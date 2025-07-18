package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gae implements vtg {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/homegraph/HomeGraphUpdateWorker");
    public final fda b;
    public final Context c;
    public final fjn d;
    public final fxv e;
    public final gtu f;
    public final agow g;
    private final ahbt h;
    private final fsv i;
    private final fze j;

    public gae(fda fdaVar, Context context, ahbt ahbtVar, fjn fjnVar, fxv fxvVar, fsv fsvVar, fze fzeVar, gtu gtuVar, agow agowVar) {
        fdaVar.getClass();
        context.getClass();
        ahbtVar.getClass();
        fjnVar.getClass();
        gtuVar.getClass();
        agowVar.getClass();
        this.b = fdaVar;
        this.c = context;
        this.h = ahbtVar;
        this.d = fjnVar;
        this.e = fxvVar;
        this.i = fsvVar;
        this.j = fzeVar;
        this.f = gtuVar;
        this.g = agowVar;
    }

    @Override // defpackage.vtu
    public final /* synthetic */ zyd a(WorkerParameters workerParameters) {
        return vtt.a();
    }

    @Override // defpackage.vtg, defpackage.vtu
    public final zyd b(WorkerParameters workerParameters) {
        workerParameters.getClass();
        ((zdv) a.b().q("com/google/android/apps/tvsearch/homegraph/HomeGraphUpdateWorker", "startWork", 70, "HomeGraphUpdateWorker.kt")).u("Starting");
        return ahkr.c(this.h, 0, new gac(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x015f, code lost:
    
        if (r1 == r4) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b A[PHI: r1 r2 r16 r22
  0x013b: PHI (r1v27 java.lang.Object) = (r1v26 java.lang.Object), (r1v48 java.lang.Object) binds: [B:53:0x0139, B:17:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x013b: PHI (r2v24 java.lang.Object) = (r2v23 java.lang.Object), (r2v35 java.lang.Object) binds: [B:53:0x0139, B:17:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x013b: PHI (r16v2 boolean) = (r16v1 boolean), (r16v5 boolean) binds: [B:53:0x0139, B:17:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x013b: PHI (r22v4 boolean) = (r22v3 boolean), (r22v7 boolean) binds: [B:53:0x0139, B:17:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.accounts.Account r19, java.lang.String r20, java.lang.String r21, defpackage.agsw r22) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gae.c(android.accounts.Account, java.lang.String, java.lang.String, agsw):java.lang.Object");
    }

    @Override // defpackage.vtu
    public final /* synthetic */ void d(vtj vtjVar) {
    }
}
