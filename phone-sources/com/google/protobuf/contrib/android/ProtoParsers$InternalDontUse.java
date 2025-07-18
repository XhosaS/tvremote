package com.google.protobuf.contrib.android;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.sct;
import defpackage.sij;
import defpackage.vtj;
import defpackage.vvj;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ProtoParsers$InternalDontUse<T extends vvj> implements Parcelable {
    public static final Parcelable.Creator<ProtoParsers$InternalDontUse<?>> CREATOR = new sct(17);
    public volatile byte[] a;
    public volatile vvj b;

    public ProtoParsers$InternalDontUse(byte[] bArr, vvj vvjVar) {
        boolean z = true;
        if (bArr == null && vvjVar == null) {
            z = false;
        }
        sij.o(z, "Must have a message or bytes");
        this.a = bArr;
        this.b = vvjVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            byte[] bArr = new byte[this.b.l()];
            try {
                this.b.dO(vtj.ah(bArr));
                this.a = bArr;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }
}
