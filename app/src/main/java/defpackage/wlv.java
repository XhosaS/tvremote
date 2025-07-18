package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wlv extends wln {
    public final String a;

    public wlv(String str) {
        this.a = str;
    }

    @Override // defpackage.wln
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wln) {
            return this.a.equals(((wln) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AuthTokenManagerConfig{scope=" + this.a + "}";
    }
}
