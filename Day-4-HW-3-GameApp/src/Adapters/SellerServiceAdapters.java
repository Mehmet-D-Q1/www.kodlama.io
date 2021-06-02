package Adapters;

import Abstract.ISellerDiscountService;
import Entities.Games;

public class SellerServiceAdapters implements ISellerDiscountService {

    @Override
    public double discountedPrice(Games games)
    {
        return games.getPrice() - (games.getPrice() * games.getDiscount()) / 100;
    }

}
