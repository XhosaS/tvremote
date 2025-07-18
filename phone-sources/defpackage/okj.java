package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okj extends ocg {
    public static final Parcelable.Creator<okj> CREATOR = new oee(14);
    public final int a;
    public final okk b;
    public final oki c;

    public okj(int i, okk okkVar, oki okiVar) {
        this.a = i;
        this.b = okkVar;
        this.c = okiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            okj okjVar = (okj) obj;
            if (this.a == okjVar.a && a.Q(this.b, okjVar.b) && a.Q(this.c, okjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, i2);
        ocv.N(parcel, 2, this.b, i);
        ocv.N(parcel, 3, this.c, i);
        ocv.x(parcel, iV);
    }
}
