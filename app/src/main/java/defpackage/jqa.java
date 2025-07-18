package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqa extends jrb {
    public jqa() {
        super("THINKING");
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
        jrb.q(jrjVar);
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
        jrjVar.w(jrjVar.q(), 0.0f);
        float f = jrjVar.q().d.e;
        float f2 = jrjVar.s().d.e;
        float f3 = jrjVar.v().d.e;
        float f4 = f2 - f;
        float f5 = f3 - f2;
        float f6 = jrjVar.r().d.e - f3;
        if (f4 > 1.5707964f) {
            jrjVar.w(jrjVar.s(), 0.0f);
        } else if (f5 > 1.5707964f) {
            jrjVar.w(jrjVar.v(), 1.5707964f);
        } else if (f6 > 1.5707964f) {
            jrjVar.w(jrjVar.r(), 3.1415927f);
        } else {
            jrjVar.w(jrjVar.q(), 4.712389f);
        }
        jrjVar.q().d.c(4.712389f);
        jrjVar.s().d.c(0.0f);
        jrjVar.v().d.c(1.5707964f);
        jrjVar.r().d.c(3.1415927f);
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        float f;
        float f2 = ((j2 - j) / 6000.0f) - ((int) r0);
        jri jriVarQ = jrjVar.q();
        jri jriVarS = jrjVar.s();
        jri jriVarV = jrjVar.v();
        jri jriVarR = jrjVar.r();
        if (f2 >= 0.16749999f) {
            double d = f2;
            if (d < 0.25d) {
                jriVarQ.d.c(4.712389f);
                jriVarS.d.c(1.5707964f);
                jriVarV.d.c(2.6179938f);
                jriVarR.d.c(3.6651917f);
            } else if (f2 < 0.4175f) {
                jriVarQ.d.c(0.0f);
                jriVarS.d.c(1.5707964f);
                jriVarV.d.c(3.1415927f);
                jriVarR.d.c(4.712389f);
            } else {
                if (d >= 0.5d) {
                    if (f2 < 0.6675f) {
                        jriVarQ.d.c(1.5707964f);
                        jriVarS.d.c(3.1415927f);
                        jriVarV.d.c(4.712389f);
                        jriVarR.d.c(0.0f);
                    } else if (d < 0.75d) {
                        jriVarQ.d.c(2.6179938f);
                        jriVarS.d.c(3.6651917f);
                        jriVarV.d.c(4.712389f);
                        jriVarR.d.c(1.5707964f);
                    } else if (f2 < 0.9175f) {
                        jriVarQ.d.c(3.1415927f);
                        jriVarS.d.c(4.712389f);
                        jriVarV.d.c(0.0f);
                        jriVarR.d.c(1.5707964f);
                    } else if (f2 < 1.0f) {
                        jriVarQ.d.c(4.712389f);
                        jriVarS.d.c(5.759587f);
                        jriVarV.d.c(0.5235988f);
                        jriVarR.d.c(1.5707964f);
                    }
                    f = 1.0f;
                    jrjVar.l(f * 3.0f);
                    return true;
                }
                jriVarQ.d.c(0.5235988f);
                jriVarS.d.c(1.5707964f);
                jriVarV.d.c(4.712389f);
                jriVarR.d.c(5.759587f);
            }
            f = 2.0f;
            jrjVar.l(f * 3.0f);
            return true;
        }
        jriVarQ.d.c(4.712389f);
        jriVarS.d.c(0.0f);
        jriVarV.d.c(1.5707964f);
        jriVarR.d.c(3.1415927f);
        f = 1.0f;
        jrjVar.l(f * 3.0f);
        return true;
    }
}
