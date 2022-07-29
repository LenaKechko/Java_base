class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] smile = {":(", "=(", ":|"};

    public NegativeTextAnalyzer() {

    }

    @Override
    public Label processText(String text) {
        String[] words = getKeywords();
        for (int i = 0; i < words.length; i++) {
            if (text.contains(words[i])) {
                return this.getLabel();
            }
        }
        return Label.OK;
    }

    @Override
    protected String[] getKeywords() {
        return this.smile;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
