package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	//?name=""の中身を受け取る
	@GetMapping("/greeting")
	public String greeting(@RequestParam("name"), String name) {

		//Greetingクラスのインスタンスを作って、nameをsetする
		Greeting greeting = new Greeting();

		greeting.setGreeting(なんだここ, name);


		//

		//

		//

		//

	}

}
