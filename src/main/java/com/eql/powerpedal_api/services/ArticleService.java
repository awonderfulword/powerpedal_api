package com.eql.powerpedal_api.services;

import com.eql.powerpedal_api.dto.ArticleDto;
import com.eql.powerpedal_api.dto.LigneCommandeClientDto;
import com.eql.powerpedal_api.dto.LigneCommandeFournisseurDto;
import com.eql.powerpedal_api.dto.LigneVenteDto;

import java.util.List;

public interface ArticleService {

    ArticleDto save(ArticleDto dto);

    ArticleDto findById(Integer id);

    ArticleDto findByCodeArticle(String codeArticle);

    List<ArticleDto> findAll();

    List<LigneVenteDto> findHistoriqueVentes(Integer idArticle);

    List<LigneCommandeClientDto> findHistoriaueCommandeClient(Integer idArticle);

    List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(Integer idArticle);

    List<ArticleDto> findAllArticleByIdCategory(Integer idCategory);

    void delete(Integer id);

}