package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class soa extends dam {
    public static final Parcelable.Creator<soa> CREATOR = new spm(1);
    public boolean a;
    public boolean b;
    public int c;
    public float d;
    public boolean e;

    public soa(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readByte() != 0;
        this.b = parcel.readByte() != 0;
        this.c = parcel.readInt();
        this.d = parcel.readFloat();
        this.e = parcel.readByte() != 0;
    }

    @Override // defpackage.dam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.c);
        parcel.writeFloat(this.d);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
    }

    public soa(Parcelable parcelable) {
        super(parcelable);
    }
}
