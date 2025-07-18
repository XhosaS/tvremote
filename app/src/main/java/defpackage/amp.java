package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amp extends agtq {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ amq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amp(amq amqVar, agsw agswVar) {
        super(agswVar);
        this.c = amqVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
