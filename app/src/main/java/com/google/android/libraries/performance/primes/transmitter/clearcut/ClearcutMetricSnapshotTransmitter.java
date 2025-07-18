package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import defpackage.abus;
import defpackage.abxc;
import defpackage.abxm;
import defpackage.abxs;
import defpackage.abyf;
import defpackage.abzb;
import defpackage.ahpn;
import defpackage.ahpq;
import defpackage.ahpr;
import defpackage.ahps;
import defpackage.ahsl;
import defpackage.ahso;
import defpackage.ahsp;
import defpackage.ahsq;
import defpackage.ahsy;
import defpackage.ahsz;
import defpackage.ahtc;
import defpackage.ahte;
import defpackage.ahtf;
import defpackage.ahth;
import defpackage.ahup;
import defpackage.ahuv;
import defpackage.ahvk;
import defpackage.ahvl;
import defpackage.ahvm;
import defpackage.ahvn;
import defpackage.ahvv;
import defpackage.ahvw;
import defpackage.jyw;
import defpackage.rdk;
import defpackage.rdl;
import defpackage.rdr;
import defpackage.rdt;
import defpackage.rej;
import defpackage.yqw;
import defpackage.yrp;
import defpackage.yru;
import defpackage.zpv;
import defpackage.zpw;
import defpackage.zpx;
import defpackage.zpy;
import defpackage.zpz;
import defpackage.zqa;
import defpackage.zqb;
import defpackage.zuz;
import defpackage.zvi;
import defpackage.zwk;
import defpackage.zxy;
import defpackage.zyd;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ClearcutMetricSnapshotTransmitter implements rdl {
    public static final yrp a = yru.a(new yrp() { // from class: rdx
        @Override // defpackage.yrp
        public final Object eV() {
            return new ahuh();
        }
    });
    public volatile jyw b;
    public volatile jyw c;
    private volatile rdr d;
    private volatile rej e;
    private final yrp f = yru.a(new yrp() { // from class: rdw
        @Override // defpackage.yrp
        public final Object eV() {
            yrp yrpVar = ClearcutMetricSnapshotTransmitter.a;
            return Boolean.valueOf(ActivityManager.isUserAMonkey() ? true : Build.VERSION.SDK_INT < 29 ? ActivityManager.isRunningInTestHarness() : ActivityManager.isRunningInUserTestHarness());
        }
    });

    @Override // defpackage.rdl
    public final zyd a(final Context context, rdk rdkVar) {
        abxc abxcVar = rdt.b;
        if (abxcVar.a != rdk.a) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        yqw.B(rdkVar.n.n(abxcVar.d), "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        rej rejVar = this.e;
        if (rejVar == null) {
            synchronized (this) {
                rejVar = this.e;
                if (rejVar == null) {
                    rejVar = new rej();
                    this.e = rejVar;
                }
            }
        }
        ahvw ahvwVar = rdkVar.c;
        if (ahvwVar == null) {
            ahvwVar = ahvw.a;
        }
        ahvv ahvvVar = new ahvv();
        ahvvVar.B(ahvwVar);
        rej.c(rej.a, ahvvVar);
        ahps ahpsVar = ((ahvw) ahvvVar.b).k;
        if (ahpsVar == null) {
            ahpsVar = ahps.a;
        }
        if ((ahpsVar.b & 1) != 0) {
            ahps ahpsVar2 = ((ahvw) ahvvVar.b).k;
            if (ahpsVar2 == null) {
                ahpsVar2 = ahps.a;
            }
            ahpq ahpqVar = ahpsVar2.c;
            if (ahpqVar == null) {
                ahpqVar = ahpq.a;
            }
            ahpn ahpnVar = new ahpn();
            ahpnVar.B(ahpqVar);
            rej.c(rej.b, ahpnVar);
            ahps ahpsVar3 = ((ahvw) ahvvVar.b).k;
            if (ahpsVar3 == null) {
                ahpsVar3 = ahps.a;
            }
            ahpr ahprVar = new ahpr();
            ahprVar.B(ahpsVar3);
            if ((ahprVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahprVar.y();
            }
            ahps ahpsVar4 = (ahps) ahprVar.b;
            ahpq ahpqVar2 = (ahpq) ahpnVar.v();
            ahpqVar2.getClass();
            ahpsVar4.c = ahpqVar2;
            ahpsVar4.b |= 1;
            if ((ahvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahvvVar.y();
            }
            ahvw ahvwVar2 = (ahvw) ahvvVar.b;
            ahps ahpsVar5 = (ahps) ahprVar.v();
            ahpsVar5.getClass();
            ahvwVar2.k = ahpsVar5;
            ahvwVar2.b |= 256;
        }
        ahuv ahuvVar = ((ahvw) ahvvVar.b).i;
        if (ahuvVar == null) {
            ahuvVar = ahuv.a;
        }
        if ((ahuvVar.b & 256) != 0) {
            ahuv ahuvVar2 = ((ahvw) ahvvVar.b).i;
            if (ahuvVar2 == null) {
                ahuvVar2 = ahuv.a;
            }
            zqb zqbVar = ahuvVar2.i;
            if (zqbVar == null) {
                zqbVar = zqb.a;
            }
            zpw zpwVar = new zpw();
            zpwVar.B(zqbVar);
            zpv zpvVar = ((zqb) zpwVar.b).e;
            if (zpvVar == null) {
                zpvVar = zpv.a;
            }
            zpv zpvVarA = rejVar.a(zpvVar);
            if ((zpwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpwVar.y();
            }
            zqb zqbVar2 = (zqb) zpwVar.b;
            zpvVarA.getClass();
            zqbVar2.e = zpvVarA;
            zqbVar2.b |= 1;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(zqbVar2.f);
            if ((zpwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpwVar.y();
            }
            ((zqb) zpwVar.b).f = abzb.b;
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                zpv zpvVarA2 = rejVar.a((zpv) it.next());
                if ((zpwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zpwVar.y();
                }
                zqb zqbVar3 = (zqb) zpwVar.b;
                zpvVarA2.getClass();
                abxs abxsVar = zqbVar3.f;
                if (!abxsVar.c()) {
                    int size = abxsVar.size();
                    zqbVar3.f = abxsVar.d(size + size);
                }
                zqbVar3.f.add(zpvVarA2);
            }
            zqb zqbVar4 = (zqb) zpwVar.b;
            abxs<zqa> abxsVar2 = (zqbVar4.c == 4 ? (zpy) zqbVar4.d : zpy.a).b;
            zpx zpxVar = new zpx();
            for (zqa zqaVar : abxsVar2) {
                zpv zpvVar2 = zqaVar.c;
                if (zpvVar2 == null) {
                    zpvVar2 = zpv.a;
                }
                if ((zpvVar2.b & 2) != 0) {
                    zpz zpzVar = new zpz();
                    zpzVar.B(zqaVar);
                    zpv zpvVarA3 = rejVar.a(zpvVar2);
                    if ((zpzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zpzVar.y();
                    }
                    zqa zqaVar2 = (zqa) zpzVar.b;
                    zpvVarA3.getClass();
                    zqaVar2.c = zpvVarA3;
                    zqaVar2.b |= 1;
                    zqaVar = (zqa) zpzVar.v();
                }
                if ((zpxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zpxVar.y();
                }
                zpy zpyVar = (zpy) zpxVar.b;
                zqaVar.getClass();
                abxs abxsVar3 = zpyVar.b;
                if (!abxsVar3.c()) {
                    int size2 = abxsVar3.size();
                    zpyVar.b = abxsVar3.d(size2 + size2);
                }
                zpyVar.b.add(zqaVar);
            }
            zpy zpyVar2 = (zpy) zpxVar.v();
            if ((zpwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpwVar.y();
            }
            zqb zqbVar5 = (zqb) zpwVar.b;
            zpyVar2.getClass();
            zqbVar5.d = zpyVar2;
            zqbVar5.c = 4;
            ahuv ahuvVar3 = ((ahvw) ahvvVar.b).i;
            if (ahuvVar3 == null) {
                ahuvVar3 = ahuv.a;
            }
            ahup ahupVar = new ahup();
            ahupVar.B(ahuvVar3);
            zqb zqbVar6 = (zqb) zpwVar.v();
            if ((ahupVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahupVar.y();
            }
            ahuv ahuvVar4 = (ahuv) ahupVar.b;
            zqbVar6.getClass();
            ahuvVar4.i = zqbVar6;
            ahuvVar4.b |= 256;
            ahuv ahuvVar5 = (ahuv) ahupVar.v();
            if ((ahvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahvvVar.y();
            }
            ahvw ahvwVar3 = (ahvw) ahvvVar.b;
            ahuvVar5.getClass();
            ahvwVar3.i = ahuvVar5;
            ahvwVar3.b |= 64;
        }
        ahvn ahvnVar = ((ahvw) ahvvVar.b).j;
        if (ahvnVar == null) {
            ahvnVar = ahvn.a;
        }
        if (ahvnVar.k.size() != 0) {
            ahvn ahvnVar2 = ((ahvw) ahvvVar.b).j;
            if (ahvnVar2 == null) {
                ahvnVar2 = ahvn.a;
            }
            ahvk ahvkVar = new ahvk();
            ahvkVar.B(ahvnVar2);
            for (int i = 0; i < ((ahvn) ahvkVar.b).k.size(); i++) {
                ahvm ahvmVar = (ahvm) ((ahvn) ahvkVar.b).k.get(i);
                ahvl ahvlVar = new ahvl();
                ahvlVar.B(ahvmVar);
                if (!((ahvm) ahvlVar.b).c.isEmpty()) {
                    if ((ahvlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahvlVar.y();
                    }
                    ((ahvm) ahvlVar.b).d = abyf.a;
                    List listB = rej.b(((ahvm) ahvlVar.b).c);
                    if ((ahvlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahvlVar.y();
                    }
                    ahvm ahvmVar2 = (ahvm) ahvlVar.b;
                    abxm abxmVar = ahvmVar2.d;
                    if (!abxmVar.c()) {
                        int size3 = abxmVar.size();
                        ahvmVar2.d = abxmVar.d(size3 + size3);
                    }
                    abus.m(listB, ahvmVar2.d);
                }
                if ((ahvlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahvlVar.y();
                }
                ahvm ahvmVar3 = (ahvm) ahvlVar.b;
                ahvmVar3.b &= -2;
                ahvmVar3.c = ahvm.a.c;
                if ((ahvkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahvkVar.y();
                }
                ahvn ahvnVar3 = (ahvn) ahvkVar.b;
                ahvm ahvmVar4 = (ahvm) ahvlVar.v();
                ahvmVar4.getClass();
                abxs abxsVar4 = ahvnVar3.k;
                if (!abxsVar4.c()) {
                    int size4 = abxsVar4.size();
                    ahvnVar3.k = abxsVar4.d(size4 + size4);
                }
                ahvnVar3.k.set(i, ahvmVar4);
            }
            if ((ahvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahvvVar.y();
            }
            ahvw ahvwVar4 = (ahvw) ahvvVar.b;
            ahvn ahvnVar4 = (ahvn) ahvkVar.v();
            ahvnVar4.getClass();
            ahvwVar4.j = ahvnVar4;
            ahvwVar4.b |= 128;
        }
        ahsq ahsqVar = ((ahvw) ahvvVar.b).h;
        if (ahsqVar == null) {
            ahsqVar = ahsq.a;
        }
        if (ahsqVar.b.size() != 0) {
            ahsq ahsqVar2 = ((ahvw) ahvvVar.b).h;
            if (ahsqVar2 == null) {
                ahsqVar2 = ahsq.a;
            }
            ahsp ahspVar = new ahsp();
            ahspVar.B(ahsqVar2);
            for (int i2 = 0; i2 < ((ahsq) ahspVar.b).b.size(); i2++) {
                ahso ahsoVar = (ahso) ((ahsq) ahspVar.b).b.get(i2);
                ahsl ahslVar = new ahsl();
                ahslVar.B(ahsoVar);
                if (!((ahso) ahslVar.b).u.isEmpty()) {
                    if ((ahslVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahslVar.y();
                    }
                    ((ahso) ahslVar.b).v = abyf.a;
                    List listB2 = rej.b(((ahso) ahslVar.b).u);
                    if ((ahslVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahslVar.y();
                    }
                    ahso ahsoVar2 = (ahso) ahslVar.b;
                    abxm abxmVar2 = ahsoVar2.v;
                    if (!abxmVar2.c()) {
                        int size5 = abxmVar2.size();
                        ahsoVar2.v = abxmVar2.d(size5 + size5);
                    }
                    abus.m(listB2, ahsoVar2.v);
                }
                if ((ahslVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahslVar.y();
                }
                ahso ahsoVar3 = (ahso) ahslVar.b;
                ahsoVar3.b &= -524289;
                ahsoVar3.u = ahso.a.u;
                if ((ahspVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahspVar.y();
                }
                ahsq ahsqVar3 = (ahsq) ahspVar.b;
                ahso ahsoVar4 = (ahso) ahslVar.v();
                ahsoVar4.getClass();
                abxs abxsVar5 = ahsqVar3.b;
                if (!abxsVar5.c()) {
                    int size6 = abxsVar5.size();
                    ahsqVar3.b = abxsVar5.d(size6 + size6);
                }
                ahsqVar3.b.set(i2, ahsoVar4);
            }
            for (int i3 = 0; i3 < ((ahsq) ahspVar.b).c.size(); i3++) {
                ahsz ahszVar = (ahsz) ((ahsq) ahspVar.b).c.get(i3);
                ahsy ahsyVar = new ahsy();
                ahsyVar.B(ahszVar);
                if (!((ahsz) ahsyVar.b).c.isEmpty()) {
                    if ((ahsyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahsyVar.y();
                    }
                    ((ahsz) ahsyVar.b).d = abyf.a;
                    List listB3 = rej.b(((ahsz) ahsyVar.b).c);
                    if ((ahsyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahsyVar.y();
                    }
                    ahsz ahszVar2 = (ahsz) ahsyVar.b;
                    abxm abxmVar3 = ahszVar2.d;
                    if (!abxmVar3.c()) {
                        int size7 = abxmVar3.size();
                        ahszVar2.d = abxmVar3.d(size7 + size7);
                    }
                    abus.m(listB3, ahszVar2.d);
                }
                if ((ahsyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahsyVar.y();
                }
                ahsz ahszVar3 = (ahsz) ahsyVar.b;
                ahszVar3.b &= -2;
                ahszVar3.c = ahsz.a.c;
                if ((ahspVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahspVar.y();
                }
                ahsq ahsqVar4 = (ahsq) ahspVar.b;
                ahsz ahszVar4 = (ahsz) ahsyVar.v();
                ahszVar4.getClass();
                abxs abxsVar6 = ahsqVar4.c;
                if (!abxsVar6.c()) {
                    int size8 = abxsVar6.size();
                    ahsqVar4.c = abxsVar6.d(size8 + size8);
                }
                ahsqVar4.c.set(i3, ahszVar4);
            }
            if ((ahvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahvvVar.y();
            }
            ahvw ahvwVar5 = (ahvw) ahvvVar.b;
            ahsq ahsqVar5 = (ahsq) ahspVar.v();
            ahsqVar5.getClass();
            ahvwVar5.h = ahsqVar5;
            ahvwVar5.b |= 32;
        }
        ahte ahteVar = ((ahvw) ahvvVar.b).m;
        if (ahteVar == null) {
            ahteVar = ahte.a;
        }
        if (ahteVar.e.size() != 0) {
            ahte ahteVar2 = ((ahvw) ahvvVar.b).m;
            if (ahteVar2 == null) {
                ahteVar2 = ahte.a;
            }
            ahtc ahtcVar = new ahtc();
            ahtcVar.B(ahteVar2);
            for (int i4 = 0; i4 < ((ahte) ahtcVar.b).e.size(); i4++) {
                ahth ahthVar = (ahth) ((ahte) ahtcVar.b).e.get(i4);
                ahtf ahtfVar = new ahtf();
                ahtfVar.B(ahthVar);
                rej.c(rej.c, ahtfVar);
                if ((ahtcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahtcVar.y();
                }
                ahte ahteVar3 = (ahte) ahtcVar.b;
                ahth ahthVar2 = (ahth) ahtfVar.v();
                ahthVar2.getClass();
                abxs abxsVar7 = ahteVar3.e;
                if (!abxsVar7.c()) {
                    int size9 = abxsVar7.size();
                    ahteVar3.e = abxsVar7.d(size9 + size9);
                }
                ahteVar3.e.set(i4, ahthVar2);
            }
            if ((ahvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahvvVar.y();
            }
            ahvw ahvwVar6 = (ahvw) ahvvVar.b;
            ahte ahteVar4 = (ahte) ahtcVar.v();
            ahteVar4.getClass();
            ahvwVar6.m = ahteVar4;
            ahvwVar6.b |= 2048;
        }
        final ahvw ahvwVar7 = (ahvw) ahvvVar.v();
        if (((Boolean) this.f.eV()).booleanValue()) {
            return zxy.a;
        }
        abxc abxcVar2 = rdt.b;
        if (abxcVar2.a != rdk.a) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        Object objK = rdkVar.n.k(abxcVar2.d);
        final rdt rdtVar = (rdt) (objK == null ? abxcVar2.b : abxcVar2.b(objK));
        boolean z = rdtVar.i;
        boolean z2 = (ahvwVar7.b & 64) != 0;
        rdr rdrVar = this.d;
        if (rdrVar == null) {
            synchronized (this) {
                rdrVar = this.d;
                if (rdrVar == null) {
                    rdrVar = new rdr();
                    this.d = rdrVar;
                }
            }
        }
        return zuz.h(rdrVar.a(context, z, !z2), new zvi() { // from class: rdy
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                jyw jywVar;
                if (!((Boolean) obj).booleanValue()) {
                    return zxy.a;
                }
                rdt rdtVar2 = rdtVar;
                Context context2 = context;
                ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter = this.a;
                String str = rdtVar2.d;
                if (rdtVar2.e) {
                    jywVar = clearcutMetricSnapshotTransmitter.c;
                    if (jywVar == null) {
                        synchronized (clearcutMetricSnapshotTransmitter) {
                            jywVar = clearcutMetricSnapshotTransmitter.c;
                            if (jywVar == null) {
                                jyw jywVarB = jyw.g(context2, str).b();
                                clearcutMetricSnapshotTransmitter.c = jywVarB;
                                jywVar = jywVarB;
                            }
                        }
                    }
                } else {
                    jywVar = clearcutMetricSnapshotTransmitter.b;
                    if (jywVar == null) {
                        synchronized (clearcutMetricSnapshotTransmitter) {
                            jywVar = clearcutMetricSnapshotTransmitter.b;
                            if (jywVar == null) {
                                List list = jyw.m;
                                jyw jywVarB2 = new jyt(context2, str).b();
                                clearcutMetricSnapshotTransmitter.b = jywVarB2;
                                jywVar = jywVarB2;
                            }
                        }
                    }
                }
                jyv jyvVarH = jywVar.h(ahvwVar7);
                if (aexn.a.eV().a(context2)) {
                    jyvVarH.p = mhm.b(context2, (mgx) ClearcutMetricSnapshotTransmitter.a.eV());
                }
                if (!rdtVar2.e) {
                    String str2 = rdtVar2.f;
                    if (!yqv.c(str2)) {
                        jyvVarH.n(str2);
                    }
                    Iterator it2 = rdtVar2.j.iterator();
                    while (it2.hasNext()) {
                        jyvVarH.l((String) it2.next());
                    }
                    if ((rdtVar2.c & 8) != 0) {
                        jyvVarH.o(rdtVar2.g);
                    }
                    abxj abxjVar = rdtVar2.h;
                    if (!abxjVar.isEmpty()) {
                        jyvVarH.k(ztm.f(abxjVar));
                    }
                }
                return otn.a(jyvVarH.d());
            }
        }, zwk.a);
    }
}
