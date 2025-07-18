package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kfu extends BasePendingResult implements kfv {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected kfu(kev kevVar) {
        super(kevVar);
        kkk.l(kevVar, "GoogleApiClient must not be null");
    }

    private final void c(RemoteException remoteException) {
        h(new Status(8, remoteException.getLocalizedMessage(), null, null));
    }

    protected abstract void b(kdz kdzVar);

    public final void g(kdz kdzVar) throws DeadObjectException {
        try {
            b(kdzVar);
        } catch (DeadObjectException e) {
            c(e);
            throw e;
        } catch (RemoteException e2) {
            c(e2);
        }
    }

    public final void h(Status status) {
        kkk.b(!status.c(), "Failed result must not be success");
        m(a(status));
    }

    @Override // defpackage.kfv
    public /* bridge */ /* synthetic */ void i(Object obj) {
        throw null;
    }
}
