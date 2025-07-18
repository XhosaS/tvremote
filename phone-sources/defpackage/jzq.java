package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzq extends kaa {
    public ixm a;
    public xhg b;
    public ihg c;
    public wlf d;
    public jwq e;

    public jzq() {
        wlf wlfVar = wlf.a;
        wlfVar.getClass();
        this.d = wlfVar;
        getLifecycle().b();
    }

    public final xhg a() {
        xhg xhgVar = this.b;
        if (xhgVar != null) {
            return xhgVar;
        }
        yks.c("appRefreshFeatureFlags");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    @Override // defpackage.kaa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.bkp r7, defpackage.bao r8, int r9) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzq.b(bkp, bao, int):void");
    }

    @Override // defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null && (bundle = getArguments()) == null) {
            bundle = new Bundle();
        }
        wlf wlfVar = wlf.a;
        wlfVar.getClass();
        this.d = (wlf) hju.H(bundle, "destination", wlfVar);
    }

    @Override // defpackage.kar, defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putAll(getArguments());
    }
}
