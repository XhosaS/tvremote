package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mup extends muu {
    public static final Parcelable.Creator<mup> CREATOR = new jbu(20);

    public mup(String str, int i, CharSequence charSequence) {
        super(str, i, charSequence);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        TextUtils.writeToParcel(this.c, parcel, i);
    }
}
