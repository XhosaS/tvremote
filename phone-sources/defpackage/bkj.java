package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkj implements bkp {
    public final bkp a;
    public final bkp b;

    public bkj(bkp bkpVar, bkp bkpVar2) {
        this.a = bkpVar;
        this.b = bkpVar2;
    }

    @Override // defpackage.bkp
    public final /* synthetic */ bkp a(bkp bkpVar) {
        return bdi.A(this, bkpVar);
    }

    @Override // defpackage.bkp
    public final Object b(Object obj, yjz yjzVar) {
        return this.b.b(this.a.b(obj, yjzVar), yjzVar);
    }

    @Override // defpackage.bkp
    public final boolean c(yjv yjvVar) {
        return this.a.c(yjvVar) && this.b.c(yjvVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bkj)) {
            return false;
        }
        bkj bkjVar = (bkj) obj;
        return yks.e(this.a, bkjVar.a) && yks.e(this.b, bkjVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "[" + ((String) b("", lr.c)) + ']';
    }
}
