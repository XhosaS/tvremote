package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnr extends ele {
    public static final IntentFilter g = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    public final Context h;
    public final lnq i;
    public final List j;
    public final List k;
    public final lnf l;
    public final lny m;
    public final lnk n;
    public List o;
    public nex p;
    public boolean q;
    public long r;
    public final mes s;
    private final mem t;
    private int u;
    private int v;

    public lnr(lfn lfnVar, Context context, mem memVar, mes mesVar, lnk lnkVar, lny lnyVar, lnn... lnnVarArr) {
        super(ecn.a);
        this.i = new lnq(this);
        this.o = Collections.EMPTY_LIST;
        this.h = context;
        this.n = lnkVar;
        this.m = lnyVar;
        this.j = Arrays.asList(lnnVarArr);
        ArrayList arrayList = new ArrayList();
        for (lnn lnnVar : lnnVarArr) {
            lnnVar.v();
            arrayList.add(lnnVar);
        }
        this.k = arrayList;
        this.l = new lnf(lfnVar.r());
        this.t = memVar;
        this.s = mesVar;
    }

    public final int O() {
        return (int) (SystemClock.elapsedRealtime() - this.r);
    }

    public final void P(int i, boolean z) {
        xqr xqrVarG = this.t.g();
        boolean zJ = xqrVarG.j();
        int iG = xqrVarG.g();
        int iF = xqrVarG.f();
        if (!z && this.u == iG && this.v == iF) {
            return;
        }
        this.u = iG;
        this.v = iF;
        this.l.b.a.add(Integer.valueOf(iG));
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((lnn) it.next()).i(i, iG, iF, zJ);
        }
    }

    public final void Q(int i, kzo kzoVar, boolean z) {
        a.ab(this.q);
        int iO = O();
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((lnn) it.next()).d(iO, i, kzoVar, z);
        }
    }

    public final void R(int i) {
        try {
            a.ab(this.q);
            int iO = O();
            this.l.b.l++;
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                ((lnn) it.next()).f(iO, i);
            }
        } catch (IllegalStateException e) {
            krd.d(a.cf(i, "session not started, failed session at "), e);
        }
    }

    public final void S(int i, boolean z, int i2) {
        a.ab(this.q);
        lnf lnfVar = this.l;
        int iO = O();
        lnfVar.j = z;
        lnfVar.c(iO);
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((lnn) it.next()).o(iO, i, z, i2);
        }
    }

    public final void T(int i, int i2, Throwable th, int i3) {
        int i4;
        int i5;
        Throwable th2;
        try {
            a.ab(this.q);
            int iO = O();
            this.l.a();
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                i4 = i;
                i5 = i2;
                th2 = th;
                int i6 = i3;
                try {
                    ((lnn) it.next()).s(iO, i6, i4, i5, th2);
                    i3 = i6;
                    i = i4;
                    i2 = i5;
                    th = th2;
                } catch (IllegalStateException unused) {
                    krd.d(a.ce(i5, i4, "Error because session not started, Error Type : ", " Error Code : "), th2);
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
            i4 = i;
            i5 = i2;
            th2 = th;
        }
    }
}
