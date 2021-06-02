package com.company;

import Abstract.BaseCampaignManager;
import Abstract.BaseCustomerManager;
import Abstract.BaseSellerManager;
import Adapters.EdevletServiceAdapter;
import Adapters.SellerServiceAdapters;
import Concreate.CampaigningManager;
import Concreate.GamerCustomerManager;
import Concreate.SellerCustomerManager;
import Entities.Gamer;
import Entities.Games;
import Entities.Seller;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        BaseCustomerManager baseCustomerManager = new GamerCustomerManager(new EdevletServiceAdapter());
        BaseCampaignManager baseCampaignManager = new CampaigningManager(new SellerServiceAdapters());
        BaseSellerManager baseSellerManager = new SellerCustomerManager(new SellerServiceAdapters());
        Gamer gamer = new Gamer(1, "melike@selvan.com","Melike", " Selvan", LocalDate.of(1988,2,2), "33255648523", "Melike01");
        Seller seller = new Seller(2, "selim@yorgun.com","Selim", " Yorgun", LocalDate.of(2001,2,2), "98653471255", "Selim01");
        Games games1 = new Games("CallOfDuty", 350, 25);
        Games games2 = new Games("MedalOfHonor", 250, 15);

        baseCustomerManager.add(gamer);
        baseCustomerManager.update(gamer);
        baseCustomerManager.delete(gamer);


        baseSellerManager.sell(games1, gamer);
        baseSellerManager.sell(games2, gamer);

        baseCampaignManager.campaignAdd(games1, seller);
        baseCampaignManager.campaignUpdate(games1, seller);
        baseCampaignManager.campaignDelete(games1, seller);

    }
}
