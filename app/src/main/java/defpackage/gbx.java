package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbx extends gbz {
    private final jrx a;

    public gbx(jrx jrxVar) {
        this.a = jrxVar;
    }

    @Override // defpackage.gcx
    public final int a() {
        return 2;
    }

    @Override // defpackage.gbz, defpackage.gcx
    public final jrx b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gcx) {
            gcx gcxVar = (gcx) obj;
            if (gcxVar.a() == 2 && this.a.equals(gcxVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoteLedService{fixedStateLedService=" + this.a.toString() + "}";
    }
}
