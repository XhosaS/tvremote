package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
class chc implements Runnable {
    private final chf a;
    private final Intent b;
    private final int c;

    public chc(chf chfVar, Intent intent, int i) {
        this.a = chfVar;
        this.b = intent;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(this.b, this.c);
    }
}
