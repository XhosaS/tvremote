package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwa implements dvk {
    public static final dwa a = new dwa();
    public Handler e;
    public int b = 0;
    public int c = 0;
    public boolean d = true;
    private boolean i = true;
    public final dvl f = new dvl(this);
    public final Runnable g = new caw(this, 15, null);
    final pku h = new pku(this);

    private dwa() {
    }

    final void a() {
        int i = this.c + 1;
        this.c = i;
        if (i == 1) {
            if (!this.d) {
                this.e.removeCallbacks(this.g);
            } else {
                this.f.e(dvc.ON_RESUME);
                this.d = false;
            }
        }
    }

    final void b() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1 && this.i) {
            this.f.e(dvc.ON_START);
            this.i = false;
        }
    }

    public final void c() {
        if (this.b == 0 && this.d) {
            this.f.e(dvc.ON_STOP);
            this.i = true;
        }
    }

    @Override // defpackage.dvk
    public final dve getLifecycle() {
        return this.f;
    }
}
