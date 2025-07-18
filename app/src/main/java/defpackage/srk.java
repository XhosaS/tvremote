package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srk {
    public static final /* synthetic */ int a = 0;
    private static final zdy b = zdy.h("com/google/android/libraries/search/audio/microphone/registry/AudioSessionsRegistry");
    private static final srl c = new srl(rxh.FAILED_OPENING_DUE_TO_INACTIVE_CLIENT, 101, "the associated audio client is already inactive");
    private static final srl d;
    private static final srl e;
    private static final rva[] f;
    private final sms g;
    private final spf h;
    private final smw i;
    private final srv j;
    private final sss k;
    private final ahbt l;
    private final List m;
    private final List n;
    private final slj o;
    private final sld p;

    static {
        new srl(rxh.FAILED_OPENING_DUE_TO_INACTIVE_PARENT, 123, "the associated audio parent is already inactive");
        d = new srl(rxh.FAILED_OPENING_DUE_TO_INACTIVE_AUDIO_ROUTE_SESSION, 114, "the associated audio route is already inactive");
        e = new srl(rxh.FAILED_OPENING_CONCURRENCY_CONFLICT, 602, "ambient session cannot start due to a conflict with another active session");
        f = new rva[]{rva.DEFAULT, rva.CONVERSATIONAL, rva.CONVERSATIONAL_TURN_BY_TURN, rva.CAPTURE_OUTPUT};
    }

    public srk(skf skfVar, sms smsVar, spf spfVar, smw smwVar, srv srvVar, slj sljVar, sss sssVar, ahbt ahbtVar, sld sldVar, euf eufVar, spi spiVar) {
        skfVar.getClass();
        smsVar.getClass();
        spfVar.getClass();
        smwVar.getClass();
        sljVar.getClass();
        ahbtVar.getClass();
        sldVar.getClass();
        eufVar.getClass();
        spiVar.getClass();
        this.g = smsVar;
        this.h = spfVar;
        this.i = smwVar;
        this.j = srvVar;
        this.o = sljVar;
        this.k = sssVar;
        this.l = ahbtVar;
        this.p = sldVar;
        this.m = new ArrayList();
        this.n = new ArrayList();
    }

    private final void g(sra sraVar) {
        this.i.r(sraVar);
        srd srdVar = (srd) sraVar;
        rux ruxVar = srdVar.a;
        zyd zydVarB = ruxVar.b();
        yqi yqiVarA = wyo.a(new yqi() { // from class: smo
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                rxj rxjVar = ((rvk) ((ruv) obj).f()).c;
                return rxjVar == null ? rxj.a : rxjVar;
            }
        });
        sms smsVar = this.g;
        Executor executor = smsVar.a;
        zxn.p(zuz.g(zydVarB, yqiVarA, executor), wyo.f(new smr(smsVar, zuz.g(((ruw) ruxVar.c()).a(), wyo.a(new yqi() { // from class: smp
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                rxd rxdVar = ((rvm) obj).c;
                return rxdVar == null ? rxd.a : rxdVar;
            }
        }), executor))), executor);
        if (srdVar.g) {
            this.h.e(ruxVar, -1, sds.a.a(sdw.SOURCE_EMPTY));
        }
    }

    public final synchronized void a(sqx sqxVar, rxn rxnVar) {
        ArrayList<srb> arrayList = new ArrayList();
        for (Object obj : this.m) {
            if (((srb) obj).b.a == sqxVar.a) {
                arrayList.add(obj);
            }
        }
        for (srb srbVar : arrayList) {
            f(srbVar.b, srbVar.d, rxnVar);
        }
        final ArrayList arrayList2 = new ArrayList();
        List list = this.n;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw null;
        }
        agqx.l(list, new agux() { // from class: srj
            @Override // defpackage.agux
            public final Object a(Object obj2) {
                int i = srk.a;
                ((sre) obj2).getClass();
                List list2 = arrayList2;
                boolean z = true;
                if (!list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    if (it2.hasNext()) {
                        int i2 = ((sre) it2.next()).a;
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            sre sreVar = (sre) it2.next();
            rxnVar.name();
            int i = sreVar.a;
            throw null;
        }
    }

    public final synchronized void b(sru sruVar, rxn rxnVar) {
        ArrayList<srb> arrayList = new ArrayList();
        for (Object obj : this.m) {
            if (((srb) obj).c.a == sruVar.a) {
                arrayList.add(obj);
            }
        }
        for (srb srbVar : arrayList) {
            f(srbVar.b, srbVar.d, rxnVar);
        }
    }

    public final synchronized boolean c(rva... rvaVarArr) {
        boolean z;
        rvaVarArr.getClass();
        List list = this.m;
        z = false;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                srb srbVar = (srb) it.next();
                rva rvaVarB = rva.b(srbVar.b.b.d);
                if (rvaVarB == null) {
                    rvaVarB = rva.DEFAULT;
                }
                if (agqj.q(rvaVarArr, rvaVarB) && !((ruw) srbVar.a.c()).a().isDone()) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.sra d(final defpackage.sqx r27, defpackage.sru r28, defpackage.rvf r29, defpackage.srw r30) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.srk.d(sqx, sru, rvf, srw):sra");
    }

    public final synchronized void e() {
        Iterator it = this.n.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public final synchronized void f(sqx sqxVar, final int i, rxn rxnVar) {
        Object next;
        rxnVar.getClass();
        if (!sqxVar.c) {
            List list = this.m;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                srb srbVar = (srb) next;
                if (srbVar.b.a == sqxVar.a && srbVar.d == i) {
                    break;
                }
            }
            srb srbVar2 = (srb) next;
            if (srbVar2 != null) {
                agqx.l(list, new agux() { // from class: srf
                    @Override // defpackage.agux
                    public final Object a(Object obj) {
                        srb srbVar3 = (srb) obj;
                        int i2 = srk.a;
                        srbVar3.getClass();
                        return Boolean.valueOf(srbVar3.d != i);
                    }
                });
                zeo zeoVarB = b.b();
                zer zerVar = zfi.a;
                zdv zdvVar = (zdv) zeoVarB.o(zerVar, "ALT.AudioSessionsRegy").q("com/google/android/libraries/search/audio/microphone/registry/AudioSessionsRegistry", "markStopped", 426, "AudioSessionsRegistry.kt");
                String strName = rxnVar.name();
                int i2 = srbVar2.d;
                zdvVar.I("#audio# stopping(%s) audio session(%d) for %s", strName, Integer.valueOf(i2), srbVar2.b.a());
                this.i.s(srbVar2, rxnVar);
                srbVar2.f.s(null);
                sld sldVar = this.p;
                String strB = sqy.b(srbVar2);
                ((zdv) sld.a.b().o(zerVar, "ALT.TimeoutTracker").q("com/google/android/libraries/search/audio/core/timeout/impl/TimeoutTrackerImpl", "cancelTimeout", 43, "TimeoutTrackerImpl.kt")).x("#audio# cancel timeout(token(%s))", strB);
                synchronized (sldVar.c) {
                    ahdl ahdlVar = (ahdl) sldVar.d.remove(strB);
                    if (ahdlVar != null) {
                        ahdlVar.s(null);
                    }
                }
                this.k.c(i2, rxnVar);
            }
        }
    }
}
