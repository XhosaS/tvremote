package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ken extends Exception {
    private final we a;

    public ken(we weVar) {
        this.a = weVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        we weVar = this.a;
        boolean z = true;
        for (kfq kfqVar : weVar.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) weVar.get(kfqVar);
            kkk.k(connectionResult);
            z &= !connectionResult.c();
            arrayList.add(kfqVar.a.b + ": " + connectionResult.toString());
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
