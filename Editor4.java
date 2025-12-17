
import java.awt.Color;

/**
 This client program performs another striking visual effect: it morphs an image into its grescaled
version. For example:
% java Editor4 thor.ppm 50
This action transforms the colored Thor image into a black and white Thor image.
Implement the Editor4.java program, and test it. Sit back, watch, and enjoy.
Implementation tips: The skeleton of the Editor4.java class is not given. You should write,
document, and implement it yourself, from scratch. It’s quite similar to Editor3.
 */
public class Editor4 {

	public static void main (String[] args) {
		String source = args[0];
        int n = Integer.parseInt(args [1]);
        
		Color[][] sourceImage = Runigram.read(source);
		Color[][] targetImage = Runigram.grayScaled(sourceImage);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, targetImage, n);
	}
}



