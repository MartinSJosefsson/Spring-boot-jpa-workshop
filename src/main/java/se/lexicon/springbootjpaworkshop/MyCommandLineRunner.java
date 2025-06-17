package se.lexicon.springbootjpaworkshop;

import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.springbootjpaworkshop.entity.AppUser;
import se.lexicon.springbootjpaworkshop.repository.AppUserRepository;
import se.lexicon.springbootjpaworkshop.repository.BookLoanRepository;
import se.lexicon.springbootjpaworkshop.repository.BookRepository;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    AppUserRepository appUserRepository;
    BookLoanRepository bookLoanRepository;
    BookRepository bookRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {



    }
}
