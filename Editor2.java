import java.awt.Color;

/**
 * Demonstrates the scaling (resizing) operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, and two integers that specify the width and the
 * height of the scaled, output image. For example, to scale/resize ironman.ppm to a width
 * of 100 pixels and a height of 900 pixels, use: java Editor2 ironman.ppm 100 900
 */
public class Editor2 {

	public static void main (String[] args){
        String fileName = args [0];

		int W = Integer.parseInt(args[1]);
		int H = Integer.parseInt(args[2]);

		Color [][] origin = Runigram.read(fileName);
        Color [][] scaled = Runigram.scaled(origin, W, H);

		Runigram.setCanvas(origin);
		Runigram.display(origin);
		StdDraw.pause (2000);


        Runigram.setCanvas(scaled); 
        Runigram.display(scaled);



}
}