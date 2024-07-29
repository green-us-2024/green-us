package com.example.greening.controller

import com.example.greening.domain.item.Prize
import com.example.greening.service.PrizeService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/prize")
class PrizeController(private val prizeService: PrizeService) {

    @GetMapping("/byId/{id}")
    fun getPrizeById(@PathVariable id: Int): ResponseEntity<Prize> {
        val prize = prizeService.findOne(id)
        return if (prize != null) {
            ResponseEntity.ok(prize)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @PostMapping("/new")
    fun createPrize(@RequestBody prize: Prize): ResponseEntity<Prize> {
        prizeService.savePrize(prize)
        return ResponseEntity.status(HttpStatus.CREATED).body(prize)
    }

    @PutMapping("/update/{prizeSeq}")
    fun updatePrize(@PathVariable prizeSeq: Int, @RequestBody newPrize: Prize): ResponseEntity<Prize> {
        return try {
            prizeService.updatePrize(prizeSeq, newPrize)
            ResponseEntity.ok(newPrize)
        } catch (e: IllegalStateException) {
            ResponseEntity.notFound().build()
        }
    }

    @DeleteMapping("/delete/{prizeSeq}")
    fun deletePrize(@PathVariable prizeSeq: Int) {
        prizeService.deletePrize(prizeSeq)
    }

    @GetMapping("/list")
    fun getAllPrize(): ResponseEntity<List<Prize>> {
        val prize = prizeService.findPrize()
        return ResponseEntity.ok(prize)
    }

    @GetMapping("/byUserSeq/{userSeq}")
    fun getPrizeByUserSeq(@PathVariable userSeq: Int): ResponseEntity<List<Prize>> {
        val prize = prizeService.findByUserSeq(userSeq)
        return ResponseEntity.ok(prize)
    }
}