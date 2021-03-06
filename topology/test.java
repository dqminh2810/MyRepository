package topology;

import java.io.IOException;
import java.net.URISyntaxException;

public class test {
	public static void main(String[] args) throws IOException, URISyntaxException{
		Color c1 = new Color(142, 132, 132);
		Color c2 = new Color(132, 132, 132);
		System.out.println("c1"+c1.toString()+"\n"+"Distance entre c1 et c2: "+Color.dist(c1,c2));
		System.out.println("c1 et c2 ont m�me couleur? "+c1.isequalto(c2));
		
		BoundingBox bb = new BoundingBox("test.png");
//		System.out.println(bb.bb[3]+","+bb.bb[2]);
		Color red = new Color(24,16,13);
		Matrix matrix = new Matrix("logo_tux.bmp");
		
		Mask mask = new Mask(matrix, red);
		matrix.applyMask(mask);
		System.out.println(red.toString());
		
////		for(int i=0; i<m.width; i++)
////			for(int j=0; j<m.height; j++)
////			System.out.println(m.val[i][j]);
//		
		matrix.save("test3");
	}
}
