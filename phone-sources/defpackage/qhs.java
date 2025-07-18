package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qhs {
    public final vie a;
    public final vhq b;
    public final Throwable c;
    public final qei d;
    public final qig e;
    public final qmt f;
    public final qor g;
    public qen h;
    public String i;
    public String j;
    public String k;
    public vhi l;
    public String o;
    public String p;
    public Long q;
    public String r;
    public String s;
    public final int u;
    public int v;
    public int w;
    public final List m = new ArrayList();
    public long n = TimeUnit.MILLISECONDS.toMicros(Instant.now().toEpochMilli());
    public Set t = yhd.a;

    public qhs(vie vieVar, vhq vhqVar, int i, Throwable th, qei qeiVar, qig qigVar, qmt qmtVar, qor qorVar) {
        this.a = vieVar;
        this.b = vhqVar;
        this.u = i;
        this.c = th;
        this.d = qeiVar;
        this.e = qigVar;
        this.f = qmtVar;
        this.g = qorVar;
    }

    public final /* bridge */ /* synthetic */ void a(vhi vhiVar) {
        vhiVar.getClass();
        this.l = vhiVar;
    }

    public final /* synthetic */ void b(qen qenVar) {
        if (qenVar != null) {
            this.h = qenVar;
            qpv qpvVarB = qenVar.b();
            if (qpvVarB instanceof qpz) {
                this.i = qenVar.c;
                this.s = ((qpz) qpvVarB).a;
            } else if (qpvVarB instanceof qpw) {
                this.s = qenVar.d;
                this.j = ((qpw) qpvVarB).a;
                this.k = qenVar.e;
            } else if (qpvVarB instanceof qpx) {
                this.q = Long.valueOf(qenVar.o);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void c(vlq vlqVar) {
        String str = vlqVar.e;
        str.getClass();
        if (str.length() > 0) {
            List list = this.m;
            vtw vtwVarM = vgy.a.m();
            vtwVarM.getClass();
            String str2 = vlqVar.e;
            str2.getClass();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            vgy vgyVar = (vgy) vucVar;
            vgyVar.b |= 1;
            vgyVar.c = str2;
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
            String str3 = (vlqVar.c == 12 ? (vld) vlqVar.d : vld.a).n;
            str3.getClass();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vgy vgyVar4 = (vgy) vtwVarM.b;
            vgyVar4.b |= 8;
            vgyVar4.f = str3;
            vkw vkwVar = (vlqVar.c == 12 ? (vld) vlqVar.d : vld.a).o;
            if (vkwVar == null) {
                vkwVar = vkw.a;
            }
            String str4 = vkwVar.b;
            str4.getClass();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar3 = vtwVarM.b;
            vgy vgyVar5 = (vgy) vucVar3;
            vgyVar5.b |= 16;
            vgyVar5.g = str4;
            vsz vszVar = vlqVar.s;
            vszVar.getClass();
            if (!vucVar3.A()) {
                vtwVarM.u();
            }
            vgy vgyVar6 = (vgy) vtwVarM.b;
            vgyVar6.b |= 128;
            vgyVar6.h = vszVar;
            vuc vucVarR = vtwVarM.r();
            vucVarR.getClass();
            list.add((vgy) vucVarR);
        }
        Set set = this.t;
        vuj vujVar = vlqVar.t;
        vujVar.getClass();
        Set setAq = yfm.aq(vujVar);
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(yfm.e(set.size() + Integer.valueOf(setAq.size()).intValue()));
        linkedHashSet.addAll(set);
        yfm.I(linkedHashSet, setAq);
        this.t = linkedHashSet;
    }
}
