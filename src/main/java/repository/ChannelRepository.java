package repository;

import model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ChannelRepository extends JpaRepository<Channel,Integer> {

   public Optional<Channel> findByAdminId(Integer id);

    public Optional<Channel> findByParentId(Integer id);

    public Optional<Channel> findByTeacherId(Integer id);
}
