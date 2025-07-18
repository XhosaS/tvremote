package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ooh extends ocg {
    public static final Parcelable.Creator<ooh> CREATOR;
    public final boolean a;
    public final boolean b;
    private final List c;

    static {
        new ooh(null, false, false);
        CREATOR = new omd(10);
    }

    public ooh(List list, boolean z, boolean z2) {
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ooh)) {
            return false;
        }
        ooh oohVar = (ooh) obj;
        return a.Q(this.c, oohVar.c) && a.Q(Boolean.valueOf(this.a), Boolean.valueOf(oohVar.a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.S(parcel, 1, new ArrayList(this.c));
        ocv.y(parcel, 2, this.a);
        ocv.y(parcel, 3, this.b);
        ocv.x(parcel, iV);
    }
}
