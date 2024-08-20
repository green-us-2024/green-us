package com.example.greening.service

import com.example.greening.domain.item.Certify
import com.example.greening.repository.CertifyRepository
import com.example.greening.repository.GreeningRepository
import com.example.greening.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime

@Service
@Transactional(readOnly = true)
class CertifyService(
    private val certifyRepository: CertifyRepository,
    private val userService: UserService,
    private val participateService: ParticipateService,
    private val userRepository: UserRepository,
    private val greeningRepository: GreeningRepository
) {

    @Transactional
    fun saveCertify(userEmail: String, gSeq: Int, certifyDate: LocalDateTime): Certify? {
        val user = userRepository.findByEmail(userEmail) ?: return null
        val participate = participateService.findByUserSeqAndgSeq(user.userSeq, gSeq)
        val pSeq = participate?.pSeq ?: -1
        return if (participate != null && participate.pComplete == "N") {
            val certify = Certify(
                certifySeq = 0,
                certifyImg = null,
                certifyDate = certifyDate,
                user = user,
                greening = greeningRepository.findById(gSeq),
                pSeq = pSeq
            )
            participateService.updateParticipate(pSeq)
            certifyRepository.save(certify)
        } else {
            null
        }
    }
    @Transactional
    fun updateCertify(certifySeq: Int, newCertify: Certify) {
        val existingCertify = certifyRepository.findById(certifySeq).orElse(null)
                ?: throw java.lang.IllegalStateException("인증이 존재하지 않습니다.")
        existingCertify.certifyImg = newCertify.certifyImg ?: existingCertify.certifyImg
        existingCertify.certifyDate = newCertify.certifyDate ?: existingCertify.certifyDate
        certifyRepository.save(existingCertify)
    }


    @Transactional
    fun deleteCertify(certifySeq: Int) {
        certifyRepository.deleteById(certifySeq)
    }

    fun findCertify(): List<Certify> {
        return certifyRepository.findAll()
    }

    fun findOne(certifySeq: Int): Certify? {
        return certifyRepository.findById(certifySeq).orElse(null)
    }

    fun findBypSeq(pSeq: Int): List<Certify> {
        return certifyRepository.findBypSeq(pSeq)
    }

    fun findById(certifySeq: Int): Certify? {
        return certifyRepository.findById(certifySeq).orElse(null)
    }

    fun findByUserId(userSeq: Int): List<Certify> {
        return certifyRepository.findByUser_UserSeq(userSeq) // 수정된 부분
    }

    fun findByUserSeqAndGSeq(userSeq: Int, gSeq: Int): List<Certify> {
        return certifyRepository.findByUserSeqAndGSeq(userSeq, gSeq)
    }

    fun findByUserSeqAndGSeqAndCertifyDate(userSeq: Int, gSeq: Int, CertifyDate: LocalDateTime): Certify? {
        return certifyRepository.findByUserSeqAndGSeqAndCertifyDate(userSeq, gSeq, CertifyDate)
    }
}