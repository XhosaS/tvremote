package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abrv extends absg {
    private final yzq a;

    public abrv(yzq yzqVar) {
        if (yzqVar == null) {
            throw new NullPointerException("Null userConsents");
        }
        this.a = yzqVar;
    }

    @Override // defpackage.absg
    public final yzq a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof absg) {
            absg absgVar = (absg) obj;
            if (this.a.equals(absgVar.a())) {
                absgVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "Dma52UserConsentsSnapshot{userConsents=" + this.a.toString() + ", stalenessMillis=0}";
    }

    @Override // defpackage.absg
    public final void b() {
    }
}
