I/O operations : 

//strings printing java :
String s = java.text.MessageFormat.format("I would like to have {0} KG of rice and {1} Litre of Milk. I only have ${2}, is this sufficient?",new String[]{"100","5","50"});

String a = "{YY}-{MM}-{SEQNO}";
a = a.replace("YY", "17").replace("MM", "06").replace("SEQNO", "0001");
System.out.println(a);
//Output:  {17}-{06}-{0001}

System.out.printf("%S-%S-%S\n", "shiva", "asd", "wqe");
----------------------------------------------------------

// for printing arrays:
int[] a = {1,2,3};
System.out.println(Arrays.toString(a)); // else it will give the index of the array
System.out.println(a); // this gives the address
----------------------------------------------------------
// for printing collections:
ArrayList<String> cars = new ArrayList<String>();
System.out.println(cars); // this works
System.out.println(cars.toString()); // this works
----------------------------------------------------------

// for taking input

Scanner obj = new Scanner(System.in);
system.out.println("enter your name:")
String name = obj.nextLine();

