package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjv implements nzy {
    public static final yyr a = yyr.o(aczx.HAPTIC_TYPE_LIGHT_IMPACT, new mji(1, 1), aczx.HAPTIC_TYPE_MEDIUM_IMPACT, new mji(3, 3), aczx.HAPTIC_TYPE_HEAVY_IMPACT, new mji(6, 6), aczx.HAPTIC_TYPE_SELECTION_CLICK, new mji(4, 4), aczx.HAPTIC_TYPE_SUCCESS, new mji(16, 16));
    private final oco b;

    public mjv(oco ocoVar) {
        this.b = ocoVar;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return aczv.b;
    }

    @Override // defpackage.nzy
    public final /* synthetic */ agff b(Object obj, final nzx nzxVar) {
        final aczv aczvVar = (aczv) obj;
        if ((aczvVar.c & 1) == 0) {
            this.b.b(acsw.LOG_TYPE_MISSING_FIELD, ((nyv) nzxVar).h, "HapticCommand is missing a type.", new Object[0]);
            agff agffVar = agij.a;
            aggz aggzVar = agoh.n;
            return agffVar;
        }
        yyr yyrVar = a;
        aczx aczxVarB = aczx.b(aczvVar.d);
        if (aczxVarB == null) {
            aczxVarB = aczx.HAPTIC_TYPE_UNKNOWN;
        }
        if (yyrVar.containsKey(aczxVarB)) {
            aczx aczxVarB2 = aczx.b(aczvVar.d);
            if (aczxVarB2 == null) {
                aczxVarB2 = aczx.HAPTIC_TYPE_UNKNOWN;
            }
            ((mju) yyrVar.get(aczxVarB2)).b();
            agff agffVarH = agff.h(new Runnable() { // from class: mjt
                @Override // java.lang.Runnable
                public final void run() {
                    yyr yyrVar2 = mjv.a;
                    aczv aczvVar2 = aczvVar;
                    View viewN = nzxVar.n();
                    yyr yyrVar3 = mjv.a;
                    aczx aczxVarB3 = aczx.b(aczvVar2.d);
                    if (aczxVarB3 == null) {
                        aczxVarB3 = aczx.HAPTIC_TYPE_UNKNOWN;
                    }
                    mju mjuVar = (mju) yyrVar3.get(aczxVarB3);
                    if (viewN == null || mjuVar == null) {
                        return;
                    }
                    viewN.performHapticFeedback(mjuVar.a());
                }
            });
            agfx agfxVar = aggd.a;
            aggb.a(agfxVar);
            return agffVarH.j(agfxVar);
        }
        acwg acwgVar = acwg.a;
        acvx acvxVar = new acvx();
        acsw acswVar = acsw.LOG_TYPE_COMMAND_EXECUTION_ERROR;
        if ((acvxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acvxVar.y();
        }
        acwg acwgVar2 = (acwg) acvxVar.b;
        acwgVar2.c = acswVar.E;
        acwgVar2.b |= 2;
        aczx aczxVarB3 = aczx.b(aczvVar.d);
        if (aczxVarB3 == null) {
            aczxVarB3 = aczx.HAPTIC_TYPE_UNKNOWN;
        }
        String strName = aczxVarB3.name();
        if ((acvxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acvxVar.y();
        }
        acwg acwgVar3 = (acwg) acvxVar.b;
        strName.getClass();
        acwgVar3.b |= 2048;
        acwgVar3.j = strName;
        this.b.c((acwg) acvxVar.v(), ((nyv) nzxVar).h, "Haptic type is not available.", new Object[0]);
        agff agffVar2 = agij.a;
        aggz aggzVar2 = agoh.n;
        return agffVar2;
    }
}
