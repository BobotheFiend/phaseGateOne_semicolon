public class FaceBookLikeSystem{
  
    public static String textDisplay(String [] names){
        
        int nameLength = names.length;

        if (nameLength == 0 ){
            return "no one likes this";
        }
        else if(nameLength == 1){
             String result = String.format("""
             %s likes this"""
                                            ,names[0]);
            return result;
        }
        else if(nameLength == 2){
             String result = String.format("""
             %s and %s likes this"""
                                            ,names[0],names[1]);
            return result;
        }
        else if(nameLength == 3){
            String result = String.format("""
             %s, %s and %s likes this"""
                                            ,names[0],names[1],names[2]);
            return result;
        }
        else if(nameLength >= 4){
             String result = String.format("""
             %s, %s and %d others likes this"""
                                            ,names[0],names[1], nameLength-2);
            return result;
        }
        return null;
    }
}
