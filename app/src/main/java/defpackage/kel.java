package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kel implements Parcelable.Creator {
    public static final kel a = new kel(new kem());
    private final Parcelable.Creator b;

    private kel(Parcelable.Creator creator) {
        this.b = creator;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return ((kem) this.b).createFromParcel(parcel);
        }
        parcel.setDataPosition(iDataPosition - 4);
        return ApiMetadata.a;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ApiMetadata[i];
    }
}
