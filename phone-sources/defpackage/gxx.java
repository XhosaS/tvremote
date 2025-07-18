package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxx {
    public final gxy a;
    public final boolean[] b = new boolean[2];
    public final /* synthetic */ gyb c;
    private boolean d;

    public gxx(gyb gybVar, gxy gxyVar) {
        this.c = gybVar;
        this.a = gxyVar;
    }

    public final zhe a(int i) {
        zhe zheVar;
        gyb gybVar = this.c;
        synchronized (gybVar) {
            if (this.d) {
                throw new IllegalStateException("editor is closed");
            }
            this.b[i] = true;
            Object obj = this.a.d.get(i);
            obj.getClass();
            zheVar = (zhe) obj;
            hjs.x(gybVar.h, zheVar);
        }
        return zheVar;
    }

    public final void b() {
        c(false);
    }

    public final void c(boolean z) {
        gyb gybVar = this.c;
        synchronized (gybVar) {
            if (this.d) {
                throw new IllegalStateException("editor is closed");
            }
            if (yks.e(this.a.g, this)) {
                gybVar.c(this, z);
            }
            this.d = true;
        }
    }
}
