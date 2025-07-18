package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nor {
    public static final /* synthetic */ int a = 0;
    private final long b;
    private final Handler c = new ogh(Looper.getMainLooper());
    private final nwq d;

    static {
        new nsf("AnalyticsConsent");
    }

    public nor(Context context, long j) {
        this.d = oos.a(context);
        this.b = j;
    }

    public final synchronized onz a() {
        kwy kwyVar;
        kwyVar = new kwy((byte[]) null, (byte[]) null);
        onz onzVarX = this.d.x();
        onzVarX.q(new igu(kwyVar, 4));
        onzVarX.p(new ofn(kwyVar, 1));
        this.c.postDelayed(new mpz(kwyVar, 18), this.b * 1000);
        return (onz) kwyVar.a;
    }
}
