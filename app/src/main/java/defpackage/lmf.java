package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobstore.DeleteFileRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        Uri uri = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                kkw.r(parcel, i);
            } else {
                uri = (Uri) kkw.h(parcel, i, Uri.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new DeleteFileRequest(uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeleteFileRequest[i];
    }
}
