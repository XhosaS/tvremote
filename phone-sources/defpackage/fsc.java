package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsc implements Parcelable {
    public static final Parcelable.Creator<fsc> CREATOR = new dyy(10);
    final ResultReceiver a;

    public fsc(Parcel parcel) {
        this.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }
}
