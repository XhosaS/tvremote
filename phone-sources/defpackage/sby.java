package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sby implements sbj, sbm {
    public static sby a;
    public sbu b;
    public yfw d;
    public int e = 2;
    private final List f = new ArrayList();
    public final TreeMap c = new TreeMap();
    private final Runnable g = new rtr(this, 18);
    private final Handler h = new Handler(Looper.getMainLooper());

    public final sbu a() {
        return (sbu) yfm.X(this.f);
    }

    public final sbu b() {
        sbu sbuVar = this.b;
        if (sbuVar != null) {
            return sbuVar;
        }
        yks.c("root");
        return null;
    }

    public final void c(sbu sbuVar) {
        sbuVar.getClass();
        sby sbyVar = a;
        if (sbyVar == null) {
            throw new UnsupportedOperationException("node must be executed within current scope");
        }
        if (!yks.e(sbyVar, this)) {
            throw new UnsupportedOperationException("can't execute node when another scope is executing");
        }
        if (!yks.e(sbuVar.b, this)) {
            throw new UnsupportedOperationException("can't execute node of a different scope");
        }
        if (this.e == 3) {
            throw new IllegalStateException("can't execute node within a destroyed scope");
        }
        this.f.add(sbuVar);
        try {
            if (sbuVar.d()) {
                throw new UnsupportedOperationException("can't execute a node that's already destroyed");
            }
            if (!sbuVar.k.isEmpty()) {
                List list = sbuVar.g;
                sbuVar.h = yfm.al(list);
                list.clear();
                List list2 = sbuVar.e;
                List listAl = yfm.al(list2);
                list2.clear();
                sbuVar.o.b.clear();
                try {
                    sbuVar.f = sbuVar.d.a(sbuVar, sbuVar.f);
                } finally {
                    sbuVar.k.clear();
                    sbuVar.m++;
                    Iterator it = yfm.ad(sbuVar.h, sbuVar.g).iterator();
                    while (it.hasNext()) {
                        ((sbu) it.next()).u();
                    }
                    Iterator it2 = yfm.ad(yfm.ad(listAl, sbuVar.e), sbuVar.c).iterator();
                    while (it2.hasNext()) {
                        sbuVar.c(it2.next());
                    }
                    sbuVar.h = yhb.a;
                }
            }
        } finally {
            this.f.remove(r0.size() - 1);
        }
    }

    public final void d(yjk yjkVar) {
        sfy.n(this);
        try {
            yjkVar.a();
        } finally {
            sfy.n(null);
        }
    }

    public final void e() {
        Handler handler = this.h;
        Runnable runnable = this.g;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }

    @Override // defpackage.sbj
    public final void s() {
        int i = this.e;
        if (i == 3) {
            throw new IllegalStateException("can't activate a destroyed scope");
        }
        if (i != 1) {
            this.e = 1;
            e();
            if (this.b != null) {
                b().s();
            }
        }
    }

    @Override // defpackage.sbj
    public final void t() {
        int i = this.e;
        if (i == 3) {
            throw new IllegalStateException("can't deactivate a destroyed scope");
        }
        if (i != 2) {
            this.e = 2;
            this.h.removeCallbacks(this.g);
            if (this.b != null) {
                b().t();
            }
        }
    }

    @Override // defpackage.sbm
    public final void u() {
        yjk yjkVar;
        if (this.e == 3) {
            throw new IllegalStateException("can't destroy a destroyed scope");
        }
        if (yks.e(a, this)) {
            throw new UnsupportedOperationException("Can't destroy a scope during execution");
        }
        if (this.e == 1) {
            t();
        }
        this.e = 3;
        this.h.removeCallbacks(this.g);
        if (this.b != null) {
            b().u();
        }
        this.f.clear();
        this.c.clear();
        yfw yfwVar = this.d;
        if (yfwVar == null || (yjkVar = (yjk) yfwVar.b) == null) {
            return;
        }
        yjkVar.a();
    }
}
