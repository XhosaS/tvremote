package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euu {
    public final Context a;
    public final eur b;
    public final Handler c = edt.L();
    public eus d;
    public int e;
    public eut f;
    private final pku g;

    public euu(Context context, pku pkuVar, eur eurVar) {
        this.a = context.getApplicationContext();
        this.g = pkuVar;
        this.b = eurVar;
    }

    public final int a() {
        eur eurVar = this.b;
        Context context = this.a;
        this.e = eurVar.a(context);
        IntentFilter intentFilter = new IntentFilter();
        if (eurVar.e()) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            connectivityManager.getClass();
            eut eutVar = new eut(this);
            this.f = eutVar;
            connectivityManager.registerDefaultNetworkCallback(eutVar);
        }
        if (eurVar.c()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (eurVar.d()) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        if (eurVar.f()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        eus eusVar = new eus(this);
        this.d = eusVar;
        context.registerReceiver(eusVar, intentFilter, null, this.c);
        return this.e;
    }

    public final void b() {
        int iA = this.b.a(this.a);
        if (this.e != iA) {
            this.e = iA;
            ((euc) this.g.a).c(this, iA);
        }
    }
}
