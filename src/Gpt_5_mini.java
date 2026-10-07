public class Gpt_5_mini extends LLMModel {
    public Gpt_5_mini() {}

    @Override
    public void prompt(String prompt) {
        System.out.println("prompt sent to GPT 5 mini...");
    }
}
