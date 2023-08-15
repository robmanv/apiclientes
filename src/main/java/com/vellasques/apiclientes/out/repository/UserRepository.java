package com.vellasques.apiclientes.out.repository;
import com.vellasques.apiclientes.out.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, String> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}

