
package HashMap_Theory;

public class SeparateChaining implements Map{


    public static class Entry{
        Object key,value;
        Entry next;

        public Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public String toString(){
            return key+" "+(Country)value;
        }
    }      //


    private  Entry[] entries;
    private  int size ;
    private  float loadFactor;
    public  SeparateChaining(int capacity,float loadFactor){
        entries = new Entry[capacity];
        this.loadFactor = loadFactor;
    }



    public SeparateChaining(int capacity){
        this(capacity,0.75f);
    }
    public SeparateChaining(){
        this(10);
    }



    private int hash(Object key){
        if(key == null) throw  new IllegalArgumentException();
        return (key.hashCode() & 0x7FFFFFFF)% entries.length;
    }

    private void rehash(){
        Entry [] oldEntries = entries;
        entries = new Entry[2*oldEntries.length+1];
        for(int k= 0;k<oldEntries.length;k++){
            for(Entry old = oldEntries[k];old!=null;){
                Entry e = old;
                old = old.next;
                int h = hash(e.key);
                e.next = entries[h];
                entries[h] = e;
            }
        }

    }



    @Override
    public Object get(Object key) {
        int h = hash(key);
        for (Entry e = entries[h]; e != null; e = e.next) {
            if (e.key.equals(key)) return e.value;         // success
        }
        return null;// failure
    }
    @Override
    public Object put(Object key, Object value) {
       int h = hash(key);
        for (Entry e = entries[h]; e != null; e = e.next) {
            if (e.key.equals(key)) {
                Object oldValue = e.value;
                e.value = value;
                return oldValue;    // successful update
            }
        }
        entries[h] = new Entry(key,value,entries[h]);
        ++size;
        if(size>loadFactor*entries.length) rehash();
        return null; // successful  insertion
    }


    public Object remove(Object key){
        int h = hash(key);
        Entry prev = null;
        for (Entry e = entries[h]; e != null; e = e.next) {
            if (e.key.equals(key)) {
                Object oldValue = e.value;
                if(prev == null) {entries[h] = e.next;}
                else {prev.next = e.next;}
                 --size;
                return oldValue;      // success
            }
            prev=e;
        }
        return null; // failure : key not found
            }





    @Override
    public int size() {
        return size;
    }

    public void print() {
        for (int i = 0; i < entries.length; i++) {
            System.out.print("Bucket " + i + ": ");
            Entry currentEntry = entries[i];
            while (currentEntry != null) {
                System.out.print("[" + currentEntry.key + ", " + currentEntry.value + "]");
                if (currentEntry.next != null) {
                    System.out.print(" -> ");
                }
                currentEntry = currentEntry.next;
            }
            System.out.println(" -> null");
        }
    }



    public static void main(String[] args) {
        SeparateChaining map = new SeparateChaining();

        // Inserting key-value pairs
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        map.print();

        // Retrieving values
        System.out.println("Value for key1: " + map.get("key1"));
        System.out.println("Value for key2: " + map.get("key2"));
        System.out.println("Value for key3: " + map.get("key3"));

        // Removing a key-value pair
        System.out.println("Removed value for key2: " + map.remove("key2"));
        System.out.println("Value for key2 after removal: " + map.get("key2"));

        // Size of the map
        System.out.println("Size of the map: " + map.size());
        map.print();
    }
}







