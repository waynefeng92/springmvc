package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 注解@Controller:创建处理器对象，对象放在springMVC容器中
 * 位置：在类的上面
 */
@Controller
public class MyController {
    /*
        处理用户提交的请求，springMVC是使用方法来处理的
        方法是自定义的，可以有多种返回值，多种参数，方法名称自定义
    */

    /**
     * 准备使用doSome处理some.do请求
     * 使用@RequestMapping注解，意为请求映射，作用是把一个请求地址和一个方法绑定在一起，一个请求制定一个方法处理
     *      属性：1.value 是一个String，表示请求的地址，value值必须是唯一的，在使用时，推荐以"/"开头
     *      位置：在方法的上面（常用）或在类的上面
     * @return ModelAndView，表示本次请求处理的结果
     *          Model：数据，请求处理完成后，要显示给用户的数据
     *          View: 视图，比如jsp之类的
     */
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome() {
        ModelAndView mv = new ModelAndView();

        // 相当与request.setAttribute()
        mv.addObject("msg","欢迎使用Spring MVC");
        mv.addObject("func","执行的是doSome方法");

        // 相当于request.getRequestDispatcher("/show.jsp").forward(request,response)
        // mv.setViewName("/show.jsp");
        // 配置了视图解析器后，就可以使用文件名，指定视图
        mv.setViewName("show");

        return mv;
    }
}
