class Main {
    public static void main(String[] args) {
        int x = 3;

        do {
            System.out.println("Você não tem permissão para entrar");
            x++;
        } while (x < 18);
    }
}