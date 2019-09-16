package datastructures.hashtable;

public class HashTable<T> {
    private Node[] table;
    private int count;

    public HashTable(){
        table = new Node[64];
    }
    public HashTable(int initialSize) {
        table = new Node[initialSize];
    }

    // hash()
    protected int hash(String key) {
//        int hashValue = 0;
//        char[] letters = key.toCharArray();
//        for( int i = 0; i<letters.length; i++) {
//            hashValue += letters[i];
//        }
//
//        hashValue = (hashValue * 1599) % table.length;
//        System.out.println("Hash Value" + hashValue);
//        return hashValue;

        return (Math.abs(key.hashCode())) % table.length;

    }

    // set()
    public void add(T key, T value) {

        // set a var (int) of the hash(key)
        int hashKey = hash((String)key);

        if( this.table[hashKey] == null ) {
            if (count > 0.75 * table.length){
                resize();
            }
            table[hashKey] = new Node(key, value);
            count++;
        }
        else {
            Node temp = table[hashKey];
            table[hashKey] = new Node(key, value);
            table[hashKey].setNext(temp);
        }

    }

    // get()
    public T get(T key) {
        // hash the key (should give me the same thing)
        // if the hash table has that key, send back the value from the node.
        int  hashKey = hash((String)key);
        Node list = table[hashKey];
        while(list != null ) {
            // Actually go through the list and check the actual value
            if (list.key.equals(key)) {
                // (do as I said, not as I did)
                return (T) list.value;
            }
            list = list.next;
        }

        return null;
    }

    // has()
    public boolean contains(T key) {
        int hashKey = hash((String)key);
        Node list = table[hashKey];
        while (list != null){
            if (list.key.equals(key)) {
                return true;
            }
            list = list.next;
        }
        return false;
    }

    private void resize(){
        Node[] newTable = new Node[table.length * 2];
        for (int i = 0; i < table.length; i++){
            Node list = table[i];
            while (list != null){
                Node next = list.next;
                int hash = (Math.abs(list.key.hashCode())) % newTable.length;
                list.next = newTable[hash];
                newTable[hash] = list;
                list = next;
            }
        }
        table = newTable;
    }

    public int size() {
        // Return the number of key/value pairs in the table.
        return count;
    }

    void dump() {
        System.out.println();
        for (int i = 0; i < table.length; i++) {
            // Print out the location number and the list of
            // key/value pairs in this location.
            System.out.print(i + ":");
            Node list = table[i]; // For traversing linked list number i.
            while (list != null) {
                System.out.print("  (" + list.key + "," + list.value + ")");
                list = list.next;
            }
            System.out.println();
        }
    } //

    public static void main(String[] args){
        HashTable table = new HashTable(4);
        table.add("Padma", 1);
        table.add("Ananya", 2);
        table.add("Aarthi", 3);
        table.dump();
    }
}
