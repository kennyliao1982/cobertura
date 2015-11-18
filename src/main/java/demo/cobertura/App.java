package demo.cobertura;


/**
 * Hello world!
 *
 */
public class App 
{
    public void runIf(boolean isOk){
    	//branch coverage + 2
    	if(isOk){
    		System.out.println("ok");
    	}else{
    		System.out.println("not ok");
    	}
    }
    
    public void runWhileLoop(int i){
    	//branch coverage + 2
    	while(i < 5){
    		System.out.println(i);
    		i++;
    	}
    }
    
    public void runForLoop(int j){
    	//branch coverage + 2
    	for(int i = 0 ; i < j; i++){
    		System.out.println(i);
    	}
    }
    
    public boolean runReturnBoolean(int i){
    	//branch coverage + 2
    	return i > 5;
    }
    
    public void runException(){
    	try{
    		System.out.println("begin test..");
    		throw new RuntimeException("error...");
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    	}
    }
}
