package ru.example.MyFileTestAppStringBoot.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class HelloController {

    private ArrayList<String> arrayList = new ArrayList<>();
    private HashMap<Integer, String> hashMap = new HashMap<>();
    private Integer key = 0;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/update-array")
    public void updateArrayList(@RequestParam(value = "values") String values) {
        arrayList.add(values);
    }

    @GetMapping("/show-array")
    public ArrayList<String> showArrayList() {
        return arrayList;
    }

    @GetMapping("/update-map")
    public void updateHashMap(@RequestParam(value = "values") String values) {
        hashMap.put(key++, values);
    }

    @GetMapping("/show-map")
    public HashMap<Integer, String> showHashMap() {
        return hashMap;
    }

    @GetMapping("/show-all-lenght")
    public String showAllLength() {
        int arrayListSize = arrayList.size();
        int hashMapSize = hashMap.size();
        return String.format("ArrayList size: %d\nHashMap size: %d", arrayListSize, hashMapSize);
    }
}