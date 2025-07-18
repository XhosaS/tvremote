package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vv extends yiz implements yjz {
    Object a;
    Object b;
    long c;
    int d;
    final /* synthetic */ vx e;
    final /* synthetic */ yle f;
    final /* synthetic */ long g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(vx vxVar, yle yleVar, long j, yih yihVar) {
        super(2, yihVar);
        this.e = vxVar;
        this.f = yleVar;
        this.g = j;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vv) create((pku) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        vv vvVar = new vv(this.e, this.f, this.g, yihVar);
        vvVar.h = obj;
        return vvVar;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, yil] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Throwable {
        vx vxVar;
        long j;
        Object obj2;
        Object obj3;
        yio yioVar = yio.a;
        if (this.d != 0) {
            j = this.c;
            Object obj4 = this.b;
            Object obj5 = this.a;
            vxVar = (vx) this.h;
            ybn.f(obj);
            obj3 = obj4;
            obj2 = obj5;
        } else {
            ybn.f(obj);
            pku pkuVar = (pku) this.h;
            vx vxVar2 = this.e;
            vu vuVar = new vu(vxVar2, pkuVar);
            yle yleVar = this.f;
            long j2 = this.g;
            ybo yboVar = vxVar2.k;
            long j3 = yleVar.a;
            float fA = vxVar2.a(vxVar2.b == uv.b ? cmm.a(j2) : cmm.b(j2));
            this.h = vxVar2;
            this.a = vxVar2;
            this.b = yleVar;
            this.c = j3;
            this.d = 1;
            yboVar.b = 0;
            obj = ykr.l(yboVar.a, new tg(fA, yboVar, vuVar, null), this);
            if (obj == yioVar) {
                return yioVar;
            }
            vxVar = vxVar2;
            j = j3;
            obj3 = yleVar;
            obj2 = vxVar2;
        }
        float fA2 = vxVar.a(((Number) obj).floatValue());
        ((yle) obj3).a = ((vx) obj2).b == uv.b ? cmm.e(j, fA2, 0.0f, 2) : cmm.e(j, 0.0f, fA2, 1);
        return ygi.a;
    }
}
