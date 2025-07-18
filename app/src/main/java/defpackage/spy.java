package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spy extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ spz b;
    int c;
    sqb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spy(spz spzVar, agsw agswVar) {
        super(agswVar);
        this.b = spzVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.o(null, this);
    }
}
