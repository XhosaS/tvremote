package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ef extends ResultReceiver {
    private final WeakReference a;

    public ef(gag gagVar) {
        super(null);
        this.a = new WeakReference(gagVar);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.List] */
    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i, Bundle bundle) {
        eb dzVar;
        gag gagVar = (gag) this.a.get();
        if (gagVar == null || bundle == null) {
            return;
        }
        synchronized (gagVar.e) {
            Object obj = gagVar.b;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            if (binder == null) {
                dzVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                dzVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof eb)) ? new dz(binder) : (eb) iInterfaceQueryLocalInterface;
            }
            synchronized (((et) obj).a) {
                ((et) obj).c = dzVar;
            }
            Object obj2 = gagVar.b;
            glk glkVarD = gli.d(bundle);
            synchronized (((et) obj2).a) {
                ((et) obj2).d = glkVarD;
            }
            Object obj3 = gagVar.b;
            if (((et) obj3).a() != null) {
                for (ee eeVar : gagVar.a) {
                    eg egVar = new eg(eeVar);
                    ((HashMap) gagVar.d).put(eeVar, egVar);
                    eeVar.c = egVar;
                    try {
                        ((et) obj3).a().b(egVar);
                        eeVar.a(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                gagVar.a.clear();
            }
        }
    }
}
