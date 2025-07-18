package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aw implements Parcelable {
    public static final Parcelable.Creator<aw> CREATOR = new av(0);
    final List a;
    final List b;

    public aw(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createTypedArrayList(au.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeTypedList(this.b);
    }
}
