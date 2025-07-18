package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.BatchUploadStatusParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        long jE = 0;
        long jE2 = 0;
        int iB = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                jE = kkw.e(parcel, i);
            } else if (c == 2) {
                iB = kkw.b(parcel, i);
            } else if (c != 3) {
                kkw.r(parcel, i);
            } else {
                jE2 = kkw.e(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new BatchUploadStatusParcel(jE, iB, jE2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BatchUploadStatusParcel[i];
    }
}
