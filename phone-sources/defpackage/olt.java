package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olt extends ocg implements Comparable<olt> {
    public static final Parcelable.Creator<olt> CREATOR = new oeg(16);
    public final int a;
    public final oma[] b;
    public final String[] c;
    public final Map d = new TreeMap();

    public olt(int i, oma[] omaVarArr, String[] strArr) {
        this.a = i;
        this.b = omaVarArr;
        for (oma omaVar : omaVarArr) {
            this.d.put(omaVar.a, omaVar);
        }
        this.c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(olt oltVar) {
        return this.a - oltVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof olt) {
            olt oltVar = (olt) obj;
            if (this.a == oltVar.a && a.Q(this.d, oltVar.d) && Arrays.equals(this.c, oltVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.a);
        sb.append(", (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append((oma) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.c;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 2, this.a);
        ocv.R(parcel, 3, this.b, i);
        ocv.P(parcel, 4, this.c);
        ocv.x(parcel, iV);
    }
}
