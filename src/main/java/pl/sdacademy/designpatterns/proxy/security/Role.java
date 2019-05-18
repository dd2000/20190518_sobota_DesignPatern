package pl.sdacademy.designpatterns.proxy.security;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Role {
//    USER(AccessType.READ),
//    ADMIN(AccessType.READ, AccessType.WRITE);

    USER,
    ADMIN;

    private List<AccessType> accessTypes;
    Role(AccessType ...accessTypes){
        this.accessTypes = Arrays.asList(accessTypes);
    }
}
