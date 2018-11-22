package mymusicplayer;
import javax.sound.midi.*;

public class mymusicapp {
public static void main(String args[]){
	mymusicapp muzic = new mymusicapp();
	muzic.play();
	System.out.println("hello");
}
	public void play(){
		try{
			Sequencer player= MidiSystem.getSequencer();
				player.open();
				
			Sequence seq=new Sequence(Sequence.PPQ,4);
				
			Track track=seq.createTrack();
				
			ShortMessage a=new ShortMessage();
			a.setMessage(144,3,44,100);
			MidiEvent noteOn=new MidiEvent(a,1);
			track.add(noteOn);
				
			ShortMessage b=new ShortMessage();
			b.setMessage(144,9,44,100);
			MidiEvent noteOff=new MidiEvent(b,16);
			track.add(noteOff);
			
				player.setSequence(seq);
				player.start();
				
				
				}
		catch(Exception ex){
			
			ex.printStackTrace();
			
		}
	}
}
