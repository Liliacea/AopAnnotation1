package springidol;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class JudgeAspect {
    public CriticismEngineImpl criticismEngine;

    public JudgeAspect() {

    }

    @Pointcut("execution(* springidol.Performer.perform())")
public void performing(){

}


@AfterReturning("performing()")
    public void getCriticismEngine() {
    System.out.println(criticismEngine.getCriticism());
    }

    public void setCriticismEngine(CriticismEngineImpl criticismEngine) {
        this.criticismEngine = criticismEngine;

    }

}
