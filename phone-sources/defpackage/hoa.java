package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hoa implements hmw, hmv {
    public final hmx a;
    public final hmv b;
    public volatile Object c;
    public volatile hmu d;
    private volatile int e;
    private volatile hmt f;
    private volatile cvi g;

    public hoa(hmx hmxVar, hmv hmvVar) {
        this.a = hmxVar;
        this.b = hmvVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hlu, java.lang.Object] */
    @Override // defpackage.hmw
    public final void a() {
        cvi cviVar = this.g;
        if (cviVar != null) {
            cviVar.a.dL();
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [hlu, java.lang.Object] */
    @Override // defpackage.hmv
    public final void b(hlg hlgVar, Exception exc, hlu hluVar, int i) {
        this.b.b(hlgVar, exc, hluVar, this.g.a.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [hlu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [hlu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [hlu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [hlu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [hlu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [hlu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [hlg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [hlg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [hlu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [hlg, java.lang.Object] */
    @Override // defpackage.hmw
    public final boolean c() throws Throwable {
        boolean z;
        boolean z2 = false;
        if (this.c != null) {
            Object obj = this.c;
            this.c = null;
            try {
                double d = hwk.a;
                SystemClock.elapsedRealtimeNanos();
                try {
                    hmx hmxVar = this.a;
                    hlw hlwVarQ = hmxVar.c.b().q(obj);
                    Object objA = hlwVarQ.a();
                    hkw hkwVarJ = ((hfw) hmxVar.c.b().d).j(objA.getClass());
                    if (hkwVarJ == null) {
                        throw new hkb(objA.getClass());
                    }
                    cvi cviVar = new cvi(hkwVarJ, objA, hmxVar.h, null);
                    hmu hmuVar = new hmu(this.g.c, hmxVar.m);
                    hos hosVarC = hmxVar.c();
                    hosVarC.b(hmuVar, cviVar);
                    if (hosVarC.a(hmuVar) == null) {
                        try {
                            this.b.d(this.g.c, hlwVarQ.a(), this.g.a, this.g.a.g(), this.g.c);
                            return true;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (!z) {
                                this.g.a.d();
                            }
                            throw th;
                        }
                    }
                    this.d = hmuVar;
                    this.f = new hmt(Collections.singletonList(this.g.c), hmxVar, this);
                    this.g.a.d();
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f != null && this.f.c()) {
            return true;
        }
        this.f = null;
        this.g = null;
        while (!z2) {
            int i = this.e;
            hmx hmxVar2 = this.a;
            if (i >= hmxVar2.e().size()) {
                break;
            }
            List listE = hmxVar2.e();
            int i2 = this.e;
            this.e = i2 + 1;
            this.g = (cvi) listE.get(i2);
            if (this.g != null && (hmxVar2.o.c(this.g.a.g()) || hmxVar2.g(this.g.a.a()))) {
                this.g.a.f(hmxVar2.n, new hnz(this, this.g));
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [hlu, java.lang.Object] */
    @Override // defpackage.hmv
    public final void d(hlg hlgVar, Object obj, hlu hluVar, int i, hlg hlgVar2) {
        this.b.d(hlgVar, obj, hluVar, this.g.a.g(), hlgVar);
    }

    final boolean e(cvi cviVar) {
        cvi cviVar2 = this.g;
        return cviVar2 != null && cviVar2 == cviVar;
    }
}
