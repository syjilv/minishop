select * from TB_PRODUCT where CATEGORY_NO = '%';

select rownum, v.* from(select sum(O.QTY) sum, T.PRD_NO, T.PRD_NM, T.IMG_ORG_FILE_NM from TB_PRODUCT T, TB_ORDER_PRODUCT O where T.PRD_NO = O.PRD_NO group by T.PRD_NO, T.PRD_NM, T.IMG_ORG_FILE_NM order by sum(O.QTY) DESC) v where rownum <= 8;