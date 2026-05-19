public class LevelFive{
    public static void main(String... args){

    int [] collections = {5,9,3,6,2};
    sort(collections);
    }


    public static boolean sort(int [] collections){
        
        int counter = 2;
        int index = 0;
        int replace = collections[0];

        for(int count : collections ){
            if (count % counter++ == 0){
              return false;
            }

        return true;
        }   
    }
}
