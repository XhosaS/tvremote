package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kiy extends kio {
    final /* synthetic */ kiz g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kiy(kiz kizVar, int i, Bundle bundle) {
        super(kizVar, i, bundle);
        this.g = kizVar;
    }

    @Override // defpackage.kio
    protected final void a(ConnectionResult connectionResult) {
        this.g.g.a(connectionResult);
        System.currentTimeMillis();
    }

    @Override // defpackage.kio
    protected final boolean b() {
        this.g.g.a(ConnectionResult.a);
        return true;
    }
}
