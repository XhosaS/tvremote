package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mjb implements nnn {
    public final idr a;

    public mjb(Context context, lfn lfnVar) {
        lfnVar.getClass();
        idz idzVar = new idz(false);
        this.a = idzVar;
        if (!lfnVar.bY() || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return;
        }
        nnm nnmVarH = nmg.d(context).h();
        idzVar.c(Boolean.valueOf(nnmVarH.a() != null));
        nnmVarH.c(this, nmq.class);
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void a(nnl nnlVar, int i) {
        this.a.c(false);
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void b(nnl nnlVar) {
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void c(nnl nnlVar, int i) {
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void d(nnl nnlVar, boolean z) {
        this.a.c(true);
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void e(nnl nnlVar, String str) {
        this.a.c(true);
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void f(nnl nnlVar, int i) {
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void g(nnl nnlVar, String str) {
        this.a.c(true);
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void h(nnl nnlVar) {
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void i(nnl nnlVar, int i) {
    }
}
