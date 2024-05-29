public class deletElement {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = new int[10];
        arr[0] = 1 ;
        arr[1] = 3 ;
        arr[2] = 5 ;
        arr[3] = 9 ;
        arr[4] = 11;
        arr[5] = 18;

        for(int i = 0 ; i < n; i++)
        {
            System.out.print(arr[i]+" ,");
        }
        System.out.println("");

        int index = 2;

        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--;

         for(int i = 0 ; i < n; i++)
        {
            System.out.print(arr[i]+" ,");
        }

        
    }
}

    

