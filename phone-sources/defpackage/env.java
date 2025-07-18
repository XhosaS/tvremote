package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class env {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public env(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof env)) {
            return false;
        }
        env envVar = (env) obj;
        return Objects.equals(this.a, envVar.a) && Objects.equals(this.b, envVar.b) && Objects.equals(this.c, envVar.c) && Objects.equals(this.d, envVar.d) && Objects.equals(this.e, envVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.b;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = iHashCode + 527;
        String str3 = this.c;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        int i2 = (i * 31) + iHashCode2;
        String str4 = this.d;
        int iHashCode4 = ((((i2 * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
