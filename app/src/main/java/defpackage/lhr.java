package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.UploadBatchesCriteria;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        ArrayList arrayListM = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                kkw.r(parcel, i);
            } else {
                arrayListM = kkw.m(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new UploadBatchesCriteria(arrayListM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UploadBatchesCriteria[i];
    }
}
