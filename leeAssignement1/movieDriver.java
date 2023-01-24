package leeAssignement1;
/**
 * 
 * @author Pong Lee
 *
 */
public class movieDriver {
    public static void main(String[] args)
    {
        distributor d1 = new distributor("John Smith", "Alabama", "205-200-4191");
        d1.addMovie("Austin Powers: International Man of Mystery", "Jay Roach", 0, 5500);
        d1.addMovie("Dumb and Dumber", "Peter Farrelly", 0 , 4670);
        d1.addMovie("21 Jumpstreet", "Phil Lord", 0, 4000);
        d1.addMovie("Die Hard"," John McTiernan" , 1, 5000);
        d1.addMovie("Morbius", "Daniel Espinosa", 2, 1000);
        //d1.addMovie("Blade Runner 2049", "Denis Villeneuve", 2, 7500); tries to add the sixth movie but operation does not work/
        
        
        distributor d2 = new distributor("Mary Jones", "Kansas", "316-200-5266");
        d2.addMovie(new movie("Hangover", "Todd Phillips", 0, 9800));
        d2.addMovie(new movie("Black Sheep", "Penelope Spheeris", 0, 1567));
        
        System.out.println("DISTRIBUTOR 1:");
        System.out.println(d1);
        System.out.println("Comedy earnings: $" + d1.comedyEarnings());
        
        System.out.println("\nDISTRIBUTOR 2:");
        System.out.println(d2);
        System.out.println("Comedy earnings: $" + d2.comedyEarnings());
        
        System.out.println("\nAre Distributors 1 and 2 equal? " + d1.equals(d2));
    }
    
    public static double calculateTax(double taxRate, distributor distributor)
    {
        double totalEarnings = distributor.totalEarning();
        double tax = (totalEarnings * taxRate) / 100;
        return tax;
    }
}
