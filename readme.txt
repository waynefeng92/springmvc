ch01-hello-springMVC: 第一个springMVC项目

需求：用户在页面发起一个请求，请求交给springMVC的控制器处理，并显示请求的处理结果（在结果页面显示欢迎语句）

实现步骤：
1. 新建web maven工程
2. 加入依赖
   spring-webmvc依赖。在添加这个依赖时，会间接的把spring依赖都加入到项目中
   jsp，servlet依赖
3. 【重点】在web.xml中注册springMVC框架的核心对象DispatcherServlet
    1)DispatcherServlet叫做中央控制器，是一个servlet，继承HttpServlet
    2)DispatcherServlet也叫前端控制器（front controller）
    3)DispatcherServlet负责接收用户提交的请求，调用其他控制器对象，并将处理结果显示给用户
4. 创建以恶发起请求的界面index.jsp
5. 创建控制器类
    1)在类的上面加入@Controller注解，创建对象，并放到springMVC容器中
    2)在类中的方法上加入@RequestMapping注解
6. 创建一个作为结果的jsp，显示请求的处理结果
7. 创建springMVC的配置文件(和spring的配置文件一样)
    1)声明组件扫描器，指定@Controller注解所在的包名
    2)声明视图解析器，帮助处理试视图
