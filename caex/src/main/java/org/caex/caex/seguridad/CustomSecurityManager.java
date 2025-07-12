package org.caex.caex.seguridad;

import javax.persistence.*;

import org.caex.caex.model.*;
import org.openxava.jpa.*;
import org.openxava.session.ISecurityManager;

public class CustomSecurityManager implements ISecurityManager {

    @Override
    public boolean existsUser(String userName) throws Exception {
        EntityManager em = XPersistence.getManager();
        Long count = em.createQuery(
            "SELECT COUNT(u) FROM Usuario u WHERE nombre = :nombre", Long.class)
            .setParameter("nombre", userName)
            .getSingleResult();
        return count > 0;
    }

    @Override
    public boolean checkPassword(String userName, String password) throws Exception {
        EntityManager em = XPersistence.getManager();
        Usuario user = em.createQuery(
            "FROM Usuario u WHERE nombre = :nombre", Usuario.class)
            .setParameter("nombre", userName)
            .getSingleResult();
        return user.getContrasena().equals(password);
    }

    @Override
    public boolean isUserInRole(String userName, String role) throws Exception {
        EntityManager em = XPersistence.getManager();
        Usuario user = em.createQuery(
            "FROM Usuario u WHERE nombre = :nombre", Usuario.class)
            .setParameter("nombre", userName)
            .getSingleResult();
        return user.getRol().equalsIgnoreCase(role);
    }
}
