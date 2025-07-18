package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixa implements zxe {
    final /* synthetic */ ixb a;
    private final iyd b;
    private final Runnable c;
    private final abnb d;

    public ixa(ixb ixbVar, iyd iydVar, Runnable runnable, abnb abnbVar) {
        this.a = ixbVar;
        this.b = iydVar;
        this.c = runnable;
        this.d = abnbVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getClass();
        ixb ixbVar = this.a;
        ixbVar.c.a(rpm.cL(), abqb.UNKNOWN, null, null);
        ixbVar.d.a(gmc.T);
        ((zdv) ((zdv) ixb.a.c()).p(th).q("com/google/android/apps/tvsearch/suggestedqueries/controller/SuggestedQueriesProviderImpl$SuggestedQueriesResponseClass", "onFailure", 264, "SuggestedQueriesProviderImpl.kt")).u("#ResultCallback for SuggestedQueries: Not updating suggestion string due to error");
        ((iwr) this.b).a();
        ixbVar.h = false;
        ixbVar.c();
        ((iwv) this.c).a.b();
        ghp ghpVar = ixbVar.e;
        abnb abnbVar = this.d;
        ghpVar.s(abnbVar);
        ixbVar.f.Z(3, abnbVar, "suggestion_download_failed");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        xuy xuyVar = (xuy) obj;
        xuyVar.getClass();
        ahal.e(this.a.b, null, 0, new iwz(this, xuyVar, null), 3).w(new agux() { // from class: iwx
            @Override // defpackage.agux
            public final Object a(Object obj2) {
                Throwable th = (Throwable) obj2;
                if (th != null && !(th instanceof CancellationException)) {
                    ((zdv) ((zdv) ixb.a.d()).p(th).q("com/google/android/apps/tvsearch/suggestedqueries/controller/SuggestedQueriesProviderImpl$SuggestedQueriesResponseClass", "onSuccess$lambda$0", 186, "SuggestedQueriesProviderImpl.kt")).u("Failed to handle successful SuggestedQueries Response.");
                }
                return agpu.a;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r10 != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.xuy r9, defpackage.agsw r10) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixa.c(xuy, agsw):java.lang.Object");
    }
}
