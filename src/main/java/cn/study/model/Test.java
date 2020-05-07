package cn.study.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("test")
public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String code;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
}
