package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class utl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ utl(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                utr utrVar = (utr) this.b;
                if (utrVar.h) {
                    return;
                }
                int i = this.a;
                if (utrVar.e.e == 4) {
                    utrVar.i.e(i);
                    return;
                } else {
                    utrVar.d += i;
                    return;
                }
            case 1:
                ((utf) this.b).b.e(this.a);
                return;
            case 2:
                try {
                    int i2 = yfl.a;
                    xvy xvyVar = ((xul) this.b).j;
                    int i3 = this.a;
                    sij.o(i3 > 0, "numMessages must be > 0");
                    if (((xzi) xvyVar).b()) {
                        return;
                    }
                    ((xzi) xvyVar).e += i3;
                    ((xzi) xvyVar).a();
                    return;
                } catch (Throwable th) {
                    ((xul) this.b).b(th);
                    return;
                }
            case 3:
                ((xwe) this.b).b.e(this.a);
                return;
            case 4:
                ((xwj) this.b).h.u(this.a);
                return;
            case 5:
                ((xwj) this.b).h.m(this.a);
                return;
            case 6:
                ((xwj) this.b).h.n(this.a);
                return;
            default:
                ((aabf) this.b).onStatus(this.a);
                return;
        }
    }

    public utl(Object obj, int i, int i2, byte[] bArr) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }
}
