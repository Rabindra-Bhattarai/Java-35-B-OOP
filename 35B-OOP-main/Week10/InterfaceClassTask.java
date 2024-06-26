package Week10;

public class InterfaceClassTask {
    
}
/*
 * Task
 * Make an interface Media
 * make the following functions
 * void play()
 * void pause()
 * void next()
 * void previous()
 * String nowPlaying()
 * 
 * Make an interface DigitalMedia extending Media
 * make the following functions
 * double size()
 * double remaining(double current)
 * 
 * Make an interface OnlineAsset
 * make the following functions
 * void download()
 * 
 * Make a class Spotify and implement DigitalMedia and OnlineAsset
 */

interface Media{
    public void play();
    public void pause();
    public void next();
    public void previous();
    public String nowPlaying();
}
interface DigitalMedia extends Media{
    public double size();
    public double remaining(double current);
}
interface OnlineAsset{
    public void download();
}
class Spotify implements DigitalMedia,OnlineAsset{
    @Override
    public void play(){System.out.println("Is playing");}
    @Override
    public void pause(){System.out.println("Is playing");}
    @Override
    public void next(){System.out.println("Is playing");}
    @Override
    public void previous(){System.out.println("Is playing");}
    @Override
    public String nowPlaying(){return ("Is playing");}
    @Override
    public double size(){return 10.9d;}
    @Override
    public double remaining(double current){return 0;}
    @Override
    public void download(){System.out.println("Is playing");}
}