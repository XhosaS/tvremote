package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import defpackage.adj;
import defpackage.adz;
import defpackage.agb;
import defpackage.amz;
import defpackage.anb;
import defpackage.apd;
import defpackage.aqn;
import defpackage.ata;
import defpackage.azo;
import defpackage.azp;
import defpackage.azt;
import defpackage.azv;
import defpackage.azz;
import defpackage.baf;
import defpackage.bdq;
import defpackage.bit;
import defpackage.bwv;
import defpackage.bxp;
import defpackage.bxr;
import defpackage.byo;
import defpackage.cbs;
import defpackage.cbt;
import defpackage.cgi;
import defpackage.cgj;
import defpackage.cgk;
import defpackage.cgl;
import defpackage.cgp;
import defpackage.chk;
import defpackage.cht;
import defpackage.chz;
import defpackage.cit;
import defpackage.ciw;
import defpackage.cja;
import defpackage.ckd;
import defpackage.clo;
import defpackage.clq;
import defpackage.cls;
import defpackage.clt;
import defpackage.cmd;
import defpackage.cme;
import defpackage.cmp;
import defpackage.cmt;
import defpackage.cnj;
import defpackage.cwk;
import defpackage.cwl;
import defpackage.cxd;
import defpackage.cxe;
import defpackage.cxg;
import defpackage.cxh;
import defpackage.cxi;
import defpackage.cxy;
import defpackage.cyh;
import defpackage.cyi;
import defpackage.cym;
import defpackage.qm;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ClearcutMetricSnapshotTransmitter implements azp {
    public static final byo a = bit.k(new azz(2));
    public volatile adj b;
    public volatile adj c;
    private volatile azt d;
    private volatile baf e;
    private final byo f = bit.k(new azz(0));

    @Override // defpackage.azp
    public final cja a(final Context context, azo azoVar) {
        cja cjaVarH;
        cmt cmtVar = azv.j;
        azoVar.i(cmtVar);
        bdq.f(azoVar.d.m((cls) cmtVar.d), "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = new baf();
                }
            }
        }
        cym cymVar = azoVar.c;
        if (cymVar == null) {
            cymVar = cym.a;
        }
        clo cloVar = (clo) cymVar.a(5, null);
        cloVar.n(cymVar);
        baf.b(baf.a, cloVar);
        cwl cwlVar = ((cym) cloVar.b).j;
        if (cwlVar == null) {
            cwlVar = cwl.a;
        }
        if ((cwlVar.b & 1) != 0) {
            cwl cwlVar2 = ((cym) cloVar.b).j;
            if (cwlVar2 == null) {
                cwlVar2 = cwl.a;
            }
            cwk cwkVar = cwlVar2.c;
            if (cwkVar == null) {
                cwkVar = cwk.a;
            }
            clo cloVar2 = (clo) cwkVar.a(5, null);
            cloVar2.n(cwkVar);
            baf.b(baf.b, cloVar2);
            cwl cwlVar3 = ((cym) cloVar.b).j;
            if (cwlVar3 == null) {
                cwlVar3 = cwl.a;
            }
            clo cloVar3 = (clo) cwlVar3.a(5, null);
            cloVar3.n(cwlVar3);
            if (!cloVar3.b.A()) {
                cloVar3.l();
            }
            cwl cwlVar4 = (cwl) cloVar3.b;
            cwk cwkVar2 = (cwk) cloVar2.i();
            cwkVar2.getClass();
            cwlVar4.c = cwkVar2;
            cwlVar4.b |= 1;
            if (!cloVar.b.A()) {
                cloVar.l();
            }
            cym cymVar2 = (cym) cloVar.b;
            cwl cwlVar5 = (cwl) cloVar3.i();
            cwlVar5.getClass();
            cymVar2.j = cwlVar5;
            cymVar2.b |= 256;
        }
        cxy cxyVar = ((cym) cloVar.b).h;
        if (cxyVar == null) {
            cxyVar = cxy.a;
        }
        if ((cxyVar.b & 256) != 0) {
            cxy cxyVar2 = ((cym) cloVar.b).h;
            if (cxyVar2 == null) {
                cxyVar2 = cxy.a;
            }
            cgl cglVar = cxyVar2.i;
            if (cglVar == null) {
                cglVar = cgl.a;
            }
            clo cloVar4 = (clo) cglVar.a(5, null);
            cloVar4.n(cglVar);
            cgi cgiVar = ((cgl) cloVar4.b).e;
            if (cgiVar == null) {
                cgiVar = cgi.a;
            }
            cgi cgiVarC = baf.c(cgiVar);
            if (!cloVar4.b.A()) {
                cloVar4.l();
            }
            cgl cglVar2 = (cgl) cloVar4.b;
            cgiVarC.getClass();
            cglVar2.e = cgiVarC;
            cglVar2.b |= 1;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(cglVar2.f);
            if (!cloVar4.b.A()) {
                cloVar4.l();
            }
            ((cgl) cloVar4.b).f = cnj.a;
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                cgi cgiVarC2 = baf.c((cgi) it.next());
                if (!cloVar4.b.A()) {
                    cloVar4.l();
                }
                cgl cglVar3 = (cgl) cloVar4.b;
                cgiVarC2.getClass();
                cglVar3.b();
                cglVar3.f.add(cgiVarC2);
            }
            cgl cglVar4 = (cgl) cloVar4.b;
            cme<cgk> cmeVar = (cglVar4.c == 4 ? (cgj) cglVar4.d : cgj.a).b;
            clo cloVarO = cgj.a.o();
            for (cgk cgkVar : cmeVar) {
                cgi cgiVar2 = cgkVar.c;
                if (cgiVar2 == null) {
                    cgiVar2 = cgi.a;
                }
                if ((cgiVar2.b & 2) != 0) {
                    clo cloVar5 = (clo) cgkVar.a(5, null);
                    cloVar5.n(cgkVar);
                    cgi cgiVarC3 = baf.c(cgiVar2);
                    if (!cloVar5.b.A()) {
                        cloVar5.l();
                    }
                    cgk cgkVar2 = (cgk) cloVar5.b;
                    cgiVarC3.getClass();
                    cgkVar2.c = cgiVarC3;
                    cgkVar2.b |= 1;
                    cgkVar = (cgk) cloVar5.i();
                }
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cgj cgjVar = (cgj) cloVarO.b;
                cgkVar.getClass();
                cgjVar.b();
                cgjVar.b.add(cgkVar);
            }
            cgj cgjVar2 = (cgj) cloVarO.i();
            if (!cloVar4.b.A()) {
                cloVar4.l();
            }
            cgl cglVar5 = (cgl) cloVar4.b;
            cgjVar2.getClass();
            cglVar5.d = cgjVar2;
            cglVar5.c = 4;
            cxy cxyVar3 = ((cym) cloVar.b).h;
            if (cxyVar3 == null) {
                cxyVar3 = cxy.a;
            }
            clo cloVar6 = (clo) cxyVar3.a(5, null);
            cloVar6.n(cxyVar3);
            cgl cglVar6 = (cgl) cloVar4.i();
            if (!cloVar6.b.A()) {
                cloVar6.l();
            }
            cxy cxyVar4 = (cxy) cloVar6.b;
            cglVar6.getClass();
            cxyVar4.i = cglVar6;
            cxyVar4.b |= 256;
            cxy cxyVar5 = (cxy) cloVar6.i();
            if (!cloVar.b.A()) {
                cloVar.l();
            }
            cym cymVar3 = (cym) cloVar.b;
            cxyVar5.getClass();
            cymVar3.h = cxyVar5;
            cymVar3.b |= 64;
        }
        cyi cyiVar = ((cym) cloVar.b).i;
        if (cyiVar == null) {
            cyiVar = cyi.a;
        }
        if (cyiVar.k.size() != 0) {
            cyi cyiVar2 = ((cym) cloVar.b).i;
            if (cyiVar2 == null) {
                cyiVar2 = cyi.a;
            }
            clo cloVar7 = (clo) cyiVar2.a(5, null);
            cloVar7.n(cyiVar2);
            for (int i = 0; i < ((cyi) cloVar7.b).k.size(); i++) {
                cyh cyhVar = (cyh) ((cyi) cloVar7.b).k.get(i);
                clo cloVar8 = (clo) cyhVar.a(5, null);
                cloVar8.n(cyhVar);
                if (!((cyh) cloVar8.b).c.isEmpty()) {
                    if (!cloVar8.b.A()) {
                        cloVar8.l();
                    }
                    ((cyh) cloVar8.b).d = cmp.a;
                    List listA = baf.a(((cyh) cloVar8.b).c);
                    if (!cloVar8.b.A()) {
                        cloVar8.l();
                    }
                    cyh cyhVar2 = (cyh) cloVar8.b;
                    cmd cmdVar = cyhVar2.d;
                    if (!cmdVar.c()) {
                        cyhVar2.d = clt.s(cmdVar);
                    }
                    ckd.d(listA, cyhVar2.d);
                }
                if (!cloVar8.b.A()) {
                    cloVar8.l();
                }
                cyh cyhVar3 = (cyh) cloVar8.b;
                cyhVar3.b &= -2;
                cyhVar3.c = cyh.a.c;
                if (!cloVar7.b.A()) {
                    cloVar7.l();
                }
                cyi cyiVar3 = (cyi) cloVar7.b;
                cyh cyhVar4 = (cyh) cloVar8.i();
                cyhVar4.getClass();
                cme cmeVar2 = cyiVar3.k;
                if (!cmeVar2.c()) {
                    cyiVar3.k = clt.t(cmeVar2);
                }
                cyiVar3.k.set(i, cyhVar4);
            }
            if (!cloVar.b.A()) {
                cloVar.l();
            }
            cym cymVar4 = (cym) cloVar.b;
            cyi cyiVar4 = (cyi) cloVar7.i();
            cyiVar4.getClass();
            cymVar4.i = cyiVar4;
            cymVar4.b |= 128;
        }
        cxe cxeVar = ((cym) cloVar.b).g;
        if (cxeVar == null) {
            cxeVar = cxe.a;
        }
        if (cxeVar.b.size() != 0) {
            cxe cxeVar2 = ((cym) cloVar.b).g;
            if (cxeVar2 == null) {
                cxeVar2 = cxe.a;
            }
            clo cloVar9 = (clo) cxeVar2.a(5, null);
            cloVar9.n(cxeVar2);
            for (int i2 = 0; i2 < ((cxe) cloVar9.b).b.size(); i2++) {
                cxd cxdVar = (cxd) ((cxe) cloVar9.b).b.get(i2);
                clo cloVar10 = (clo) cxdVar.a(5, null);
                cloVar10.n(cxdVar);
                if (!((cxd) cloVar10.b).e.isEmpty()) {
                    if (!cloVar10.b.A()) {
                        cloVar10.l();
                    }
                    ((cxd) cloVar10.b).f = cmp.a;
                    List listA2 = baf.a(((cxd) cloVar10.b).e);
                    if (!cloVar10.b.A()) {
                        cloVar10.l();
                    }
                    cxd cxdVar2 = (cxd) cloVar10.b;
                    cmd cmdVar2 = cxdVar2.f;
                    if (!cmdVar2.c()) {
                        cxdVar2.f = clt.s(cmdVar2);
                    }
                    ckd.d(listA2, cxdVar2.f);
                }
                if (!cloVar10.b.A()) {
                    cloVar10.l();
                }
                cxd cxdVar3 = (cxd) cloVar10.b;
                cxdVar3.b &= -524289;
                cxdVar3.e = cxd.a.e;
                if (!cloVar9.b.A()) {
                    cloVar9.l();
                }
                cxe cxeVar3 = (cxe) cloVar9.b;
                cxd cxdVar4 = (cxd) cloVar10.i();
                cxdVar4.getClass();
                cme cmeVar3 = cxeVar3.b;
                if (!cmeVar3.c()) {
                    cxeVar3.b = clt.t(cmeVar3);
                }
                cxeVar3.b.set(i2, cxdVar4);
            }
            for (int i3 = 0; i3 < ((cxe) cloVar9.b).c.size(); i3++) {
                cxg cxgVar = (cxg) ((cxe) cloVar9.b).c.get(i3);
                clo cloVar11 = (clo) cxgVar.a(5, null);
                cloVar11.n(cxgVar);
                if (!((cxg) cloVar11.b).c.isEmpty()) {
                    if (!cloVar11.b.A()) {
                        cloVar11.l();
                    }
                    ((cxg) cloVar11.b).d = cmp.a;
                    List listA3 = baf.a(((cxg) cloVar11.b).c);
                    if (!cloVar11.b.A()) {
                        cloVar11.l();
                    }
                    cxg cxgVar2 = (cxg) cloVar11.b;
                    cmd cmdVar3 = cxgVar2.d;
                    if (!cmdVar3.c()) {
                        cxgVar2.d = clt.s(cmdVar3);
                    }
                    ckd.d(listA3, cxgVar2.d);
                }
                if (!cloVar11.b.A()) {
                    cloVar11.l();
                }
                cxg cxgVar3 = (cxg) cloVar11.b;
                cxgVar3.b &= -2;
                cxgVar3.c = cxg.a.c;
                if (!cloVar9.b.A()) {
                    cloVar9.l();
                }
                cxe cxeVar4 = (cxe) cloVar9.b;
                cxg cxgVar4 = (cxg) cloVar11.i();
                cxgVar4.getClass();
                cme cmeVar4 = cxeVar4.c;
                if (!cmeVar4.c()) {
                    cxeVar4.c = clt.t(cmeVar4);
                }
                cxeVar4.c.set(i3, cxgVar4);
            }
            if (!cloVar.b.A()) {
                cloVar.l();
            }
            cym cymVar5 = (cym) cloVar.b;
            cxe cxeVar5 = (cxe) cloVar9.i();
            cxeVar5.getClass();
            cymVar5.g = cxeVar5;
            cymVar5.b |= 32;
        }
        cxh cxhVar = ((cym) cloVar.b).l;
        if (cxhVar == null) {
            cxhVar = cxh.a;
        }
        if (cxhVar.b.size() != 0) {
            cxh cxhVar2 = ((cym) cloVar.b).l;
            if (cxhVar2 == null) {
                cxhVar2 = cxh.a;
            }
            clo cloVar12 = (clo) cxhVar2.a(5, null);
            cloVar12.n(cxhVar2);
            for (int i4 = 0; i4 < ((cxh) cloVar12.b).b.size(); i4++) {
                cxi cxiVar = (cxi) ((cxh) cloVar12.b).b.get(i4);
                clo cloVar13 = (clo) cxiVar.a(5, null);
                cloVar13.n(cxiVar);
                clq clqVar = (clq) cloVar13;
                baf.b(baf.c, clqVar);
                if (!cloVar12.b.A()) {
                    cloVar12.l();
                }
                cxh cxhVar3 = (cxh) cloVar12.b;
                cxi cxiVar2 = (cxi) clqVar.i();
                cxiVar2.getClass();
                cme cmeVar5 = cxhVar3.b;
                if (!cmeVar5.c()) {
                    cxhVar3.b = clt.t(cmeVar5);
                }
                cxhVar3.b.set(i4, cxiVar2);
            }
            if (!cloVar.b.A()) {
                cloVar.l();
            }
            cym cymVar6 = (cym) cloVar.b;
            cxh cxhVar4 = (cxh) cloVar12.i();
            cxhVar4.getClass();
            cymVar6.l = cxhVar4;
            cymVar6.b |= 2048;
        }
        final cym cymVar7 = (cym) cloVar.i();
        cbt cbtVar = aqn.a;
        if (cbtVar.d().D()) {
            int i5 = cymVar7.b;
            String str = (16777216 & i5) != 0 ? "primes stats" : null;
            int i6 = i5 & 32;
            int i7 = i5 & 16;
            int i8 = i5 & 8;
            int i9 = i5 & 256;
            int i10 = i5 & 64;
            int i11 = i5 & 1024;
            int i12 = i5 & 128;
            int i13 = i5 & 2048;
            if (i6 != 0) {
                str = "network metric";
            }
            if (i7 != 0) {
                str = "timer metric";
            }
            if (i8 != 0) {
                str = "memory metric";
            }
            if (i9 != 0) {
                str = "battery metric";
            }
            if (i10 != 0) {
                str = "crash metric";
            }
            if (i11 != 0) {
                str = "jank metric";
            }
            if (i12 != 0) {
                str = "package metric";
            }
            if (i13 != 0) {
                str = "trace";
            }
            cbs cbsVar = (cbs) cbtVar.d().j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotTransmitter", "logSystemHealthMetric", 219, "ClearcutMetricSnapshotTransmitter.java");
            if (str == null) {
                str = "unknown";
            }
            cbsVar.z("Sending Primes %s: %s", str, cymVar7);
        }
        if (((Boolean) this.f.aL()).booleanValue()) {
            return ciw.a;
        }
        cmt cmtVar2 = azv.j;
        azoVar.i(cmtVar2);
        Object objK = azoVar.d.k((cls) cmtVar2.d);
        if (objK == null) {
            objK = cmtVar2.b;
        } else {
            cmtVar2.b(objK);
        }
        final azv azvVar = (azv) objK;
        if (cbtVar.d().D()) {
            ((cbs) cbtVar.d().j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotTransmitter", "transmit", 119, "ClearcutMetricSnapshotTransmitter.java")).t("%s", Base64.encodeToString(cymVar7.g(), 2));
        }
        boolean z = azvVar.h;
        boolean z2 = (cymVar7.b & 64) != 0;
        final azt aztVar = this.d;
        if (aztVar == null) {
            synchronized (this) {
                aztVar = this.d;
                if (aztVar == null) {
                    aztVar = new azt();
                    this.d = aztVar;
                }
            }
        }
        if (z) {
            Boolean bool = (Boolean) aztVar.a.get();
            if (bool != null) {
                cjaVarH = qm.K(bool);
            } else {
                agb agbVar = aztVar.c;
                if (agbVar == null) {
                    synchronized (aztVar) {
                        agbVar = aztVar.c;
                        if (agbVar == null) {
                            agbVar = new agb(context, new amz());
                            aztVar.c = agbVar;
                        }
                    }
                }
                if (!z2 && !aztVar.b.getAndSet(true)) {
                    agbVar.e(new anb() { // from class: azs
                        @Override // defpackage.anb
                        public final void a() {
                            aztVar.a.set(null);
                        }
                    });
                }
                cit citVarX = cit.x(apd.c(agbVar.d()));
                adz adzVar = new adz(aztVar, 4);
                int i14 = bxr.a;
                bxp bxpVar = new bxp(bwv.b(), adzVar);
                chz chzVar = chz.a;
                cjaVarH = cgp.h(chk.h(citVarX, bxpVar, chzVar), Throwable.class, new ata(7), chzVar);
            }
        } else {
            cjaVarH = qm.K(true);
        }
        return chk.i(cjaVarH, new cht() { // from class: baa
            @Override // defpackage.cht
            public final cja a(Object obj) {
                adj adjVar;
                if (!((Boolean) obj).booleanValue()) {
                    return ciw.a;
                }
                azv azvVar2 = azvVar;
                Context context2 = context;
                ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter = this.a;
                String str2 = azvVar2.c;
                if (azvVar2.d) {
                    adjVar = clearcutMetricSnapshotTransmitter.c;
                    if (adjVar == null) {
                        synchronized (clearcutMetricSnapshotTransmitter) {
                            adjVar = clearcutMetricSnapshotTransmitter.c;
                            if (adjVar == null) {
                                List list = adj.k;
                                adv advVar = adv.a;
                                qp.p(context2);
                                qp.o(str2);
                                adv advVar2 = adv.b;
                                qp.p(advVar2);
                                adg.b(advVar2);
                                adjVar = new adj(context2, str2, advVar2, null, null);
                                clearcutMetricSnapshotTransmitter.c = adjVar;
                            }
                        }
                    }
                } else {
                    adjVar = clearcutMetricSnapshotTransmitter.b;
                    if (adjVar == null) {
                        synchronized (clearcutMetricSnapshotTransmitter) {
                            adjVar = clearcutMetricSnapshotTransmitter.b;
                            if (adjVar == null) {
                                List list2 = adj.k;
                                adv advVar3 = adv.a;
                                qp.p(context2);
                                qp.o(str2);
                                adjVar = new adj(context2, str2, advVar3, null, null);
                                clearcutMetricSnapshotTransmitter.b = adjVar;
                            }
                        }
                    }
                }
                cym cymVar8 = cymVar7;
                qp.p(cymVar8);
                adh adhVar = new adh(adjVar, cymVar8);
                if (cqz.a.aL().a(context2)) {
                    adhVar.m = apm.a(context2, (aoy) ClearcutMetricSnapshotTransmitter.a.aL());
                }
                if (!azvVar2.d) {
                    String str3 = azvVar2.e;
                    if (!bdq.q(str3)) {
                        if (adhVar.a.c()) {
                            throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
                        }
                        clq clqVar2 = adhVar.n;
                        if (!clqVar2.b.A()) {
                            clqVar2.l();
                        }
                        cor corVar = (cor) clqVar2.b;
                        cor corVar2 = cor.a;
                        str3.getClass();
                        corVar.b |= 16777216;
                        corVar.j = str3;
                    }
                    for (String str4 : azvVar2.i) {
                        if (adhVar.a.c()) {
                            throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
                        }
                        if (adhVar.c == null) {
                            adhVar.c = new ArrayList();
                        }
                        adhVar.c.add(str4);
                    }
                    if ((azvVar2.b & 8) != 0) {
                        String str5 = azvVar2.f;
                        if (!adhVar.a.i.a(adw.ACCOUNT_NAME)) {
                            throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
                        }
                        adhVar.g = str5;
                    }
                    cma cmaVar = azvVar2.g;
                    if (!cmaVar.isEmpty()) {
                        Object[] array = cmaVar.toArray();
                        int length = array.length;
                        int[] iArr = new int[length];
                        for (int i15 = 0; i15 < length; i15++) {
                            Object obj2 = array[i15];
                            obj2.getClass();
                            iArr[i15] = ((Number) obj2).intValue();
                        }
                        adhVar.c(iArr);
                    }
                }
                return apd.c(adhVar.b());
            }
        }, chz.a);
    }
}
