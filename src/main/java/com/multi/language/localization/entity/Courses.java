package com.multi.language.localization.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    @CreatedDate
    private LocalDate createDate;

    @LastModifiedDate
    private LocalDate updateDate;

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private List<CourseTranslation> translations;

//    @PrePersist
//    public void prePersist(){
//        this.createDate=LocalDate.now();
//        this.updateDate=LocalDate.now();
//    }
//
//    @PreUpdate
//    public void preUpdate(){
//        this.updateDate=LocalDate.now();
//    }

}
