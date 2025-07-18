package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class maz implements mab {
    public final Executor a;
    public final Runnable b;
    private final xkp c;
    private final xbw d;
    private final Executor e;
    private final Executor f;
    private final Executor g;
    private final xbw h;
    private final lie i;
    private final mbk j;
    private final jzs k;
    private final jzs l;

    public maz(xkp xkpVar, jzs jzsVar, gqz gqzVar, jzs jzsVar2, mbk mbkVar, xbw xbwVar, xbw xbwVar2, lie lieVar) {
        this.c = xkpVar;
        jzsVar.getClass();
        this.k = jzsVar;
        this.b = gqzVar;
        this.l = jzsVar2;
        this.j = mbkVar;
        this.h = xbwVar;
        this.d = xbwVar2;
        this.i = lieVar;
        this.e = jzsVar.h(0);
        this.a = jzsVar.h(3000);
        this.f = jzsVar.h(1000);
        this.g = jzsVar.h(2000);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yfo] */
    private final void h(ieg iegVar, String str, boolean z, String str2) {
        jzs jzsVar = this.l;
        lyz lyzVar = (lyz) jzsVar.a.b();
        lyzVar.getClass();
        ExecutorService executorService = (ExecutorService) jzsVar.b.b();
        executorService.getClass();
        Object objB = jzsVar.c.b();
        iegVar.getClass();
        this.e.execute(new mbb(lyzVar, executorService, (gag) objB, iegVar, str, str2, z));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, yfo] */
    private final void i(uof uofVar, idy idyVar, Executor executor, int i, mfm mfmVar) {
        may mayVar = new may(idyVar, mfmVar);
        int i2 = 0;
        max maxVar = new max(mayVar, executor, i2);
        this.i.ac(((Boolean) xkq.a.et(((xkq) this.c).b)).booleanValue());
        jzs jzsVar = (jzs) this.d.b();
        jzs jzsVar2 = this.k;
        Object obj = uofVar.c;
        lhr lhrVar = new lhr(((lhv) jzsVar.a).b(), (gag) jzsVar.c.b(), (jzs) jzsVar.b.b(), (ksn) obj, maxVar, new max(mayVar, jzsVar2.h(i - 2), i2));
        mbk mbkVar = (mbk) this.h.b();
        idy idyVar2 = mayVar.a;
        kuw kuwVar = (kuw) mbkVar.a.b();
        kuwVar.getClass();
        gag gagVar = (gag) mbkVar.b.b();
        gagVar.getClass();
        lzw lzwVar = (lzw) mbkVar.c.b();
        lzwVar.getClass();
        lqs lqsVar = (lqs) mbkVar.d.b();
        lqsVar.getClass();
        idyVar2.getClass();
        uofVar.getClass();
        maxVar.execute(new mbj(kuwVar, gagVar, lzwVar, lqsVar, idyVar2, lhrVar, uofVar));
    }

    @Override // defpackage.mab
    public final void a(idy idyVar) {
        f(new max(new may(idyVar, new mfm()), this.a, 0));
    }

    @Override // defpackage.mab
    public final void b(ieg iegVar, String str, boolean z) {
        h(iegVar, str, z, true != z ? "account = ? AND asset_type = 6 AND asset_id = ? AND hidden IN (1, 3)" : "account = ? AND asset_type = 6 AND asset_id = ? AND NOT (hidden IN (1, 3))");
    }

    @Override // defpackage.mab
    public final void c(ieg iegVar, String str, boolean z) {
        h(iegVar, str, z, true != z ? "account = ? AND asset_type IN (19, 20) AND root_asset_id = ?  AND hidden IN (1, 3)" : "account = ? AND asset_type IN (19, 20) AND root_asset_id = ?  AND NOT (hidden IN (1, 3))");
    }

    @Override // defpackage.mab
    public final void d(uof uofVar, idy idyVar, mfm mfmVar) {
        i(uofVar, idyVar, this.g, 2000, mfmVar);
    }

    @Override // defpackage.mab
    public final void e(uof uofVar, idy idyVar, mfm mfmVar) {
        i(uofVar, idyVar, this.f, 1000, mfmVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, yfo] */
    public final void f(Executor executor) {
        mbk mbkVar = this.j;
        ldv ldvVar = (ldv) mbkVar.d.b();
        ldvVar.getClass();
        isy isyVar = (isy) mbkVar.c.b();
        isyVar.getClass();
        ?? r1 = mbkVar.a;
        executor.execute(new mav(ldvVar, isyVar, (hx) mbkVar.b.b(), (gag) r1.b(), executor, 0));
    }

    @Override // defpackage.mfk
    public final /* bridge */ /* synthetic */ void g(Object obj, idy idyVar) {
        d(new uof((ksn) obj, (String) null), new krn(this, idyVar, 8, null), new mfm());
    }
}
