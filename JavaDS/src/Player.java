import java.util.*;

public class Player {

	
	private int playerId;
	private String playerName;
	private int Runs;
	private String playerType;
	private String matchType;
	
	Player(){}
	Player(int playerId, String playerName , int Runs , String playerType,String matchType){
		this.playerId = playerId;
		this.playerName = playerName;
		this.Runs = Runs;
		this.playerType = playerType;
		this.matchType = matchType;
	}
	
	
	
	
	
	public int getPlayerId() {
		return playerId;
	}
	public int getRuns() {
		return Runs;
	}
	public void setRuns(int runs) {
		Runs = runs;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerType() {
		return playerType;
	}
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	
	
	
}




