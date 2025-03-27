package kr.co.sboard.repository;

import kr.co.sboard.entity.Article;
import kr.co.sboard.entity.Comment;
import kr.co.sboard.repository.custom.ArticleRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
