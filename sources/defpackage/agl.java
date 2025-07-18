package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class agl extends agk {
    protected final adx a;

    public agl(int i, adx adxVar) {
        super(i);
        this.a = adxVar;
    }

    protected abstract void c(ahc ahcVar);

    @Override // defpackage.agq
    public final void d(Status status) {
        this.a.g(new afy(status));
    }

    @Override // defpackage.agq
    public final void e(Exception exc) {
        this.a.g(exc);
    }

    @Override // defpackage.agq
    public final void f(ahc ahcVar) throws DeadObjectException {
        try {
            c(ahcVar);
        } catch (DeadObjectException e) {
            d(agq.h(e));
            throw e;
        } catch (RemoteException e2) {
            d(agq.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.agq
    public void g(awy awyVar, boolean z) {
    }
}
