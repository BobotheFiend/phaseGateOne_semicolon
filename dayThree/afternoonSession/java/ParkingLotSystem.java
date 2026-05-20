public class ParkingLotSystem{

    public static int [] parkingStatus(int number){
        
        java.util.Random picker = new java.util.Random();
        
        int [] parkinglot = new int [number];

        int count = 0;
        for(;count < parkinglot.length; count++){

            int parkingSlot = picker.nextInt(2);

            parkinglot[count] = parkingSlot;
        }
            return parkinglot[count-1];
        
    }

    public static void parkingText(){
    System.out.println("""
        ----------------Parking Lot-------------------
            
        If you want to park press 1
        If you want to leave press 2
        If you don't want either option press 0"""
                                    );
    
    }
    public static String userChoice(int choice){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        int [] parkingSpaces = parkingStatus(number);

        boolean checkingParkingStatus = true;
        while(checkingParkingStatus){
        switch(choice){
            case 1:
              boolean isCarParked = false;            
              int count = 0;
              for (; count < parkingSpaces.length; count++) {
                  if (parkingSpaces[count] == 0) {
                    parkingSpaces[count] = 1;
                    isCarParked = true;
                    String status = 
                    return "";
                  }
              }
              if (!isCarParked) {
                        return("Parking lot is full!");

              }
            
            case 2: 
                boolean isCarRemoved = false;
//                int counter = 0;
//                for(;counter < parkingSpaces.length;counter){
                  if (parkingSpaces[counter] == 1)
                }

            case 0: checkingParkingStatus = false; return
                
            default: 
            }
        }

    }

}
