public class Exercise {

    public static void main (String[] args) {

        int numbers[] = {10,20,40,60,80};

        System.out.println("first element:" +numbers[0]);
        System.out.println("last element:" +numbers[4]);

        for (int i=numbers.length-1; i>=0; i-- )
        {
            System.out.println(numbers[i]);
        }

        System.out.println("total no of element in array:" +numbers.length);

    }

}