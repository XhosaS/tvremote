package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oap implements ServiceConnection {
    final /* synthetic */ oat a;
    private final int b;

    public oap(oat oatVar, int i) {
        this.a = oatVar;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        if (iBinder != null) {
            oat oatVar = this.a;
            synchronized (oatVar.y) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                oatVar.I = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof obs)) ? new obs(iBinder) : (obs) iInterfaceQueryLocalInterface;
            }
            this.a.Q(0, null, this.b);
            return;
        }
        oat oatVar2 = this.a;
        synchronized (oatVar2.x) {
            i = oatVar2.B;
        }
        if (i == 3) {
            oatVar2.F = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        Handler handler = oatVar2.w;
        handler.sendMessage(handler.obtainMessage(i2, oatVar2.H.get(), 16));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        oat oatVar = this.a;
        synchronized (oatVar.y) {
            oatVar.I = null;
        }
        oat oatVar2 = this.a;
        int i = this.b;
        Handler handler = oatVar2.w;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
