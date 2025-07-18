package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vp extends yiz implements yjz {
    int a;
    final /* synthetic */ vr b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(vr vrVar, float f, float f2, yih yihVar) {
        super(2, yihVar);
        this.b = vrVar;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new vp(this.b, this.c, this.d, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            vr vrVar = this.b;
            float f = this.c;
            float f2 = this.d;
            long jFloatToRawIntBits = Float.floatToRawIntBits(f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
            this.a = 1;
            if (vk.a(vrVar.i, (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32), this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
