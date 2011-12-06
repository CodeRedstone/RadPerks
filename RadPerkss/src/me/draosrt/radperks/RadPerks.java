package me.draosrt.radperks;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class RadPerks extends JavaPlugin {

	protected RadPerksLogHandler log;
	public final RadPerksPlayerListener playerListener = new RadPerksPlayerListener(this);
	
	@Override
	public void onEnable() {
		this.log = new RadPerksLogHandler (this);
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvent(Event.Type.PLAYER_INTERACT, this.playerListener, Event.Priority.Normal, this);
		this.load();
		this.log.info("Enabled");
		
	}

	@Override
	public void onDisable() {
		this.log.info("Disabled");
		
		
	}
	private void load(){
		int i;
		boolean bla = true;
		playerListener.myHashMap.clear();  // clear the hashmap, should be clear anyway. you need to make it public in playerListener aswell.
		BufferedReader read = new BufferedReader(new FileReader(new File("myfile.txt")); // same file...	
		try {
			do{
				String s; // new string
				if((s =  read.readLine()) == null) { // if the next line doesn't exist <-- fail spelling
					break; // stop
				}
			
				
				String[] rads = s.split(":"); //split at :, same syntax as before
				playerListener.myHashMap.put(rads[0], Integer.parseInt(rads[1 // put it in the hashmap
				
			
			}while(true);	
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			
		}
			
	}

	
	
}
