package Task.Management.DevTask;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface TaskRepository extends JpaRepository<EntityTask,Long> {
    org.springframework.data.domain.Page<EntityTask> findByAuthorId(Long authorId, Pageable pageable);
    Page<EntityTask> findByExecutorId(Long executorId, Pageable pageable);

}
