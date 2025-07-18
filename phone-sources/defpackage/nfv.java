package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfv extends nez {
    private int d = -1;
    private int c = -1;
    private final float a = Resources.getSystem().getDisplayMetrics().density;

    private final void A(ekl eklVar, boolean z) {
        if (!z || this.d == -1 || this.c == -1) {
            return;
        }
        nfa nfaVar = this.b;
        StringBuilder sbE = nfaVar.e(eklVar.a);
        sbE.append(this.c);
        sbE.append(':');
        sbE.append(this.d);
        nfaVar.f("view", sbE.toString());
    }

    @Override // defpackage.nez
    public final void b() {
        this.b.g("view");
    }

    @Override // defpackage.nez
    public final void f(ekl eklVar, evv evvVar, boolean z) {
        A(eklVar, z);
    }

    @Override // defpackage.nez
    public final void o(ekl eklVar, int i, int i2, boolean z) {
        if (i == -1 || i2 == -1) {
            this.c = -1;
            this.d = -1;
        } else {
            float f = this.a;
            this.c = (int) (i / f);
            this.d = (int) (i2 / f);
        }
        A(eklVar, z);
    }

    @Override // defpackage.nez
    public final void p(ekl eklVar, ebh ebhVar, boolean z) {
        A(eklVar, z);
    }
}
