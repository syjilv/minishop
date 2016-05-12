package fw;
//SQL�� �����ϴ� Ŭ���� - �����ӿ�ũ ������� �۾��� �ϸ� ��������(XML)�� �����
public class Query {
	
	public static String PRD_LIST = "select * from TB_PRODUCT where CATEGORY_NO like ?";

	public static String PRD_SEARCH_TOP = "select v.* from("
										+ "		select T.PRD_NO, T.PRD_NM, T.IMG_GEN_FILE_NM "
										+ "		from TB_PRODUCT T, TB_ORDER_PRODUCT O "
										+ "		where T.PRD_NO = O.PRD_NO "
										+ "		group by T.PRD_NO, T.PRD_NM, T.IMG_GEN_FILE_NM "
										+ "		order by sum(O.QTY) DESC) v "
										+ "where rownum <= 8";
	
	;
}
