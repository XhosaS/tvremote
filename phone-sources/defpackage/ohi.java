package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ohi extends obe {
    public ohi(Context context, Looper looper, oav oavVar, nws nwsVar, nwt nwtVar) {
        super(context, looper, 160, oavVar, nwsVar, nwtVar);
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.oat
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobstore.IMobStoreFileService");
        return iInterfaceQueryLocalInterface instanceof ogz ? (ogz) iInterfaceQueryLocalInterface : new ogz(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.mobstore.IMobStoreFileService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.mobstore.service.START";
    }

    @Override // defpackage.oat
    public final boolean f() {
        return true;
    }

    @Override // defpackage.oat
    public final nvg[] g() {
        return oex.f;
    }
}
