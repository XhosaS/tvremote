package defpackage;

import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class boj extends bnn {
    private long a = 9205357640488583168L;
    private nxb b;

    @Override // defpackage.bnn
    public final void a(long j, tac tacVar, float f) {
        nxb nxbVar = this.b;
        if (nxbVar == null || !a.s(this.a, j)) {
            if (bna.e(j)) {
                this.b = null;
                this.a = 9205357640488583168L;
                nxbVar = null;
            } else {
                nxbVar = this.b;
                if (nxbVar == null) {
                    nxbVar = new nxb();
                    this.b = nxbVar;
                }
                nxbVar.a = b(j);
                this.b = nxbVar;
                this.a = j;
            }
        }
        long jL = tacVar.l();
        long j2 = bnq.a;
        if (!a.s(jL, j2)) {
            tacVar.o(j2);
        }
        if (!yks.e(tacVar.b, nxbVar != null ? nxbVar.a : null)) {
            tacVar.r((Shader) (nxbVar != null ? nxbVar.a : null));
        }
        if (tacVar.f() == f) {
            return;
        }
        tacVar.m(f);
    }

    public abstract Shader b(long j);
}
