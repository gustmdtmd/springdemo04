package part01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// http://localhost:8090/myapp/hello.htm

//컨트롤러에 꼭 선언!
@Controller
public class HelloController {
	public HelloController() {
	
	}
	
	//요청이 왔을 때 어떤 컨트롤러가 호출이 되어야 하는지 알려주는 지표 같은 것.
	@RequestMapping(value="/hello.htm")
	public String search() {
		return "part01/hello";
	}
}
