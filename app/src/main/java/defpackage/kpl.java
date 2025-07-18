package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kpl extends ert implements IInterface {
    public kpl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void e(LocationRequestUpdateData locationRequestUpdateData) {
        Parcel parcelA = a();
        erv.b(parcelA, locationRequestUpdateData);
        J(59, parcelA);
    }
}
