package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqq extends jrb {
    private final int[] D;

    public jqq() {
        super("MOLECULE_DISAPPEAR");
        this.D = new int[]{0, 2, 3, 1};
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
        jrb.l(jrjVar);
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
        jrjVar.e(0.0f);
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        float f;
        Iterator it = jrjVar.iterator();
        while (true) {
            f = (j2 - j) / 300.0f;
            if (!it.hasNext()) {
                break;
            }
            jri jriVar = (jri) it.next();
            int iP = jrjVar.p(jriVar);
            float f2 = f - (this.D[iP] * 0.01f);
            if (f2 > 0.0f && f2 < 0.5f) {
                jriVar.g.c(jrb.a[iP] - 25.0f);
            } else if (f2 > 0.5f && f2 < 1.0f) {
                jriVar.g.c(jrb.a[iP] + 10.0f);
            }
        }
        if (f > 0.8f) {
            jrjVar.e(0.0f);
        }
        return f < 1.0f;
    }
}
