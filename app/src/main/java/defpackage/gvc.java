package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gvc extends agtq {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ gvh d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvc(gvh gvhVar, agsw agswVar) {
        super(agswVar);
        this.d = gvhVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
