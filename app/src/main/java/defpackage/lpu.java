package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lpu extends lpm {
    private final kfv a;

    public lpu(kfv kfvVar) {
        this.a = kfvVar;
    }

    @Override // defpackage.lpm, defpackage.lpo
    public final void d(int i, Bundle bundle, DataHolder dataHolder) {
        this.a.i(new lpw(lpy.K(i, bundle), dataHolder == null ? null : new lqh(dataHolder)));
    }
}
