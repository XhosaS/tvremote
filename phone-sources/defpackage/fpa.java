package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpa implements uha {
    final /* synthetic */ fnw a;
    final /* synthetic */ int b;
    final /* synthetic */ fph c;

    public fpa(fph fphVar, fnw fnwVar, int i) {
        this.a = fnwVar;
        this.b = i;
        this.c = fphVar;
    }

    @Override // defpackage.uha
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        fnw fnwVar = this.a;
        edt.aB(this.c.b.k, new foe(new fqc(this, this.b, (List) obj, fnwVar, 1), 1));
    }

    @Override // defpackage.uha
    public final void a(Throwable th) {
    }
}
