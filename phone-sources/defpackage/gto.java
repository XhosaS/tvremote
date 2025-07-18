package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gto extends BroadcastReceiver {
    final /* synthetic */ gtp a;

    public gto(gtp gtpVar) {
        this.a = gtpVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        this.a.c(intent);
    }
}
