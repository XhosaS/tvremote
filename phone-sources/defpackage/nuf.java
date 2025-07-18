package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nuf extends ocg {
    public static final Parcelable.Creator<nuf> CREATOR = new nub(2);
    public final String a;
    public final int b;
    public int c;

    public nuf(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuf)) {
            return false;
        }
        nuf nufVar = (nuf) obj;
        return Objects.equals(this.a, nufVar.a) && this.b == nufVar.b && this.c == nufVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "LogErrorParcelable[LogSourceName: " + this.a + ", ClearcutStatusCode: " + this.b + ", ErrorCount: " + this.c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, this.a);
        ocv.B(parcel, 2, this.b);
        ocv.B(parcel, 3, this.c);
        ocv.x(parcel, iV);
    }
}
