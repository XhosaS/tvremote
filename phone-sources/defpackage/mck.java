package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mck implements mcj {
    private final ldv a;
    private final Executor b;
    private final Executor c;
    private final lyz d;
    private final lkt e;

    public mck(ldv ldvVar, lyz lyzVar, lkt lktVar, Executor executor, Executor executor2) {
        this.a = ldvVar;
        this.d = lyzVar;
        this.e = lktVar;
        this.b = executor;
        this.c = executor2;
        a(icz.a);
    }

    @Override // defpackage.mcj
    public final void a(idy idyVar) {
        this.c.execute(new mav(this.a, this.d, idyVar, "watch_next_feed", "watch_next_feed_account", 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yfo] */
    @Override // defpackage.idy
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ksn ksnVar = (ksn) obj;
        lnt lntVar = new lnt(this, 8);
        lkt lktVar = this.e;
        lyz lyzVar = (lyz) lktVar.b.b();
        lyzVar.getClass();
        idf idfVar = (idf) lktVar.c.b();
        idfVar.getClass();
        lys lysVar = (lys) lktVar.e.b();
        lysVar.getClass();
        lfu lfuVar = (lfu) lktVar.f.b();
        lfuVar.getClass();
        lfx lfxVar = (lfx) lktVar.d.b();
        lfxVar.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) lktVar.a.b();
        sharedPreferences.getClass();
        ksnVar.getClass();
        this.b.execute(new mch(lyzVar, idfVar, lysVar, lfuVar, lfxVar, sharedPreferences, ksnVar, lntVar));
    }
}
