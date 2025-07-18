package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otp implements Parcelable {
    public static final Parcelable.Creator<otp> CREATOR = new omd(15);
    public int a;
    public float b;

    public otp() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }

    public otp(otp otpVar) {
        this.a = otpVar.a;
        this.b = otpVar.b;
    }

    public otp(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readFloat();
    }
}
