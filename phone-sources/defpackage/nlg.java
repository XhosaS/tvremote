package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nlg extends ocg {
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public static final nsf a = new nsf("MediaLiveSeekableRange");
    public static final Parcelable.Creator<nlg> CREATOR = new nld(2);

    public nlg(long j, long j2, boolean z, boolean z2) {
        this.b = Math.max(j, 0L);
        this.c = Math.max(j2, 0L);
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlg)) {
            return false;
        }
        nlg nlgVar = (nlg) obj;
        return this.b == nlgVar.b && this.c == nlgVar.c && this.d == nlgVar.d && this.e == nlgVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.b;
        int iV = ocv.v(parcel);
        ocv.C(parcel, 2, j);
        ocv.C(parcel, 3, this.c);
        ocv.y(parcel, 4, this.d);
        ocv.y(parcel, 5, this.e);
        ocv.x(parcel, iV);
    }
}
