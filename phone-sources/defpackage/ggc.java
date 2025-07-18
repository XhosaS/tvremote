package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ggc extends yiz implements yjv {
    final /* synthetic */ ggd a;
    final /* synthetic */ String b;
    final /* synthetic */ yjv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggc(ggd ggdVar, String str, yjv yjvVar, yih yihVar) {
        super(1, yihVar);
        this.a = ggdVar;
        this.b = str;
        this.c = yjvVar;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new ggc(this.a, this.b, this.c, (yih) obj).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(yih<?> yihVar) {
        return new ggc(this.a, this.b, this.c, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Exception {
        ybn.f(obj);
        gic gicVar = this.a.a;
        String str = this.b;
        yjv yjvVar = this.c;
        ghi ghiVarA = gicVar.a(str);
        try {
            Object objA = yjvVar.a(ghiVarA);
            wef.r(ghiVarA, null);
            return objA;
        } finally {
        }
    }
}
