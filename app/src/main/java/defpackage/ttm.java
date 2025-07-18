package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ttm implements twa {
    public final Executor a;
    public final twb b;
    public final tvy c;
    public final ttz d;
    public final ttl e;
    public final HashSet f;
    public final List g;
    public boolean h;
    public boolean i;
    public zyd j;
    private final zyh k;
    private final twe l;
    private final ttl m;

    public ttm(tua tuaVar, tvz tvzVar, zyh zyhVar, twe tweVar, twb twbVar, ttq ttqVar) {
        ttl ttlVar = new ttl(this);
        this.m = ttlVar;
        ttl ttlVar2 = new ttl(this);
        this.e = ttlVar2;
        this.f = new HashSet();
        this.g = new ArrayList();
        this.h = false;
        this.i = false;
        this.j = null;
        this.k = zyhVar;
        this.l = tweVar;
        this.b = twbVar;
        this.a = new zyt(zyhVar);
        this.c = tvzVar.a(tweVar, ttlVar, ttqVar);
        zyh zyhVar2 = (zyh) tuaVar.a.a();
        zyhVar2.getClass();
        zyh zyhVar3 = (zyh) tuaVar.b.a();
        zyhVar3.getClass();
        adkp adkpVar = (adkp) tuaVar.c.a();
        adkpVar.getClass();
        Context context = (Context) tuaVar.d.a();
        context.getClass();
        ((tru) tuaVar.e.a()).getClass();
        this.d = new ttz(zyhVar2, zyhVar3, adkpVar, context, tweVar, ttlVar2);
    }

    @Override // defpackage.twa
    public final void a() {
        this.d.a();
        this.c.a();
    }

    public final void b() {
        this.j = this.k.schedule(wyo.h(new Runnable() { // from class: tsy
            @Override // java.lang.Runnable
            public final void run() {
                final ttm ttmVar = this.a;
                ttmVar.a.execute(wyo.h(new Runnable() { // from class: tsx
                    @Override // java.lang.Runnable
                    public final void run() {
                        trm trmVar = new trm();
                        ttm ttmVar2 = ttmVar;
                        ttmVar2.d(trmVar);
                        if (ttmVar2.h) {
                            return;
                        }
                        ttmVar2.d.d(trmVar);
                    }
                }));
            }
        }), 5000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.twa
    public final void c(Supplier supplier, int i, int i2) throws Throwable {
        b();
        this.d.c(supplier, i, i2);
        this.c.c(supplier, i, i2);
    }

    public final void d(trr trrVar) {
        if (this.h || this.i) {
            return;
        }
        if (!((tsk) this.l).o || this.f.isEmpty()) {
            this.h = true;
            this.d.a();
            this.b.d(trrVar);
            for (tsz tszVar : this.g) {
                if (!this.f.contains(tszVar.a)) {
                    tszVar.b.run();
                }
            }
        }
    }
}
