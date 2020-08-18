package staticex;

public class StaticEx {

	 //static block
    static{
        //can be used to initialize resources when class is loaded
        System.out.println("StaticExample static block");
        //can access only static variables and methods
        str="Test";
        setCount(2);
    }
    
    //multiple static blocks in same class
    static{
        System.out.println("StaticExample static block2");
    }
    
    //static variable example
    private static int count; //kept private to control its value through setter
    public static String str;
    
    public int getCount() {
        return count;
    }

    //static method example
    public static void setCount(int count) {
        if(count > 0)
        StaticEx.count = count;
    }
    
    //static util method
    public static int addInts(int i, int...js){
        int sum=i;
        for(int x : js) sum+=x;
        return sum;
    }

    //static class example - used for packaging convenience only
    public static class MyStaticClass{
        public int count;
        
    }
    public static void main(String[] args) {
        StaticEx.setCount(5);
        
        //non-private static variables can be accessed with class name
        StaticEx.str = "abc";
        StaticEx se = new StaticEx();
        System.out.println(se.getCount());
        //class and instance static variables are same
        System.out.println(StaticEx.str +" is same as "+se.str);
        System.out.println(StaticEx.str == se.str);
        
        //static nested classes are like normal top-level classes
        StaticEx.MyStaticClass myStaticClass = new StaticEx.MyStaticClass();
        myStaticClass.count=10;
        
        StaticEx.MyStaticClass myStaticClass1 = new StaticEx.MyStaticClass();
        myStaticClass1.count=20;
        
        System.out.println(myStaticClass.count);
        System.out.println(myStaticClass1.count);
    }


}
