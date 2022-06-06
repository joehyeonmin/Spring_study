package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    /*
    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }
    */

    /*
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private DataSource dataSource;
    */

    @Bean
    public MemberService memberService(){

        return new MemberService(memberRepository);
    }
    /*
    @Bean
    public MemberRepository memberRepository(){
        //return new MemoryMemberRepository();
        return  new JpaMemberRepository(em);
    }
     */

    /*
    @Bean
    public TimeTraceAop timeTraceAop(){
        return new TimeTraceAop();
    }
    */
}