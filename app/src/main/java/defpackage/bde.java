package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bde implements bcl {
    public static final bde a = new bde();
    public Handler e;
    public int b = 0;
    public int c = 0;
    public boolean d = true;
    private boolean i = true;
    public final bco f = new bco(this);
    public final Runnable g = new bcz(this);
    final bda h = new bda(this);

    private bde() {
    }

    final void a() {
        int i = this.c + 1;
        this.c = i;
        if (i == 1) {
            if (!this.d) {
                this.e.removeCallbacks(this.g);
            } else {
                this.f.e(bce.ON_RESUME);
                this.d = false;
            }
        }
    }

    final void b() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1 && this.i) {
            this.f.e(bce.ON_START);
            this.i = false;
        }
    }

    final void c() {
        if (this.b == 0 && this.d) {
            this.f.e(bce.ON_STOP);
            this.i = true;
        }
    }

    @Override // defpackage.bcl
    public final bcg ek() {
        return this.f;
    }
}
