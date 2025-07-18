package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahgn extends ahjj {
    private final agvb d;

    public ahgn(agvb agvbVar, agte agteVar, int i, int i2) {
        super(agteVar, i, i2);
        this.d = agvbVar;
    }

    static /* synthetic */ Object d(ahgn ahgnVar, ahge ahgeVar, agsw agswVar) {
        Object objA = ahgnVar.d.a(ahgeVar, agswVar);
        return objA == agtg.a ? objA : agpu.a;
    }

    @Override // defpackage.ahjj
    protected Object b(ahge ahgeVar, agsw agswVar) {
        return d(this, ahgeVar, agswVar);
    }

    @Override // defpackage.ahjj
    protected ahjj c(agte agteVar, int i, int i2) {
        return new ahgn(this.d, agteVar, i, i2);
    }

    @Override // defpackage.ahjj
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }

    public /* synthetic */ ahgn(agvb agvbVar) {
        super(agtf.a, -2, 1);
        this.d = agvbVar;
    }
}
