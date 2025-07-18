package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gtp extends gtr {
    private final BroadcastReceiver e;

    public gtp(Context context, isy isyVar) {
        super(context, isyVar);
        this.e = new gto(this);
    }

    public abstract IntentFilter a();

    public abstract void c(Intent intent);

    @Override // defpackage.gtr
    public final void d() {
        gpn.b();
        int i = gtq.a;
        getClass().getSimpleName();
        this.a.registerReceiver(this.e, a());
    }

    @Override // defpackage.gtr
    public final void e() {
        gpn.b();
        int i = gtq.a;
        getClass().getSimpleName();
        this.a.unregisterReceiver(this.e);
    }
}
