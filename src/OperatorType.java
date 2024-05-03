public enum OperatorType {
    ADD('+'), SUBSTRACT('-'), MULITPLY('*'), DIVIDE('/'), MOD('%');

    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }
    public char getSymbol() {
        return this.symbol;
    }

    public static OperatorType getOperatorType(char symbol) {
        for (OperatorType type : OperatorType.values()) {
            if (type.getSymbol() == symbol) {
                return type;
            }
        }
        throw new IllegalArgumentException(symbol+"은 사칙연산 연산자 기호가 아닙니다");
    }
}
