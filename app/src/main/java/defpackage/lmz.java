package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        int iB = 0;
        Uri uri = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                uri = (Uri) kkw.h(parcel, i, Uri.CREATOR);
            } else if (c != 2) {
                kkw.r(parcel, i);
            } else {
                iB = kkw.b(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new OpenFileDescriptorRequest(uri, iB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new OpenFileDescriptorRequest[i];
    }
}
