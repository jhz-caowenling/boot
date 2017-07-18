package demo.boot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by 15846 on 2017/7/14.
 */
@RestController
@EnableAutoConfiguration
public class HelloContreller {

    @RequestMapping("/hello")
    public String index(){
        System.out.println("enter controller");
        return "Hello Warld";
    }

    @RequestMapping("/404")
    public String error(){
        Test test=new Test();
        System.out.println("enter controller:"+test);
        return "This is 404 error page";
    }

}
