package connecttoar;
import java.util.Scanner;

    public class TestRead implements Runnable{
    private MessagePool mp;
    public  MessagePool getMessagePool(){
                    return mp;
	}
    public void setMessagePool(MessagePool mpp){
                    mp=mpp;
    }
    public void run()   {
    	while(true){
    		try{
    			Scanner reader = new Scanner(System.in);
    			String msg=reader.nextLine();
    			mp.setMessage(msg);
    		}catch(Exception ex){System.err.println(ex.toString());
       		}
    		
    	}
    }
    
}
