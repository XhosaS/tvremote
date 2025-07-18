package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbe {
    public int a = 0;
    public int b = 100;
    public wt c;

    public final void a() {
        int i = this.a;
        if (i == 2) {
            if (this.b <= 0) {
                throw new IllegalArgumentException();
            }
            wt wtVar = this.c;
            if (wtVar == null || wtVar.b() != this.b) {
                this.c = new wt(this.b);
                return;
            }
            return;
        }
        if (i != 3 && i != 1) {
            this.c = null;
            return;
        }
        wt wtVar2 = this.c;
        if (wtVar2 == null || wtVar2.b() != Integer.MAX_VALUE) {
            this.c = new wt(Integer.MAX_VALUE);
        }
    }

    public final void b() {
        wt wtVar = this.c;
        if (wtVar != null) {
            wtVar.i(-1);
        }
    }

    public final void c(int i) {
        wt wtVar = this.c;
        if (wtVar == null || wtVar.c() == 0) {
            return;
        }
        this.c.g(Integer.toString(i));
    }
}
