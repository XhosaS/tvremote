package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rro extends rrx implements rqf {
    public final rqd a;
    public final Context b;
    public final Executor c;
    public final yfo d;
    public final xbw e;
    public final yfo f;
    public final yfo g;
    public final yfo h;
    public final rrl i;
    public final rnt j;
    public final unc k;

    public rro(yyh yyhVar, Context context, Executor executor, rrl rrlVar, yfo yfoVar, xbw xbwVar, rnt rntVar, unc uncVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4) {
        super(null);
        this.a = yyhVar.f(executor, xbwVar, null);
        this.b = context;
        this.c = executor;
        this.i = rrlVar;
        this.d = yfoVar;
        this.j = rntVar;
        this.k = uncVar;
        this.e = xbwVar;
        this.f = yfoVar2;
        this.g = yfoVar3;
        this.h = yfoVar4;
    }

    @Override // defpackage.rqf
    public final void k() {
        osv osvVar = new osv(this, 6);
        Executor executor = this.c;
        sfy.G(osvVar, executor);
        sfy.E(new qxp(this, 20), executor);
    }
}
