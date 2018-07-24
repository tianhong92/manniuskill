package handler;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class ManniuStreamHandler extends SkillStreamHandler {
    public ManniuStreamHandler(Skill skill) {
        super(skill);
    }

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(new CancelandStopIntentHandler(), new HelloWorldIntentHandler(), new HelpIntentHandler(), new LaunchRequestHandler(), new SessionEndedRequestHandler())
                .build();
    }
}
