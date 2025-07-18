package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class nxr extends BasePendingResult implements nxs {
    public final npj g;
    public final jzs h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected nxr(jzs jzsVar, nwu nwuVar) {
        super(nwuVar);
        ocv.aG(nwuVar, "GoogleApiClient must not be null");
        ocv.aG(jzsVar, "Api must not be null");
        this.g = (npj) jzsVar.b;
        this.h = jzsVar;
    }

    private final void d(RemoteException remoteException) {
        m(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    protected abstract void b(nwf nwfVar);

    public /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    public final void l(nwf nwfVar) throws DeadObjectException {
        try {
            b(nwfVar);
        } catch (DeadObjectException e) {
            d(e);
            throw e;
        } catch (RemoteException e2) {
            d(e2);
        }
    }

    public final void m(Status status) {
        ocv.au(!status.b(), "Failed result must not be success");
        q(a(status));
    }
}
