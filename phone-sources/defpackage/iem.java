package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iem extends icu {
    public final IntentFilter g;
    private final BroadcastReceiver h;
    private final Context i;

    public iem(Context context, String... strArr) {
        context.getClass();
        this.i = context;
        this.g = new IntentFilter();
        for (String str : strArr) {
            this.g.addAction(str);
        }
        this.h = new iel(this);
    }

    @Override // defpackage.icu
    public final void ec() {
        this.i.registerReceiver(this.h, this.g);
    }

    @Override // defpackage.icu
    public final void ed() {
        this.i.unregisterReceiver(this.h);
    }
}
