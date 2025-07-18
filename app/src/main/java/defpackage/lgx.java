package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgx {
    public final Context a;

    public lgx(Context context) {
        this.a = context;
    }

    public final void a() {
        Log.v("FA", String.valueOf(this.a.getClass().getSimpleName()).concat(" is starting up."));
    }

    public final void b() {
        Log.v("FA", String.valueOf(this.a.getClass().getSimpleName()).concat(" is shutting down."));
    }

    public final void c(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    public final void d(lih lihVar, Runnable runnable) {
        lihVar.aC().h(new lgv(lihVar, runnable));
    }

    public final void e(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
        } else {
            Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        }
    }
}
