public class App {
    public static void main(String[] args) {

        char[] myName = { 'G', 'E', 'N', 'E','S','I','S'
            };
        //System.out.println(myName[6]);
            
        //System.out.println(myName[5]);
            
        //System.out.println(myName[4]);
            
        //System.out.println(myName[3]); 
            
        //System.out.println(myName[2]);
            
        //System.out.println(myName[1]);
            
        //System.out.println(myName[0]);
            
        for (int i = 0; i < myName.length; i++) {
            System.out.println(myName[i]);
            
            }
            
         for (int i = myName.length -1 ; i >= 0; i--) {
             
          for (int i = 0; 1< myName.length; i++){
           if (myName[i] == 'A' || myName[i] == 'E' || myName[i] == 'I' || myName[i] == 'O' || myName[i] == 'U' ) {
              System.out.println(myName[i]);
           }
        
    }
}