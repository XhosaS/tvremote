package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aui extends yiz implements yjv {
    int a;
    final /* synthetic */ ysx b;
    final /* synthetic */ mr c;
    final /* synthetic */ yjv d;
    final /* synthetic */ yow e;
    final /* synthetic */ bcb f;
    final /* synthetic */ bcb g;
    final /* synthetic */ bdl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aui(bdl bdlVar, ysx ysxVar, mr mrVar, yjv yjvVar, yow yowVar, bcb bcbVar, bcb bcbVar2, yih yihVar) {
        super(1, yihVar);
        this.h = bdlVar;
        this.b = ysxVar;
        this.c = mrVar;
        this.d = yjvVar;
        this.e = yowVar;
        this.f = bcbVar;
        this.g = bcbVar2;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new aui(this.h, this.b, this.c, this.d, this.e, this.f, this.g, (yih) obj).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(yih<?> yihVar) {
        return new aui(this.h, this.b, this.c, this.d, this.e, this.f, this.g, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        try {
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                this.h.h(Float.NaN);
                ysx ysxVar = this.b;
                aob aobVar = new aob(this.f, this.g, this.c, 2);
                this.a = 1;
                if (ysxVar.a(aobVar, this) == yioVar) {
                    return yioVar;
                }
            }
            this.h.h(((Number) this.c.d()).floatValue());
            this.d.a(false);
        } catch (CancellationException unused) {
            ykr.q(this.e, null, 0, new ajo(this.c, this.h, this.f, this.g, null, 4, null), 3);
        }
        return ygi.a;
    }
}
