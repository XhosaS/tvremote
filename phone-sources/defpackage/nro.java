package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nro extends obe {
    public nro(Context context, Looper looper, oav oavVar, nws nwsVar, nwt nwtVar) {
        super(context, looper, 161, oavVar, nwsVar, nwtVar);
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.oat
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return iInterfaceQueryLocalInterface instanceof nsd ? (nsd) iInterfaceQueryLocalInterface : new nsd(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // defpackage.oat
    public final boolean f() {
        return true;
    }

    @Override // defpackage.oat
    public final nvg[] g() {
        return nks.o;
    }
}
