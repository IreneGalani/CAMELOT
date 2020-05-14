
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
public void loadAudioClip(Role merlin,Role percival,Role mordred,Role oberon,Role morgana,boolean isUsed)
    {
        merlin.checkRoles(isUsed);
        percival.checkRoles(isUsed);
        mordred.checkRoles(isUsed);
        oberon.checkRoles(isUsed);
        morgana.checkRoles(isUsed);
        //load audio clip 
    }
    
}
