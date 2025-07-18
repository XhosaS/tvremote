package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajn extends aij {
    public ajn(Context context, Looper looper, aid aidVar, agx agxVar, ahl ahlVar) {
        super(context, looper, 270, aidVar, agxVar, ahlVar);
    }

    @Override // defpackage.aij, defpackage.aib, defpackage.afx
    public final int a() {
        return 203400000;
    }

    @Override // defpackage.aib
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof ajj ? (ajj) iInterfaceQueryLocalInterface : new ajj(iBinder);
    }

    @Override // defpackage.aib
    protected final String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.aib
    protected final String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.aib
    public final aes[] e() {
        return aep.b;
    }

    @Override // defpackage.aib
    protected final Bundle s() {
        return new Bundle();
    }

    @Override // defpackage.aib
    protected final boolean y() {
        return true;
    }
}
