package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kg extends yiy implements yjz {
    Object a;
    Object b;
    int c;
    int d;
    final /* synthetic */ kh e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(kh khVar, yih yihVar) {
        super(yihVar);
        this.e = khVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kg) create((ymy) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        kg kgVar = new kg(this.e, yihVar);
        kgVar.f = obj;
        return kgVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ymy ymyVar;
        Object obj2;
        int i;
        Object obj3;
        yio yioVar = yio.a;
        if (this.d != 0) {
            i = this.c;
            obj2 = this.b;
            Object obj4 = this.a;
            ymyVar = (ymy) this.f;
            ybn.f(obj);
            obj3 = obj4;
        } else {
            ybn.f(obj);
            ymyVar = (ymy) this.f;
            ke keVar = this.e.b;
            Object obj5 = keVar.b;
            obj2 = keVar.c;
            i = keVar.e;
            obj3 = obj5;
        }
        while (i != Integer.MAX_VALUE) {
            long j = ((long[]) obj2)[i] >> 31;
            Object obj6 = ((Object[]) obj3)[i];
            this.f = ymyVar;
            this.a = obj3;
            this.b = obj2;
            i = (int) (j & 2147483647L);
            this.c = i;
            this.d = 1;
            if (ymyVar.a(obj6, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
