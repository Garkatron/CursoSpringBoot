package cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItsPalindromeRestController {

    @GetMapping("/ItsPalindrome/{word}")
    public String itsPalindrome(@PathVariable String word) {
        char[] w = word.toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = w.length - 1; i >= 0; i--) {
            str.append(w[i]);
        }


        boolean pal = str.toString().equals(word);
        return "The word its a palindrome: " + pal;
    }

    // https://www.youtube.com/watch?v=319Vm8BHCJk
}
