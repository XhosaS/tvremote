package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bev {
    private final bel a;
    private final beg b;
    private final bet c;
    private final bey d = new bey();

    public bev(bel belVar, beg begVar, bet betVar) {
        this.a = belVar;
        this.b = begVar;
        this.c = betVar;
    }

    public final beb a(agxd agxdVar, String str) {
        beb bebVarA;
        synchronized (this.d) {
            bel belVar = this.a;
            bebVarA = belVar.a(str);
            if (agxdVar.d(bebVarA)) {
                Object obj = this.b;
                if (obj instanceof bei) {
                    bebVarA.getClass();
                    ((bei) obj).e(bebVarA);
                }
                bebVarA.getClass();
            } else {
                beu beuVar = new beu(this.c);
                beuVar.b(bek.a, str);
                bebVarA = bew.a(this.b, agxdVar, beuVar);
                bebVarA.getClass();
                beb bebVar = (beb) belVar.a.put(str, bebVarA);
                if (bebVar != null) {
                    bebVar.eP();
                }
            }
        }
        return bebVarA;
    }
}
