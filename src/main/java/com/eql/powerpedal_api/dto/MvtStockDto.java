package com.eql.powerpedal_api.dto;

import com.eql.powerpedal_api.entities.MvtStock;
import com.eql.powerpedal_api.entities.SourceMvtStock;
import com.eql.powerpedal_api.entities.TypeMvtStock;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStockDto {
    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    private TypeMvtStock typeMvt;

    private SourceMvtStock sourceMvt;


    public static MvtStockDto fromEntity(MvtStock mvtStock) {
        if (mvtStock == null) {
            return null;
        }

        return MvtStockDto.builder()
                .id(mvtStock.getId())
                .dateMvt(mvtStock.getDateMvt())
                .quantite(mvtStock.getQuantite())
                .article(ArticleDto.fromEntity(mvtStock.getArticle()))
                .typeMvt(mvtStock.getTypeMvt())
                .sourceMvt(mvtStock.getSourceMvt())
                .build();
    }

    public static MvtStock toEntity(MvtStockDto dto) {
        if (dto == null) {
            return null;
        }

        MvtStock mvtStock = new MvtStock();
        mvtStock.setId(dto.getId());
        mvtStock.setDateMvt(dto.getDateMvt());
        mvtStock.setQuantite(dto.getQuantite());
        mvtStock.setArticle(ArticleDto.toEntity(dto.getArticle()));
        mvtStock.setTypeMvt(dto.getTypeMvt());
        mvtStock.setSourceMvt(dto.getSourceMvt());
        return mvtStock;
    }
}


