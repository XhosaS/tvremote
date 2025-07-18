package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kfo {
    public final int c;

    public kfo(int i) {
        this.c = i;
    }

    public static Status h(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void d(Status status);

    public abstract void e(Exception exc);

    public abstract void f(kgq kgqVar);

    public abstract void g(kgg kggVar, boolean z);
}
