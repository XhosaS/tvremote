package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iri extends yiv {
    public Object a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public int e;
    public String f;
    final /* synthetic */ mta g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iri(mta mtaVar, yih yihVar) {
        super(yihVar);
        this.g = mtaVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.g.m(null, 0, this);
    }
}
