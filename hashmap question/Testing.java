// import java.util.*;

// public class Testing
// {
//     public static class MyHashMap<K,V>
//     {
//         public static final int DEFAULT_CAPACITY = 4;
//         public static final float DEFAULT_LOAD_FACTOR = 0.75f;
//         private class Node
//         {
//             K key;
//             V value;
//             Node(K key, V value)
//             {
//                 this.key = key;
//                 this.value = value;
//             }
//         }
//         private int n;
//         private LinkedList<Node> buckets[];
//         private int HashFunct(K key)
//         {
//             int hc = key.hashCode();
//             return (int)(Math.abs(hc))%(buckets.length);
//         }
//         private void initbucket(int N)
//         {
//             buckets = new LinkedList[N];
//             for(int i =0;i<buckets.length;i++)
//             {
//                 buckets[i] = new LinkedList<>();
//             }
//         }
//         private int searchInBucket(LinkedList<Node> ll,K key)
//         {
//             for(int i =0;i<ll.size();i++)
//             {
//                 if(ll.get(i).key == key)
//                 {
//                     return i;
//                 }
//             }
//             return -1;
//         }
//         public MyHashMap()
//         {
//             initbucket(DEFAULT_CAPACITY);
//         }
//         public int size()
//         {
//             return -1;
//         }
        
//         public void put(K key, V value)
//         {
//             int bi = HashFunct(key);
//             LinkedList<Node> currBucket = buckets[bi];
//             int ei = searchInBucket(currBucket,key);
//             if(ei==-1)
//             {
//                 Node node = new Node(key, value);
//                 currBucket.add(node);
//                 n++;
//             }
//             else
//             {
//                 Node currNode = currBucket.get(ei);
//                 currNode.value = value;
//             }

//         }
//         public V get(K key)
//         {
//             int bi = HashFunct(key);
//             LinkedList<Node> currBucket = buckets[bi];
//             int ei = searchInBucket(currBucket, key);
//             if(ei!=-1)
//             {
//                 Node currNode = currBucket.get(ei);
//                 return currNode.value;
//             }
//             return null;
//         }
//         public V remove(K key)
//         {
//             int bi = HashFunct(key);
//             LinkedList<Node> currBucket = buckets[bi];
//             int ei = searchInBucket(currBucket, key);
//             if(ei!=-1)
//             {
//                 Node currNode = currBucket.get(ei);
//                 V val = currNode.value; 
//                 currBucket.remove(ei);
//                 n--;
//                 return val;
//             }
//             else
//             {
//                 return null;
//             }
//         }
//     }  
//     public static void main(String[] args) 
//     {
//         MyHashMap<Integer,String> mp = new MyHashMap<>();
//         mp.put(1, "sanjay");
//         System.out.println(mp.size());
//     }
// }