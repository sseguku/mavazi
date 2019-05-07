public class BraceChecker {

 
  public boolean isValid(String braces) {
    // Add code here
    //return false if the braces are empty
    int len = braces.length(); 
    if(len == 0 ) return false;
    else{
      //all odd length are supposed to return false
      if(len % 2 != 0){
        return false;
      }
      else{
       
        boolean status = true;
        int top = -1;
        char temp;
        char []str = new char[len];
        int i;
          
         //each char in the string
         for(i = 0;  i<len; i++){
           //does each character consists of (,), [,],{,}
           if(braces.charAt(i)== '(' ||braces.charAt(i)== ')' || braces.charAt(i)== '[' || braces.charAt(i)== ']' || braces.charAt(i)== '{' ||braces.charAt(i)== '}' ) {
             
             
             if( (braces.charAt(i)== ')' || braces.charAt(i)== '}' || braces.charAt(i)== ']') && top==-1 ){
               status = false;
               break;               
             }
             if(braces.charAt(i)== '(' || braces.charAt(i)== '{' || braces.charAt(i)== ']'){
               top++;
               str[top] = braces.charAt(i);               
             }else{
               temp = str[top];
               top--;
               if(temp=='(' && braces.charAt(i)== ')' || temp=='{' && braces.charAt(i)== '}' || temp=='[' && braces.charAt(i)== ']' ){
                 continue;
               }else{
                 status = false;
                 break;
               }
               
             }
             
         
             
           }//allowed characters
           else{//not allowed
             status =  false;
             break;
           }
         }//ends the for loop
        
        if(i==len && top==-1) status = true;
        else status = false;
        return status;
      }
    }
    
  }//ends method
  
}//ends class
