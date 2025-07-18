package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdn {
    public final rdm a;

    public rdn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rdn) {
            return this.a.equals(((rdn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CardRetrieverWrapper{cardRetriever=" + this.a.toString() + "}";
    }

    public rdn(rdm rdmVar) {
        this.a = rdmVar;
    }
}
