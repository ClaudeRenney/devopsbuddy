package com.devopsbuddy.enums;

/**
 * Created by Claude on 7/14/17.
 */
public enum RolesEnum {

    BASIC(1, "ROLES_BASIC"),
    PRO(2, "ROLES_PRO"),
    ADMIN(3, "ROLES_ADMIN");

    private final int id;

    private final String roleName;

    RolesEnum(int id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public int getId() {return id;}

    public String getRoleName() {return roleName;}
}
