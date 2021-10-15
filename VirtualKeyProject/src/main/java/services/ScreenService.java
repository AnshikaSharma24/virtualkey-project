package services;

import screens.screenoption;
import screens.Screen;
import screens.WelcomeScreen;
import system.Directory;


public class ScreenService {
	
	//static Directory dir = new Directory();
	
	
	
	public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static screenoption screenoption = new screenoption();
    
    

    public static Screen CurrentScreen = WelcomeScreen;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
