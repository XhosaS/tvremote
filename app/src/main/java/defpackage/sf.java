package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class sf extends ahy {
    final /* synthetic */ int a;
    final /* synthetic */ sg b;
    private boolean c = false;

    public sf(sg sgVar, int i) {
        this.b = sgVar;
        this.a = i;
    }

    @Override // defpackage.ahy, defpackage.ahx
    public final void a() {
        if (this.c) {
            return;
        }
        sg sgVar = this.b;
        sgVar.a.setVisibility(this.a);
    }

    @Override // defpackage.ahy, defpackage.ahx
    public final void b() {
        this.b.a.setVisibility(0);
    }

    @Override // defpackage.ahy, defpackage.ahx
    public final void c() {
        this.c = true;
    }
}
