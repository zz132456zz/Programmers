// 프로그래머스 - [3차] 방금그곡

public class Level2_JustThatSong {

	public static void main(String[] args) {
		//String m = "ABCDEFG";
		//String[] musicinfos = {"12:00,12:14,HELLO,CDEFGAB","13:00,13:05,WORLD,ABCDEF"};
		String m = "CC#BCC#BCC#BCC#B";
		String[] musicinfos = {"03:00,03:30,FOO,CC#B","04:00,04:08,BAR,CC#BCC#BCC#B"};
		String answer = "";
		int match = -1;
		
		String m_sharp = m.replaceAll("C#", "c").replaceAll("D#", "d").replaceAll("F#", "f").replaceAll("G#", "g").replaceAll("A#", "a");
		String[][] music = new String[musicinfos.length][4];
		for(int i = 0; i < musicinfos.length; i++) {
			music[i] = musicinfos[i].split(",");
			music[i][3] = music[i][3].replaceAll("C#", "c").replaceAll("D#", "d").replaceAll("F#", "f").replaceAll("G#", "g").replaceAll("A#", "a");
		}
		
		String[] playmusic = new String[musicinfos.length];
		for(int i = 0; i < musicinfos.length; i++) {
			int hour1 = Integer.parseInt(music[i][0].split(":")[0]);
			int minute1 = Integer.parseInt(music[i][0].split(":")[1]);
			int hour2 = Integer.parseInt(music[i][1].split(":")[0]);
			int minute2 = Integer.parseInt(music[i][1].split(":")[1]);
			int time = (hour2 - hour1) * 60 + (minute2 - minute1);
			
			String temp = "";
			int len = music[i][3].length();
			for(int j = 0; j < time; j++) {
				temp += music[i][3].charAt(j % len);
			}
			playmusic[i] = temp;
			
			if(playmusic[i].contains(m_sharp)) {
				if(match == -1)
					match = i;
				else if(playmusic[i].length() > playmusic[match].length())
					match = i;
			}
		}
		
		if(match == -1)
			answer = "(None)";
		else
			answer = music[match][2];
		
		System.out.println(answer);

	}

}
