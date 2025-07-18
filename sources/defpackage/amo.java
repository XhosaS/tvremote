package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amo extends ajh {
    public static final Parcelable.Creator CREATOR = new akz(6);
    public final String a;
    public final byte[] b;
    public final List c;

    public amo(String str, byte[] bArr, List list) {
        this.a = str;
        this.b = bArr;
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof amo)) {
            return false;
        }
        amo amoVar = (amo) obj;
        return ii.X(this.a, amoVar.a) && ii.X(this.b, amoVar.b) && ii.X(this.c, amoVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iH = qq.h(parcel);
        qq.u(parcel, 1, str);
        qq.p(parcel, 2, this.b);
        ArrayList arrayList = new ArrayList(this.c);
        int i2 = qq.i(parcel, 3);
        int size = arrayList.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(((Integer) arrayList.get(i3)).intValue());
        }
        qq.j(parcel, i2);
        qq.j(parcel, iH);
    }
}
