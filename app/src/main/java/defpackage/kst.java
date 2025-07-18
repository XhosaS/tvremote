package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kst extends ksv {
    public final Map a;
    public final Map b;
    public long c;

    public kst(lbk lbkVar) {
        super(lbkVar);
        this.b = new we();
        this.a = new we();
    }

    public final void a(String str, long j) {
        if (str == null || str.length() == 0) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.a("Ad unit id must be a non-empty string");
            return;
        }
        lbk lbkVar2 = this.y;
        lbh lbhVar = lbkVar2.g;
        lbkVar2.o(lbhVar);
        lbhVar.h(new ksq(this, str, j));
    }

    public final void b(String str, long j) {
        if (str == null || str.length() == 0) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.a("Ad unit id must be a non-empty string");
            return;
        }
        lbk lbkVar2 = this.y;
        lbh lbhVar = lbkVar2.g;
        lbkVar2.o(lbhVar);
        lbhVar.h(new ksr(this, str, j));
    }

    public final void c(long j, lez lezVar) {
        if (lezVar == null) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.k.a("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            lbk lbkVar2 = this.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.k.b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        lio.J(lezVar, bundle, true);
        lbk lbkVar3 = this.y;
        leo leoVar = lbkVar3.l;
        lbkVar3.n(leoVar);
        leoVar.t("am", "_xa", bundle);
    }

    public final void d(String str, long j, lez lezVar) {
        if (lezVar == null) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.k.a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            lbk lbkVar2 = this.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.k.b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        lio.J(lezVar, bundle, true);
        lbk lbkVar3 = this.y;
        leo leoVar = lbkVar3.l;
        lbkVar3.n(leoVar);
        leoVar.t("am", "_xu", bundle);
    }

    public final void e(long j) {
        lbk lbkVar = this.y;
        lfg lfgVar = lbkVar.k;
        lbkVar.n(lfgVar);
        lez lezVarJ = lfgVar.j(false);
        Map map = this.a;
        for (String str : map.keySet()) {
            d(str, j - ((Long) map.get(str)).longValue(), lezVarJ);
        }
        if (!map.isEmpty()) {
            c(j - this.c, lezVarJ);
        }
        f(j);
    }

    public final void f(long j) {
        Map map = this.a;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j));
        }
        if (map.isEmpty()) {
            return;
        }
        this.c = j;
    }
}
