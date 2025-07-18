package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euc {
    public static final eur a = new eur(1);
    public final Context b;
    public final euo c;
    public final etz d;
    public int f;
    public int g;
    public boolean h;
    public int j;
    public boolean k;
    public euu m;
    public final pku n;
    public boolean i = true;
    public List l = Collections.EMPTY_LIST;
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();

    public euc(Context context, euo euoVar, gag gagVar) {
        this.b = context.getApplicationContext();
        this.c = euoVar;
        Handler handlerM = edt.M(new etv(this, 2));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        etz etzVar = new etz(handlerThread, euoVar, gagVar, handlerM, this.i);
        this.d = etzVar;
        pku pkuVar = new pku(this, null);
        this.n = pkuVar;
        euu euuVar = new euu(context, pkuVar, a);
        this.m = euuVar;
        int iA = euuVar.a();
        this.j = iA;
        this.f = 1;
        etzVar.obtainMessage(1, iA, 0).sendToTarget();
    }

    public final void a(eua euaVar) {
        this.e.add(euaVar);
    }

    public final void b() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((eua) it.next()).d(this, this.k);
        }
    }

    public final void c(euu euuVar, int i) {
        if (this.j != i) {
            this.j = i;
            this.f++;
            this.d.obtainMessage(3, i, 0).sendToTarget();
        }
        boolean zG = g();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            eur eurVar = euuVar.b;
            ((eua) it.next()).g();
        }
        if (zG) {
            b();
        }
    }

    public final void d() {
        e(false);
    }

    public final void e(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        this.f++;
        this.d.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        boolean zG = g();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((eua) it.next()).e(this);
        }
        if (zG) {
            b();
        }
    }

    public final boolean f() {
        return this.g == 0 && this.f == 0;
    }

    public final boolean g() {
        boolean z;
        if (this.i || this.j == 0) {
            z = false;
        } else {
            for (int i = 0; i < this.l.size(); i++) {
                if (((etn) this.l.get(i)).b == 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        boolean z2 = this.k != z;
        this.k = z;
        return z2;
    }
}
