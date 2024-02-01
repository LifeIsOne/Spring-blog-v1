package shop.mtcoding.blog.board;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data   //  getter, setter, toString
@Entity
@Table(name = "board_tb")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  AUTO_INCREMENT
    private int id;
    private String title;
    private String content;
    private int userId;    //   N에 Foreign Key

    @CreationTimestamp
    private LocalDateTime createdAt;
}
