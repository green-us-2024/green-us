package com.example.greening.repository

import com.example.greening.domain.item.User
import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
class UserRepository {

    @PersistenceContext
    private lateinit var em: EntityManager

    fun save(user: User) {
        if(user.userSeq == 0) {
            em.persist(user)
        }else{
            em.merge(user)
        }
    }

    fun delete(user: User) {
        if (em.contains(user)) {
            em.remove(user)
        } else {
            em.remove(em.merge(user))
        }
    }

    fun deleteById(id: Int) {
        val user = findOne(id)
        if (user != null) {
            delete(user)
        }
    }

    fun findOne(id : Int) : User?{
        return try{
            em.find(User::class.java, id)
        }catch(e: Exception){
            null
        }
    }

    fun findById(userSeq: Int): User? {
        return try{
            em.createQuery("select u from User u where u.userSeq = :userSeq", User::class.java)
                    .setParameter("userSeq", userSeq)
                    .singleResult
        }catch(e: IllegalStateException){
            null
        }
    }

    fun findAll() : List<User>{
        return try{
            em.createQuery("select u from User u", User::class.java).resultList
        }catch(e: Exception){
            emptyList()
        }
    }

    fun findByEmail(userEmail: String): User? {
        return try{
            em.createQuery("select u from User u where u.userEmail = :userEmail", User::class.java)
                    .setParameter("userEmail", userEmail)
                    .singleResult
        }catch(e: Exception){
            null
        }
    }

}