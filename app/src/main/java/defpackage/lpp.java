package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lpp extends ert implements IInterface {
    public lpp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
    }

    public final void e(lpo lpoVar, boolean z, int i, ApiMetadata apiMetadata) {
        Parcel parcelA = a();
        erv.c(parcelA, lpoVar);
        parcelA.writeInt(z ? 1 : 0);
        parcelA.writeString(null);
        parcelA.writeString(null);
        parcelA.writeInt(i);
        erv.b(parcelA, apiMetadata);
        Parcel parcelB = b(11, parcelA);
        parcelB.recycle();
    }
}
