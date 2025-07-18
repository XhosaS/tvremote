package defpackage;

import android.os.SystemClock;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvo implements pvh {
    public static final tvn a = tvn.n("GnpSdk");
    static final List b = Arrays.asList(vie.SHOWN, vie.SHOWN_REPLACED, vie.SHOWN_FORCED);
    public pvt D;
    public final int H;
    private final qgq N;
    public final pvg c;
    public final vie d;
    public final vhq e;
    public final qei f;
    public final qig g;
    public final qmt h;
    public final pyg i;
    public final qbp j;
    public String k = null;
    public int I = 0;
    public final List l = new ArrayList();
    public int J = 0;
    public final List m = new ArrayList();
    public vht n = null;
    public qrx o = null;
    public int K = 0;
    public String p = null;
    public qen q = null;
    public String r = null;
    public String s = null;
    public String t = null;
    public vhi u = null;
    public qbm v = null;
    public qbo w = null;
    public final List x = new ArrayList();
    public pvi A = null;
    public int L = 0;
    public int M = 0;
    public String B = null;
    public boolean C = false;
    public boolean E = false;
    public Long F = null;
    public final Set G = new HashSet();
    public Long y = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(Instant.now().toEpochMilli()));
    public final Long z = Long.valueOf(SystemClock.elapsedRealtime());

    public pvo(pvg pvgVar, vie vieVar, vhq vhqVar, int i, qei qeiVar, qig qigVar, qmt qmtVar, pyg pygVar, qbp qbpVar, qgq qgqVar) {
        this.c = pvgVar;
        this.d = vieVar;
        this.e = vhqVar;
        this.H = i;
        this.f = qeiVar;
        this.g = qigVar;
        this.h = qmtVar;
        this.i = pygVar;
        this.j = qbpVar;
        this.N = qgqVar;
    }

    public static boolean j(Boolean bool) {
        return (bool == null || bool.booleanValue()) ? false : true;
    }

    @Override // defpackage.pvh
    public final void a() {
        this.N.a(new Runnable() { // from class: pvm
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:263:0x068e  */
            /* JADX WARN: Removed duplicated region for block: B:305:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:90:0x02b5  */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.String, java.lang.Throwable] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 2054
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.pvm.run():void");
            }
        });
    }

    @Override // defpackage.pvh
    public final void b(String str) {
        qbm qbmVar;
        Iterator it = this.j.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                qbmVar = null;
                break;
            } else {
                qbmVar = (qbm) it.next();
                if (qbmVar.a.equals(str)) {
                    break;
                }
            }
        }
        this.v = qbmVar;
    }

    @Override // defpackage.pvh
    public final void c(qis qisVar) {
        vnz vnzVar = qisVar.q;
        if (vnzVar != null && vnzVar.b) {
            this.C = true;
        }
        List list = this.x;
        vtw vtwVarM = vgy.a.m();
        String str = qisVar.a;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        vgy vgyVar = (vgy) vucVar;
        vgyVar.b = 1 | vgyVar.b;
        vgyVar.c = str;
        long j = qisVar.c;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        vgy vgyVar2 = (vgy) vucVar2;
        vgyVar2.b |= 2;
        vgyVar2.d = j;
        long j2 = qisVar.e;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        vuc vucVar3 = vtwVarM.b;
        vgy vgyVar3 = (vgy) vucVar3;
        vgyVar3.b |= 4;
        vgyVar3.e = j2;
        vsz vszVar = qisVar.i;
        if (!vucVar3.A()) {
            vtwVarM.u();
        }
        vuc vucVar4 = vtwVarM.b;
        vgy vgyVar4 = (vgy) vucVar4;
        vgyVar4.b |= 128;
        vgyVar4.h = vszVar;
        String str2 = qisVar.n;
        if (!vucVar4.A()) {
            vtwVarM.u();
        }
        vgy vgyVar5 = (vgy) vtwVarM.b;
        vgyVar5.b |= 8;
        vgyVar5.f = str2;
        vkw vkwVar = qisVar.l.o;
        if (vkwVar == null) {
            vkwVar = vkw.a;
        }
        String str3 = vkwVar.b;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vgy vgyVar6 = (vgy) vtwVarM.b;
        str3.getClass();
        vgyVar6.b |= 16;
        vgyVar6.g = str3;
        list.add((vgy) vtwVarM.r());
        this.G.addAll(qisVar.k);
    }

    @Override // defpackage.pvh
    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c((qis) it.next());
        }
    }

    @Override // defpackage.pvh
    public final void e(qen qenVar) {
        if (qenVar != null) {
            this.q = qenVar;
            qpv qpvVarB = qenVar.b();
            if (qpvVarB instanceof qpz) {
                this.r = qenVar.c;
                this.p = ((qpz) qpvVarB).a;
            } else if (qpvVarB instanceof qpw) {
                this.p = qenVar.d;
                this.s = ((qpw) qpvVarB).a;
                this.t = qenVar.e;
            } else if (qpvVarB instanceof qpx) {
                this.F = Long.valueOf(((qpx) qpvVarB).b);
            }
        }
    }

    @Override // defpackage.pvh
    public final void f(vlq vlqVar) {
        if (vlqVar != null && !vlqVar.e.isEmpty()) {
            vtw vtwVarM = vgy.a.m();
            String str = vlqVar.e;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            vgy vgyVar = (vgy) vucVar;
            str.getClass();
            vgyVar.b |= 1;
            vgyVar.c = str;
            long j = vlqVar.i;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            vuc vucVar2 = vtwVarM.b;
            vgy vgyVar2 = (vgy) vucVar2;
            vgyVar2.b |= 2;
            vgyVar2.d = j;
            long j2 = vlqVar.f;
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            vgy vgyVar3 = (vgy) vtwVarM.b;
            vgyVar3.b |= 4;
            vgyVar3.e = j2;
            String str2 = (vlqVar.c == 12 ? (vld) vlqVar.d : vld.a).n;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vgy vgyVar4 = (vgy) vtwVarM.b;
            str2.getClass();
            vgyVar4.b |= 8;
            vgyVar4.f = str2;
            vkw vkwVar = (vlqVar.c == 12 ? (vld) vlqVar.d : vld.a).o;
            if (vkwVar == null) {
                vkwVar = vkw.a;
            }
            String str3 = vkwVar.b;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar3 = vtwVarM.b;
            vgy vgyVar5 = (vgy) vucVar3;
            str3.getClass();
            vgyVar5.b |= 16;
            vgyVar5.g = str3;
            vsz vszVar = vlqVar.s;
            if (!vucVar3.A()) {
                vtwVarM.u();
            }
            vgy vgyVar6 = (vgy) vtwVarM.b;
            vszVar.getClass();
            vgyVar6.b |= 128;
            vgyVar6.h = vszVar;
            this.x.add((vgy) vtwVarM.r());
            vnz vnzVar = vlqVar.q;
            if (vnzVar == null) {
                vnzVar = vnz.a;
            }
            if (vnzVar.b) {
                this.C = true;
            }
        }
        if (vlqVar != null) {
            this.G.addAll(vlqVar.t);
        }
    }

    @Override // defpackage.pvh
    public final void g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f((vlq) it.next());
        }
    }

    @Override // defpackage.pvh
    public final void h(long j) {
        this.y = Long.valueOf(j);
    }

    @Override // defpackage.pvh
    public final void i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vko vkoVar = (vko) it.next();
            vtw vtwVarM = vgy.a.m();
            String str = vkoVar.c;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            vgy vgyVar = (vgy) vucVar;
            str.getClass();
            vgyVar.b |= 1;
            vgyVar.c = str;
            long j = vkoVar.d;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            vuc vucVar2 = vtwVarM.b;
            vgy vgyVar2 = (vgy) vucVar2;
            vgyVar2.b |= 2;
            vgyVar2.d = j;
            long j2 = vkoVar.e;
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            vuc vucVar3 = vtwVarM.b;
            vgy vgyVar3 = (vgy) vucVar3;
            vgyVar3.b |= 4;
            vgyVar3.e = j2;
            vsz vszVar = vkoVar.f;
            if (!vucVar3.A()) {
                vtwVarM.u();
            }
            vgy vgyVar4 = (vgy) vtwVarM.b;
            vszVar.getClass();
            vgyVar4.b |= 128;
            vgyVar4.h = vszVar;
            this.x.add((vgy) vtwVarM.r());
        }
    }
}
