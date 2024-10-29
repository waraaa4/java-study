package collection;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();

		// 회원 4명 생성
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "고길동");
		
		// 회원 4명 추가
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(member4);

		// 회원 목록 조회
		memberArrayList.showAllMember();

		// 아이디로 4번째 회원 삭제
		memberArrayList.removeMember(1004);
		
		// 회원 목록 조회
		memberArrayList.showAllMember();

	}

}

class MemberArrayList {

	ArrayList<Member> list;

	// 인스턴스 생성 + 초기화
	public MemberArrayList() {
		list = new ArrayList<Member>(); // 리스트를 먼저 생성해야함
	}

	// 리스트에 회원을 추가하는 메소드
	public void addMember(Member member) {
		list.add(member);
	}

	// 아이디로 회원을 삭제하는 메소드
	public void removeMember(int memberId) {
		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			int id = member.memberId;
			if (id == memberId) {
				list.remove(i);
				System.out.println(memberId + " 회원 삭제");
				return;
			}
		}
		System.out.println(memberId + "번 회원이 존재하지 않습니다");
	}

	// 전체 회원을 출력하는 메소드
	public void showAllMember() {

		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			System.out.println(member);
		}
	}
}
