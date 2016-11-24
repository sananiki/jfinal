package demo;

import com.jfinal.core.Controller;

public class IndexController extends Controller{
	public void index() {
		setAttr("ss", 123);
		render("form/index.html"); 
	} 
}
