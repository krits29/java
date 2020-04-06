/**
 * Created by kritisharma on 2/22/20.
 */
import java.util.*;

public class WasteSorter
{
    //private HashMap<String, String> map = new HashMap();

    public static Random ness = new Random();
    public static String location;
    public static ArrayList<String> listr = new ArrayList<>();
    public static ArrayList<String> listc = new ArrayList<>();
    public static ArrayList<String> listt = new ArrayList<>();

    public WasteSorter()
    {
        this.addToList();
    }

    public void addToMap()
    {
//        map.put("r", "paper");
//        map.put("r", "cardboard");
//        map.put("r", "plastic bottles");
//        map.put("r", "jugs");
//        map.put("r", "tubs");
//        map.put("r", "glass bottles");
//        map.put("r", "jars");
//        map.put("r", "metal cans");
//
//        map.put("c", "grass clippings");
//        map.put("c", "tree leaves");
//        map.put("c", "vegetable food scraps");
//        map.put("c", "newspaper");
//        map.put("c", "tissues");
//        map.put("c", "cardboard");
//
//        map.put("t", "cat litter");
//        map.put("t", "pens and pencils");
//        map.put("t", "styrofoam");
//        map.put("t", "incandescent light bulbs");
//        map.put("t", "six pack ring holder");
//        map.put("t", "potato chip bags");
//        map.put("t", "wrappers");
//        map.put("t", "balloons");


    }

    public void addToList()
    {
        listr.add("paper");
        listr.add("cardboard");
        listr.add("plastic bottles");
        listr.add("jugs");
        listr.add("tubs");
        listr.add("glass bottles");
        listr.add("jars");
        listr.add("metal cans");

        listc.add("grass clippings");
        listc.add("tree leaves");
        listc.add("vegetable food scraps");
        listc.add("newspaper");
        listc.add("tissues");
        listc.add("cardboard");

        listt.add("cat litter");
        listt.add("pens and pencils");
        listt.add("styrofoam");
        listt.add("incandescent light bulbs");
        listt.add("six pack ring holder");
        listt.add("potato chip bags");
        listt.add("wrappers");
        listt.add("balloons");
    }

    public static String getItem()
    {
        int category = ness.nextInt(3) + 1;
        int arrayNumber = 0;

        if(category == 1)
        {
            arrayNumber = ness.nextInt(listr.size() - 1);
            location = "r";
            return listr.get(arrayNumber);
        }
        else if(category == 2)
        {
            arrayNumber = ness.nextInt(listc.size() - 1);
            location = "c";
            return listc.get(arrayNumber);
        }
        else
        {
            arrayNumber = ness.nextInt(listt.size() - 1);
            location = "t";
            return listt.get(arrayNumber);
        }

    }

    public String getLocation()
    {
        return this.location;
    }
}
