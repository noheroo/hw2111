package pro.sky.java.course2.hw2111.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course2.hw2111.exceptions.WrongDataException;

import java.util.List;

@Service
@SessionScope
public class StoreServiceImpl implements StoreService {

    private final List<Integer> basket;

    public StoreServiceImpl(List<Integer> basket) {
        this.basket = basket;
    }

    @Override
    public void addItem(List<Integer> id) {
        for (Integer integer : id) {
            if (integer > 0) {
                basket.add(integer);
            } else {
                throw new WrongDataException();
            }
        }
    }

    @Override
    public List<Integer> getBasket() {
        return basket;
    }
}
