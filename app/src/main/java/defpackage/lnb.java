package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobstore.RenameRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        Uri uri = null;
        Uri uri2 = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                uri = (Uri) kkw.h(parcel, i, Uri.CREATOR);
            } else if (c != 2) {
                kkw.r(parcel, i);
            } else {
                uri2 = (Uri) kkw.h(parcel, i, Uri.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new RenameRequest(uri, uri2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RenameRequest[i];
    }
}
