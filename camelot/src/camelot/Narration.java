package camelot;

public class Narration
{
    boolean playing;//o xristis pataei anaparagwgi
    boolean finished;//h anaparagwgh oloklirothike
    public Narration()
    {
    this.playing = false;
    this.finished = false;
    }
    public void setPlaying(boolean playing){
        this.playing = playing;
    }
    public void setFinished(boolean finished){
        this.finished = finished;
    }
public void loadAudioClip(Role checkrole)
    {
        boolean mybool = checkrole.checkRoles();
        //load audio clip 
    }
    
}