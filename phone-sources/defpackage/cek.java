package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cek extends yiz implements yjz {
    int a;
    /* synthetic */ float b;
    final /* synthetic */ cel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cek(cel celVar, yih yihVar) {
        super(2, yihVar);
        this.c = celVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cek) create(Float.valueOf(((Number) obj).floatValue()), (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        cek cekVar = new cek(this.c, yihVar);
        cekVar.b = ((Number) obj).floatValue();
        return cekVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            float f = this.b;
            cff cffVar = this.c.a;
            yjz yjzVarU = ccf.u(cffVar);
            if (yjzVarU == null) {
                bty.a("Required value was null.");
                throw new yfs();
            }
            bmx bmxVar = new bmx((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            this.a = 1;
            obj = yjzVarU.a(bmxVar, this);
            if (obj == yioVar) {
                return yioVar;
            }
        }
        return new Float(Float.intBitsToFloat((int) (((bmx) obj).a & 4294967295L)));
    }
}
