package homework4;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
//        System.out.println("请求对象销毁！");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
//        System.out.println("请求对象创建！");
    }

}
