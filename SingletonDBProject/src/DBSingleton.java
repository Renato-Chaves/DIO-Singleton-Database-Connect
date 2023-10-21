public class DBSingleton {

    private static volatile DBSingleton instance;
    private String server;
    private String user;
    private String pass;

    private DBSingleton(String _server, String _user, String _pass){
        this.server = _server;
        this.user = _user;
        this.pass = _pass;
    }
    
    public void DBInfo(){
        System.out.println("Successfuly connected to Database: "+server+" with username: "+user);
    }

    public static DBSingleton getInstance(String _server, String _user, String _pass){

        if(instance == null){
            synchronized (DBSingleton.class){
                if(instance == null){
                    instance = new DBSingleton(_server, _user, _pass);
                }else{

                }
            }
        }
        return instance;
    }
  
}
