package kr.co.sboard.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class FileDTO {

    private int fno;
    private int ano;
    private String oName;
    private String sName;
    private int download;
    private String rdate;


}
