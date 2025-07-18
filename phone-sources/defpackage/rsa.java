package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.ArrayMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rsa extends rrx implements roq, rqf {
    public final Context a;
    public final rsn b;
    public final ArrayMap c;
    public final Executor d;
    public final rqd e;
    public final yfo f;
    public final rsh g;
    public final tst h;
    public final yfo i;
    private final rrv j;
    private final rrz k;
    private final cb m;

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, yfo] */
    public rsa(yyh yyhVar, Context context, cb cbVar, xbw xbwVar, rrv rrvVar, yfo yfoVar, yfo yfoVar2, Executor executor, rzy rzyVar, yfo yfoVar3, rsh rshVar, tst tstVar, yfo yfoVar4) {
        super(null);
        ArrayMap arrayMap = new ArrayMap();
        this.c = arrayMap;
        a.ab(true);
        this.d = executor;
        this.e = yyhVar.f(executor, xbwVar, yfoVar2);
        this.a = context;
        this.m = cbVar;
        this.f = yfoVar;
        this.j = rrvVar;
        rrz rrzVar = new rrz(context, arrayMap, yfoVar3);
        this.k = rrzVar;
        ?? B = rzyVar.a.b();
        B.getClass();
        ((uht) rzyVar.b.b()).getClass();
        this.b = new rsn(B, rrzVar);
        this.g = rshVar;
        this.h = Build.VERSION.SDK_INT < 31 ? trk.a : tstVar;
        this.i = yfoVar4;
    }

    public static rqa a(zat zatVar, rse rseVar) {
        rpz rpzVarA = rqa.a();
        vtw vtwVarM = zba.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        zba zbaVar = (zba) vtwVarM.b;
        zatVar.getClass();
        zbaVar.l = zatVar;
        zbaVar.b |= 1024;
        rpzVarA.f((zba) vtwVarM.r());
        rpzVarA.b = null;
        rsk rskVar = rseVar.a;
        rpzVarA.c = "Activity";
        rpzVarA.a = rskVar.b();
        rpzVarA.c(true);
        return rpzVarA.a();
    }

    @Override // defpackage.roq
    public final void g(rmp rmpVar) {
        ArrayMap arrayMap = this.c;
        synchronized (arrayMap) {
            arrayMap.clear();
        }
    }

    @Override // defpackage.rqf
    public final void k() {
        cb cbVar = this.m;
        cbVar.x(this.b);
        cbVar.x(this.j);
    }

    @Override // defpackage.roq
    public final /* synthetic */ void j(rmp rmpVar) {
    }
}
