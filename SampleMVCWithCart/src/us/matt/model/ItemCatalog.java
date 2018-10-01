package us.matt.model;

import java.util.ArrayList;
import java.util.List;

public class ItemCatalog {
    private List<Item> itemCatalog = new ArrayList<>();
    private int nextProductNumber;

    public ItemCatalog() {
        nextProductNumber = 1;
        itemCatalog.add(new Item(nextProductNumber++,"Beecham's Pills",44.75,false,"Worth a guinea a box - Beecham's pills make all the difference","images/Beechams_Pills.png"));
        itemCatalog.add(new Item(nextProductNumber++,"Daffy's Elixir",35.25,true,"Cures the following ailments: The Stone in Babies and Children; Convulsion fits; Consumption and Bad Digestives; Agues; Piles; Surfeits; Vapours from the Spleen; Green Sickness; Children's Distempers, whether the Worms, Rickets, Stones, Convulsions, Gripes, King's Evil, Joint Evil or any other disorder proceeding from Wind or Crudities; Gout and Rheumatism; Stone or Gravel in the Kidnies; Cholic and Griping of the Bowels","images/daffy.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Dalby's Carminative", 71.22,true,"Aids infants afflicted with wind, watery gripes, fluxes and other disorders of the stomach and bowels”","images/dalby.png"));
        itemCatalog.add(new Item(nextProductNumber++,"Hadacol",17.17,true,"Don't Be Satisfied With Symptomatic Relief! It's Possible to RELIEVE THE CAUSE OF YOUR AILMENTS When Lack Of Vitamins B1, B2, Iron and Niacin Cause Stomach Disturbances, Gas, Heartburn, Indigestion, Nagging Aches and Pains, and Certain Nervous Disorders.","images/hadacal.png"));
        itemCatalog.add(new Item(nextProductNumber++,"Lydia Pinkham",9.91,false,"Have you heard of Lydia Pinkum, And her love for the human race? How she sells (she sells, she sells) her wonderful compound, And the papers publish her face?","images/Lydia_Pinkham.png"));
        itemCatalog.add(new Item(nextProductNumber++,"Nine oils",103.52,true,"Men who work at heavy lifting and hauling, and are likely to get strains and ricks of the back, have a superstitious belief in the \"Nine Oils.\" It is the same wherever you go. What are they? what, the original Nine? Blessed if I know, nor they don't know either. But that don't make any difference.","images/snakeoil.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"RUB A535",4.44,false,"A popular product for the treatment of tough muscle pain, arthritic pains, rheumatic pains, bursitis, lumbago, etc.","images/Antiphlogistine.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Turlington's Balsam",17.77,false,"An effective in the treatment of kidney and bladder stones, cholic, and inward weakness","images/BalsomOfLifeBottles.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Clark Stanley's Snake Oil Liniment",13.33,false,"The viper oil of Mesues. Take 2 pounds of live snakes and 2 pounds 3 ounces of sesame oil. Cook slowly, covered in a glazed pot, until meat pulls away from bone. Strain and store. Uses: Cleans the skin, removes pimples, impetigo and other defects.","images/Snake_Oil_Liniment.png"));
    }

    public List<Item> getItemCatalog() {
        return itemCatalog;
    }

    public List<Item> getFeaturedItemCatalog() {
        List<Item> item = new ArrayList<>();

        for(Item i: itemCatalog) {
            if (i.isFeatured()) {
                item.add(i);
            }
        }
        return item;
    }
    public Item getSingleItem(int itemNum) {
        Item item=null;

        for(Item i: itemCatalog) {
            if (i.getProductNumer() == itemNum) {
                return i;
            }
        }
        return item;
    }
}
