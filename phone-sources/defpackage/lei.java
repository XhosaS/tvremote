package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lei implements idf {
    public final mma a;
    private final idf b;
    private final idf c;
    private final idp d = new leh(this);

    public lei(idf idfVar, mma mmaVar, idf idfVar2) {
        mmaVar.getClass();
        this.a = mmaVar;
        this.b = idfVar;
        this.c = idfVar2;
    }

    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        Object objB = this.c.b(obj);
        rin rinVarI = this.a.i((String) objB);
        if (rinVarI != null) {
            return ieg.f(rinVarI);
        }
        ieg iegVar = (ieg) this.b.b(obj);
        idp idpVar = this.d;
        Object obj2 = iegVar.c;
        if (obj2 != null) {
            return ieg.f(idpVar.c(obj2, objB));
        }
        iegVar.p();
        return iegVar;
    }
}
