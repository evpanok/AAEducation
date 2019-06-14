package ua.com.avesacademy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


    @SpringBootApplication
    public class Application {
        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }

        @Bean
        public CommandLineRunner demo(final UserService userService,final PageSaleService pageService) {
            return new CommandLineRunner() {
                @Override
                public void run(String... strings) throws Exception {
                    userService.addUser(new CustomUser("name","admin", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8", UserRole.ADMIN));
                    userService.addUser(new CustomUser("name2","user", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8", UserRole.USER));
                    pageService.addPageSale(new PageSale("first","title1","Text","https://fs30.fex.net/play/1428453805","https://d9db56472fd41226d193-1e5e0d4b7948acaf6080b0dce0b35ed5.ssl.cf1.rackcdn.com/spectools/docs/wd-spectools-word-sample-04.doc","https://go.microsoft.com/fwlink/?LinkID=521962","http://www.pdf995.com/samples/pdf.pdf"));


                }
            };
        }
    }
