package pro.sky.java.course2.hw2111.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.hw2111.services.StoreService;
import pro.sky.java.course2.hw2111.services.StoreServiceImpl;

import java.util.List;


@RestController
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreServiceImpl storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public String addItem(@RequestParam Integer idItem) {
        storeService.addItem(idItem);
        return "Item added";
    }

    @GetMapping("/get")
    public List<Integer> getBasket() {
        return storeService.getBasket();
    }
}
