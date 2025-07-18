package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ult extends obe {
    public ult(Context context, Looper looper, oav oavVar, nws nwsVar, nwt nwtVar) {
        super(context, looper, 131, oavVar, nwsVar, nwtVar);
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.oat
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        return iInterfaceQueryLocalInterface instanceof ulx ? (ulx) iInterfaceQueryLocalInterface : new ulx(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    @Override // defpackage.oat
    public final boolean f() {
        return true;
    }
}
