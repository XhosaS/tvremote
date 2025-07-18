package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class prg implements zxe {
    final /* synthetic */ pia a;
    final /* synthetic */ prj b;

    public prg(prj prjVar, pia piaVar) {
        this.a = piaVar;
        this.b = prjVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        int i = qce.a;
        try {
            prj prjVar = this.b;
            qeg.f(prjVar.a, prjVar.i, this.a, prjVar.f);
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }
}
