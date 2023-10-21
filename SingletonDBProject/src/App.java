public class App {
    public static void main(String[] args){
        DBSingleton s1;
        DBSingleton s2;
        s1 = DBSingleton.getInstance("db1", "user1", "123");
        s1.DBInfo();
        s2 = DBSingleton.getInstance("db2", "user2", "321");
        s2.DBInfo();
        if(s1 == s2){
           System.out.println("References to same Singleton object");
        }
     }
}
