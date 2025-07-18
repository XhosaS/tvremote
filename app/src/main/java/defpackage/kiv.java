package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kiv implements ServiceConnection {
    final /* synthetic */ kiz a;
    private final int b;

    public kiv(kiz kizVar, int i) {
        this.a = kizVar;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        if (iBinder != null) {
            kiz kizVar = this.a;
            synchronized (kizVar.f) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                kizVar.s = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof kkd)) ? new kkd(iBinder) : (kkd) iInterfaceQueryLocalInterface;
            }
            this.a.B(0, null, this.b);
            return;
        }
        kiz kizVar2 = this.a;
        synchronized (kizVar2.e) {
            i = kizVar2.i;
        }
        if (i == 3) {
            kizVar2.p = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        Handler handler = kizVar2.d;
        handler.sendMessage(handler.obtainMessage(i2, kizVar2.r.get(), 16));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        kiz kizVar = this.a;
        synchronized (kizVar.f) {
            kizVar.s = null;
        }
        kiz kizVar2 = this.a;
        int i = this.b;
        Handler handler = kizVar2.d;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
