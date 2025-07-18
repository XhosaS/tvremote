package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfh {
    public final qth a;
    public final ofl b;
    public final ofj c;
    public final tst d;
    public final String e;
    public final duv f;
    public final duv g;
    public rft h;
    public Object i;
    public rfu j;
    public String k;
    public ImmutableMap l;
    public boolean m;
    public final tst n;

    public rfh() {
        throw null;
    }

    public final void a(Object obj, ImmutableMap immutableMap, rft rftVar, boolean z) {
        int iAS;
        if (rftVar == null) {
            return;
        }
        uzn uznVar = z ? null : (uzn) tst.h((ofe) rrx.aC(this.a, obj, immutableMap, null)).b(new prn(14)).b(new prn(15)).f();
        rftVar.C = new bw(this, 12);
        rftVar.D = uznVar;
        boolean z2 = false;
        if (uznVar != null && (iAS = a.aS(uznVar.b)) != 0 && iAS == 4) {
            z2 = true;
        }
        rftVar.i(z2);
    }

    public rfh(qth qthVar, Context context, rzy rzyVar, tst tstVar) {
        ogd ogdVar = new ogd(context.getApplicationContext());
        tst tstVarI = tst.i(rzyVar);
        String packageName = context.getPackageName();
        this.f = new rfx(this);
        this.g = new scm(this, 1);
        this.l = ImmutableMap.of();
        this.a = qthVar;
        this.c = ogdVar;
        this.d = tstVarI;
        this.e = packageName;
        this.n = tstVar;
        this.b = new ofl() { // from class: rfv
            @Override // defpackage.ofl
            public final void a(Map map) {
                rfh rfhVar = this.a;
                ImmutableMap immutableMapCopyOf = ImmutableMap.copyOf(map);
                rfhVar.l = immutableMapCopyOf;
                rfhVar.a(rfhVar.i, immutableMapCopyOf, rfhVar.h, rfhVar.m);
                rfu rfuVar = rfhVar.j;
                if (rfuVar != null) {
                    rfuVar.b(rfhVar.l);
                }
            }
        };
    }
}
