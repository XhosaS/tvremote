package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blo implements ServiceConnection {
    final /* synthetic */ blp a;

    public blo(blp blpVar) {
        this.a = blpVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        componentName.getClass();
        iBinder.getClass();
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
        bla bkyVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof bla)) ? new bky(iBinder) : (bla) iInterfaceQueryLocalInterface;
        blp blpVar = this.a;
        blpVar.g = bkyVar;
        try {
            bla blaVar = blpVar.g;
            if (blaVar != null) {
                blpVar.f = blaVar.a(blpVar.j, blpVar.a);
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        this.a.g = null;
    }
}
