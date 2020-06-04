-------Pair---------
import javafx.util.Pair; 
Pair <String, Integer> ans = new Pair <String, Integer> ("", 0);
ans.getKey()
ans.getValue() 
                          

---------ArrayList----------
Collections.sort(al, Collections.reverseOrder()); 



-------------------------Priority Queues-----------------------------------------------
PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
for(int i=0;i<B.size();i++)
        {
            pq.offer(B.get(i));
        }
for(int i=0; i<k && i<pq_size;i++)
        {
            ans=pq.poll();
        }


---------------------String-------------------

int number = 23;  
String str = String.valueOf(number);


char vowel[] = {'A', 'E', 'I', 'O', 'U'}; 
	String str = String.valueOf(vowel);


str.substring(15, 20)


String array1[]= str.split("/");


str1.isEmpty()


----------HashMap----------------
HashMap<Integer,Integer> map=new HashMap<>();
if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
                arr2.add(arr[i]);
                
            }

map.get(arr[i]%k)
for(int i: map.keySet())
        {
	}

int[]arr=map.values()
int[] arr=map.keySet()

-------------Queue-----------
import java.util.LinkedList;
import java.util.Queue;
Queue<Integer> q = new LinkedList<>(); 
size(), isEmpty(), contains()
q.offer(B.get(i));
ans=q.poll();

------------Stack-------------
import java.util.Stack;
Stack<Integer> stack = new Stack<Integer>(); 
stack.push(9);
stack.pop();
---------HashSet-------------
HashSet<String> set=new HashSet<String>();  
set.add("Ravi");  
set.remove("Ravi"); 

-------Add to List to 2d List ------
ansl.add(new ArrayList<Integer>(res))    //res is list
//call by reference by default otherwise


----------ARRAYS
(clone the array)
int[] a=new int[n];
int[] b=a.clone();

//sort
Arrays.sort(arr);

intervals[][]
Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0],arr2[0])



Arrays.fill(ar, 10); 
int retVal = Arrays.binarySearch(arr,54); //arr is sorted array


//Arraylist to array
list.toArray(new int[size]);




//read arrow fxn javascript
//master theorem recursion
//rachit jain ques
//segment tree
//counting sort
//use js to send linkedin requests



