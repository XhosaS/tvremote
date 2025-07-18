package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gch extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ gci b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gch(gci gciVar, agsw agswVar) {
        super(agswVar);
        this.b = gciVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(false, this);
    }
}
