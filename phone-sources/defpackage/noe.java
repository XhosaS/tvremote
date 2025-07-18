package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class noe {
    public static final /* synthetic */ int a = 0;

    static {
        new nsf("CastDynamiteModule");
    }

    public static nog a(Context context) {
        try {
            IBinder iBinderC = odp.d(context, odp.a, "com.google.android.gms.cast.framework.dynamite").c("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (iBinderC == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderC.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return iInterfaceQueryLocalInterface instanceof nog ? (nog) iInterfaceQueryLocalInterface : new nof(iBinderC);
        } catch (odl e) {
            throw new nni(e);
        }
    }
}
