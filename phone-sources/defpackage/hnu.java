package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnu implements hnv, hwu {
    private static final cuj a = hww.a(20, new hoy(1));
    private hnv b;
    private boolean c;
    private boolean d;
    private final mfm e = new mfm();

    static hnu d(hnv hnvVar) {
        hnu hnuVar = (hnu) a.a();
        hju.p(hnuVar);
        hnuVar.d = false;
        hnuVar.c = true;
        hnuVar.b = hnvVar;
        return hnuVar;
    }

    @Override // defpackage.hnv
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.hnv
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.hnv
    public final Object c() {
        return this.b.c();
    }

    @Override // defpackage.hnv
    public final synchronized void e() {
        this.e.c();
        this.d = true;
        if (this.c) {
            return;
        }
        this.b.e();
        this.b = null;
        a.b(this);
    }

    @Override // defpackage.hwu
    public final mfm f() {
        return this.e;
    }

    final synchronized void g() {
        this.e.c();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            e();
        }
    }
}
