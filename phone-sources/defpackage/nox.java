package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nox extends ifj implements noz {
    public nox(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }

    @Override // defpackage.noz
    public final odd a() {
        odd odbVar;
        Parcel parcelL = l(2, k());
        IBinder strongBinder = parcelL.readStrongBinder();
        if (strongBinder == null) {
            odbVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            odbVar = iInterfaceQueryLocalInterface instanceof odd ? (odd) iInterfaceQueryLocalInterface : new odb(strongBinder);
        }
        parcelL.recycle();
        return odbVar;
    }
}
