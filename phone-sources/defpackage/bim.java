package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bim extends bin {
    public bim(long j, bja bjaVar) {
        super(j, bjaVar, null, new aru(18));
    }

    @Override // defpackage.bin
    public final bin a(yjv yjvVar, yjv yjvVar2) {
        return (bin) bjb.c(new bbs(yjvVar, yjvVar2, 2));
    }

    @Override // defpackage.bin, defpackage.bit
    public final bit b(yjv yjvVar) {
        return (bir) bjb.c(new bil(yjvVar, 0));
    }

    @Override // defpackage.bin
    public final bix c() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // defpackage.bin, defpackage.bit
    public final void d() {
        synchronized (bjb.b) {
            z();
        }
    }

    @Override // defpackage.bin, defpackage.bit
    public final void e() {
        bjb.r();
    }

    @Override // defpackage.bin, defpackage.bit
    public final /* synthetic */ void f() {
        bcm.E();
    }

    @Override // defpackage.bin, defpackage.bit
    public final /* synthetic */ void g() {
        bcm.E();
    }
}
