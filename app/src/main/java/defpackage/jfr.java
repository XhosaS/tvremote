package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jfr extends BroadcastReceiver {
    final /* synthetic */ jhh a;

    public jfr(jhh jhhVar) {
        this.a = jhhVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        jhh jhhVar = this.a;
        ahal.e(jhhVar.j, null, 0, new jgu(jhhVar, null), 3);
    }
}
