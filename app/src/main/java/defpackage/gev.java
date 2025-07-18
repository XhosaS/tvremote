package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gev implements geu {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/logging/appflow/AppFlowEventHandlerInteractor");
    private final ros b;
    private final gfu c;
    private final fex d;

    public gev(ros rosVar, gfu gfuVar, fex fexVar) {
        rosVar.getClass();
        gfuVar.getClass();
        fexVar.getClass();
        this.b = rosVar;
        this.c = gfuVar;
        this.d = fexVar;
    }

    private final void c(rqs rqsVar, ggg gggVar, int i, int i2, String str) {
        String str2;
        if (i2 != 5) {
            if (str == null || str.length() <= 0) {
                return;
            }
            rqt rqtVar = (rqt) rqsVar;
            rqtVar.i(gge.a(i), str);
            ((zdv) a.b().q("com/google/android/apps/tvsearch/logging/appflow/AppFlowEventHandlerInteractor", "addFlowRequestIdTagIfPresent", 125, "AppFlowEventHandlerInteractor.kt")).J("AppFlowEvent: %s, %s, %s, externalFlowRequestId=%s", rqsVar.d(), gggVar, rqtVar.a.b, str);
            return;
        }
        gfu gfuVar = this.c;
        rqt rqtVar2 = (rqt) rqsVar;
        rpz rpzVar = rqtVar2.a;
        Set set = gfu.a;
        String str3 = rpzVar.b;
        if (set.contains(str3) || gfu.b.contains(str3) || gfu.d.contains(str3) || gfu.c.contains(str3)) {
            if (((Boolean) gfuVar.e.a()).booleanValue()) {
                if (gfu.b.contains(str3)) {
                    gfuVar.a();
                }
            } else if (set.contains(str3)) {
                gfuVar.a();
            }
            str2 = gfuVar.f;
        } else {
            str2 = null;
        }
        String str4 = str2;
        if (str4 == null) {
            ((zdv) ((zdv) a.d()).r(zfc.SMALL).q("com/google/android/apps/tvsearch/logging/appflow/AppFlowEventHandlerInteractor", "addFlowRequestIdTagIfPresent", 108, "AppFlowEventHandlerInteractor.kt")).x("interactionId is could not be successfully retrieved for event %s", str3);
        } else {
            rqtVar2.i(gge.a(i), str4);
        }
        ((zdv) a.b().q("com/google/android/apps/tvsearch/logging/appflow/AppFlowEventHandlerInteractor", "addFlowRequestIdTagIfPresent", 114, "AppFlowEventHandlerInteractor.kt")).J("AppFlowEvent: %s, %s, %s, interactionId=%s", rqsVar.d(), gggVar, str3, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015a  */
    @Override // defpackage.geu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.ggi r16) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gev.a(ggi):void");
    }

    @Override // defpackage.geu
    public final void b(ggg gggVar, rqs rqsVar, int i, int i2, String str, ahrs ahrsVar) {
        gggVar.getClass();
        if (i == 0 || i2 == 0) {
            throw null;
        }
        c(rqsVar, gggVar, i, i2, str);
        if (ahrsVar == null) {
            String strB = this.d.b();
            if (strB != null) {
                if (!rqsVar.e()) {
                    ((rqt) rqsVar).h(strB);
                }
                abxc abxcVar = ahrs.d;
                ahrq ahrqVar = new ahrq();
                ahta.c(strB, ahrqVar);
                ((rqt) rqsVar).f(abxcVar, ahta.a(ahrqVar));
            }
        } else {
            agwh agwhVar = new agwh();
            agwhVar.a = ahrsVar;
            String strB2 = this.d.b();
            if (strB2 != null) {
                if (!rqsVar.e()) {
                    ((rqt) rqsVar).h(strB2);
                }
                String str2 = ((ahrs) agwhVar.a).i;
                str2.getClass();
                if (str2.length() == 0) {
                    ahrs ahrsVar2 = (ahrs) agwhVar.a;
                    ahrq ahrqVar2 = new ahrq();
                    ahrqVar2.B(ahrsVar2);
                    ahta.c(strB2, ahrqVar2);
                    agwhVar.a = ahta.a(ahrqVar2);
                }
            }
            ((rqt) rqsVar).f(ahrs.d, agwhVar.a);
        }
        this.b.a(rqsVar);
    }
}
