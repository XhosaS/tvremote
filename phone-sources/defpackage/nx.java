package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nx extends yiz implements yjz {
    /* synthetic */ float a;

    public nx(yih yihVar) {
        super(2, yihVar);
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((nx) create(Float.valueOf(((Number) obj).floatValue()), (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        nx nxVar = new nx(yihVar);
        nxVar.a = ((Number) obj).floatValue();
        return nxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ybn.f(obj);
        return Boolean.valueOf(this.a > 0.0f);
    }
}
