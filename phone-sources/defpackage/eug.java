package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eug implements Parcelable {
    public static final Parcelable.Creator<eug> CREATOR = new dyy(5);
    public final long a;
    public final long b;

    public eug(long j, long j2) {
        boolean z = true;
        if (j2 < 0) {
            if (j2 == -9223372036854775807L) {
                j2 = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        a.H(z);
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eug)) {
            return false;
        }
        eug eugVar = (eug) obj;
        return this.a == eugVar.a && this.b == eugVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 961) + ((int) this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
