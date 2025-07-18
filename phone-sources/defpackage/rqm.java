package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqm implements rqf {
    public final uht a;
    public final xbw b;

    public rqm(yyh yyhVar, Context context, uht uhtVar, xbw xbwVar, yfo yfoVar, yfo yfoVar2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        yyhVar.f(uhtVar, xbwVar, yfoVar);
        this.a = uhtVar;
        this.b = xbwVar;
        sij.l(new evk(this, context, 17));
        sij.l(new riu(yfoVar2, 19));
    }

    public final synchronized void a() {
    }

    @Override // defpackage.rqf
    public final void k() {
        sfy.E(new qxp(this, 19), this.a);
    }
}
