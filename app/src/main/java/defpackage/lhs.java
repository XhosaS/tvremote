package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.UploadBatchParcel;
import com.google.android.gms.measurement.internal.UploadBatchesParcel;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        ArrayList arrayListO = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                kkw.r(parcel, i);
            } else {
                arrayListO = kkw.o(parcel, i, UploadBatchParcel.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new UploadBatchesParcel(arrayListO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UploadBatchesParcel[i];
    }
}
