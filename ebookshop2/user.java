package ebookshop2;

public class user {
    private int id;
    private String username;
    private String passwork;
    private int role;

    public user(int id, String username, String passwork, int role){
        this.id = id;
        this.username = username;
        this.passwork = passwork;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswork() {
        return passwork;
    }

    public int getRole() {
        return role;
    }
}
