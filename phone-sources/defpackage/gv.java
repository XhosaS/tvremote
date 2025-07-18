package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gv {
    public Intent a;
    private final IntentSender b;
    private int c;
    private int d;

    /* JADX WARN: Illegal instructions before constructor call */
    public gv(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        IntentSender intentSender = pendingIntent.getIntentSender();
        intentSender.getClass();
        this(intentSender);
    }

    public final gw a() {
        return new gw(this.b, this.a, this.c, this.d);
    }

    public final void b(int i, int i2) {
        this.d = i;
        this.c = i2;
    }

    public gv(IntentSender intentSender) {
        intentSender.getClass();
        this.b = intentSender;
    }
}
