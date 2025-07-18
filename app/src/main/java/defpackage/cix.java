package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cix extends cja {
    private final BroadcastReceiver e;

    public cix(Context context, coe coeVar) {
        super(context, coeVar);
        this.e = new ciw(this);
    }

    public abstract IntentFilter a();

    public abstract void c(Intent intent);

    @Override // defpackage.cja
    public final void d() {
        cbx.c().a(ciy.a, String.valueOf(getClass().getSimpleName()).concat(": registering receiver"));
        this.a.registerReceiver(this.e, a());
    }

    @Override // defpackage.cja
    public final void e() {
        cbx.c().a(ciy.a, String.valueOf(getClass().getSimpleName()).concat(": unregistering receiver"));
        this.a.unregisterReceiver(this.e);
    }
}
