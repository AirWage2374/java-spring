@RestController
public class UserController {

    @GetMapping("/api/public")
    public String publicResource() {
        return "Ini adalah sumber daya publik yang dapat diakses tanpa autentikasi.";
    }

    @GetMapping("/api/private")
    public String privateResource() {
        return "Ini adalah sumber daya pribadi yang membutuhkan autentikasi.";
    }
}
