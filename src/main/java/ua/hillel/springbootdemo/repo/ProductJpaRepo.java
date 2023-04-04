package ua.hillel.springbootdemo.repo;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ua.hillel.springbootdemo.model.entity.Product;

@Repository
@RequiredArgsConstructor
public class ProductJpaRepo implements ProductRepo {
    private final SessionFactory sessionFactory;

    @Override
    public Product add(Product product) {
        EntityManager entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();

        try {
            entityManager.persist(product);
            entityManager.flush();

            return product;
        } finally {
            entityManager.getTransaction().commit();
        }

    }

    @Override
    public Product findById(Long id) {
        EntityManager entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();

        try {
            Product product = entityManager.find(Product.class, id);

            return product;
        } finally {
            entityManager.getTransaction().commit();
        }
    }
}
