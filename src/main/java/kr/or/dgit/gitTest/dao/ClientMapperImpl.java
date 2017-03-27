package kr.or.dgit.gitTest.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.gitTest.dto.Client;

public class ClientMapperImpl implements ClientMapper {

	private String namespace = "kr.or.dgit.trysoft.dao.ClientMapper.";
	private static final Log log = LogFactory.getLog(ClientMapperImpl.class);

	private SqlSession sqlSession;

	public ClientMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	

	@Override
	public int insertClient(Client client) {
		log.debug("insertClient()");
		return sqlSession.insert(namespace + "insertClient", client);
	}


}
