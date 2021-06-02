package Abstract;

import Entities.Customer;
import Entities.Games;

public interface ISellerService {
    void sell(Games games, Customer customer);
}
