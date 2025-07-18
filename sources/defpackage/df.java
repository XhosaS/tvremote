package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class df extends re {
    final /* synthetic */ dg a;
    private boolean b = false;
    private int c = 0;

    public df(dg dgVar) {
        this.a = dgVar;
    }

    @Override // defpackage.re, defpackage.rd
    public final void a() {
        int i = this.c + 1;
        this.c = i;
        dg dgVar = this.a;
        if (i == dgVar.a.size()) {
            rd rdVar = dgVar.b;
            if (rdVar != null) {
                rdVar.a();
            }
            this.c = 0;
            this.b = false;
            dgVar.c = false;
        }
    }

    @Override // defpackage.re, defpackage.rd
    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        rd rdVar = this.a.b;
        if (rdVar != null) {
            rdVar.b();
        }
    }
}
