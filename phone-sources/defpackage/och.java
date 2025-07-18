package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class och extends RuntimeException {
    public och(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
