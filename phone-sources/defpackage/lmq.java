package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmq {
    private final ieg a;
    private final String b;
    private final boolean c;
    private List d;
    private final lsc e;

    public lmq(ieg iegVar, String str, boolean z, lsc lscVar) {
        this.a = iegVar;
        this.b = str;
        this.c = z;
        this.e = lscVar;
    }

    public final synchronized lvd a(lvd lvdVar) {
        if (this.d == null) {
            nag nagVar = new nag(null, null, null, null);
            nagVar.n(this.a);
            nagVar.o(this.c ? ksy.h(this.b) : ksy.i(this.b));
            nagVar.a = tst.i(Locale.getDefault());
            nagVar.p(lgm.a());
            ieg iegVarE = ((ieg) this.e.b(nagVar.m())).e(new kro(15));
            if (!iegVarE.m()) {
                Throwable thI = iegVarE.i();
                krd.a("Error when fetching online streams", thI);
                throw new IOException("Could not fetch online streams", thI);
            }
            this.d = ((zuw) iegVarE.g()).i().a;
        }
        for (lvd lvdVar2 : this.d) {
            lcl lclVar = lvdVar2.b;
            int i = lclVar.c;
            lcl lclVar2 = lvdVar.b;
            if (i == lclVar2.c) {
                kzo kzoVar = lclVar.l;
                if (kzoVar == null) {
                    kzoVar = kzo.a;
                }
                kzo kzoVar2 = lclVar2.l;
                if (kzoVar2 == null) {
                    kzoVar2 = kzo.a;
                }
                if (krh.A(kzoVar, kzoVar2, false)) {
                }
            }
        }
        throw new IOException("Could not find matching online stream for itag: " + lvdVar.b.c);
        return lvdVar2;
    }
}
