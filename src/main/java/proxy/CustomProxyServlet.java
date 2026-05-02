package proxy;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/*")
public class CustomProxyServlet extends org.mitre.dsmiley.httpproxy.ProxyServlet {

    /** Serialization constant. */
    private static final long serialVersionUID = -1094805546046550603L;


    @Override
    protected String getConfigParam(String key) {
        return System.getProperty("proxy." + key, super.getConfigParam(key));
    }
}
