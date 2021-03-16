@Controller
public class UserController {
   // 로그인 페이지로 이동
   @RequestMapping("/user/login.do)
   public String login() {
      logger.info("경로 : login");
      return "user/login";
   }

   @RequestMapping("/user/insert.do")
   public String insert() {
      logger.info("경로 : insert");
      return "user/insert";     
   }

   @RequestMapping("/user/update.do")
   public String update() {
      logger.info("경로 : update");
      return "user/update";     
   }
}  	