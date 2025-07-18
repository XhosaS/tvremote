package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class paa implements zxe {
    final /* synthetic */ oyu a;

    public paa(oyu oyuVar) {
        this.a = oyuVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) pad.a.d()).p(th)).q("com/google/android/libraries/home/homegraph/foyer/storage/HomeGraphStore$1", "onFailure", 'h', "HomeGraphStore.java")).u("Background Executor saving home graph data in cache throws an exception.");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ozi oziVar = this.a.a;
            oziVar.u = false;
            oziVar.c.a(oziVar.f);
        }
    }
}
