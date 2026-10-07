public class LLMModelFactory {
    public static LLMModel getModel(String activity){
switch (activity){
    case Activities.CODE_GENERATION:
    {
        Claude_Sonnet claudeSonnet = new Claude_Sonnet();
        return claudeSonnet;
    }
    case Activities.SUMMARIZATION:
    {
    Gemini gemini = new Gemini();
    return gemini;
    }

    case Activities.DOCUMENT_ANALYSIS:
    {
        Claude_Sonnet claudeSonnet = new Claude_Sonnet();
        return claudeSonnet;
    }
    case Activities.SIMPLE_QUESTION:
    {
        Gpt_5_mini gpt_5_mini = new Gpt_5_mini();
        return gpt_5_mini;
    }
    case Activities.COMPLEX_ANALYSIS:
    {
        GPT_5 gpt_5 = new GPT_5();
        return gpt_5;
    }
    default:
        throw new IllegalArgumentException("Unsupported activity: " + activity);  }
    }
}
