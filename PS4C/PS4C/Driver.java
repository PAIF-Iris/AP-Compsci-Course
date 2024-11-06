
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main (String args[]) {
        double num = Review.sentimentVal("beautiful");
        System.out.println(num);
        
        System.out.println(Review.totalSentiment("SimpleReview.txt"));
        System.out.println(Review.starRating("SimpleReview.txt"));

        System.out.println(Review.totalSentiment("YelpReview.txt"));
        System.out.println(Review.starRating("YelpReview.txt"));
        
        System.out.println(Review.fakeReview("SimpleReview.txt", "positive"));


    }
}
