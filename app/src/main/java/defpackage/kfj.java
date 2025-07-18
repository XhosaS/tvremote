package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class kfj extends kfi {
    protected final lvj a;

    public kfj(int i, lvj lvjVar) {
        super(i);
        this.a = lvjVar;
    }

    protected abstract void c(kgq kgqVar);

    @Override // defpackage.kfo
    public final void d(Status status) {
        this.a.a.q(new kej(status));
    }

    @Override // defpackage.kfo
    public final void e(Exception exc) {
        this.a.a.q(exc);
    }

    @Override // defpackage.kfo
    public final void f(kgq kgqVar) throws DeadObjectException {
        try {
            c(kgqVar);
        } catch (DeadObjectException e) {
            d(kfo.h(e));
            throw e;
        } catch (RemoteException e2) {
            d(kfo.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.kfo
    public void g(kgg kggVar, boolean z) {
    }
}
