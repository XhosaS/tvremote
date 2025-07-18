package defpackage;

import android.os.Parcelable;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class saa implements sbi {
    public final /* synthetic */ sab a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ saa(rzy rzyVar, sab sabVar, int i) {
        this.c = i;
        this.b = rzyVar;
        this.a = sabVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sbi
    public final Object a(Object obj) {
        int i = this.c;
        if (i == 0) {
            sab sabVar = this.a;
            rzy rzyVar = new rzy((rzy) null, sabVar.b);
            UnmodifiableIterator it = sabVar.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object obj2 = this.b;
                aafi aafiVar = (aafi) it.next();
                Object obj3 = sabVar.c;
                Object obj4 = aafiVar.b;
                Object obj5 = aafiVar.c;
                Object objA = ((sak) obj).a();
                sbd sbdVar = (sbd) obj4;
                String str = sbdVar.c;
                Object objAF = rrx.aF((ulp) obj3);
                Object obj6 = (Parcelable) ((rzt) obj2).a.get(str);
                if (obj6 == null) {
                    obj6 = sbd.a;
                }
                sbf sbfVar = (sbf) objA;
                sbe sbeVar = new sbe(sbfVar.i(), sbfVar.d, ((sbc) obj6).a);
                sbeVar.a((sbb) objAF);
                sbdVar.a(sbeVar);
                ((sew) aafiVar.a).b(sbeVar, rzyVar);
            }
            return rzyVar;
        }
        int i2 = 1;
        if (i != 1) {
            sab sabVar2 = this.a;
            Object obj7 = this.b;
            rzy rzyVar2 = (rzy) obj7;
            rzy rzyVar3 = new rzy(rzyVar2, sabVar2.b);
            UnmodifiableIterator it2 = sabVar2.a.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                aafi aafiVar2 = (aafi) it2.next();
                Object obj8 = aafiVar2.b;
                Object obj9 = aafiVar2.c;
                Object objA2 = ((sak) obj).a();
                Object obj10 = aafiVar2.a;
                Object obj11 = obj7;
                Object obj12 = objA2;
                while (obj11 != null) {
                    rzy rzyVar4 = (rzy) obj11;
                    sbf sbfVar2 = (sbf) ((sew) obj10).a(rzyVar4);
                    if (!sbfVar2.e.add(obj12)) {
                        break;
                    }
                    obj11 = rzyVar4.a;
                    obj12 = sbfVar2;
                }
                sew sewVar = (sew) obj10;
                ((sbd) obj8).a(sbd.e(sewVar, rzyVar2));
                sewVar.b(objA2, rzyVar3);
            }
            return rzyVar3;
        }
        rzt rztVar = new rzt();
        sab sabVar3 = this.a;
        UnmodifiableIterator it3 = sabVar3.a.iterator();
        it3.getClass();
        while (it3.hasNext()) {
            Object obj13 = this.b;
            aafi aafiVar3 = (aafi) it3.next();
            Object obj14 = sabVar3.c;
            Object obj15 = aafiVar3.b;
            Object obj16 = aafiVar3.a;
            sew sewVar2 = (sew) obj16;
            rzy rzyVar5 = (rzy) obj13;
            Parcelable parcelable = (Parcelable) sewVar2.a(rzyVar5);
            Object obj17 = aafiVar3.c;
            if (((sad) obj).a == 0) {
                throw null;
            }
            Object objAF2 = rrx.aF((ulp) obj14);
            sbf sbfVar3 = (sbf) parcelable;
            sbe sbeVarE = sbd.e(sewVar2, rzyVar5);
            if (rrx.B(sbfVar3.f)) {
                sbd sbdVar2 = (sbd) obj15;
                sbdVar2.d.removeCallbacksAndMessages(sbeVarE);
                sbdVar2.c(sbeVarE);
            }
            long jAA = sbd.f.aA();
            vtw vtwVarM = wgv.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            wgv wgvVar = (wgv) vucVar;
            wgvVar.b |= i2;
            wgvVar.e = jAA;
            int i3 = i2;
            sab sabVar4 = sabVar3;
            long j = sbfVar3.f;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            wgv wgvVar2 = (wgv) vtwVarM.b;
            wgvVar2.b |= 2;
            wgvVar2.f = j;
            tko tkoVar = new tko(obj16, obj13);
            vtw vtwVarM2 = wgn.a.m();
            Object obj18 = tkoVar.b;
            rzy rzyVar6 = (rzy) tkoVar.a;
            sew sewVar3 = (sew) obj18;
            vtw vtwVarI = ((sbf) sewVar3.a(rzyVar6)).i();
            Object obj19 = rzyVar6.a;
            while (obj19 != null) {
                rzy rzyVar7 = (rzy) obj19;
                vtw vtwVarI2 = ((sbf) sewVar3.a(rzyVar7)).i();
                if (!vtwVarI2.b.A()) {
                    vtwVarI2.u();
                }
                wgy wgyVar = (wgy) vtwVarI2.b;
                wgy wgyVar2 = (wgy) vtwVarI.r();
                wgy wgyVar3 = wgy.a;
                wgyVar2.getClass();
                wgyVar.c();
                wgyVar.c.add(wgyVar2);
                obj19 = rzyVar7.a;
                vtwVarI = vtwVarI2;
            }
            wgy wgyVar4 = (wgy) vtwVarI.r();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            wgn wgnVar = (wgn) vtwVarM2.b;
            wgyVar4.getClass();
            wgnVar.c = wgyVar4;
            wgnVar.b |= i3;
            vtw vtwVarM3 = wgj.a.m();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            wgj wgjVar = (wgj) vtwVarM3.b;
            wgn wgnVar2 = (wgn) vtwVarM2.r();
            wgnVar2.getClass();
            wgjVar.c = wgnVar2;
            wgjVar.b = i3;
            wgj wgjVar2 = (wgj) vtwVarM3.r();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wgv wgvVar3 = (wgv) vtwVarM.b;
            wgjVar2.getClass();
            wgvVar3.d = wgjVar2;
            wgvVar3.c = 4;
            sbd sbdVar3 = (sbd) obj15;
            sbdVar3.d(vtwVarM, (sbb) objAF2, ImmutableSet.of());
            rztVar.a.putParcelable(sbdVar3.c, new sbc(jAA));
            i2 = i3;
            sabVar3 = sabVar4;
        }
        return rztVar;
    }

    public /* synthetic */ saa(sab sabVar, Object obj, int i) {
        this.c = i;
        this.a = sabVar;
        this.b = obj;
    }
}
