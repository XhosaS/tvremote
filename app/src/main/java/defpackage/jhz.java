package defpackage;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhz {
    public static final yzq a = yzq.s(fbo.S.a(), fbo.W.a(), fbo.Y.a(), fbo.ac.a());
    public final ghr b;
    private final agow c;
    private final gfr d;
    private final glq e;
    private final gmd f;
    private final agow g;
    private final gmu h;
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final AtomicBoolean j = new AtomicBoolean(false);
    private final AtomicBoolean k = new AtomicBoolean(false);

    public jhz(agow agowVar, gfr gfrVar, glq glqVar, gmd gmdVar, agow agowVar2, gmu gmuVar, ghr ghrVar) {
        this.c = agowVar;
        this.d = gfrVar;
        this.e = glqVar;
        this.f = gmdVar;
        this.g = agowVar2;
        this.h = gmuVar;
        this.b = ghrVar;
    }

    public final void a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f.k(str);
        }
        if (this.i.compareAndSet(false, true)) {
            if (((Boolean) this.g.a()).booleanValue()) {
                ((gfn) this.c.a()).a(rpm.cr()).b().c();
            } else {
                this.d.a(rpm.cr(), abqb.OK, null, null);
            }
            this.f.m(gmc.f);
            this.b.B(8);
            this.e.v();
        }
        if (a.contains(str2) && this.j.compareAndSet(false, true)) {
            gmd gmdVar = this.f;
            gmdVar.b(gmc.C);
            gmdVar.b(gmc.D);
            gmdVar.b(gmc.G);
            gmdVar.b(gmc.B);
            if (((Boolean) this.g.a()).booleanValue()) {
                ((gfn) this.c.a()).a(rpm.cn()).b().c();
            } else {
                this.d.a(rpm.cn(), abqb.OK, null, null);
            }
            this.h.D();
        }
        if (TextUtils.isEmpty(str) || this.k.getAndSet(true)) {
            return;
        }
        this.b.i(str);
    }

    public final void b(gmc gmcVar) {
        this.f.b(gmcVar);
    }

    public final void c() {
        this.i.set(false);
        this.k.set(false);
        this.j.set(false);
    }
}
