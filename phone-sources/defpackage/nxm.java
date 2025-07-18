package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class nxm {
    public final int c;

    public nxm(int i) {
        this.c = i;
    }

    public static Status h(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void d(Status status);

    public abstract void e(Exception exc);

    public abstract void f(nzd nzdVar);

    public abstract void g(pkg pkgVar, boolean z);
}
