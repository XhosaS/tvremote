package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jw extends re {
    final /* synthetic */ int a;
    final /* synthetic */ jx b;
    private boolean c = false;

    public jw(jx jxVar, int i) {
        this.b = jxVar;
        this.a = i;
    }

    @Override // defpackage.re, defpackage.rd
    public final void a() {
        if (this.c) {
            return;
        }
        jx jxVar = this.b;
        jxVar.a.setVisibility(this.a);
    }

    @Override // defpackage.re, defpackage.rd
    public final void b() {
        this.b.a.setVisibility(0);
    }

    @Override // defpackage.re, defpackage.rd
    public final void c() {
        this.c = true;
    }
}
