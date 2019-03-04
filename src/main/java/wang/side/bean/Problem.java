package wang.side.bean;

import java.util.Arrays;

public class Problem {
    private String displayId;
    private String title;
    private String[] tags;
    private Description description;
    private Description inputDescription;
    private Description outputDescription;
    private String testCaseScore;
    private Description hint;
    private int timeLimit;
    private int memoryLimit;
    private Sample[] samples;
    private Template template;
    private String spj;
    private String ruleType;
    private String source;
    private Answer[] answers;

    public Problem() {
    }

    public String getDisplayId() {
        return displayId;
    }

    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Description getInputDescription() {
        return inputDescription;
    }

    public void setInputDescription(Description inputDescription) {
        this.inputDescription = inputDescription;
    }

    public Description getOutputDescription() {
        return outputDescription;
    }

    public void setOutputDescription(Description outputDescription) {
        this.outputDescription = outputDescription;
    }

    public String getTestCaseScore() {
        return testCaseScore;
    }

    public void setTestCaseScore(String testCaseScore) {
        this.testCaseScore = testCaseScore;
    }

    public Description getHint() {
        return hint;
    }

    public void setHint(Description hint) {
        this.hint = hint;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public int getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(int memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public Sample[] getSamples() {
        return samples;
    }

    public void setSamples(Sample[] samples) {
        this.samples = samples;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public String getSpj() {
        return spj;
    }

    public void setSpj(String spj) {
        this.spj = spj;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "display_id='" + displayId + '\'' +
                ", title='" + title + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", inputDescription=" + inputDescription +
                ", outputDescription=" + outputDescription +
                ", testCaseScore='" + testCaseScore + '\'' +
                ", hint=" + hint +
                ", timeLimit=" + timeLimit +
                ", memoryLimit=" + memoryLimit +
                ", samples=" + Arrays.toString(samples) +
                ", template=" + template +
                ", spj='" + spj + '\'' +
                ", ruleType='" + ruleType + '\'' +
                ", source='" + source + '\'' +
                ", answers=" + Arrays.toString(answers) +
                '}';
    }
}
