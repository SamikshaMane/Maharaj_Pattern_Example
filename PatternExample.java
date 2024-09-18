import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

class PatternExample
{
	public static void main(String[] args){
		File file = new File("C:\\Users\\vaish\\OneDrive\\Desktop\\PatternExample\\MaharajPattern.jpeg");
		try{
			BufferedImage image = ImageIO.read(file);
			for(int i=0;i<image.getHeight();i++){
				for(int j=0;j<image.getWidth();j++){
					Color color = new Color(image.getRGB(j,i));
					if((color.getRed()==0)&& (color.getBlue()==0)&&(color.getGreen()==0))
					{
						System.out.print("*");
					}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}catch(Exception e){
		System.out.println("Exception Occured");
	}
}
}