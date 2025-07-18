package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oog extends ocg {
    public static final Parcelable.Creator<oog> CREATOR = new omd(9);
    public final String a;
    public final byte[] b;
    public final List c;

    public oog(String str, byte[] bArr, List list) {
        this.a = str;
        this.b = bArr;
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oog)) {
            return false;
        }
        oog oogVar = (oog) obj;
        return a.Q(this.a, oogVar.a) && a.Q(this.b, oogVar.b) && a.Q(this.c, oogVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        ocv.F(parcel, 2, this.b);
        ArrayList arrayList = new ArrayList(this.c);
        int iW = ocv.w(parcel, 3);
        int size = arrayList.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) arrayList.get(i2)).intValue());
        }
        ocv.x(parcel, iW);
        ocv.x(parcel, iV);
    }
}
