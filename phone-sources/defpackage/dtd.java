package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtd extends yiz implements yjz {
    /* synthetic */ boolean a;

    public dtd(yih yihVar) {
        super(2, yihVar);
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((dtd) create(bool, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        dtd dtdVar = new dtd(yihVar);
        dtdVar.a = ((Boolean) obj).booleanValue();
        return dtdVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ybn.f(obj);
        return Boolean.valueOf(this.a);
    }
}
