public class ParkingLotSystemApp{

    public static void main(String... args){

    java.util.Random picker = new java.util.Random();
    java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        int [] parkinglot = new int [20];

        int count = 0;
        for(;count < parkinglot.length; count++){

            int parkingSlot = picker.nextInt(2);

            parkinglot[count] = parkingSlot;
        }
        System.out.print(java.util.Arrays.toString(parkinglot));

        System.out.printf("""
        %n------------------------Parking Lot------------------------
            
        If you want to park press 1
        If you want to leave press 2
        If you don't want either option press 0"""
                                    );


        boolean checkingParkingStatus = true;
        while(checkingParkingStatus){
        System.out.printf("%nEnter your choice: ");
        int choice = inputCollector.nextInt();
        switch(choice){
            case 1:
              boolean isCarParked = false;            
              int counter = 0;
              for (; counter < parkinglot.length; counter++) {
                  if (parkinglot[counter] == 0){
                    parkinglot[counter] = 1;
                    isCarParked = true;
              System.out.printf("The parking is at space %d\n Car parked %d",counter, parkinglot[counter]);
                    break;
                    }
              }
              System.out.print(java.util.Arrays.toString(parkinglot));
              if (!isCarParked) {
               System.out.println("No Space to Park..!");
              }
                break;
            
            case 2: 
//                boolean isCarRemoved = false;
//                  if (parkinglot.length == 1){
//                    
//                }
                break;
            case 0: checkingParkingStatus = false; 
                    System.out.println("Exiting the Premisis");
                    break;

            default: System.out.println("Invalid Choice....");

            }

        }


    }
}
