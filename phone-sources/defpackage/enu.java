package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enu {
    public final String a;
    public final String b;
    public final String c;

    public enu(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            enu enuVar = (enu) obj;
            if (Objects.equals(this.a, enuVar.a) && Objects.equals(this.b, enuVar.b) && Objects.equals(this.c, enuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
