package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oia extends ocg {
    public static final Parcelable.Creator<oia> CREATOR = new odt(13);
    public String a;
    public final int b;
    public ohm c;
    public oho d;

    private oia() {
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oia) {
            oia oiaVar = (oia) obj;
            if (a.Q(this.a, oiaVar.a) && a.Q(Integer.valueOf(this.b), Integer.valueOf(oiaVar.b)) && a.Q(this.c, oiaVar.c) && a.Q(this.d, oiaVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, this.a);
        ocv.B(parcel, 2, this.b);
        ocv.N(parcel, 3, this.c, i);
        ocv.N(parcel, 4, this.d, i);
        ocv.x(parcel, iV);
    }

    public oia(String str, int i, ohm ohmVar, oho ohoVar) {
        this.a = str;
        this.b = i;
        this.c = ohmVar;
        this.d = ohoVar;
    }
}
