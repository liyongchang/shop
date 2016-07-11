package cn.itcast.shop.adminuser.dao;

import cn.itcast.shop.adminuser.vo.AdminUser;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class AdminUserDao extends HibernateDaoSupport{

	// Dao完成登录的代码
	public AdminUser login(AdminUser adminUser) {
		String hql = "from AdminUser where username = ? and password = ?";
		List<AdminUser> list = this.getHibernateTemplate().find(hql, adminUser.getUsername(),adminUser.getPassword());
		if(list != null && list.size()>0){
			return list.get(0);
		}
		return null;
	}

}
