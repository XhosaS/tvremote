package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iyb extends yiz implements yjz {
    int a;
    final /* synthetic */ yqe b;
    final /* synthetic */ iyd c;
    final /* synthetic */ boolean d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyb(yqe yqeVar, iyd iydVar, boolean z, yih yihVar) {
        super(2, yihVar);
        this.b = yqeVar;
        this.c = iydVar;
        this.d = z;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iyb) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        iyb iybVar = new iyb(this.b, this.c, this.d, yihVar);
        iybVar.e = obj;
        return iybVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            yow yowVar = (yow) this.e;
            yqe yqeVar = this.b;
            if (yqeVar != null) {
                yqeVar.t(null);
            }
            iyd iydVar = this.c;
            ysx ysxVarB = iydVar.b(iydVar.d, iydVar.e, this.d);
            wp wpVar = new wp(yowVar, iydVar, 13);
            this.a = 1;
            if (ysxVarB.a(wpVar, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
