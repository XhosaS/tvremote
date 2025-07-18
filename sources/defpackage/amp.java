package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amp extends ajh {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;
    private final List c;

    static {
        new amp(null, false, false);
        CREATOR = new akz(7);
    }

    public amp(List list, boolean z, boolean z2) {
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof amp)) {
            return false;
        }
        amp ampVar = (amp) obj;
        return ii.X(this.c, ampVar.c) && ii.X(Boolean.valueOf(this.a), Boolean.valueOf(ampVar.a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.y(parcel, 1, new ArrayList(this.c));
        qq.k(parcel, 2, this.a);
        qq.k(parcel, 3, this.b);
        qq.j(parcel, iH);
    }
}
