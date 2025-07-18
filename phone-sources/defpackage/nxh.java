package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class nxh extends nxg {
    protected final kwy a;

    public nxh(int i, kwy kwyVar) {
        super(i);
        this.a = kwyVar;
    }

    protected abstract void c(nzd nzdVar);

    @Override // defpackage.nxm
    public final void d(Status status) {
        this.a.v(new nwk(status));
    }

    @Override // defpackage.nxm
    public final void e(Exception exc) {
        this.a.v(exc);
    }

    @Override // defpackage.nxm
    public final void f(nzd nzdVar) throws DeadObjectException {
        try {
            c(nzdVar);
        } catch (DeadObjectException e) {
            d(nxm.h(e));
            throw e;
        } catch (RemoteException e2) {
            d(nxm.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.nxm
    public void g(pkg pkgVar, boolean z) {
    }
}
