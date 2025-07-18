package defpackage;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgb extends BasicPermission {
    private final String a;
    private final int b;

    public dgb(String str) {
        super("BC", str);
        this.a = str;
        StringTokenizer stringTokenizer = new StringTokenizer(doj.b(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (strNextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (strNextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (strNextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (strNextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (strNextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (strNextToken.equals("all")) {
                i = 63;
            }
        }
        if (i == 0) {
            throw new IllegalArgumentException("unknown permissions passed to mask");
        }
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgb) {
            dgb dgbVar = (dgb) obj;
            if (this.b == dgbVar.b && getName().equals(dgbVar.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final String getActions() {
        return this.a;
    }

    public final int hashCode() {
        return getName().hashCode() + this.b;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof dgb) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = this.b;
        int i2 = ((dgb) permission).b;
        return (i & i2) == i2;
    }
}
