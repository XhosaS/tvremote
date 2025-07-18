package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class dmg {
    public final czm a;
    public final List b;
    final czb c;
    public boolean d;
    public dmd e;
    public boolean f;
    public dmd g;
    public Bitmap h;
    public dmd i;
    public int j;
    public int k;
    public int l;
    private final Handler m;
    private final ddz n;
    private boolean o;
    private cyx p;

    public dmg(cyg cygVar, czm czmVar, int i, int i2, dar darVar, Bitmap bitmap) {
        ddz ddzVar = cygVar.b;
        Context baseContext = cygVar.c.getBaseContext();
        czb czbVarB = cyg.c(baseContext).b(baseContext);
        Context baseContext2 = cygVar.c.getBaseContext();
        cyx cyxVarN = cyg.c(baseContext2).b(baseContext2).b().n(((dor) ((dor) dor.b(dcr.b).K()).N()).w(i, i2));
        this.b = new ArrayList();
        this.c = czbVarB;
        Handler handler = new Handler(Looper.getMainLooper(), new dmf(this));
        this.n = ddzVar;
        this.m = handler;
        this.p = cyxVarN;
        this.a = czmVar;
        e(darVar, bitmap);
    }

    final int a() {
        return ((czq) this.a).f.c;
    }

    public final void b() {
        int i;
        if (!this.d || this.o) {
            return;
        }
        dmd dmdVar = this.i;
        if (dmdVar != null) {
            this.i = null;
            c(dmdVar);
            return;
        }
        this.o = true;
        czm czmVar = this.a;
        czq czqVar = (czq) czmVar;
        czo czoVar = czqVar.f;
        int i2 = czoVar.c;
        int i3 = 0;
        if (i2 > 0 && (i = czqVar.e) >= 0) {
            i3 = i < i2 ? ((czn) czoVar.e.get(i)).i : -1;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + i3;
        czmVar.b();
        this.g = new dmd(this.m, czqVar.e, jUptimeMillis);
        cyx cyxVarI = this.p.n((dor) new dor().C(new dpt(Double.valueOf(Math.random())))).i(czmVar);
        cyxVarI.p(this.g, cyxVarI, dqc.a);
    }

    final void c(dmd dmdVar) {
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, dmdVar).sendToTarget();
            return;
        }
        if (!this.d) {
            this.i = dmdVar;
            return;
        }
        if (dmdVar.b != null) {
            d();
            dmd dmdVar2 = this.e;
            this.e = dmdVar;
            List list = this.b;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((dme) list.get(size)).c();
                }
            }
            if (dmdVar2 != null) {
                this.m.obtainMessage(2, dmdVar2).sendToTarget();
            }
        }
        b();
    }

    public final void d() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.n.d(bitmap);
            this.h = null;
        }
    }

    final void e(dar darVar, Bitmap bitmap) {
        dqk.d(bitmap, "Argument must not be null");
        this.h = bitmap;
        this.p = this.p.n(new dor().I(darVar));
        this.j = dqm.a(bitmap);
        this.k = bitmap.getWidth();
        this.l = bitmap.getHeight();
    }
}
