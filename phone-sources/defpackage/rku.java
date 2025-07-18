package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rku implements rjq {
    public static final /* synthetic */ int b = 0;
    private static final ydk k;
    private final Context c;
    private final ojh d;
    private final Executor e;
    private final rjk f;
    private final nvj g;
    private final nwq i;
    private final nwq j;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final ojg h = new ojg() { // from class: rkt
        @Override // defpackage.ojg
        public final void a() {
            Iterator it = this.a.a.iterator();
            while (it.hasNext()) {
                ((rjp) it.next()).a();
            }
        }
    };

    static {
        ydk ydkVar = new ydk((byte[]) null, (byte[]) null);
        ydkVar.a = 1;
        k = ydkVar;
    }

    public rku(Context context, nwq nwqVar, ojh ojhVar, nwq nwqVar2, rjk rjkVar, Executor executor, nvj nvjVar) {
        this.c = context;
        this.i = nwqVar;
        this.d = ojhVar;
        this.j = nwqVar2;
        this.e = executor;
        this.f = rjkVar;
        this.g = nvjVar;
    }

    public static Object g(uhp uhpVar, String str) throws ExecutionException {
        try {
            return sfy.J(uhpVar);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if ((cause instanceof nwa) || (cause instanceof nvz)) {
                throw e;
            }
            Log.e("OneGoogle", String.format("Failed to load %s. Exception: %s", str, rrx.aq(cause)));
            return null;
        }
    }

    private final uhp h(int i) {
        return nwb.f(i) ? sfy.B(new nwa(i, "Google Play Services not available", this.g.i(this.c, i, null))) : sfy.B(new nvz());
    }

    @Override // defpackage.rjq
    public final uhp a() {
        return b();
    }

    @Override // defpackage.rjq
    public final uhp b() {
        uhp uhpVarP;
        nvj nvjVar = this.g;
        Context context = this.c;
        rjk rjkVar = this.f;
        uhp uhpVarA = rjkVar.a();
        int iH = nvjVar.h(context, 10000000);
        if (iH != 0) {
            uhpVarP = h(iH);
        } else {
            nwq nwqVar = this.i;
            ydk ydkVar = k;
            npj npjVar = ojl.a;
            nwu nwuVar = nwqVar.C;
            olf olfVar = new olf(nwuVar, ydkVar);
            nwuVar.j(olfVar);
            uhpVarP = rrx.P(olfVar, trc.a(new rke(6)), ugk.a);
        }
        uhp uhpVarK = szg.k(new eet(rjkVar, 20), ((rjl) rjkVar).c);
        return szg.r(new hbn(uhpVarA, uhpVarK, uhpVarP, 13), ugk.a, sfy.N(uhpVarA, uhpVarP, uhpVarK));
    }

    @Override // defpackage.rjq
    public final void c(rjp rjpVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        if (copyOnWriteArrayList.isEmpty()) {
            ojh ojhVar = this.d;
            nzt nztVarO = ojhVar.o(this.h, ojg.class.getName());
            okw okwVar = new okw(nztVarO);
            nig nigVar = new nig(okwVar, 16);
            nig nigVar2 = new nig(okwVar, 17);
            nzy nzyVar = new nzy();
            nzyVar.a = nigVar;
            nzyVar.b = nigVar2;
            nzyVar.c = nztVarO;
            nzyVar.f = 2720;
            ojhVar.y(nzyVar.a());
        }
        copyOnWriteArrayList.add(rjpVar);
    }

    @Override // defpackage.rjq
    public final void d(rjp rjpVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        copyOnWriteArrayList.remove(rjpVar);
        if (copyOnWriteArrayList.isEmpty()) {
            this.d.s(kwy.B(this.h, ojg.class.getName()), 2721);
        }
    }

    @Override // defpackage.rjq
    public final uhp e(String str, int i) {
        return f(str, i);
    }

    @Override // defpackage.rjq
    public final uhp f(String str, int i) {
        int iH = this.g.h(this.c, 10400000);
        if (iH != 0) {
            return h(iH);
        }
        nwq nwqVar = this.j;
        int iV = rrx.V(i);
        npj npjVar = ojl.a;
        nwu nwuVar = nwqVar.C;
        olh olhVar = new olh(nwuVar, str, iV);
        nwuVar.j(olhVar);
        return rrx.P(olhVar, new rke(5), this.e);
    }
}
