public static void main(String[] args) {
        Computador basicao = new ComputadorBuilder()
                .comProcessador("Intel Core i5")
                .comRam("8GB")
                .comArmazenamento("256GB SSD")
                .build();

        Computador gamer = new ComputadorBuilder()
                .comProcessador("Intel Core i9")
                .comRam("32GB")
                .comArmazenamento("1TB SSD")
                .comPlacaDeVideo("NVIDIA RTX 4070")
                .build();

        System.out.println("=== Computador Básico ===");
        System.out.println(basicao);

        System.out.println("\n=== Computador Gamer ===");
        System.out.println(gamer);
    }

