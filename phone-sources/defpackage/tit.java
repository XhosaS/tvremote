package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tit extends tiu {
    public final String a;
    public final String b;

    public tit(String str, String str2) {
        super(2);
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tit)) {
            return false;
        }
        tit titVar = (tit) obj;
        return Objects.equals(this.a, titVar.a) && Objects.equals(this.b, titVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // defpackage.tiu
    public final String toString() {
        return "[" + ((Object) sip.k(this.d)) + " service_name=" + this.a + ", client_name=" + this.b + "]";
    }
}
