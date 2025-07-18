package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klc extends kjn {
    private final kku t;

    public klc(Context context, Looper looper, kjd kjdVar, kku kkuVar, kgd kgdVar, khm khmVar) {
        super(context, looper, 270, kjdVar, kgdVar, khmVar);
        this.t = kkuVar;
    }

    @Override // defpackage.kjn, defpackage.kiz, defpackage.keg
    public final int a() {
        return 203400000;
    }

    @Override // defpackage.kiz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof kky ? (kky) iInterfaceQueryLocalInterface : new kky(iBinder);
    }

    @Override // defpackage.kiz
    protected final String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.kiz
    protected final String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.kiz
    protected final boolean f() {
        return true;
    }

    @Override // defpackage.kiz
    public final Feature[] g() {
        return kbk.b;
    }

    @Override // defpackage.kiz
    protected final Bundle u() {
        Bundle bundle = new Bundle();
        String str = this.t.c;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
