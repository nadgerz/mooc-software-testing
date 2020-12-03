package tudelft.numfinder;

public class NumFinderMain {

    public static void main(String[] args) {
        NumFinder nf1 = new NumFinder();

        // this works
        nf1.find(new int[]{4, 25, 7, 9});
        System.out.println(nf1.getLargest());
        System.out.println(nf1.getSmallest());


        NumFinder nf2 = new NumFinder();

        // this no longer crashes
        nf2.find(new int[]{4, 3, 2, 1});
        System.out.println(nf2.getLargest());
        System.out.println(nf2.getSmallest());


        NumFinder nf3 = new NumFinder();

        // this no longer crashes
        nf3.find(new int[]{4, Integer.parseInt(null), 2, 1});
        System.out.println(nf3.getLargest());
        System.out.println(nf3.getSmallest());
    }
}
