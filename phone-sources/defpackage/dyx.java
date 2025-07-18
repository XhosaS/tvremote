package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyx {
    public static final dyx a;
    public final int b = 0;
    public final int c = 0;
    public final int d = 0;
    public final String e = null;

    static {
        a.H(true);
        a = new dyx();
        edt.Z(0);
        edt.Z(1);
        edt.Z(2);
        edt.Z(3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyx)) {
            return false;
        }
        dyx dyxVar = (dyx) obj;
        int i = dyxVar.b;
        int i2 = dyxVar.c;
        int i3 = dyxVar.d;
        String str = dyxVar.e;
        return Objects.equals(null, null);
    }

    public final int hashCode() {
        return 15699857;
    }
}
