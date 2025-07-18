package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akx extends ajh {
    public static final Parcelable.Creator CREATOR = new akz(1);
    public final List a;

    public akx(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akx) {
            return this.a.equals(((akx) obj).a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (akw akwVar : this.a) {
            if (!z) {
                sb.append(", ");
            }
            akwVar.a(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.y(parcel, 2, this.a);
        qq.j(parcel, iH);
    }
}
