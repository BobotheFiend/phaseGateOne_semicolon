public class LevelFive{
    public static void main(String... args){

    int [] collections = {5,9,3,6,2};
    sort(collections);
    }


    public static void sort(int [] collections){
        
        int counter = 2;
       int count = 0;
        int index = 0;
        int replace = collections[0];

        for(;count < collections.length; count++){
            if (collections[count] % counter++ == 0){

            }
            collections[index++] = collections[count];
            System.out.print(collections[count]);
             
        }   
    }
}
