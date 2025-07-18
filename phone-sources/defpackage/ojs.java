package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ojs extends ocg {
    public static final Parcelable.Creator<ojs> CREATOR = new oee(5);
    public final ojp a;
    public final ojr b;
    public final ojq c;

    public ojs(ojp ojpVar, ojr ojrVar, ojq ojqVar) {
        this.a = ojpVar;
        this.b = ojrVar;
        this.c = ojqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojs)) {
            return false;
        }
        ojs ojsVar = (ojs) obj;
        return a.Q(this.a, ojsVar.a) && a.Q(this.b, ojsVar.b) && a.Q(this.c, ojsVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ojp ojpVar = this.a;
        int iV = ocv.v(parcel);
        ocv.N(parcel, 1, ojpVar, i);
        ocv.N(parcel, 2, this.b, i);
        ocv.N(parcel, 3, this.c, i);
        ocv.x(parcel, iV);
    }
}
