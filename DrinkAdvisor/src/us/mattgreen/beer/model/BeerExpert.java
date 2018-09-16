package us.mattgreen.beer.model;

import java.util.*;

/**
 * This class is an abstraction of a real beer expert that can make
 * recommendations about beer products based on a color preference.
 * 
 * @author  Textbook, with modifications by Jim Lombardo
 * @version 1.02
 */
public class BeerExpert {
    
    /**
     * Retrieves the beer recommendations.
     * 
     * @param color - the color preference for beer. NOTE: the color is
     * is validated in any way and a String is required.
     * @return a collection of beer products that are appropriate
     * for the preferred beer color
     */
    public List getBrands(String color) {
        List brands = new ArrayList();
        
        if (color.equals("light")) {
             brands.add("Miller Lite");
             brands.add("Michelob Ultra");
             
        } else if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
            
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }

        return brands;
    }
}
