package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aji extends yiz implements yjz {
    int a;
    /* synthetic */ int b;
    final /* synthetic */ ajk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aji(ajk ajkVar, yih yihVar) {
        super(2, yihVar);
        this.c = ajkVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aji) create(Integer.valueOf(((Number) obj).intValue()), (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        aji ajiVar = new aji(this.c, yihVar);
        ajiVar.b = ((Number) obj).intValue();
        return ajiVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        uof uofVar;
        Object obj2 = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0 && Math.abs(this.b) == 1 && (uofVar = this.c.l) != null) {
            this.a = 1;
            Object objK = yoz.k(new ale(uofVar, (yih) null, 1), this);
            if (objK != obj2) {
                objK = ygi.a;
            }
            if (objK == obj2) {
                return obj2;
            }
        }
        return ygi.a;
    }
}
