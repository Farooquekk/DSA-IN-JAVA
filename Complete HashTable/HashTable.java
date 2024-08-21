package HashMap_Theory;

public class HashTable implements  Map {

private static class Entry{

    Object key;
    Object value;
    Entry(Object key , Object value){
        this.key = key;
        this.value = value;
    }
    public String toString(){
        return key.toString() + "\t" + value.toString();
    }

}

private final Entry [] entries = new Entry[11];
private  int size;



private  int hash(Object key){
    return (key.hashCode()&0x7fffffff)%entries.length;
}



    /*@Override
    public Object get(Object key) {
        int index = hash(key);
        Entry entry = entries[index];
        if (entry != null && entry.key.equals(key)) {
            return entry.value;
        }
        return null; // Return null if there's no entry for the given key or if the key doesn't match
    }
*/
    public Object get(Object key) {

        return entries[hash(key)].value;
    }

    @Override
    public Object put(Object key, Object value) {
    entries[hash(key)] = new Entry(key,value);
    size ++;
        return null;
    }

    @Override
    public Object remove(Object key) {
    Object value = entries[hash(key)].value;
    entries[hash(key)]=null;
    --size;
    return value;

    }

    @Override
    public int size() {
        return size;
    }

    public void print() {
        for (int i = 0;i<entries.length;i++) {
            if (entries[i] != null) {
                System.out.println(" Index : " + i + " : " + entries[i].key + " : " +  entries[i].value );
            }
        }
    }


    public static void main(String[] args) {

    HashTable group = new HashTable();

     group.put("PK",new Country("Pakistan","Urdu",227100,22));
     group.put("IND",new Country("India","Hindi",1227100,140));
     group.put("CH",new Country("China","Chinese",1357100,139));
     group.put("BN",new Country("Bangladesh","Bengali",137100,19));
     group.put("IT",new Country("Italy","Italian",207100,18));



        group.print();

        System.out.println(group.get("PK"));
        System.out.println(group.get("IND"));
        System.out.println(group.get("CH"));
        System.out.println(group.get("BN"));
        System.out.println(group.get("IT"));





    }


}



// Methods for avoiding the collision problem
// 1 --> Linear Probing
// 2 --> Quadratic Probing
// 2 --> Separate Chaining