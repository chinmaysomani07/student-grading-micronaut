package in.one2n.studentgrading.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StudentScoreDTO {

  private String firstName;

  private String lastName;

  private String university;

  private Double test1Score;

  private Double test2Score;

  private Double test3Score;

  private Double test4Score;

  private Double finalScore;

  private String grade;
}
