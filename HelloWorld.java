import java.util.concurrent.TimeUnit;
public class HelloWorld{
	public static void main(String[] args){
		while(true){
			System.out.println("Hello World");

			try{
				TimeUnit.MINUTES.sleep(1);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}
