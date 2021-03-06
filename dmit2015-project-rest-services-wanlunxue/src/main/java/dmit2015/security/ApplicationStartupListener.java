/**
 * This is application startup listener, which generate 3 startup user when application starts
 *
 * @author  Wanlun Xue
 * @version 1.0
 * @lastModified   2021.03.23
 */

package dmit2015.security;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.logging.Logger;

@WebListener
public class ApplicationStartupListener implements ServletContextListener {
    private static final Logger logger = Logger.getLogger(ApplicationStartupListener.class.getName());

    @Inject
    CallerUserRepository callerUserRepository;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        if (callerUserRepository.list().size() == 0) {
            logger.info("Creating default accounts for application");
            CallerUser user01 = new CallerUser();
            user01.setUsername("user01@dmit2015.ca");
            callerUserRepository.add(user01, "Password2015", new String[]{"USER"});
            CallerUser user02 = new CallerUser();
            user02.setUsername("admin01@dmit2015.ca");
            callerUserRepository.add(user02, "Password2015", new String[]{"ADMIN"});
            CallerUser user03 = new CallerUser();
            user03.setUsername("user02@dmit2015.ca");
            callerUserRepository.add(user03, "Password2015", new String[]{"USER"});

        } else {
            logger.info("Application has user accounts");
        }
    }
}