package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtc extends yiz implements yjz {
    int a;
    final /* synthetic */ bcy b;
    final /* synthetic */ dsn c;
    final /* synthetic */ Context d;
    final /* synthetic */ djd e;
    final /* synthetic */ dtg f;
    final /* synthetic */ yvc g;
    final /* synthetic */ dti h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtc(bcy bcyVar, dsn dsnVar, yvc yvcVar, Context context, djd djdVar, dti dtiVar, dtg dtgVar, yih yihVar) {
        super(2, yihVar);
        this.b = bcyVar;
        this.c = dsnVar;
        this.g = yvcVar;
        this.d = context;
        this.e = djdVar;
        this.h = dtiVar;
        this.f = dtgVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtc) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        dtc dtcVar = new dtc(this.b, this.c, this.g, this.d, this.e, this.h, this.f, yihVar);
        dtcVar.i = obj;
        return dtcVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            yow yowVar = (yow) this.i;
            yle yleVar = new yle();
            bcy bcyVar = this.b;
            yleVar.a = bcyVar.a;
            dtb dtbVar = new dtb(this.c, bcyVar, yleVar, this.g, this.d, this.e, this.h, this.f, yowVar, null);
            this.a = 1;
            if (vyf.J(bcyVar.l, dtbVar, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
