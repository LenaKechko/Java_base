abstract class KeywordAnalyzer implements TextAnalyzer{

    @Override
    public Label processText(String text) {
        return Label.OK;
    }

    protected abstract String[] getKeywords();
    protected abstract Label getLabel();
}
