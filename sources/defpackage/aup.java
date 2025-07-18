package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aup implements auh {
    public final cjd a;
    public final cov b;

    public aup(auf aufVar, Context context, cjd cjdVar, cov covVar, crv crvVar, crv crvVar2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        aufVar.a(cjdVar, covVar, crvVar);
        this.a = cjdVar;
        this.b = covVar;
        bit.k(new ayj(this, context, 1));
        bit.k(new asf(crvVar2, 7));
    }

    public final synchronized void a() {
    }

    @Override // defpackage.auh
    public final void t() {
        qm.M(new ama(this, 5, null), this.a);
    }
}
