package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ocm extends obe {
    private final ocf a;

    public ocm(Context context, Looper looper, oav oavVar, ocf ocfVar, nyc nycVar, nzw nzwVar) {
        super(context, looper, 270, oavVar, nycVar, nzwVar);
        this.a = ocfVar;
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 203400000;
    }

    @Override // defpackage.oat
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof ocj ? (ocj) iInterfaceQueryLocalInterface : new ocj(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.oat
    protected final boolean e() {
        return true;
    }

    @Override // defpackage.oat
    public final nvg[] g() {
        return nul.b;
    }

    @Override // defpackage.oat
    protected final Bundle h() {
        Bundle bundle = new Bundle();
        String str = this.a.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
