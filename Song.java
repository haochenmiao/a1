// Haochen Miao
// 01/14/2020
// CSE142
// TA: Siming Yin
// Assignment #1
// This program will print out the song of a woman who swallowed a lot of innocent animals by using the static method.
public class Song{
   public static void main(String[] args){
      sestet();
      sestet1();
      sestet2();
      sestet3();
      sestet4();
      sestet5();
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");
      }
   public static void sestet() {
      System.out.println("There was an old woman who swallowed a fly.");
      drawfly();
      System.out.println();
      }
    public static void sestet1() {
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      drawspider();
      drawfly();
      System.out.println();
      }
      //check
    public static void sestet2() {
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      drawbird();
      drawspider();
      drawfly();
      System.out.println();
      }
      //check
    public static void sestet3() {
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      drawcat();
      drawbird();
      drawspider();
      drawfly();
      System.out.println();
      }
    public static void sestet4() {
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      drawdog();
      drawcat();
      drawbird();
      drawspider();
      drawfly();
      System.out.println();
      }
    public static void sestet5() {
      System.out.println("There was an old woman who swallowed a whale,");
      System.out.println("Hopefully she ate well.");
      drawwhale();
      drawdog();
      drawcat();
      drawbird();
      drawspider();
      drawfly();
      System.out.println();
      }            
   public static void drawfly() {
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
      }
   public static void drawspider() {
      System.out.println("She swallowed the spider to catch the fly,");
        }
   public static void drawbird() {
      System.out.println("She swallowed the bird to catch the spider,");
      }
   public static void drawcat() {
      System.out.println("She swallowed the cat to catch the bird,");
      }
   public static void drawdog() {
      System.out.println("She swallowed the dog to catch the cat,");
      }
   public static void drawwhale() {
      System.out.println("She swallowed the whale to catch the dog,");
      }
  }
