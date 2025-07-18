package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class idp extends agtq {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ idt d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idp(idt idtVar, agsw agswVar) {
        super(agswVar);
        this.d = idtVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(null, false, this);
    }
}
