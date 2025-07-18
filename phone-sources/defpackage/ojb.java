package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ojb extends obe {
    public ojb(Context context, Looper looper, oav oavVar, nyc nycVar, nzw nzwVar) {
        super(context, looper, 387, oavVar, nycVar, nzwVar);
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 17895000;
    }

    @Override // defpackage.oat
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        iBinder.getClass();
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.notifications.capping.internal.INotificationsCappingService");
        return iInterfaceQueryLocalInterface instanceof oiw ? (oiw) iInterfaceQueryLocalInterface : new oiw(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.notifications.capping.internal.INotificationsCappingService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.notifications.capping.api.NotificationsCappingApiService.START";
    }

    @Override // defpackage.oat
    protected final boolean e() {
        return true;
    }

    @Override // defpackage.oat
    public final boolean f() {
        return true;
    }

    @Override // defpackage.oat
    public final nvg[] g() {
        return ojc.b;
    }
}
