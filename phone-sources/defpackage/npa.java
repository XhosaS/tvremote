package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class npa extends ifj implements npb {
    public npa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    @Override // defpackage.npb
    public final List a() {
        Parcel parcelL = l(3, k());
        ArrayList arrayListCreateTypedArrayList = parcelL.createTypedArrayList(npi.CREATOR);
        parcelL.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.npb
    public final int[] b() {
        Parcel parcelL = l(4, k());
        int[] iArrCreateIntArray = parcelL.createIntArray();
        parcelL.recycle();
        return iArrCreateIntArray;
    }
}
