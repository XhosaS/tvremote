package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yrb extends yqh {
    public ypm b;
    public final yns a = new yns(0, ynv.a);
    private final Thread c = Thread.currentThread();

    public static final void d(int i) {
        throw new IllegalStateException(a.cf(i, "Illegal state "));
    }

    @Override // defpackage.yqh
    public final void a(Throwable th) {
        yns ynsVar;
        int i;
        do {
            ynsVar = this.a;
            i = ynsVar.b;
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                d(i);
                throw new yfs();
            }
        } while (!ynsVar.d(i, 2));
        this.c.interrupt();
        ynsVar.b = 3;
    }

    @Override // defpackage.yqh
    public final boolean b() {
        return true;
    }

    public final void c() {
        while (true) {
            yns ynsVar = this.a;
            int i = ynsVar.b;
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        d(i);
                        throw new yfs();
                    }
                }
            } else if (ynsVar.d(i, 1)) {
                ypm ypmVar = this.b;
                if (ypmVar != null) {
                    ypmVar.eD();
                    return;
                }
                return;
            }
        }
    }
}
