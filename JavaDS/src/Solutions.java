import java.util.Scanner;

class Solutions{
	
	public static void main(String[] args) {
		Player player[] = new Player[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter players....");
		for(int i=0;i<4;i++) {
			
			
				int id = sc.nextInt();sc.nextLine();
				String name = sc.nextLine();
				int run = sc.nextInt();sc.nextLine();
				String playerType = sc.nextLine();
				String matchType = sc.nextLine();
				Player p = new Player(id,name,run,playerType,matchType);
				
			player[i] = p;
		}
		
		System.out.println("Enter player type....");
		String playerType  = sc.nextLine();
		System.out.println("Enter match type....");
		String matchType  = sc.nextLine();
		Player playerRun = findPlayerWithLowestRun(player,matchType);
		System.out.println(playerRun);
		if(playerRun!=null) System.out.println(playerRun.getRuns());
		else System.out.println(0+"--> no lowest run");
		
		Player []p = findPlayerByMatchType(player,matchType);
		
		if(p==null) System.out.println("No such player found");
		else {
			for(int i=0;i<p.length;i++) {
						System.out.println(p[i].getRuns());
						break;
			    }
			}
	}
	
	static Player findPlayerWithLowestRun(Player player[], String playerType){
		Player p = new Player();
		int minimumRun = Integer.MAX_VALUE;
		boolean f = false;
		for(int i=0;i<player.length;i++) {
			if(player[i].getPlayerType().equalsIgnoreCase(playerType)) {
				if(player[i].getRuns()<minimumRun) {
					p = player[i];
					minimumRun = player[i].getRuns();
					f = true;
				}
			}
		}
		
		if(!f)
			return null;
		
		return p;
		
	}
	static Player[] findPlayerByMatchType(Player player[], String matchType){
		Player []p = new Player[4];
		boolean f = false;
		for(int i=0;i<player.length;i++) {
			if(player[i].getMatchType().equalsIgnoreCase(matchType)) {
				    p[i] = player[i];
					f = true;
				
			}
	   }
		if(!f) return null;
		return p;
	}
}
