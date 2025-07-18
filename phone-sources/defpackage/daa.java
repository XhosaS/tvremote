package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class daa {
    public final byte[] a;
    public final String b;
    public final long c;

    public daa(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        this.a = bArr;
        parcel.readByteArray(bArr);
        String string = parcel.readString();
        string.getClass();
        this.b = string;
        this.c = parcel.readLong();
    }
}
