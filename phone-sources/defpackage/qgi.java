package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qgi implements qer {
    public static final tvn a = tvn.n("GnpSdk");
    public final Context b;
    public final xbw c;
    private final yow d;

    public qgi(Context context, yow yowVar, xbw xbwVar) {
        xbwVar.getClass();
        this.b = context;
        this.d = yowVar;
        this.c = xbwVar;
    }

    @Override // defpackage.qer
    public final void a() {
        if (xff.b()) {
            ykr.q(this.d, null, 0, new kci(this, (yih) null, 15), 3);
        } else {
            a.l().s("aborting restart receiver disabling as disableRestartIntentHandler flag is off");
        }
    }

    @Override // defpackage.qer
    public final void b() {
        if (xff.b()) {
            ykr.q(this.d, null, 0, new kci(this, (yih) null, 16, (byte[]) null), 3);
        } else {
            a.l().s("aborting restart receiver enabling as disableRestartIntentHandler flag is off");
        }
    }
}
