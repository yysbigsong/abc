package bean;

import lombok.*;

/*@Getter
@Setter
@ToString
@EqualsAndHashCode*/
//@Data

@EqualsAndHashCode(exclude = {"name"})
@Getter
@Setter
@ToString(exclude = {"sex","name"})
/*
@NoArgsConstructor//用于生成一个无参构造方法
@RequiredArgsConstructor//生产一个包含了被@NotNull标识的变量的构造方法，同样设置生成构造方法的权限
//使用access参数进行设置
@AllArgsConstructor//生成一个包含所有变量，同时如果变量使用了@NotNull，会进行过是否为空的校验
*/
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor
/*@Value//对于final，只提供get*/
@Builder
public class User {
    /*@Getter @Setter*/ private String name;
    /*@Getter(AccessLevel.PROTECTED)*/ private int age;//指定访问权限
    /*@Getter @Setter*/ private String sex;
    private String phone;
    private transient String address;//不参与equals和hashcode
    private String createtime;
}
