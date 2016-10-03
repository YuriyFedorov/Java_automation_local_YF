package round2.lesson13;

/**
 * Created by yuriyf on 10/3/2016.
 */
public class EnumTask
{
    public static void main(String[] args)
    {
        getTypeOfBeer();
        getNameAndTypeOfAlcoholContent();
    }

    // percentages are used as strings just `cause it's more simple in current task.
    private enum BEER
    {
        Heineken("Lager", "5.0%"),
        Guinness("Stout", "4.2%"),
        Corone("Lager", "4.6%"),
        Budweiser("Lager", "5.0%");
        private final String kindOf;

        private final String percentage;

        BEER(String kindOf, String percentage) {
            this.kindOf = kindOf;
            this.percentage = percentage;
        }

        public String getKindOf() {
            return kindOf;
        }
        public String getPercentage() {
            return percentage;
        }
    }

    public static void getTypeOfBeer(){
       System.out.println(BEER.Heineken.getKindOf());
       System.out.println(BEER.Guinness.getKindOf());
       System.out.println(BEER.Corone.getKindOf());
       System.out.println(BEER.Budweiser.getKindOf());
    }

    public static void getNameAndTypeOfAlcoholContent(){
       System.out.println(BEER.Heineken.name() + " " + BEER.Heineken.getPercentage());
       System.out.println(BEER.Guinness.name() + " " + BEER.Guinness.getPercentage());
       System.out.println(BEER.Corone.name() + " " + BEER.Corone.getPercentage());
       System.out.println(BEER.Budweiser.name() + " " + BEER.Budweiser.getPercentage());
    }
}
