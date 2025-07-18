package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kzv extends kiz {
    public kzv(Context context, Looper looper, kip kipVar, kiq kiqVar) {
        super(context, looper, kjp.b(context), kcy.d, 93, kipVar, kiqVar, null);
    }

    @Override // defpackage.kiz, defpackage.keg
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.kiz
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof kzj ? (kzj) iInterfaceQueryLocalInterface : new kzh(iBinder);
    }

    @Override // defpackage.kiz
    protected final String c() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // defpackage.kiz
    protected final String d() {
        return "com.google.android.gms.measurement.START";
    }
}
