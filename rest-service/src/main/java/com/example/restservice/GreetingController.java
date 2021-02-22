package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	//定数でテンプレを用意。最終的にこれをcontetに渡す。
	private final String TEMPLATE = "Hello, %s!";

	//AtomicLongを使ってカウンターを作る。最終的にこれがidになる。
	private final AtomicLong COUNTER = new AtomicLong();

	//@GetMappingで、戻り値がGreeting型のメソッドを定義。@RequestParamでnameを受け取る。（このとき、nameがなかった時のdefaultParamも設定する）
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

		//Greeting型のインスタンスを返す。idはインクリメントして渡す。テンプレはString型に変換しながら@RequestParamで受け取ったnameをテンプレに入れる。
		return new Greeting(COUNTER.incrementAndGet(), String.format(TEMPLATE, name));

	}

}
