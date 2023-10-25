package Course2.Module1;

public class Switch_Statements_Assessment {
    public static void main(String[] args) {
        String dog = "large";
        switch (dog) {
            case "tiny":
                System.out.printf("A %s dog will need 10 pounds of food\n", dog);
                break;
            case "small":
                System.out.printf("A %s dog will need 25 pounds of food\n", dog);
                break;
            case "regular":
                System.out.printf("A %s dog will need 50 pounds of food\n", dog);
                break;
            case "large":
                System.out.printf("A %s dog will need 100 pounds of food\n", dog);
                break;
        }
    }
}
