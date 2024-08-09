package aug07facade;

public class HomeThreaterFacade {

	RoomLight roomlight ;
	SoundSystem soundsystem;
	Television television ;
	
	public HomeThreaterFacade(RoomLight rommlight, SoundSystem soundsystem, Television television) {
		super();
		this.roomlight = roomlight;
		this.soundsystem = soundsystem;
		this.television = television;
	}
	
	
	public void watchmovie () {
		  roomlight.lightDim();		
		  television.switchOffTv();
		  soundsystem.switchOnSoundSystem();
		 
	}
	
	public void stopwatching() {
		
		 roomlight.lightDim();
		 television.switchOnTv();
		 soundsystem.switchOnSoundSystem();
		 
		
	}
	
		

	}


