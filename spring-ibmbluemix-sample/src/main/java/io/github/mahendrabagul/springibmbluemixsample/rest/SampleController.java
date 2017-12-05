package io.github.mahendrabagul.springibmbluemixsample.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import io.github.mahendrabagul.springibmbluemixsample.data.VisitorStore;
import io.github.mahendrabagul.springibmbluemixsample.data.VisitorStoreFactory;
import io.github.mahendrabagul.springibmbluemixsample.model.Visitor;

@RestController
@RequestMapping("/api")
public class SampleController {
	@GetMapping("/sample")
	public Map<String, String> sample(@RequestParam(value = "name", defaultValue = "World") String name) {
		Map<String, String> result = new HashMap<>();
		result.put("message", String.format("Hello, %s", name));
		return result;
	}

	VisitorStore store = VisitorStoreFactory.getInstance();

	@GetMapping("/visitor")
	public String getVisitors() {
		if (store == null) {
			return "[]";
		}
		List<String> names = new ArrayList<String>();
		for (Visitor visitor : store.getAll()) {
			String name = visitor.getName();
			if (name != null) {
				names.add(name);
			}
		}
		return new Gson().toJson(names);
	}

	@PostMapping("/visitor")
	public String addVisitors(@RequestBody Visitor visitor) {
		if (store == null) {
			return String.format("Hello %s!", visitor.getName());
		}
		store.persist(visitor);
		return String.format("Hello %s! I've added you to the database.", visitor.getName());
	}
}