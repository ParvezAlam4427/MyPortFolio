@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    @Autowired
    private ContactMessageService service;

    // Test endpoint for browser
    @GetMapping("/test")
    public String test() {
        return "Backend is working!";
    }

    @PostMapping
    public ResponseEntity<String> submitMessage(@RequestBody ContactMessage message) {
        service.saveMessage(message);
        return ResponseEntity.ok("Message Saved Successfully");
    }
}
