package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iul implements ite {
    private static final zdy c = zdy.h("com/google/android/apps/tvsearch/statesync/monitors/tvoperator/TvOperatorMonitor");
    public agvc a;
    public agux b;
    private final agow d;
    private final agow e;
    private final ztw f;
    private final fco g;
    private final boolean h;

    public iul(agow agowVar, fcu fcuVar, agow agowVar2, ztw ztwVar, fco fcoVar) {
        agowVar.getClass();
        fcuVar.getClass();
        ztwVar.getClass();
        fcoVar.getClass();
        this.d = agowVar;
        this.e = agowVar2;
        this.f = ztwVar;
        this.g = fcoVar;
        Object objA = agowVar2.a();
        objA.getClass();
        Duration durationB = acbh.b((abwf) objA);
        durationB.getClass();
        boolean z = false;
        if (!durationB.isNegative()) {
            Object objA2 = agowVar.a();
            objA2.getClass();
            if (fcuVar.c(((Boolean) objA2).booleanValue())) {
                z = true;
            }
        }
        this.h = z;
    }

    @Override // defpackage.ite
    public final Object e(agsw agswVar) {
        Object objA = this.d.a();
        objA.getClass();
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        fco fcoVar = this.g;
        try {
            fcr fcrVar = (fcr) ((zuv) fcoVar.a(zBooleanValue)).t(5L, TimeUnit.SECONDS);
            if (fcrVar == null) {
                ((zdv) c.d().q("com/google/android/apps/tvsearch/statesync/monitors/tvoperator/TvOperatorMonitor", "getEvents", 49, "TvOperatorMonitor.kt")).u("TV operator service result is null");
                return agrd.a;
            }
            iuw iuwVar = iuw.a;
            iux iuxVar = new iux(new iuu());
            ivp ivpVar = ivp.a;
            ivo ivoVar = new ivo();
            Instant instantA = this.f.a();
            instantA.getClass();
            abzy abzyVarB = acbk.b(instantA);
            if ((ivoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ivoVar.y();
            }
            ivp ivpVar2 = (ivp) ivoVar.b;
            ivpVar2.c = abzyVarB;
            ivpVar2.b |= 1;
            String strA = fcrVar.a();
            if ((ivoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ivoVar.y();
            }
            ivp ivpVar3 = (ivp) ivoVar.b;
            ivpVar3.b |= 2;
            ivpVar3.d = strA;
            String strB = fcrVar.b();
            if ((ivoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ivoVar.y();
            }
            ivp ivpVar4 = (ivp) ivoVar.b;
            ivpVar4.b |= 4;
            ivpVar4.e = strB;
            List listA = fcoVar.g.a();
            listA.getClass();
            if (!listA.isEmpty()) {
                Object obj = listA.get(0);
                obj.getClass();
                String str = (String) obj;
                if ((ivoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ivoVar.y();
                }
                ivp ivpVar5 = (ivp) ivoVar.b;
                ivpVar5.b |= 8;
                ivpVar5.f = str;
            }
            String strC = fcrVar.c();
            if ((ivoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ivoVar.y();
            }
            ivp ivpVar6 = (ivp) ivoVar.b;
            ivpVar6.b |= 16;
            ivpVar6.g = strC;
            abxd abxdVarV = ivoVar.v();
            abxdVarV.getClass();
            ivp ivpVar7 = (ivp) abxdVarV;
            iuu iuuVar = iuxVar.a;
            if ((iuuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                iuuVar.y();
            }
            iuw iuwVar2 = (iuw) iuuVar.b;
            iuwVar2.c = ivpVar7;
            iuwVar2.b = 7;
            List listSingletonList = Collections.singletonList(iuxVar.a());
            listSingletonList.getClass();
            return listSingletonList;
        } catch (Exception e) {
            ((zdv) ((zdv) c.b()).p(e).q("com/google/android/apps/tvsearch/statesync/monitors/tvoperator/TvOperatorMonitor", "getEvents", 65, "TvOperatorMonitor.kt")).u("Failed to get TV operator service result");
            return agrd.a;
        }
    }

    @Override // defpackage.ite
    public final /* synthetic */ Object f(agsw agswVar) {
        return agpu.a;
    }

    @Override // defpackage.ite
    public final void h() {
        Object objA = this.e.a();
        objA.getClass();
        Duration durationB = acbh.b((abwf) objA);
        durationB.getClass();
        agux aguxVar = null;
        agvc agvcVar = null;
        if (durationB.compareTo(Duration.ZERO) > 0) {
            agvc agvcVar2 = this.a;
            if (agvcVar2 == null) {
                agvy.b("updateStateAtFixedRate");
            } else {
                agvcVar = agvcVar2;
            }
            agvcVar.a(this, durationB, durationB);
            return;
        }
        agux aguxVar2 = this.b;
        if (aguxVar2 == null) {
            agvy.b("cancelScheduledUpdateTask");
        } else {
            aguxVar = aguxVar2;
        }
        aguxVar.a(this);
    }

    @Override // defpackage.ite
    public final void j(agux aguxVar) {
        this.b = aguxVar;
    }

    @Override // defpackage.ite
    public final void l(agvc agvcVar) {
        this.a = agvcVar;
    }

    @Override // defpackage.ite
    public final boolean m() {
        return this.h;
    }

    @Override // defpackage.ite
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.ite
    public final void i() {
    }

    @Override // defpackage.ite
    public final void k(agux aguxVar) {
    }
}
