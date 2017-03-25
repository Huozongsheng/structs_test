package Login;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by huozongsheng on 2017/3/24.
 */
public class Login_action extends ActionSupport {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String execute() throws Exception {
        if (getUsername().equals("test") && getPassword().equals("123"))
        {
            ActionContext.getContext().getSession().put("user", getUsername());
            return SUCCESS;
        } else {
            return ERROR;
        }

    }
}
