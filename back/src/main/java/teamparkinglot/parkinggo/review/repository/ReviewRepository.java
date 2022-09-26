package teamparkinglot.parkinggo.review.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import teamparkinglot.parkinggo.review.entity.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    @Query("select r from Review r join fetch r.member join fetch r.parking where r.parking.id = :parkingId order by r.createdDate desc")
    List<Review> findReviewsByParkingOrderByCreatedDateDesc(@Param("parkingId") Long parkingId);

    @Query("select r from Review r where r.member.id = :memberId and r.parking.id = :parkingId")
    Optional<Review> findByMemberIdAndParkingId(@Param("memberId") Long memberId, @Param("parkingId") long parkingId);
}
