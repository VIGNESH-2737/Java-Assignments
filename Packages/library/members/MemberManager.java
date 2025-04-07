package library.members;

import java.util.ArrayList;
import java.util.List;

public class MemberManager {
    private List<Member> members;
    
    public MemberManager() {
        this.members = new ArrayList<>();
    }
    
    public void addMember(Member member) {
        members.add(member);
    }
    
    public Member findMemberById(String id) {
        for (Member member : members) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }
    
    public List<Member> getAllMembers() {
        return new ArrayList<>(members);
    }
}
