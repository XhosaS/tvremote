package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahx implements ServiceConnection {
    final /* synthetic */ aib a;
    private final int b;

    public ahx(aib aibVar, int i) {
        this.a = aibVar;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        if (iBinder != null) {
            aib aibVar = this.a;
            synchronized (aibVar.e) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aibVar.o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof aiu)) ? new aiu(iBinder) : (aiu) iInterfaceQueryLocalInterface;
            }
            this.a.w(0, null, this.b);
            return;
        }
        aib aibVar2 = this.a;
        synchronized (aibVar2.d) {
            i = aibVar2.h;
        }
        if (i == 3) {
            aibVar2.l = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        Handler handler = aibVar2.c;
        handler.sendMessage(handler.obtainMessage(i2, aibVar2.n.get(), 16));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        aib aibVar = this.a;
        synchronized (aibVar.e) {
            aibVar.o = null;
        }
        aib aibVar2 = this.a;
        int i = this.b;
        Handler handler = aibVar2.c;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
