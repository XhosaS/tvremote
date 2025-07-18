package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mir extends mis {
    public final ksy a;

    protected mir(ksy ksyVar, liq liqVar, lio lioVar) {
        super(liqVar, lioVar);
        this.a = ksyVar;
    }

    @Override // defpackage.mis
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return this.a.equals(((mir) obj).a);
        }
        return false;
    }

    @Override // defpackage.mis
    public int hashCode() {
        return (super.hashCode() * 31) + this.a.hashCode();
    }
}
