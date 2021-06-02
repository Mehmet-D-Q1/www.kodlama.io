package Abstract;

import Entities.Customer;
import Entities.Games;

public interface ICampaignService {
    void campaignAdd(Games games, Customer customer);
    void campaignUpdate(Games games, Customer customer);
    void campaignDelete(Games games, Customer customer);
}
