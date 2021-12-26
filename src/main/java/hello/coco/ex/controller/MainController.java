package hello.coco.ex.controller;

import hello.coco.ex.model.BoardVO;
import hello.coco.ex.model.MemberVO;
import hello.coco.ex.service.BoardService;
import hello.coco.ex.service.BoardServiceImpl;
import hello.coco.ex.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Parameter;
import java.util.List;

@Controller
@Slf4j
public class MainController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/main")
    public String helloCon() throws Exception {
        return "main";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginCon(Model model, MemberVO memberVO) throws Exception {

        if (memberVO != null) {
            model.addAttribute(memberService.loginMember(memberVO));
        }
        model.addAttribute("id", memberVO.getId());
        return "enterBoard";
    }

    @RequestMapping("/memberInfo/{id}")
    public String memberInfo(Model model, @PathVariable("id") String id) throws Exception {
        model.addAttribute("memberInfo", memberService.MemberInfo(id));
        return "memberInfo";
    }
}
