package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omc extends ocg {
    public static final Parcelable.Creator<omc> CREATOR = new omd(0);
    public final List a;

    public omc(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof omc) {
            return this.a.equals(((omc) obj).a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (omb ombVar : this.a) {
            if (!z) {
                sb.append(", ");
            }
            ombVar.a(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.S(parcel, 2, this.a);
        ocv.x(parcel, iV);
    }
}
