package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bon extends bnn {
    public final long a;

    public bon(long j) {
        this.a = j;
    }

    @Override // defpackage.bnn
    public final void a(long j, tac tacVar, float f) {
        long jK;
        tacVar.m(1.0f);
        if (f == 1.0f) {
            jK = this.a;
        } else {
            long j2 = this.a;
            jK = bny.k(bnq.d(j2), bnq.c(j2), bnq.b(j2), bnq.a(j2) * f, bnq.f(j2));
        }
        tacVar.o(jK);
        if (tacVar.b != null) {
            tacVar.r(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bon)) {
            return false;
        }
        long j = this.a;
        long j2 = ((bon) obj).a;
        long j3 = bnq.a;
        return a.s(j, j2);
    }

    public final int hashCode() {
        long j = bnq.a;
        return a.k(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) bnq.g(this.a)) + ')';
    }
}
