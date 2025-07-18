package com.google.protobuf.contrib.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.MessageLite;
import defpackage.abvw;
import defpackage.abvz;
import defpackage.acar;
import defpackage.yqw;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ProtoParsers$InternalDontUse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new acar();
    public volatile byte[] a;
    public volatile MessageLite b;

    public ProtoParsers$InternalDontUse(byte[] bArr, MessageLite messageLite) {
        boolean z = true;
        if (bArr == null && messageLite == null) {
            z = false;
        }
        yqw.B(z, "Must have a message or bytes");
        this.a = bArr;
        this.b = messageLite;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            int iG = this.b.g();
            byte[] bArr = new byte[iG];
            try {
                MessageLite messageLite = this.b;
                boolean z = abvz.e;
                messageLite.f(new abvw(bArr, 0, iG));
                this.a = bArr;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }
}
