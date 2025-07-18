package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ich extends yiz implements yjz {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ity c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ich(ity ityVar, boolean z, yih yihVar) {
        super(2, yihVar);
        this.c = ityVar;
        this.b = z;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ich) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        ich ichVar = new ich(this.c, this.b, yihVar);
        ichVar.d = obj;
        return ichVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            ysy ysyVar = (ysy) this.d;
            yrz yrzVarR = vyf.R(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0, 6);
            yst ystVar = new yst(yrzVarR, true);
            ity ityVar = this.c;
            ipi ipiVar = new ipi(new ysq(new daz(new ipi((yjz) new alb(ityVar, yrzVarR, this.b, (yih) null, 4), (ysx) ystVar, 13), (yih) null, 10)), new icg(ityVar, yrzVarR, (yih) null, 0), 11);
            this.a = 1;
            if (vyf.K(ysyVar, ipiVar, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
