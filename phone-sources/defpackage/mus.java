package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mus extends mvd {
    public static final Parcelable.Creator<mus> CREATOR = new mur(0);

    public mus(int i, CharSequence charSequence) {
        super(i, charSequence);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        TextUtils.writeToParcel(this.b, parcel, i);
    }
}
