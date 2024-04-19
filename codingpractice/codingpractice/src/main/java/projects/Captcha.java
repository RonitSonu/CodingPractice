package projects;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

public class Captcha {



    private String captchaString;

    public static final String CATCHA_CHARS = "ABCDEFGHJKLMNPQRSTUVWXYabcdefghjkmnpqrstuvwxy23456789";

    public BufferedImage getCaptchaImage(){
        try{
            Color backGroundColor = Color.white;
            Color borderColor = Color.black;
            Color textColor = Color.black;
            Color circleColor = new Color(190, 160, 150);
            Font textFont = new Font("Verdana", Font.BOLD, 20);
            int charsToPrint = 6;
            int width = 160;
            int height = 50;
            int circlesToDraw = 25;
            float horizMargin = 10.0f;
            double rotationRange = 0.7;

            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = (Graphics2D) bufferedImage.getGraphics();
            g.setColor(backGroundColor);
            g.fillRect(0, 0, width, height);

            //Let's make some noisy circles
            g.setColor(circleColor);
            for(int i=0; i< circlesToDraw; i++){
                int L = (int) (Math.random() * height / 2.0);
                int X = (int) (Math.random() * width - L);
                int Y = (int) (Math.random() * height - L);
                g.draw3DRect(X, Y , L*2, L*2, true);
            }
            g.setColor(textColor);
            g.setFont(textFont);
            FontMetrics fontMetrics = g.getFontMetrics();
            int maxAdvance = fontMetrics.getMaxAdvance();
            int fontHeight = fontMetrics.getHeight();

            String eligibleChars = CATCHA_CHARS;
            char[] chars = eligibleChars.toCharArray();
            float spaceForLetters = -horizMargin * 2 + width;
            float spacePerChar = spaceForLetters / (charsToPrint - 1.0f);

            StringBuffer finalString = new StringBuffer();
            for(int i=0; i<charsToPrint; i++){
                double randomValue = Math.random();
                int randomIndex = (int) Math.round(randomValue * (chars.length - 1));
                char characterToShow = chars[randomIndex];
                finalString.append(characterToShow);

                //this is a separate canvas used for the character so that we can rotate it independently
                int charWidth = fontMetrics.charWidth(characterToShow);
                int charDim = Math.max(maxAdvance, fontHeight);
                int halfCharDim = (int) (charDim / 2);
                BufferedImage charImage = new BufferedImage(charDim, charDim, BufferedImage.TYPE_INT_ARGB);
                Graphics2D charGraphics = charImage.createGraphics();
                charGraphics.translate(halfCharDim, halfCharDim);
                double angle = (Math.random() - 0.5) * rotationRange;
                charGraphics.transform(AffineTransform.getRotateInstance(angle));
                charGraphics.translate(-halfCharDim, -halfCharDim);
                charGraphics.setColor(textColor);
                charGraphics.setFont(textFont);
                int charX = (int) (0.5 * charDim - 0.5 * charWidth);
                charGraphics.drawString("" + characterToShow, charX,
                        (int) ((charDim - fontMetrics.getAscent()) / 2 + fontMetrics.getAscent()));
                float x = horizMargin + spacePerChar * (i) -charDim / 2.0f;
                int y = (int) ((height - charDim) / 2);
                g.drawImage(charImage, (int) x, y , charDim, charDim, null, null);
                charGraphics.dispose();
            }
            g.setColor(borderColor);
            g.drawRect(0, 0 , width - 1, height - 1);
            g.dispose();
            captchaString = finalString.toString();
            System.out.println("Captcha String generated: "+captchaString);
            return bufferedImage;


        }catch (Exception e){
            //e.printStackTrace();
            throw new RuntimeException("Unable to build image",e);
        }

    }

    public static void main(String[] args) {

        Captcha c = new Captcha();
        System.out.println(c.getCaptchaImage().getGraphics());
    }


}
