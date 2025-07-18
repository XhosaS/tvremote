package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbb implements Parcelable {
    public final whh b;
    public final udj c;
    public static final tui a = tui.l("com/google/android/libraries/play/logging/ulex/common/play/logsystem/PlayGlobalDimensionData");
    public static final Parcelable.Creator<sbb> CREATOR = new ous(10);

    public sbb(whh whhVar, udj udjVar) {
        this.b = whhVar;
        this.c = udjVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArrH = this.b.h();
        int length = bArrH.length;
        byte[] bArrH2 = this.c.h();
        int length2 = bArrH2.length;
        parcel.writeInt(length);
        parcel.writeByteArray(bArrH);
        parcel.writeInt(length2);
        parcel.writeByteArray(bArrH2);
    }
}
