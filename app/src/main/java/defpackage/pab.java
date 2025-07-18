package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pab implements zxe {
    final /* synthetic */ pad a;

    public pab(pad padVar) {
        this.a = padVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) pad.a.d()).p(th)).q("com/google/android/libraries/home/homegraph/foyer/storage/HomeGraphStore$2", "onFailure", (char) 162, "HomeGraphStore.java")).u("Background Executor loading home graph data throws an exception.");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ozw ozwVar = (ozw) obj;
        pad padVar = this.a;
        synchronized (padVar.g) {
            padVar.h = null;
        }
        this.a.a(ozwVar);
    }
}
