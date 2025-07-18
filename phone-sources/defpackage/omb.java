package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omb extends ocg {
    public static final Parcelable.Creator<omb> CREATOR = new omd(1);
    public final String a;
    public final String b;
    public final oma c;
    public final boolean d;

    public omb(String str, String str2, oma omaVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = omaVar;
        this.d = z;
    }

    final void a(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.d(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omb)) {
            return false;
        }
        omb ombVar = (omb) obj;
        return a.Q(this.a, ombVar.a) && a.Q(this.b, ombVar.b) && a.Q(this.c, ombVar.c) && this.d == ombVar.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, this.a);
        ocv.O(parcel, 3, this.b);
        ocv.N(parcel, 4, this.c, i);
        ocv.y(parcel, 5, this.d);
        ocv.x(parcel, iV);
    }
}
