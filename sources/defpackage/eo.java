package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eo implements rd {
    int a;
    final /* synthetic */ ep b;
    private boolean c = false;

    protected eo(ep epVar) {
        this.b = epVar;
    }

    @Override // defpackage.rd
    public final void a() {
        if (this.c) {
            return;
        }
        ep epVar = this.b;
        epVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.rd
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    @Override // defpackage.rd
    public final void c() {
        this.c = true;
    }

    public final void d(asv asvVar, int i) {
        this.b.f = asvVar;
        this.a = i;
    }
}
