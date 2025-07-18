package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kf implements ahx {
    int a;
    final /* synthetic */ kg b;
    private boolean c = false;

    protected kf(kg kgVar) {
        this.b = kgVar;
    }

    @Override // defpackage.ahx
    public final void a() {
        if (this.c) {
            return;
        }
        kg kgVar = this.b;
        kgVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.ahx
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    @Override // defpackage.ahx
    public final void c() {
        this.c = true;
    }

    public final void d(ahw ahwVar, int i) {
        this.b.f = ahwVar;
        this.a = i;
    }
}
