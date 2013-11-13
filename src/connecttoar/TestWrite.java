package connecttoar;


public class TestWrite implements Runnable{
                     SerialTest st = new SerialTest();
	private MessagePool mp;
	public MessagePool getMessagePool(){
		return mp;
	}
	public void setMessagePool(MessagePool mpp){
		mp=mpp;
	}

	public void run(){
		while(true){
			try{
                                                                            String msg=mp.getMessage();
                                                                            st.SendtoSerial(msg);
				
			}catch(Exception ex){
			}
		}
	}
    
}
