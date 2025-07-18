package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mfc implements idy, mfb {
    private final idy a;
    private volatile boolean b;

    public mfc(idy idyVar) {
        this.a = idyVar;
    }

    @Override // defpackage.mfb
    public final synchronized void a() {
        this.b = true;
    }

    @Override // defpackage.idy
    public final synchronized void c(Object obj) {
        if (this.b) {
            return;
        }
        this.a.c(obj);
    }
}
