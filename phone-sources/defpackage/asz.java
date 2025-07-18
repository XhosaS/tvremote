package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asz extends yiz implements yka {
    /* synthetic */ float a;
    final /* synthetic */ yjv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asz(yjv yjvVar, yih yihVar) {
        super(3, yihVar);
        this.b = yjvVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        asz aszVar = new asz(this.b, (yih) obj3);
        aszVar.a = fFloatValue;
        return aszVar.invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ybn.f(obj);
        this.b.a(new Float(this.a));
        return ygi.a;
    }
}
