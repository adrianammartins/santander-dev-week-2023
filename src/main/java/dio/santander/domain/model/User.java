package dio.santander.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera o id automaticamente
        private Long id;
        private String name;
        @OneToOne(cascade = CascadeType.ALL)// @oneToOne- relacionamento de um pra um
        private Account account;
        @OneToOne(cascade = CascadeType.ALL)
        private Card card;
        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)//@OneToMany- relacionamento de um pra muitos
        private List<Feature> features;
        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)// fetch= FetchType.EAGER- significa que toda vez que for buscar um usuário no banco, gostaria que ele troxesse a lista de feature dele.
        private List<News> news;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Account getAccount() {
            return account;
        }

        public void setAccount(Account account) {
            this.account = account;
        }

        public Card getCard() {
            return card;
        }

        public void setCard(Card card) {
            this.card = card;
        }

        public List<Feature> getFeatures() {
            return features;
        }

        public void setFeatures(List<Feature> features) {
            this.features = features;
        }

        public List<News> getNews() {
            return news;
        }

        public void setNews(List<News> news) {
            this.news = news;
        }

    }
