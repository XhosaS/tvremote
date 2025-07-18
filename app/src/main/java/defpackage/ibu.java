package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ibu extends agtq {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ icd e;
    int f;
    String g;
    yrn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibu(icd icdVar, agsw agswVar) {
        super(agswVar);
        this.e = icdVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objV = this.e.v(null, null, null, null, this);
        return objV == agtg.a ? objV : new agpk(objV);
    }
}
