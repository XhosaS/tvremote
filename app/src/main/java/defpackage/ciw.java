package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ciw extends BroadcastReceiver {
    final /* synthetic */ cix a;

    public ciw(cix cixVar) {
        this.a = cixVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        this.a.c(intent);
    }
}
