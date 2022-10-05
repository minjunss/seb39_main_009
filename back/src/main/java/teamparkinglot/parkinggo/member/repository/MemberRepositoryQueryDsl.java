package teamparkinglot.parkinggo.member.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import teamparkinglot.parkinggo.member.dto.MyPageResDto;
import teamparkinglot.parkinggo.member.dto.SidebarDto;

public interface MemberRepositoryQueryDsl {

    MyPageResDto findMyPage(@Param("email") String email);

    SidebarDto findSidebar(@Param("email") String email);
}
