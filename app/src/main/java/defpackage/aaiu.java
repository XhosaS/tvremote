package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aaiu {
    public final boolean a;
    private final aajj b;

    public aaiu(aajj aajjVar, boolean z) {
        this.b = aajjVar;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aaiu) {
            aaiu aaiuVar = (aaiu) obj;
            if (aaiuVar.b.equals(this.b) && aaiuVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.a).hashCode();
    }
}
