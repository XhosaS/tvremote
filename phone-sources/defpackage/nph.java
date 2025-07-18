package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nph {
    long b;
    public final nqj c;
    List d;
    final SparseIntArray e;
    final LruCache f;
    final List g;
    public final Deque h;
    public nwx i;
    public nwx j;
    private final Handler l;
    private final TimerTask m;
    public final Set k = DesugarCollections.synchronizedSet(new HashSet());
    public final nsf a = new nsf("MediaQueue");

    public nph(nqj nqjVar) {
        this.c = nqjVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.l = new ogh(Looper.getMainLooper());
        this.m = new npe(this);
        nqjVar.G(new npg(this));
        this.f = new npf(this);
        this.b = a();
        d();
    }

    public static /* synthetic */ void f(nph nphVar) {
        Set set = nphVar.k;
        synchronized (set) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
    }

    private final void g() {
        this.l.removeCallbacks(this.m);
    }

    private final void h() {
        nwx nwxVar = this.j;
        if (nwxVar != null) {
            nwxVar.h();
            this.j = null;
        }
    }

    private final void i() {
        nwx nwxVar = this.i;
        if (nwxVar != null) {
            nwxVar.h();
            this.i = null;
        }
    }

    public final long a() {
        nln nlnVarH = this.c.h();
        if (nlnVarH == null) {
            return 0L;
        }
        MediaInfo mediaInfo = nlnVarH.a;
        if (nln.f(nlnVarH.e, nlnVarH.f, nlnVarH.l, mediaInfo == null ? -1 : mediaInfo.a)) {
            return 0L;
        }
        return nlnVarH.b;
    }

    public final void b() {
        f(this);
        this.d.clear();
        this.e.clear();
        this.f.evictAll();
        this.g.clear();
        g();
        this.h.clear();
        h();
        i();
        f(this);
        f(this);
    }

    public final void c() {
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        for (int i = 0; i < this.d.size(); i++) {
            sparseIntArray.put(((Integer) this.d.get(i)).intValue(), i);
        }
    }

    public final void d() {
        nwx nwxVarZ;
        ocv.aC();
        if (this.b != 0 && this.j == null) {
            h();
            i();
            nqj nqjVar = this.c;
            ocv.aC();
            if (nqjVar.p()) {
                npq npqVar = new npq(nqjVar);
                nqj.y(npqVar);
                nwxVarZ = npqVar;
            } else {
                nwxVarZ = nqj.z();
            }
            this.j = nwxVarZ;
            nwxVarZ.i(new mkk(this, 6));
        }
    }

    public final void e() {
        g();
        this.l.postDelayed(this.m, 500L);
    }
}
