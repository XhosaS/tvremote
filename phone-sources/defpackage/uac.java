package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uac extends uad {
    public uac(Duration duration, int i) {
        super(duration, i);
    }

    public final String toString() {
        tss tssVar = new tss("exponentialBackoff");
        tssVar.e("firstDelayMs", this.b.toMillis());
        tssVar.c("multiplier", 2.0d);
        tssVar.d("tries", this.a);
        return tssVar.toString();
    }
}
