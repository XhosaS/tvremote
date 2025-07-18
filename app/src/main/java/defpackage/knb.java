package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.feedback.FileTeleporter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        String strL = null;
        String strL2 = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) kkw.h(parcel, i, ParcelFileDescriptor.CREATOR);
            } else if (c == 3) {
                strL = kkw.l(parcel, i);
            } else if (c != 4) {
                kkw.r(parcel, i);
            } else {
                strL2 = kkw.l(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new FileTeleporter(parcelFileDescriptor, strL, strL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FileTeleporter[i];
    }
}
