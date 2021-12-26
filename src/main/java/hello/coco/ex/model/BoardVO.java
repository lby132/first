package hello.coco.ex.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class BoardVO {

    private int bid;
    private String cate_cd;
    private String title;
    private String content;
    private String tag;
    private int view_cnt;
    private String reg_id;
    private String reg_dt;
    private String edit_dt;

}
