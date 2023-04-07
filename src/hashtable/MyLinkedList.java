package hashtable;
import java.util.LinkedList;

class MyLinkedList<K,V> {
    LinkedList<MyMapNode<K,V>>MyMapNode = new LinkedList<>();

    public MyMapNode<K, V> search(K key) {
        for (MyMapNode<K, V> node : MyMapNode) {
            if (node.getKey().equals(key)) {
                return node;
            }
        }
        return null;
    }
    public void insert(K key, V value) {
        MyMapNode<K, V> node = search(key);
        if (node == null) {
            MyMapNode.add(new MyMapNode<K, V>(key, value));
        } else {
            node.setValue(value);
        }
    }

    public V get(K key) {
        MyMapNode<K, V> node = search(key);
        if (node != null) {
            return node.getValue();
        }
        return null;
    }
}
