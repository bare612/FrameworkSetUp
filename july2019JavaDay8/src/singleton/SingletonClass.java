package singleton;

public class SingletonClass {

   public static String password = "secret code";
   public static SingletonClass singletonClass = null;

   private SingletonClass() {}

   public static SingletonClass getInstance(){
       if(singletonClass == null){

       }
       return singletonClass;
   }


}
