package buem.zui.summerschooltheater.model;

import java.time.LocalDateTime;

//class-agregattor
public class OperaTheater {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    //Custom
    private Actors actors;
    private Repertoire operas;
}
