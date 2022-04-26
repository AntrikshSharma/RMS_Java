
package Classes;

public class Person {
    private String username, password;
    
    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    protected String getUsername() {
        return username;
    }
    
    protected String getPassword() {
        return password;
    }
}
