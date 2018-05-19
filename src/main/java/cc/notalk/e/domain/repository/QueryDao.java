package cc.notalk.e.domain.repository;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueryDao {
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    /**
     * 查询的结果是实体
      */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public <T> List<T> queryObject(String sql, Class<T> classType) {
        EntityManager em = entityManagerFactory.createEntityManager();
        Query query = em.createNativeQuery(sql, classType); // 执行查询，返回的是实体列表
        List resultList = null;
        try {
            resultList = query.getResultList();
        } catch (Exception e) {
        } finally {
            em.close();
        }
        return resultList;
    }

    @SuppressWarnings("unchecked")
    public <T> T query(String sql) {
        EntityManager em = entityManagerFactory.createEntityManager();
        Query query = em.createNativeQuery(sql);
        T singleResult = null;
        try {
            singleResult = (T) query.getSingleResult();
        } catch (Exception e) {
            if (!(e instanceof NoResultException)) {
            }
        } finally {
            em.close();
        }
        return singleResult;
    }

    /**
     * 更新和插入操作
      */
    public int update(String sql) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createNativeQuery(sql);
        int executeUpdate = 0;
        try {
            executeUpdate = query.executeUpdate();
            em.getTransaction().commit();
        } catch (Exception e) {
        } finally {
            em.close();
        }
        return executeUpdate;
    }

    /**
     * 查询 sql 对应的 Map 结果集
      */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Map<String, Object>> queryMap(String sql) {
        EntityManager em = entityManagerFactory.createEntityManager();
        Query query = em.createNativeQuery(sql);
        List resultList = null;
        try {
            resultList = query.getResultList();
        } catch (Exception e) {
        } finally {
            em.close();
        }
        return resultList;
    }

    /**
     * 查询 sql 对应的 Map 结果集
      */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Map<String, Object>> queryMap(String sql, Map<String, Object> params) {
        EntityManager em = entityManagerFactory.createEntityManager();
        Query query = em.createNativeQuery(sql);
        fillParams(query, params);
        List resultList = null;
        try {
            resultList = query.getResultList();
        } catch (Exception e) {
        } finally {
            em.close();
        }
        return resultList;
    }

    private void fillParams(Query query, Map<String, Object> params) {
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
    }

}