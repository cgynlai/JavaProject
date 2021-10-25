package implementComparable;

import java.util.*;



public class SortingExample {

	public SortingExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	   ArrayList<Item> items = new ArrayList<Item>();
	   Item item1 = new Item(10, 20,"dd");
	   Item item2 = new Item(10,20, "DD");
	   Item item3 = new Item(16,15, "aa");
	   Item item4 = new Item(15,20, "cc");
	   Item item5 = new Item(05,10, "AA");
	   items.add(item1);
	   items.add(item2);
	   items.add(item3);
	   items.add(item4);
	   items.add(item5);
	   System.out.println(item1.hashCode());
	   System.out.println(item2.hashCode());
	   System.out.println(item1.equals(item2));   
	   
	   System.out.println("****unsorted********");
	   int i=0;
	   for(Item item : items) {
		   System.out.println(++i + " : " + item);
	   }
	   
	   
       Collections.sort(items, Item.itemWeightComparator );
       
       
       System.out.println("*** sorted****");
       for (Item item : items) {
    	   //System.out.println(item.getValue() + "   " + item.getWeight());
    	   System.out.println(item);
       }
       int position = Collections.binarySearch(items, item5);
       //Collections.b
       System.out.println("item 5 position " + position);
       System.out.println("***iterate sorted ******");
       Iterator<Item> it2 = items.iterator();
       while(it2.hasNext()) {
    	   System.out.println(it2.next());
       }
       
       Iterator<Item> it = items.iterator();
       while(it.hasNext()) {
    	   if(it.next().equals(item2)) {
    		   
    		   it.remove();
    	   }
       }
       
       System.out.println("*** sorted 2****");
       for (Item item : items) {
    	   //System.out.println(item.getValue() + "   " + item.getWeight());
    	   System.out.println(item);
       }
       
       System.out.println("newlist: " + items);
       for (Item item : items) {
    	   System.out.println(item.getValue() + "   " + item.getWeight());
       }
       items.add(item5);
       items.set(0, item5);
       System.out.println(items.get(0));
       Iterator<Item> ite = items.iterator();
       while(ite.hasNext()) {
    	   System.out.println(ite.next());	
       }
       
       HashMap<Item,Integer> hmap = new HashMap<Item,Integer>();
       hmap.put(item5, 5);
       hmap.put(item4, 4);
       hmap.put(item3, 3);
       hmap.put(item2, 2);
       System.out.println(hmap);
       System.out.println("*****hashmap ************");
       
       for(Item item : hmap.keySet()) {
    	   System.out.println(hmap.get(item));
       }
       
       TreeMap<Item, Integer> tmap = new TreeMap<Item, Integer>();
       tmap.put(item5, 5);
       tmap.put(item4, 4);
       tmap.put(item3, 3);
       tmap.put(item2, 2);
       System.out.println(tmap);
       System.out.println("*****TreeMap ************");
       for(Item item : tmap.keySet()) {
    	   System.out.println(tmap.get(item));
       }
       
       System.out.println(Arrays.asList(tmap));
       
       Integer[] array = {9,9,3,2,3,5};
       //TreeSet<Integer> tset = new TreeSet<Integer>(Arrays.asList(array));
       TreeSet<Integer> tset = new TreeSet<Integer>();
       tset.addAll(Arrays.asList(array));
       //tset.add(10);
       System.out.println(tset);
       
 //      Driver driver = new com.mysql.jdbc.Driver();
       
//       String url = jdbc:mysql://localhost:3306/;
//       Properties info = new Properties();
//       info.setProperty("user", "root");
//       info.setProperty("password", "1234");
//       
//       Connection conn = driver.connect(url,info);
//       String sql = "insert into customers (name, email, birthday) values (?,?,?)";
//       PreparedStatement ps = conn.prepareStatement(sql);
//       ps.setString(1, "alex");
//       ps.setString(2,xx@gmail.com"");
//       ps.execute();
//       ps.close();
//       conn.close();
//       //query
//       ResultSet rs = ps.executeQuery();
//       rs.getInt(1);
//       rs.getString(2);
//       rs.getDate(3;)
//       rs.close();
	}

}
