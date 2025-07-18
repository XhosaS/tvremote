package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olu extends ocg {
    public static final Parcelable.Creator<olu> CREATOR = new oeg(17);
    public final String a;
    public final byte[] b;
    public final String c;
    public final olt[] d;
    public final Map e = new TreeMap();
    public final boolean f;
    public final long g;

    public olu(String str, String str2, olt[] oltVarArr, boolean z, byte[] bArr, long j) {
        this.a = str;
        this.c = str2;
        this.d = oltVarArr;
        this.f = z;
        this.b = bArr;
        this.g = j;
        for (olt oltVar : oltVarArr) {
            this.e.put(Integer.valueOf(oltVar.a), oltVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof olu) {
            olu oluVar = (olu) obj;
            if (a.Q(this.a, oluVar.a) && a.Q(this.c, oluVar.c) && this.e.equals(oluVar.e) && this.f == oluVar.f && Arrays.equals(this.b, oluVar.b) && this.g == oluVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.e, Boolean.valueOf(this.f), this.b, Long.valueOf(this.g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.a);
        sb.append("', '");
        sb.append(this.c);
        sb.append("', (");
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            sb.append((olt) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f);
        sb.append(", ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, this.a);
        ocv.O(parcel, 3, this.c);
        ocv.R(parcel, 4, this.d, i);
        ocv.y(parcel, 5, this.f);
        ocv.F(parcel, 6, this.b);
        ocv.C(parcel, 7, this.g);
        ocv.x(parcel, iV);
    }
}
