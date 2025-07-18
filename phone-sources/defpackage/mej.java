package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mej extends BroadcastReceiver implements ids {
    private static mej b;
    public volatile int a;
    private final IntentFilter c;
    private final CopyOnWriteArrayList d;

    private mej(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.DOCK_EVENT");
        this.c = intentFilter;
        this.d = new CopyOnWriteArrayList();
        Intent intentRegisterReceiver = context.getApplicationContext().registerReceiver(this, intentFilter);
        int intExtra = 0;
        if (intentRegisterReceiver != null) {
            intExtra = intentRegisterReceiver.getIntExtra("android.intent.extra.DOCK_STATE", 0);
            this.a = intExtra;
        }
        this.a = intExtra;
    }

    public static synchronized mej a(Context context) {
        if (b == null) {
            b = new mej(context);
        }
        return b;
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        this.d.add(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        this.d.remove(iejVar);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.intent.action.DOCK_EVENT".equals(intent.getAction())) {
            krd.f("unexpected intent: ".concat(String.valueOf(String.valueOf(intent))));
            return;
        }
        int intExtra = intent.getIntExtra("android.intent.extra.DOCK_STATE", 0);
        if (this.a != intExtra) {
            this.a = intExtra;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((iej) it.next()).dM();
            }
        }
    }
}
