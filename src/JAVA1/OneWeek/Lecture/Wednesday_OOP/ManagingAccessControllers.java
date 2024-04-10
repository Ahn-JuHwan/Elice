package JAVA1.OneWeek.Lecture.Wednesday_OOP;

class User {
    protected String ID;

    User() {
        this.ID = "immediate Id";
    }

    protected String IdViewer() {
        return this.ID;
    }
}

public class ManagingAccessControllers {
    public static void main(String args[]) {
        User user1 = new User();

        System.out.println(user1.ID);

        System.out.println(user1.IdViewer());

    }
}
