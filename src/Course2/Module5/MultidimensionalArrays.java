package src.Course2.Module5;
import java.util.Arrays;
public class MultidimensionalArrays {
    public static void main(String[] args) {
        String[][][] nameAddressPhone = {{{"Bill", "Jim", "Bob"},{"123-841-1384", "348-138-3883", "948-123-4885"},{"123 Sesame Street", "9060 West Pikachu Avenue", "2747 N Clark Parkway"}}};
        System.out.println(Arrays.deepToString(nameAddressPhone));

        System.out.println("\n\nOR:\n\n");
        
        for (int i=0; i < nameAddressPhone.length; i++) {
            for (int j=0; j<nameAddressPhone[i].length; j++){
                System.out.print("\n");
                for (int f=0; f<nameAddressPhone[i][j].length; f++){
                    System.out.print("| ");
                    System.out.print(nameAddressPhone[i][j][f]);
                    System.out.print(" |");
                }
            }
        }
    }
}
