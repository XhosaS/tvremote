package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mlm extends icu {
    private final Context g;
    private final IntentFilter h;
    private final BroadcastReceiver i;

    public mlm(Context context, IntentFilter intentFilter) {
        this.g = context;
        this.h = intentFilter;
        this.i = new mll(this, intentFilter);
    }

    @Override // defpackage.icu
    protected final void ec() {
        this.g.registerReceiver(this.i, this.h);
    }

    @Override // defpackage.icu
    protected final void ed() {
        this.g.unregisterReceiver(this.i);
    }
}
