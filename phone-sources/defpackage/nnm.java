package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nnm {
    public static final nsf a = new nsf("SessionManager");
    public final nnf b;
    private final Context c;

    public nnm(nnf nnfVar, Context context) {
        this.b = nnfVar;
        this.c = context;
    }

    public final nmq a() {
        ocv.aC();
        nnl nnlVarB = b();
        if (nnlVarB == null || !(nnlVarB instanceof nmq)) {
            return null;
        }
        return (nmq) nnlVarB;
    }

    public final nnl b() {
        ocv.aC();
        try {
            return (nnl) odc.a(this.b.a());
        } catch (RemoteException unused) {
            nsf.e();
            return null;
        }
    }

    public final void c(nnn nnnVar, Class cls) {
        if (nnnVar == null) {
            throw new NullPointerException("SessionManagerListener can't be null");
        }
        ocv.aC();
        try {
            this.b.d(new nng(nnnVar, cls));
        } catch (RemoteException unused) {
            nsf.e();
        }
    }

    public final void d(boolean z) {
        ocv.aC();
        try {
            a.a("End session for %s", this.c.getPackageName());
            this.b.c(z);
        } catch (RemoteException unused) {
            nsf.e();
        }
    }

    public final void e(nnn nnnVar, Class cls) {
        ocv.aC();
        if (nnnVar == null) {
            return;
        }
        try {
            this.b.e(new nng(nnnVar, cls));
        } catch (RemoteException unused) {
            nsf.e();
        }
    }
}
