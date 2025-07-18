package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zxm extends zul implements Runnable {
    private zyd a;

    public zxm(zyd zydVar) {
        this.a = zydVar;
    }

    @Override // defpackage.zum
    protected final String a() {
        zyd zydVar = this.a;
        if (zydVar != null) {
            return a.t(zydVar, "delegate=[", "]");
        }
        return null;
    }

    @Override // defpackage.zum
    protected final void b() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zyd zydVar = this.a;
        if (zydVar != null) {
            eZ(zydVar);
        }
    }
}
