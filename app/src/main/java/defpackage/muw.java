package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class muw implements nzy {
    public static final Map a = new HashMap();
    public static final Map b = new HashMap();
    public static final Map c = new HashMap();
    private final agfx d;
    private final agfx e;

    public muw(agfx agfxVar, agfx agfxVar2) {
        this.d = agfxVar;
        this.e = agfxVar2;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return actc.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, final nzx nzxVar) {
        final actc actcVar = (actc) obj;
        return agff.h(new Runnable() { // from class: mut
            @Override // java.lang.Runnable
            public final void run() {
                nzx nzxVar2 = nzxVar;
                this.a.c(actcVar, nzxVar2.n(), ((nyv) nzxVar2).b);
            }
        }).j(this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.actc r19, android.view.View r20, android.view.View r21) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.muw.c(actc, android.view.View, android.view.View):void");
    }
}
