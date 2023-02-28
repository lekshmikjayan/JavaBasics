
public class tryctch implements Runnable{
	public void run() {
		System.out.println("This is running in thread")
	;}
	public String getName(String name) {
		return name;
	}
	
	public void ageCheck(int age) {
		
			if (age< 35 && age > 1) {
				throw new ArithmeticException("Access denied ");
			
			}else {
				System.out.println("Access granted ");
				}
			int i = 99;
			int j =0;
			try {
				int x = i/j;
				System.out.println(x);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		finally {
			System.out.println("Something went wrong..!");
		}
		}
		
	}
	
/*public class abc extends Thread{
 * public void run()
{sysy.out('running in thread'
 */
  
