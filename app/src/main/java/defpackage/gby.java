package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gby extends gbz {
    private final jry a;

    public gby(jry jryVar) {
        this.a = jryVar;
    }

    @Override // defpackage.gcx
    public final int a() {
        return 1;
    }

    @Override // defpackage.gbz, defpackage.gcx
    public final jry c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gcx) {
            gcx gcxVar = (gcx) obj;
            if (gcxVar.a() == 1 && this.a.equals(gcxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoteLedService{ledService=" + this.a.toString() + "}";
    }
}
