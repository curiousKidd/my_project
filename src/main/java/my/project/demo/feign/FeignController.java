package my.project.demo.feign;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequiredArgsConstructor
public class FeignController {

    private final FeignService feignService;

    @GetMapping(value = "/feign/test")
    public String test(HttpServletRequest request, HttpServletResponse response, Model model) {

        try {

            String barotem = feignService.getBarotem();
            StringBuffer result = new StringBuffer();

            for (int i = 0; i < barotem.length(); i++) {
                if (barotem.charAt(i) == '\\' && barotem.charAt(i + 1) == 'u') {
                    Character c = (char) Integer.parseInt(barotem.substring(i + 2, i + 6), 16);
                    result.append(c);
                    i += 5;
                } else {
                    result.append(barotem.charAt(i));
                }
            }
            
            model.addAttribute("response", result);
            return "barotem";
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }

    }

}
