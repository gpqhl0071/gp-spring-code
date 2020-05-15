import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;

public class Test {

  public static void main(String[] args) {
    //定义main函数测试效果
// 创建 "SecurityFactory",加载ini配置,并通过它创建SecurityManager
    IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro.ini");
    SecurityManager securityManager = factory.getInstance();

// 将SecurityManager托管到SecurityUtils⼯具类中(ops:之后可以不必关⼼SecurityManager)
//因为直接操作SecurityManager太复杂、易出错。
    SecurityUtils.setSecurityManager(securityManager);

// 获得Subject，通过subject可以执⾏shiro的相关功能操作(身份认证或权限校验等)
//几乎所有操作，除了加密，因为加密是其他模块，可以在架构图看到。每次创建了subject都会从session中同步一下信息。直接由用户使用，调用功能简单，其底层调用Securitymanager的相关流程
    Subject currentUser = SecurityUtils.getSubject();

// 身份认证( 类似登录逻辑 )
    if (!currentUser.isAuthenticated()) {//判断是否已经登录
      //如果未登录，则封装⼀个token，其中包含 ⽤户名和密码
      UsernamePasswordToken token = new UsernamePasswordToken("zhangsan", "123");
      try {
        //将token传⼊login⽅法，进⾏身份认证 (判断⽤户名和密码是否正确)
        currentUser.login(token);//如果失败则会抛出异常
      } catch (UnknownAccountException uae) {//⽤户不存在
        System.out.println("There is no user with username of " + token.getPrincipal());
      } catch (IncorrectCredentialsException ice) {//密码错误
        System.out.println("Password for account " + token.getPrincipal() + " was incorrect!");
      } catch (LockedAccountException lae) {//账户冻结，例如多次登陆
        System.out.println("The account for username "
            + token.getPrincipal()
            + " is locked. Please contact your administrator to unlock it.");
      } catch (AuthenticationException ae) {//其他认证异常
      }
    }

// 认证成功则⽤户信息会存⼊ currentUser（Subject）
    System.out.println("User [" + currentUser.getPrincipal() + "] logged in successfully.");

// 可以进⼀步进⾏⻆⾊校验 和 权限校验
    if (currentUser.hasRole("admin")) { //校验⻆⾊
      System.out.println("hello,boss");
    } else {
      System.out.println("Hello, you");
    }
    if (currentUser.isPermitted("user:update")) { //校验权限
      System.out.println("you can update user");
    } else {
      System.out.println("Sorry, you can not update.");
    }
// ⽤户退出，会清除⽤户状态 身份信息，登录状态信息，权限信息，角色信息，会话信息 全部抹除
    currentUser.logout();
// System.exit(0);
  }
}
