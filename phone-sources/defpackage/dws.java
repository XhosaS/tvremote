package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dws implements Runnable {
    private final dvl a;
    private final dvc b;
    private boolean c;

    public dws(dvl dvlVar, dvc dvcVar) {
        dvcVar.getClass();
        this.a = dvlVar;
        this.b = dvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        this.a.e(this.b);
        this.c = true;
    }
}
