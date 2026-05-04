package ones;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Rough {
	
	public static void performOperations(List<Integer>ax) {
		ax.stream().filter((p)->p%2!=0).forEach(a->System.out.println(a));
	}

	/*Am integrating Collections and Lambda Functions */
	@Test
	public void testName() throws Exception {
		List<Integer>num = new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
//		System.out.println(num);//1,2,3
		performOperations(num);
		/*
		 * stream: Collections of data : irrespective of data types int,string,float
		 * [1,2,3]=> stream => {1,2,3}=>filter(it performs specific task based on our logic)
		 * Lambda Functions:
		 * [1,3]
		 * 
		 * syntax: ()->{}
		 * 1.  printing odd numbers
		 * */
//		num.stream().filter((p)->p%2!=0).forEach(a->System.out.println(a));
		
	}
}
