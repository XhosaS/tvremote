package defpackage;

import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpt extends lpm {
    public final khi a;

    public lpt(khi khiVar) {
        this.a = khiVar;
    }

    @Override // defpackage.lpm, defpackage.lpo
    public final void c(int i, Bundle bundle) {
        if (i != 0) {
            if (Log.isLoggable("PeopleClient", 5)) {
                Log.w("PeopleClient", "Non-success data changed callback received.");
            }
        } else {
            khi khiVar = this.a;
            bundle.getString("account");
            bundle.getString("pagegaiaid");
            bundle.getInt("scope");
            khiVar.a(new lps());
        }
    }
}
