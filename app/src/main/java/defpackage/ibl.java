package defpackage;

/* loaded from: classes.dex */
public final class ibl extends agtq {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ ibm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibl(ibm ibmVar, agsw agswVar) {
        super(agswVar);
        this.c = ibmVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
