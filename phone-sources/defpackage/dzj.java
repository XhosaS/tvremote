package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzj {
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public final String c;
    public final String d;

    public dzj(String str, String str2) {
        this.c = edt.aa(str);
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dzj dzjVar = (dzj) obj;
            if (Objects.equals(this.c, dzjVar.c) && Objects.equals(this.d, dzjVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
