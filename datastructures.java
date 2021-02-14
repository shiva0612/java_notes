data structures : 


declarations:

string a="shiva"
String username = "root",password = "0612"
char a='a';
long a=123123;
boolean passed=true;

enum Level {
  LOW,
  medium,
  HIGH
}
String priority = level.low; // priority="low"
----------------------------------------------------------

arrays:

char[] a = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
String[] obj = new String[] {"shiva","surya"};
String[] obj = {"shiva","surya"}
int[] obj = {1,2,3}
int[] a = new int[2]
int a[] = new int[2]

a[1]=10; //since it is a normal arrays

if a is like (ArrayList<Integer> a = new ArratList<>()) then we have to use a.set(1,10)

----------------------------------------------------------

collections and generics:

ArrayList<String> cars = new ArrayList<String>(); // ArrayList<String> cars = new ArrayList<>(); this is also right
List<String> list = new List<String>();
collections obj = new Arraylist(); // as datatype is not mentioned in here(it takes all the datatypes "it takes everything as objects")


// this is generics (here, we mention datatypes)
collections<Integer> obj = new ArrayList<>(); // we can't add element based on index
List<Integer> obj = new ArrayList<>();// we can add elements based on index and List allows duplicate values also
Set<Integer> obj = new HashSet<>();// set does not allow duplicate values and when printed gives numbers in random order
Set<Integer> obj = new TreeSet<>();// while adding numbers they get sorted 
Map<Integer,String> obj = new HashMap<>(); // same like dictionary in python


// for initializing collections

ArrayList<String> gfg = new ArrayList<String>() { 
            { 
                add("Geeks"); 
                add("for"); 
                add("Geeks"); 
            } 
        }; 
		
 ArrayList<String> gfg = new ArrayList<String>( 
            Arrays.asList("Geeks", "for", "Geeks")
												); 

List<String> gfg = new ArrayList<>( 
            List.of("Geeks","for", "Geeks")
			); 						

List<Integer> arr = new ArrayList<>(); 
        arr.add(1); 
        arr.add(2); 
        arr.add(3); 
        arr.add(4); 
        arr.add(5); 
  
        // create a ArrayList Integer type 
        // and Initialize an ArrayList with arr 
        List<Integer> gfg = new ArrayList<Integer>(arr);	
----------------------------------------------------------

arr_name = {1,2,3}
List<int> obj = arrays.aslist(arr_name) // this method you will not be able to add , remove elements in "obj" it is fixed size
										//and 
										//writethrough property (changes made in any of (arr_name/obj) will reflect in both )

list<int>obj = new ArrayList<>(arrays.aslist(arr_name))//now we can add/delete the list

https://youtu.be/_ntIzftXKMM		
----------------------------------------------------------
conversions :

int b = 1;
long a = b;
// widening is automatic since "1 can be converted to 1.0000 but 1.343 to be converted to 1.3 some calculation needed"
 
char[] b;
b = a.toCharArray(); // string to char array

char[] a = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
String str = new String(a);// char array to string 

String a = "1234"; //string to int
int b = Integer.parseInt(a);

int a=1234 // int to String
String b = a+"";

Integer a = 123; //Integer to String
String b = a.toString() 
// here a is the object of Integer class so it has few inbuilt functions unlike if it is simply  int 						 we have do 1234+""

for joining strings 
https://www.geeksforgeeks.org/java-string-join-examples/

for spiltting strings
https://www.geeksforgeeks.org/split-string-java-examples/

String a = "shiva";

a.length()
a.substring(start_index,end_index);
a.substring(0,a.length());

----------------------------------------------------------

ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid (we have to use Wrapper class)

//for sorintg arraylist or anything which extends the class "collections"
we can say :
collections.sort(myNumbers);



ArrayList<String> car = new ArrayList<>() //arraylist methods are not synchronized (not thread safe), they are fast
										  // when extra element beyond size is added size will be increased by 50%
										  // this is a static array

vector <Sting>car = new vector<>()        //vector methods are synchronizes (thread safe), so they are slow
										  // when extra element beyond size is added size will be increased by 100%
										  // dynamic or linked list kind of thing


Arraylist :

		car.add("shiva")
		car.set(0,"sdasd")  
		car.get(1)
		car.remove(2)
		car.clear()
		car.size() 
		in arraylist we cannot add items in the start or middle , only at the end we can add items (the set function is to edit the item at that location)             

vectors :

		above methods from arralist +

		for vectors we also have v.capacity()
		v.addelementat()

linkedlist :

		above methods from arralist +

		addFirst() 
		addLast()
		removeFirst()
		removeLast()
		getFirst()
		getLast()

Hashmap :
Hashset : we can only have unique values and also has additional function ".contains()"
------------------------------------------------------------------------------



