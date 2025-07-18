package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kiw implements kit {
    final /* synthetic */ kiz a;

    public kiw(kiz kizVar) {
        this.a = kizVar;
    }

    @Override // defpackage.kit
    public final void a(ConnectionResult connectionResult) {
        if (connectionResult.c()) {
            kiz kizVar = this.a;
            kizVar.s(null, kizVar.x());
        } else {
            kiq kiqVar = this.a.k;
            if (kiqVar != null) {
                kiqVar.c(connectionResult);
            }
        }
    }
}
