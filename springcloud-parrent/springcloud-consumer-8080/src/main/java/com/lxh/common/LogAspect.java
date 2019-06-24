package com.lxh.common;



import com.google.gson.Gson;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


@Aspect
@Component
public class LogAspect
{


    private final static String PARAMS_TOKEN = "token";

    private final static boolean CHECK_FALG = true;

    @Pointcut("execution(public * com.lxh.controller.*.*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void logPointCut()
    {

    }


    @Before("logPointCut()")
    public void doBefore(JoinPoint joinPoint) throws Throwable
    {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        System.out.println("请求开始_START >>>URL=" + request.getRequestURL().toString());
    }


    @Around("logPointCut()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable
    {
        long startTime = System.currentTimeMillis();
        Object ob = pjp.proceed();// ob 为方法的返回值
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        System.out.println("请求结束_END >>>URL=" + request.getRequestURL().toString() + "-- 输出= " + new Gson().toJson(ob) + "-- 耗时=" + (System.currentTimeMillis() - startTime));
        return ob;
    }


//    //获取是否登录
//    public boolean checkAccess(HttpServletRequest request)
//    {
//        boolean isOut = false;
//        // 验证
//        if (null != request.getCookies())
//        {
//            for (Cookie entity : request.getCookies())
//            {
//                if (entity.getName().equals(PARAMS_TOKEN))
//                {
//                    String cache_token = member_token.get("registration_member_token" + entity.getValue());
//                    if (cache_token != null)
//                    {
//                        member_token.setExpire("registration_member_token" + entity.getValue(), 1800);
//                        System.out.print(member_token.ttl("registration_member_token" + entity.getValue()));
//                        isOut = true;
//                        break;
//                    }
//                }
//            }
//        }
//        return isOut;
//    }
}
