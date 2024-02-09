package com.zerobase.cms.order.domain.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.zerobase.cms.order.domain.model.Product;
import com.zerobase.cms.order.domain.model.QProduct;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<Product> searchByName(String name) {
        String search = "%" + name + "%"; // name이 포함된 모든 문자열 찾을 수 있다.

        QProduct product = QProduct.product;
        return queryFactory.selectFrom(product) // Product 테이블에서 데이터를 선택해라.
                .where(product.name.like(search)) // name과 문자열이 일치하는 모든 Product를 찾아라.
                .fetch();
    }
}
