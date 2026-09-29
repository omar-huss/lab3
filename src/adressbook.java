import java.util.ArrayList;
import java.util.List;

public class adressbook {
    private List<BuddyInfo> buddies;

    public adressbook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }


    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }


    public static void main(String[] args){
            BuddyInfo buddy = new BuddyInfo("bleep", "45 dorp","1234");
            adressbook adressbook = new adressbook();
            adressbook.addBuddy(buddy);
            adressbook.removeBuddy(buddy);
            System.out.println("hello world");
            System.out.println("hello world but done online (wow)");
        }







    }

