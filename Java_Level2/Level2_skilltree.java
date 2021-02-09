// 프로그래머스 - 스킬트리

public class Level2_skilltree {

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE","CBADF","AECB","BDA"};
		int answer = skill_trees.length;
		
		for(int i=0;i<skill_trees.length;i++) {
			int[] order = new int[skill.length()];
			Boolean check = false;
			Boolean out = false;
			for(int j=0;j<skill.length();j++) {
				if(skill_trees[i].indexOf(skill.charAt(j)) == -1) {
					check = true;
				}else if(check) {
					answer--;
					out = true;
					break;
				}
				order[j] = skill_trees[i].indexOf(skill.charAt(j));
			}
			
			if(out) {
				continue;
			}
			
			for(int j=skill.length()-1;j>0;j--) {
				if(order[j] == -1) {
					continue;
				}
				else if(order[j] < order[j-1]) {
					answer--;
					break;
				}
			}
		}
		
		System.out.println(answer);		
	}

}
