package HashMap_Theory;

public class QuadraticProbing implements  Map{

    private static class Entry{
        Object key, value;

        public Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    private  Entry [] entries;
    private  int size , used;
    private  float loadFactor;
    private  final Entry NIL = new Entry(null,null); // dummy

    public QuadraticProbing(int capacity, float loadFactor){
        entries = new Entry[capacity];
        this.loadFactor = loadFactor;
    }
    public QuadraticProbing(int capacity){
        this(capacity,0.75f);
    }
    public QuadraticProbing() {
        this(101);
    }


    public  Object get(Object key){
        int h = hash(key);
        for(int i=1;i<entries.length;i++){

            int j = nextProbe(h,i);
            Entry entry = entries[j];
            if(entry==null) break;
            if(entry==NIL) continue;
            if(entry.key.equals(key)) return entry.value; // success
        }
        return null ;// fail
    }

    public Object put(Object key , Object value){


        if(used>loadFactor*entries.length) rehash();
        int h = hash(key);
        for(int i =0;i<entries.length;i++){
            int j = nextProbe(h,i);
            Entry entry = entries[i];
            if(entry==null) {
                entries[j] = new Entry(key,value);
                ++size;
                ++used;
                return null ;
            } // insertion success
            if(key==NIL) continue;
            if(entry.key.equals((key))){
                Object oldValue = entry.value;
                entries[j].value = value;
                return oldValue;
            } // Update successful
        }
        return  null ;                        // failure table overflow
    }

    public Object remove(Object key){
        int h = hash(key);
        for(int i=0;i<entries.length;i++){
            int j = nextProbe(h,i);
            Entry entry  = entries[j];
            if(entry==null) break;
            if(entry == NIL) continue;
            if(entry.key.equals(key)){
                Object oldValue = entry.value;
                entries[j] = NIL;
                --size;
                return oldValue ;           //  success
            }
        }
        return null;                    // failure : key not found
    }








    @Override
    public int size() {
        return size;
    }
    private int hash(Object key){
        if(key == null) throw  new IllegalArgumentException();
        return (key.hashCode() & 0x7FFFFFFF)% entries.length;
    }
    private int nextProbe(int h , int i){
        return (h+i*i)%entries.length;            // Quadratic Probing
    }

    private void rehash(){
        Entry [] oldEntries = entries;
        entries = new Entry[2*oldEntries.length+1];
        for(int k = 0;k< oldEntries.length;k++){
            Entry entry = oldEntries[k];
            if(entry==null || entry == NIL) continue;
            int h = hash(entry.key);
            for(int i = 0;i < entries.length;i++){
                int j = nextProbe(h,i);
                if(entries[j] == null){
                    entries[j] = entry;
                    break;
                }
            }
        }
        used = size;

    }


    public static void main(String[] args) {



        QuadraticProbing group = new QuadraticProbing();

        Country pakistan = new Country("Pakistan","Urdu",227100,22);
        Country india = new Country("India","Hindi",1227100,140);
        Country china = new Country("China","Chinese",1357100,139);
        Country bangladesh = new Country("Bangladesh","Bengali",137100,19);
        Country italy = new Country("Italy","Italian",207100,18);

        group.put(pakistan,"PK");
        group.put(india,"IND");
        group.put(china,"CH");
        group.put(bangladesh,"BAN");
        group.put(italy,"IT");


    }

}
