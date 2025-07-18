package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmw extends nec {
    public lmw(efn efnVar, int i, boolean z, lmi lmiVar, Handler handler) {
        super(efnVar, i, z);
        if (lmiVar == null || handler == null) {
            return;
        }
        f(new lmv(lmiVar, handler));
    }

    @Override // defpackage.nec, defpackage.ees
    public final long b(eey eeyVar) {
        mft mftVarD = mjo.d(1);
        try {
            return super.b(eeyVar);
        } finally {
            mftVarD.a();
        }
    }
}
