package world.girin.bizvault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BizVaultApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizVaultApplication.class, args);
    }

}
