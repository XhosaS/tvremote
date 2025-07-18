package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwr {
    public static final kwr a = new kwr("", "");
    private final String b;
    private final String c;

    public kwr() {
        throw null;
    }

    public final boolean a(ksy ksyVar) {
        return ksy.t(ksyVar) && ksyVar.b.equals(this.b);
    }

    public final boolean b(ksy ksyVar) {
        return ksy.t(ksyVar) && ksyVar.b.equals(this.c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kwr) {
            kwr kwrVar = (kwr) obj;
            if (this.b.equals(kwrVar.b) && this.c.equals(kwrVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ShowStatus{lastWatchedEpisodeId=" + this.b + ", nextEpisodeId=" + this.c + "}";
    }

    public kwr(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null lastWatchedEpisodeId");
        }
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null nextEpisodeId");
        }
        this.c = str2;
    }
}
