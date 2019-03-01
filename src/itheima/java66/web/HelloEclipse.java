package itheima.java66.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/helloEclipse")
public class HelloEclipse {

	@RequestMapping("/getName")
	public String getName() {
		System.out.println("111");
		System.out.println("012");
		System.out.println("123");
		System.out.println("234");
		System.out.println("345");
//		int i = 1/0;
		System.out.println("-------------------------");
		System.out.println("456");
		System.out.println("567");
		System.out.println("678");
		System.out.println("789");
//		System.out.println(i);
		return "java66";
	}
}
