package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class exz extends exl {
    private final int e;
    private final dze f;
    private long g;
    private boolean h;

    public exz(ees eesVar, eey eeyVar, dze dzeVar, int i, long j, long j2, long j3, int i2, dze dzeVar2) {
        super(eesVar, eeyVar, dzeVar, i, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.e = i2;
        this.f = dzeVar2;
    }

    @Override // defpackage.ezt
    public final void e() {
        epm epmVarB = b();
        epmVarB.j(0L);
        fel felVarK = epmVarB.k(this.e);
        felVarK.b(this.f);
        try {
            eey eeyVarA = this.q.a(this.g);
            efw efwVar = this.x;
            long jB = efwVar.b(eeyVarA);
            if (jB != -1) {
                jB += this.g;
            }
            fdi fdiVar = new fdi(efwVar, this.g, jB);
            for (int iA = 0; iA != -1; iA = felVarK.a(fdiVar, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, true)) {
                this.g += iA;
            }
            felVarK.e(this.v, 1, (int) this.g, 0, null);
            ecm.e(this.x);
            this.h = true;
        } catch (Throwable th) {
            ecm.e(this.x);
            throw th;
        }
    }

    @Override // defpackage.exw
    public final boolean f() {
        return this.h;
    }

    @Override // defpackage.ezt
    public final void c() {
    }
}
