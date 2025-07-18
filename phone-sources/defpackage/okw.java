package defpackage;

import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okw extends oks {
    public final nzt a;

    public okw(nzt nztVar) {
        this.a = nztVar;
    }

    @Override // defpackage.oks
    public final void c(int i, Bundle bundle) {
        if (i != 0) {
            String strM = ocv.m();
            if (Log.isLoggable(strM, 5)) {
                Log.w(strM, "Non-success data changed callback received.");
                return;
            }
            return;
        }
        nzt nztVar = this.a;
        bundle.getString("account");
        bundle.getString("pagegaiaid");
        bundle.getInt("scope");
        nztVar.b(new okv(0));
    }
}
