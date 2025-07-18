package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbt implements sbo {
    private final sbo a;
    private int b;

    public sbt(sbo sboVar, int i) {
        this.a = sboVar;
        this.b = i;
    }

    @Override // defpackage.sbo
    public final void b(rsu rsuVar) {
        int i;
        rsuVar.getClass();
        if (this.b <= 0 || (i = rsuVar.c) == 2) {
            this.a.b(rsuVar);
            return;
        }
        int iD = (i == 1 ? (rss) rsuVar.d : rss.a).c.d();
        if (this.b < iD) {
            rst rstVar = new rst();
            rstVar.B(rsuVar);
            rsr rsrVar = new rsr();
            abvo abvoVar = (rsuVar.c == 1 ? (rss) rsuVar.d : rss.a).c;
            abvo abvoVarJ = abvoVar.j(this.b, abvoVar.d());
            abvoVarJ.getClass();
            if ((rsrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rsrVar.y();
            }
            rss rssVar = (rss) rsrVar.b;
            rssVar.b |= 1;
            rssVar.c = abvoVarJ;
            rss rssVarA = rud.a(rsrVar);
            if ((rstVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rstVar.y();
            }
            rsu rsuVar2 = (rsu) rstVar.b;
            rsuVar2.d = rssVarA;
            rsuVar2.c = 1;
            this.a.b(rsq.a(rstVar));
        }
        this.b -= iD;
    }
}
