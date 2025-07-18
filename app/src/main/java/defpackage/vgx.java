package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vgx extends BroadcastReceiver {
    final /* synthetic */ wyt a;
    final /* synthetic */ xo b;

    public vgx(wyt wytVar, xo xoVar) {
        this.a = wytVar;
        this.b = xoVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        wwt wwtVarA = this.a.a();
        try {
            this.b.b(null);
            wum.g(wum.c(), ((wys) wwtVarA).a);
        } catch (Throwable th) {
            try {
                wum.g(wum.c(), ((wys) wwtVarA).a);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
