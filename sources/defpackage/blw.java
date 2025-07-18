package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blw extends blx {
    public final String a;
    public final String b;

    public blw(String str, String str2) {
        super(2);
        this.a = str;
        this.b = str2;
    }

    public final boolean a() {
        return this.b != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blw)) {
            return false;
        }
        blw blwVar = (blw) obj;
        return Objects.equals(this.a, blwVar.a) && Objects.equals(this.b, blwVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // defpackage.blx
    public final String toString() {
        return "[" + ((Object) aju.g(this.d)) + " service_name=" + this.a + ", client_name=" + this.b + "]";
    }
}
