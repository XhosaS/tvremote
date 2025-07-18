package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardFontData;
import com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData;
import com.google.android.gms.people.cpg.callingcard.CallingCardMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        CallingCardFontData callingCardFontData = null;
        CallingCardFullScreenImageData callingCardFullScreenImageData = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                callingCardFontData = (CallingCardFontData) kkw.h(parcel, i, CallingCardFontData.CREATOR);
            } else if (c != 2) {
                kkw.r(parcel, i);
            } else {
                callingCardFullScreenImageData = (CallingCardFullScreenImageData) kkw.h(parcel, i, CallingCardFullScreenImageData.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new CallingCardMetadata(callingCardFontData, callingCardFullScreenImageData);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CallingCardMetadata[i];
    }
}
