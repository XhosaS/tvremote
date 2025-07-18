package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqc extends jrb {
    public jqc() {
        super("ROTATION EXIT");
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
        if (jrb.m(jrjVar)) {
            return;
        }
        jrjVar.l(12.0f);
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
        if (jrb.n(jrjVar)) {
            return;
        }
        jrjVar.y();
        jrjVar.g();
        jrb.j(jrjVar);
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        if (!jrb.m(jrjVar)) {
            if (!jrb.n(jrjVar)) {
                float fC = jrjVar.c();
                float f = jrjVar.q().d.f + fC;
                float f2 = jrjVar.s().d.f + fC;
                float f3 = jrjVar.v().d.f + fC;
                float f4 = jrjVar.r().d.f + fC;
                float fD = d(2.7488937f - f);
                float fD2 = d(2.7488937f - f2);
                float fD3 = d((-0.3926991f) - f3);
                if (fD > d((-0.3926991f) - f4) && fD3 > fD2 && fD < 4.712389f && fD3 < 4.712389f) {
                    jrjVar.y();
                    jrjVar.g();
                    jrb.j(jrjVar);
                }
                return true;
            }
            g(jrjVar, j2);
            if (!jrb.m(jrjVar)) {
                return true;
            }
        }
        return false;
    }

    public final float d(float f) {
        float f2 = f % 6.2831855f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }
}
