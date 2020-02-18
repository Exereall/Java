	class Tv{
		
	int channel=1;
	int volumeLevel=1;
	boolean on=false;
		
	
	public Tv() {
		
		
	
	
	}
	public void turnOn() {
		on=true;
	}
	
	public void turnOff() {
	on=false;
	}
	public void setChannel(int NewChannel) {
		this.channel=NewChannel;
	}
	public void setVolume(int NewVolume) {
		this.volumeLevel=NewVolume;
	}
	public void channelUp() {
		if(on&&channel>=1&&channel<120) {
			channel++;
		}
			
	}
	public void channelDown() {
		if(on&&channel>=1&&channel<=120) {
			channel--;
		}
			
	}
	public void VolumeUp() {
		if(on&&volumeLevel>1&&volumeLevel<=7) {
			volumeLevel++;
		}
			
	}
	public void VolumeDown() {
		if(on&&volumeLevel>1&&volumeLevel<=7) {
			volumeLevel--;
			System.out.println(volumeLevel);
		}
			
	}
	}

public class Main {
	public static void main(String[] args) {
		Tv tv1= new Tv();
		tv1.channelUp();e
		System.out.println(tv1.channel);
	}



	
	
	
	
	
}
