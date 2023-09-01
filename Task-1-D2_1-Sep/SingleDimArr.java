// 13. Implement a single-dimensional array that stores the names of three countries.

public class SingleDimArr{

    public static void main(String[] args){
        // Declare an array to store country names
        String[] countries = new String[3];

        // Assign country names to the array elements
        countries[0] = "India";
        countries[1] = "Canada";
        countries[2] = "Germany";

        // Print the country names
        for (int i = 0; i < countries.length; i++){

            System.out.println(countries[i]);
        }
    }    
}
