package defpackage;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qhw implements qgv, qip, qiq {
    public final Context a;
    public final qio b;
    public final qgp c;
    public final qid d;
    private final Map e = new LinkedHashMap();
    private final Object f = new Object();
    private final qir g;

    public qhw(qir qirVar, Context context, qio qioVar, qgp qgpVar, qid qidVar) {
        this.g = qirVar;
        this.a = context;
        this.b = qioVar;
        this.c = qgpVar;
        this.d = qidVar;
    }

    public static boolean l(qij qijVar) {
        qii qiiVar = qijVar.c;
        if (qiiVar == null) {
            qiiVar = qii.a;
        }
        qii qiiVar2 = qii.a;
        if (qiiVar == qiiVar2) {
            return false;
        }
        return (qiiVar2 != null && qiiVar.getClass() == qiiVar2.getClass() && abza.a.a(qiiVar.getClass()).k(qiiVar, qiiVar2)) ? false : true;
    }

    public static boolean m(qij qijVar) {
        qij qijVar2 = qij.a;
        if (qijVar2 == qijVar) {
            return false;
        }
        return (qijVar != null && qijVar2.getClass() == qijVar.getClass() && abza.a.a(qijVar2.getClass()).k(qijVar2, qijVar)) ? false : true;
    }

    public static boolean n(qij qijVar, qgu qguVar) {
        abla ablaVar = qijVar.b;
        if (ablaVar == null) {
            ablaVar = abla.a;
        }
        vfc vfcVarA = qix.a(ablaVar);
        if (vfcVarA != null) {
            return ((qgr) qguVar).a || !vfcVarA.e;
        }
        return false;
    }

    private final zyd o() {
        return wzx.g(this.c.a.c()).e(IOException.class, new zvi() { // from class: qhh
            @Override // defpackage.zvi
            public final zyd a(Object obj) throws IOException {
                IOException iOException = (IOException) obj;
                int i = yrv.a;
                boolean z = false;
                IOException iOException2 = iOException;
                Throwable cause = iOException2;
                while (true) {
                    Throwable cause2 = iOException2.getCause();
                    if (cause2 == null) {
                        if (iOException2 instanceof FileNotFoundException) {
                            return this.a.i();
                        }
                        throw iOException;
                    }
                    if (cause2 == cause) {
                        throw new IllegalArgumentException("Loop in causal chain detected.", cause2);
                    }
                    if (z) {
                        cause = cause.getCause();
                    }
                    z = !z;
                    iOException2 = cause2;
                }
            }
        }, zwk.a);
    }

    @Override // defpackage.qgv
    public final zyd a() {
        wzx wzxVarG = wzx.g(o());
        yqi yqiVar = new yqi() { // from class: qgy
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                qij qijVar = (qij) obj;
                if (!qhw.m(qijVar)) {
                    return this.a.g();
                }
                abla ablaVar = qijVar.b;
                if (ablaVar == null) {
                    ablaVar = abla.a;
                }
                return yqt.i(ablaVar);
            }
        };
        zwk zwkVar = zwk.a;
        return wzx.g(wzxVarG.h(yqiVar, zwkVar)).e(Exception.class, new zvi() { // from class: qhc
            @Override // defpackage.zvi
            public final zyd a(Object obj) throws Exception {
                throw ((Exception) obj);
            }
        }, zwkVar).h(new yqi() { // from class: qhl
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                yqt yqtVar = (yqt) obj;
                yqtVar.g();
                return yqtVar;
            }
        }, zwkVar);
    }

    @Override // defpackage.qgv
    public final zyd b(final qgu qguVar, final int i) {
        wzx wzxVarG = wzx.g(o());
        zvi zviVar = new zvi() { // from class: qhe
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final qij qijVar = (qij) obj;
                boolean zM = qhw.m(qijVar);
                final qhw qhwVar = this.a;
                if (!zM || !qhw.l(qijVar)) {
                    return zxn.h(qhwVar.g());
                }
                qio qioVar = qhwVar.b;
                qii qiiVar = qijVar.c;
                if (qiiVar == null) {
                    qiiVar = qii.a;
                }
                int i2 = i;
                final qgu qguVar2 = qguVar;
                wzx wzxVarG2 = wzx.g(qioVar.a(qiiVar, i2));
                qht qhtVar = new qht();
                zwk zwkVar = zwk.a;
                return wzxVarG2.h(qhtVar, zwkVar).c(Exception.class, new yqi() { // from class: qha
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        return ypv.a;
                    }
                }, zwkVar).i(new zvi() { // from class: qhb
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) throws IOException {
                        yqt yqtVar = (yqt) obj2;
                        if (!yqtVar.g()) {
                            return zxn.h(qhwVar.g());
                        }
                        if (qhw.n(qijVar, qguVar2)) {
                            return zxn.h(yqtVar);
                        }
                        qiw.a((InputStream) yqtVar.c());
                        return zxn.g(new qgx());
                    }
                }, zwkVar);
            }
        };
        zwk zwkVar = zwk.a;
        return wzxVarG.i(zviVar, zwkVar).e(Exception.class, new zvi() { // from class: qhf
            @Override // defpackage.zvi
            public final zyd a(Object obj) throws Exception {
                throw ((Exception) obj);
            }
        }, zwkVar).h(new yqi() { // from class: qhg
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                yqt yqtVar = (yqt) obj;
                yqtVar.g();
                return yqtVar;
            }
        }, zwkVar);
    }

    @Override // defpackage.qgv
    public final zyd c() {
        wzx wzxVarG = wzx.g(o());
        zvi zviVar = new zvi() { // from class: qhi
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                qij qijVar = (qij) obj;
                return qhw.m(qijVar) ? zxn.h(qijVar) : this.a.i();
            }
        };
        zwk zwkVar = zwk.a;
        return wzx.g(wzxVarG.i(zviVar, zwkVar).h(new yqi() { // from class: qhj
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                abla ablaVar = ((qij) obj).b;
                return ablaVar == null ? abla.a : ablaVar;
            }
        }, zwkVar)).e(Exception.class, new zvi() { // from class: qhk
            @Override // defpackage.zvi
            public final zyd a(Object obj) throws Exception {
                throw ((Exception) obj);
            }
        }, zwkVar).h(new yqi() { // from class: qhm
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return (abla) obj;
            }
        }, zwkVar);
    }

    @Override // defpackage.qgv
    public final zyd d(final qgu qguVar, final int i) {
        wzx wzxVarG = wzx.g(o());
        zvi zviVar = new zvi() { // from class: qho
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final qij qijVar = (qij) obj;
                boolean zM = qhw.m(qijVar);
                final qhw qhwVar = this.a;
                final qgu qguVar2 = qguVar;
                final int i2 = i;
                if (!zM || !qhw.l(qijVar)) {
                    return qhwVar.h(qguVar2, i2);
                }
                qio qioVar = qhwVar.b;
                qii qiiVar = qijVar.c;
                if (qiiVar == null) {
                    qiiVar = qii.a;
                }
                wzx wzxVarG2 = wzx.g(qioVar.a(qiiVar, i2));
                qht qhtVar = new qht();
                zwk zwkVar = zwk.a;
                return wzxVarG2.h(qhtVar, zwkVar).c(Exception.class, new yqi() { // from class: qhu
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        return ypv.a;
                    }
                }, zwkVar).i(new zvi() { // from class: qhv
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) throws IOException {
                        yqt yqtVar = (yqt) obj2;
                        boolean zG = yqtVar.g();
                        qgu qguVar3 = qguVar2;
                        if (!zG) {
                            return qhwVar.h(qguVar3, i2);
                        }
                        if (qhw.n(qijVar, qguVar3)) {
                            return zxn.h((InputStream) yqtVar.c());
                        }
                        qiw.a((InputStream) yqtVar.c());
                        return zxn.g(new qgx());
                    }
                }, zwkVar);
            }
        };
        zwk zwkVar = zwk.a;
        return wzxVarG.i(zviVar, zwkVar).e(Exception.class, new zvi() { // from class: qhp
            @Override // defpackage.zvi
            public final zyd a(Object obj) throws Exception {
                throw ((Exception) obj);
            }
        }, zwkVar).h(new yqi() { // from class: qhq
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return (InputStream) obj;
            }
        }, zwkVar);
    }

    @Override // defpackage.qgv
    public final void e(qgt qgtVar, Executor executor) {
        executor.getClass();
        synchronized (this.f) {
            this.e.put(qgtVar, executor);
        }
    }

    @Override // defpackage.qgv
    public final void f(qgt qgtVar) {
        synchronized (this.f) {
            this.e.remove(qgtVar);
        }
    }

    public final yqt g() {
        this.g.a();
        return ypv.a;
    }

    public final zyd h(final qgu qguVar, final int i) {
        zyd zydVarI = i();
        zvi zviVar = new zvi() { // from class: qhd
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                qij qijVar = (qij) obj;
                if (!qhw.n(qijVar, qguVar)) {
                    return zxn.g(new qgx());
                }
                qhw qhwVar = this.a;
                qii qiiVar = qijVar.c;
                if (qiiVar == null) {
                    qiiVar = qii.a;
                }
                return qhwVar.b.a(qiiVar, i);
            }
        };
        return zuz.h(zydVarI, wyo.c(zviVar), zwk.a);
    }

    public final zyd i() {
        zyd zydVarA = this.g.a();
        zvi zviVar = new zvi() { // from class: qhn
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final qhw qhwVar = this.a;
                final abla ablaVar = (abla) obj;
                zyd zydVarC = qhwVar.c.a.c();
                zvi zviVar2 = new zvi() { // from class: qgz
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        qij qijVar = (qij) obj2;
                        aewa aewaVarEV = aevz.a.eV();
                        qhw qhwVar2 = qhwVar;
                        if (aewaVarEV.c(qhwVar2.a) && ablaVar.b.size() > 0) {
                            abla ablaVar2 = qijVar.b;
                            if (ablaVar2 == null) {
                                ablaVar2 = abla.a;
                            }
                            if (ablaVar2.b.size() == 0) {
                                qid qidVar = qhwVar2.d;
                                qidVar.a.a.a(qidVar.b);
                                return qhwVar2.c.a.c();
                            }
                        }
                        return zxn.h(qijVar);
                    }
                };
                return zuz.h(zydVarC, wyo.c(zviVar2), zwk.a);
            }
        };
        return zuz.h(zydVarA, wyo.c(zviVar), zwk.a);
    }

    @Override // defpackage.qip
    public final void j() {
        yyr yyrVarJ;
        synchronized (this.f) {
            yyrVarJ = yyr.j(this.e);
        }
        zdl it = yyrVarJ.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Executor executor = (Executor) entry.getValue();
            final qgt qgtVar = (qgt) entry.getKey();
            qgtVar.getClass();
            executor.execute(wyo.h(new Runnable() { // from class: qhs
                @Override // java.lang.Runnable
                public final void run() {
                    qgtVar.a();
                }
            }));
        }
    }

    @Override // defpackage.qiq
    public final void k() {
        yyr yyrVarJ;
        synchronized (this.f) {
            yyrVarJ = yyr.j(this.e);
        }
        zdl it = yyrVarJ.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Executor executor = (Executor) entry.getValue();
            final qgt qgtVar = (qgt) entry.getKey();
            qgtVar.getClass();
            executor.execute(wyo.h(new Runnable() { // from class: qhr
                @Override // java.lang.Runnable
                public final void run() {
                    qgtVar.b();
                }
            }));
        }
    }
}
