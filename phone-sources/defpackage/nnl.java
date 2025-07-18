package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class nnl {
    private final nnh a;
    public final nnd f;

    static {
        new nsf("Session");
    }

    protected nnl(Context context, String str, String str2) {
        nnd nndVarE;
        nnh nnhVar = new nnh(this, 2);
        this.a = nnhVar;
        int i = noe.a;
        try {
            nndVarE = noe.a(context).e(str, str2, nnhVar);
        } catch (RemoteException | nni unused) {
            nsf.e();
            nndVarE = null;
        }
        this.f = nndVarE;
    }

    public long b() {
        throw null;
    }

    protected abstract void f(boolean z);

    protected void g(Bundle bundle) {
        throw null;
    }

    protected void h(Bundle bundle) {
        throw null;
    }

    protected abstract void i(Bundle bundle);

    protected abstract void k(Bundle bundle);

    protected void l(Bundle bundle) {
        throw null;
    }

    public final int p() {
        ocv.aC();
        nnd nndVar = this.f;
        if (nndVar != null) {
            try {
                if (nndVar.a() >= 211100000) {
                    return nndVar.b();
                }
            } catch (RemoteException unused) {
                nsf.e();
            }
        }
        return 0;
    }

    public final odd q() {
        nnd nndVar = this.f;
        if (nndVar != null) {
            try {
                return nndVar.c();
            } catch (RemoteException unused) {
                nsf.e();
            }
        }
        return null;
    }

    protected final void r(int i) {
        nnd nndVar = this.f;
        if (nndVar == null) {
            return;
        }
        try {
            nndVar.d(i);
        } catch (RemoteException unused) {
            nsf.e();
        }
    }

    public final boolean s() {
        ocv.aC();
        nnd nndVar = this.f;
        if (nndVar != null) {
            try {
                return nndVar.e();
            } catch (RemoteException unused) {
                nsf.e();
            }
        }
        return false;
    }
}
