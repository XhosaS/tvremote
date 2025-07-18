package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ant {
    public final anw a;
    public final byg b = byg.g(null);

    /* JADX WARN: Type inference failed for: r0v0, types: [anw, java.lang.Object] */
    public ant(awy awyVar) {
        this.a = awyVar.b;
        ((bzz) awyVar.a).f();
    }

    public static byg a(Class cls) {
        try {
            return byg.h((anx) cls.getDeclaredConstructor(null).newInstance(null));
        } catch (ReflectiveOperationException unused) {
            return bxw.a;
        }
    }

    static /* synthetic */ bzw b() {
        aco acoVar = aco.DO_NOTHING;
        aco acoVar2 = aco.FILE_DELETION;
        aco acoVar3 = aco.EXEC_SQL_FIX;
        aco acoVar4 = aco.SEND_BROADCAST;
        aco acoVar5 = aco.PROCESS_RESTART;
        aco acoVar6 = aco.SHARED_PREFERENCES_DELETION;
        aco acoVar7 = aco.COMPONENT_ENABLED_SETTING_FIX;
        aco acoVar8 = aco.START_SERVICE;
        bit.g(acoVar, aoi.class);
        bit.g(acoVar2, aol.class);
        bit.g(acoVar3, aoj.class);
        bit.g(acoVar4, aon.class);
        bit.g(acoVar5, aom.class);
        bit.g(acoVar6, aop.class);
        bit.g(acoVar7, aoh.class);
        bit.g(acoVar8, aoq.class);
        return cbc.g(8, new Object[]{acoVar, aoi.class, acoVar2, aol.class, acoVar3, aoj.class, acoVar4, aon.class, acoVar5, aom.class, acoVar6, aop.class, acoVar7, aoh.class, acoVar8, aoq.class});
    }

    public final void c(Context context, adc adcVar, acm acmVar) {
        aco acoVarB;
        if (adcVar != null) {
            acoVarB = aco.b(adcVar.b);
            if (acoVarB == null) {
                acoVarB = aco.UNRECOGNIZED;
            }
        } else {
            acoVarB = aco.UNSPECIFIED_FIX;
        }
        Log.e("AppDoctor", "Failed on fix: " + acoVarB.a());
        anw anwVar = this.a;
        clo cloVarO = acn.a.o();
        String packageName = context.getPackageName();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        clt cltVar = cloVarO.b;
        acn acnVar = (acn) cltVar;
        packageName.getClass();
        acnVar.b |= 1;
        acnVar.c = packageName;
        if (!cltVar.A()) {
            cloVarO.l();
        }
        acn acnVar2 = (acn) cloVarO.b;
        acnVar2.g = acmVar.a();
        acnVar2.b |= 16;
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        acn acnVar3 = (acn) cloVarO.b;
        acnVar3.f = qm.y(6);
        acnVar3.b |= 8;
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        acn acnVar4 = (acn) cloVarO.b;
        acnVar4.e = acoVarB.a();
        acnVar4.b |= 4;
        anwVar.a((acn) cloVarO.i());
    }
}
