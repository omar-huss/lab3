public class BuddyInfo {
    private String name;
    private String address;
    private String number;

    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address =  address;
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public static void main(String []  args) {
        BuddyInfo buddy = new BuddyInfo( "omar",  "home", "12345");
        System.out.println("hello "+ buddy.getName());
        System.out.println("your address is "+buddy.getAddress() + " your number is "+ buddy.getNumber());

    }
}
