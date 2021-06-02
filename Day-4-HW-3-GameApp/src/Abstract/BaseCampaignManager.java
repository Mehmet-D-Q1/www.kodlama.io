package Abstract;

import Entities.Customer;
import Entities.Games;

public abstract class BaseCampaignManager implements ICampaignService{
    @Override
    public void campaignAdd(Games games, Customer customer) {

        System.out.println(games.getGameName() + " oyunu " + customer.getFirstName() + " tarafından % " + games.getDiscount() + " oranında indirime girdi.");
    }

    @Override
    public void campaignUpdate(Games games, Customer customer) {

        System.out.println(games.getGameName() + " oyununun yeni fiyatı: " + games.getPrice() + " TL dir.");
    }

    @Override
    public void campaignDelete(Games games, Customer customer) {
        System.out.println(games.getGameName() + " oyununun indirimine " + customer.getFirstName() + " tarafından son verildi.");

    }

}
