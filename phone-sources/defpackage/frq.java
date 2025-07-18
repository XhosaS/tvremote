package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frq extends ResultReceiver {
    private final WeakReference a;

    public frq(gag gagVar) {
        super(null);
        this.a = new WeakReference(gagVar);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.List] */
    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i, Bundle bundle) {
        frn frlVar;
        gag gagVar = (gag) this.a.get();
        if (gagVar == null || bundle == null) {
            return;
        }
        synchronized (gagVar.b) {
            Object obj = gagVar.d;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            if (binder == null) {
                frlVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                frlVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof frn)) ? new frl(binder) : (frn) iInterfaceQueryLocalInterface;
            }
            synchronized (((fsd) obj).a) {
                ((fsd) obj).c = frlVar;
            }
            Object obj2 = gagVar.d;
            glk glkVarD = gli.d(bundle);
            synchronized (((fsd) obj2).a) {
                ((fsd) obj2).d = glkVarD;
            }
            frn frnVarA = ((fsd) gagVar.d).a();
            if (frnVarA != null) {
                Iterator it = gagVar.e.iterator();
                if (it.hasNext()) {
                    frp frpVar = (frp) it.next();
                    frr frrVar = new frr(frpVar);
                    ((HashMap) gagVar.a).put(frpVar, frrVar);
                    frpVar.a = frrVar;
                    try {
                        frnVarA.a(frrVar);
                        throw null;
                    } catch (RemoteException e) {
                        e = e;
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                        gagVar.e.clear();
                    } catch (SecurityException e2) {
                        e = e2;
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                        gagVar.e.clear();
                    }
                }
                gagVar.e.clear();
            }
        }
    }
}
