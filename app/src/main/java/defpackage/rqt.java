package defpackage;

import j$.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqt implements rqs {
    public final rpz a;
    public yqt b;
    public yqt c;
    private final Map d = new HashMap();
    private final epa e;
    private final Set f;
    private yqt g;
    private yqt h;
    private yqt i;
    private yqt j;
    private final yqt k;
    private final yqt l;
    private final boolean m;

    public rqt(rpz rpzVar) {
        epb epbVar = epb.a;
        this.e = new epa();
        this.f = new HashSet();
        ypv ypvVar = ypv.a;
        this.g = ypvVar;
        this.h = ypvVar;
        this.i = ypvVar;
        this.j = ypvVar;
        this.k = ypvVar;
        this.l = ypvVar;
        this.m = false;
        this.b = ypvVar;
        this.c = ypvVar;
        this.a = rpzVar;
    }

    @Override // defpackage.rqx
    public final rqs a(int i, String str) {
        this.g = yqt.i(Integer.valueOf(i));
        this.h = yqt.i(str);
        return this;
    }

    @Override // defpackage.rqx
    public final rqs b(abqb abqbVar) {
        this.g = yqt.i(Integer.valueOf(abqbVar.s));
        this.h = ypv.a;
        return this;
    }

    @Override // defpackage.rqu
    public final rqv c() {
        AtomicLong atomicLong = rqv.a;
        yqt yqtVarI = ypv.a;
        long andIncrement = rqv.a.getAndIncrement();
        yzq.o(zcp.b);
        epb epbVar = (epb) this.e.v();
        epb epbVar2 = epb.a;
        epa epaVar = new epa();
        epaVar.B(epbVar);
        yyn yynVar = new yyn(4);
        for (Map.Entry entry : this.d.entrySet()) {
            yynVar.c((String) entry.getKey(), yzq.o((Collection) entry.getValue()));
        }
        yyr yyrVarA = yynVar.a(false);
        rpz rpzVar = this.a;
        yzq yzqVarO = yzq.o(this.f);
        epi epiVar = epi.a;
        epg epgVar = new epg();
        epf epfVar = epf.a;
        epe epeVar = new epe();
        if ((epeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            epeVar.y();
        }
        rql rqlVar = rpzVar.a;
        epf epfVar2 = (epf) epeVar.b;
        epfVar2.b |= 2;
        epfVar2.d = ((rqm) rqlVar).a;
        if ((epgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            epgVar.y();
        }
        epi epiVar2 = (epi) epgVar.b;
        epf epfVar3 = (epf) epeVar.v();
        epfVar3.getClass();
        epiVar2.f = epfVar3;
        epiVar2.b |= 8;
        if ((epgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            epgVar.y();
        }
        epi epiVar3 = (epi) epgVar.b;
        epiVar3.e = 1;
        epiVar3.b |= 1;
        if (this.i.g()) {
            Long l = (Long) this.i.c();
            l.longValue();
            if ((epgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                epgVar.y();
            }
            epi epiVar4 = (epi) epgVar.b;
            epiVar4.c = 4;
            epiVar4.d = l;
        }
        if (this.j.g()) {
            Object objC = this.j.c();
            if ((epgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                epgVar.y();
            }
            epi epiVar5 = (epi) epgVar.b;
            epiVar5.c = 5;
            epiVar5.d = objC;
        }
        if ((epaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            epaVar.y();
        }
        epb epbVar3 = (epb) epaVar.b;
        epi epiVar6 = (epi) epgVar.v();
        epiVar6.getClass();
        epbVar3.c = epiVar6;
        epbVar3.b |= 1;
        if (this.g.g()) {
            adfz adfzVar = adfz.a;
            adfy adfyVar = new adfy();
            int iIntValue = ((Integer) this.g.c()).intValue();
            if ((adfyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adfyVar.y();
            }
            adfz adfzVar2 = (adfz) adfyVar.b;
            adfzVar2.b |= 1;
            adfzVar2.c = iIntValue;
            if (this.h.g()) {
                Object objC2 = this.h.c();
                if ((adfyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    adfyVar.y();
                }
                adfz adfzVar3 = (adfz) adfyVar.b;
                adfzVar3.b |= 2;
                adfzVar3.d = (String) objC2;
            }
            adga adgaVar = adga.a;
            adfx adfxVar = new adfx();
            if ((adfxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adfxVar.y();
            }
            adga adgaVar2 = (adga) adfxVar.b;
            adfz adfzVar4 = (adfz) adfyVar.v();
            adfzVar4.getClass();
            adgaVar2.d = adfzVar4;
            adgaVar2.b |= 2;
            if ((epaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                epaVar.y();
            }
            epb epbVar4 = (epb) epaVar.b;
            adga adgaVar3 = (adga) adfxVar.v();
            adgaVar3.getClass();
            epbVar4.d = adgaVar3;
            epbVar4.b |= 2;
        }
        yqt yqtVarI2 = this.b.g() ? yqt.i((wxl) this.b.c()) : yqtVarI;
        if (this.c.g()) {
            yqtVarI = yqt.i(this.c.c());
            adga adgaVar4 = adga.a;
            adfx adfxVar2 = new adfx();
            abzy abzyVarD = acbj.d(((Duration) this.c.c()).toNanos());
            if ((Integer.MIN_VALUE & adfxVar2.b.memoizedSerializedSize) == 0) {
                adfxVar2.y();
            }
            adga adgaVar5 = (adga) adfxVar2.b;
            abzyVarD.getClass();
            adgaVar5.c = abzyVarD;
            adgaVar5.b |= 1;
            epaVar.a((adga) adfxVar2.v());
        }
        yqt yqtVar = yqtVarI;
        yqt yqtVar2 = this.k;
        if (yzqVarO != null) {
            return new rqy(andIncrement, yqtVar2, yqtVar, yqtVarI2, rpzVar, epaVar, yyrVarA, yzqVarO);
        }
        throw new IllegalStateException("Missing required properties:".concat(" testCodes"));
    }

    @Override // defpackage.rqx
    public final Duration d() {
        return (Duration) this.c.e(Duration.ZERO);
    }

    @Override // defpackage.rqx
    public final boolean e() {
        return this.i.g() || this.j.g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqt)) {
            return false;
        }
        rqt rqtVar = (rqt) obj;
        if (!this.a.equals(rqtVar.a) || !this.d.equals(rqtVar.d)) {
            return false;
        }
        epb epbVar = (epb) this.e.v();
        abxd abxdVarV = rqtVar.e.v();
        if ((epbVar != abxdVarV && (abxdVarV == null || epbVar.getClass() != abxdVarV.getClass() || !abza.a.a(epbVar.getClass()).k(epbVar, abxdVarV))) || !this.f.equals(rqtVar.f) || !this.g.equals(rqtVar.g) || !this.h.equals(rqtVar.h) || !this.i.equals(rqtVar.i) || !this.j.equals(rqtVar.j) || !this.k.equals(rqtVar.k) || !this.l.equals(rqtVar.l)) {
            return false;
        }
        boolean z = rqtVar.m;
        if (this.b.equals(rqtVar.b)) {
            return this.c.equals(rqtVar.c);
        }
        return false;
    }

    public final void f(abxc abxcVar, Object obj) {
        epa epaVar = this.e;
        epd epdVar = ((epb) epaVar.b).e;
        if (epdVar == null) {
            epdVar = epd.a;
        }
        epc epcVar = new epc();
        epcVar.B(epdVar);
        epcVar.f(abxcVar, obj);
        if ((epaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            epaVar.y();
        }
        epb epbVar = (epb) epaVar.b;
        epd epdVar2 = (epd) epcVar.v();
        epdVar2.getClass();
        epbVar.e = epdVar2;
        epbVar.b |= 4;
    }

    public final void g(long j) {
        this.i = yqt.i(Long.valueOf(j));
        this.j = ypv.a;
    }

    public final void h(String str) {
        this.j = yqt.i(str);
        this.i = ypv.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.d, this.e.v(), this.f, this.g, this.h, this.i, this.j, this.k, this.l, false, this.b, this.c});
    }

    public final void i(String str, String str2) {
        Set hashSet;
        Map map = this.d;
        if (map.containsKey(str)) {
            hashSet = (Set) map.get(str);
        } else {
            hashSet = new HashSet();
            map.put(str, hashSet);
        }
        hashSet.add(str2);
    }

    public final String toString() {
        return this.a.b;
    }
}
