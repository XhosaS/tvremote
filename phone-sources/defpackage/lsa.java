package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsa {
    public final zuw a;

    public lsa() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lsa) {
            return this.a.equals(((lsa) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GetStreamsResponse{streams=" + this.a.toString() + "}";
    }

    public lsa(zuw zuwVar) {
        this.a = zuwVar;
    }
}
