package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gui extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ gva b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gui(gva gvaVar, agsw agswVar) {
        super(agswVar);
        this.b = gvaVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.s(this);
    }
}
