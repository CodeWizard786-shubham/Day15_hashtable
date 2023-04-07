package hashtable;
public class Main<K,V> {
    public static void main(String[] args) {
        MyLinkedList<String,Integer>wordFreq=new MyLinkedList<>();
        String sentence = "To be or not to be";
        String[] words = sentence.split(" ");
        for (String word : words) {
            String lowercase=word.toLowerCase();
            Integer freq = wordFreq.get(lowercase);
            if (freq != null) {
                wordFreq.insert(lowercase, freq + 1);
            } else {
                wordFreq.insert(lowercase, 1);
            }
        }
        System.out.println("Word frequencies:");
        for (MyMapNode<String, Integer> node : wordFreq.MyMapNode) {
            System.out.println(node.getKey() + ": " + node.getValue());
        }
    }
}
