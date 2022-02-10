package app;

public class CountOfString {

    public static void main(String[] args) {
        
        String testStr = "aabnnvcccccaaz";     
        
       System.out.println(printCompresssion(testStr)); 
   
    }


    static String printCompresssion(String myStr){
              
        StringBuilder newStringBuilder = new StringBuilder(); 
    
        int count=1;  
    
        for(int i=0; i<myStr.length(); i++){
            
                    if(i==myStr.length()-1){         
                        newStringBuilder.append(myStr.charAt(i)+ "" +count);
                        
                break;
                                }

            if(myStr.charAt(i)==myStr.charAt(i+1)){   
                count++;
            }
            else{                 
                newStringBuilder.append(myStr.charAt(i)+""+count);
                count=1;     
            }
       }
    
       
     return newStringBuilder.toString();
    }

}