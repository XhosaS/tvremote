package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gse implements gqt, gsx, gqg {
    Boolean a;
    private final Context b;
    private final gsd d;
    private boolean e;
    private final gqr h;
    private final gsf j;
    private final tae k;
    private final fse l;
    private final isy m;
    private final cb n;
    private final Map c = new HashMap();
    private final Object f = new Object();
    private final gqw g = fki.aT();
    private final Map i = new HashMap();

    static {
        gpn.a("GreedyScheduler");
    }

    public gse(Context context, tae taeVar, gag gagVar, gqr gqrVar, fse fseVar, isy isyVar) {
        this.b = context;
        cb cbVar = (cb) taeVar.g;
        this.d = new gsd(this, cbVar);
        this.j = new gsf(cbVar, fseVar);
        this.m = isyVar;
        this.n = new cb(gagVar);
        this.k = taeVar;
        this.h = gqrVar;
        this.l = fseVar;
    }

    private final void f() {
        this.a = Boolean.valueOf(gvp.a(this.b, this.k));
    }

    private final void g() {
        if (this.e) {
            return;
        }
        this.h.c(this);
        this.e = true;
    }

    @Override // defpackage.gqg
    public final void a(gun gunVar, boolean z) {
        yqe yqeVar;
        cb cbVarC = this.g.c(gunVar);
        if (cbVarC != null) {
            this.j.b(cbVarC);
        }
        synchronized (this.f) {
            yqeVar = (yqe) this.c.remove(gunVar);
        }
        if (yqeVar != null) {
            gpn.b();
            Objects.toString(gunVar);
            yqeVar.t(null);
        }
        if (z) {
            return;
        }
        synchronized (this.f) {
            this.i.remove(gunVar);
        }
    }

    @Override // defpackage.gqt
    public final void b(String str) {
        Runnable runnable;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            gpn.b();
            return;
        }
        g();
        gpn.b();
        gsd gsdVar = this.d;
        if (gsdVar != null && (runnable = (Runnable) gsdVar.b.remove(str)) != null) {
            gsdVar.c.m(runnable);
        }
        for (cb cbVar : this.g.a(str)) {
            this.j.b(cbVar);
            fki.bc(this.l, cbVar);
        }
    }

    @Override // defpackage.gqt
    public final void c(guw... guwVarArr) {
        long jMax;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            gpn.b();
            return;
        }
        g();
        HashSet<guw> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (guw guwVar : guwVarArr) {
            gun gunVarAM = fki.aM(guwVar);
            gqw gqwVar = this.g;
            if (!gqwVar.b(gunVarAM)) {
                synchronized (this.f) {
                    gun gunVarAM2 = fki.aM(guwVar);
                    Map map = this.i;
                    aacv aacvVar = (aacv) map.get(gunVarAM2);
                    if (aacvVar == null) {
                        int i = guwVar.l;
                        Object obj = this.k.e;
                        aacvVar = new aacv(i, System.currentTimeMillis());
                        map.put(gunVarAM2, aacvVar);
                    }
                    jMax = aacvVar.b + (Math.max((guwVar.l - aacvVar.a) - 5, 0) * 30000);
                }
                long jMax2 = Math.max(guwVar.a(), jMax);
                Object obj2 = this.k.e;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (guwVar.c == gpx.a) {
                    if (jCurrentTimeMillis < jMax2) {
                        gsd gsdVar = this.d;
                        if (gsdVar != null) {
                            String str = guwVar.b;
                            Map map2 = gsdVar.b;
                            Runnable runnable = (Runnable) map2.remove(str);
                            if (runnable != null) {
                                gsdVar.c.m(runnable);
                            }
                            foa foaVar = new foa(gsdVar, guwVar, 18);
                            map2.put(str, foaVar);
                            gsdVar.c.n(jMax2 - System.currentTimeMillis(), foaVar);
                        }
                    } else if (guwVar.c()) {
                        gou gouVar = guwVar.k;
                        if (gouVar.d) {
                            gpn.b();
                            Objects.toString(guwVar);
                        } else if (gouVar.b()) {
                            gpn.b();
                            Objects.toString(guwVar);
                        } else {
                            hashSet.add(guwVar);
                            hashSet2.add(guwVar.b);
                        }
                    } else if (!gqwVar.b(fki.aM(guwVar))) {
                        gpn.b();
                        String str2 = guwVar.b;
                        cb cbVarE = gqwVar.e(guwVar);
                        this.j.c(cbVarE);
                        this.l.L(cbVarE);
                    }
                }
            }
        }
        synchronized (this.f) {
            if (!hashSet.isEmpty()) {
                TextUtils.join(",", hashSet2);
                gpn.b();
                for (guw guwVar2 : hashSet) {
                    gun gunVarAM3 = fki.aM(guwVar2);
                    Map map3 = this.c;
                    if (!map3.containsKey(gunVarAM3)) {
                        map3.put(gunVarAM3, gta.a(this.n, guwVar2, (yot) this.m.d, this));
                    }
                }
            }
        }
    }

    @Override // defpackage.gqt
    public final boolean d() {
        return false;
    }

    @Override // defpackage.gsx
    public final void e(guw guwVar, fki fkiVar) {
        boolean z = fkiVar instanceof gss;
        gun gunVarAM = fki.aM(guwVar);
        if (z) {
            gqw gqwVar = this.g;
            if (gqwVar.b(gunVarAM)) {
                return;
            }
            gpn.b();
            Objects.toString(gunVarAM);
            gunVarAM.toString();
            cb cbVarD = gqwVar.d(gunVarAM);
            this.j.c(cbVarD);
            this.l.L(cbVarD);
            return;
        }
        gpn.b();
        Objects.toString(gunVarAM);
        gunVarAM.toString();
        cb cbVarC = this.g.c(gunVarAM);
        if (cbVarC != null) {
            this.j.b(cbVarC);
            this.l.M(cbVarC, ((gst) fkiVar).a);
        }
    }
}
