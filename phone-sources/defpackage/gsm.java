package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsm implements Runnable {
    private final gso a;
    private final Intent b;
    private final int c;

    public gsm(gso gsoVar, Intent intent, int i) {
        this.a = gsoVar;
        this.b = intent;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b, this.c);
    }
}
