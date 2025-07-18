package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ako extends ajh implements Comparable {
    public static final Parcelable.Creator CREATOR = new afi(15);
    public final int a;
    public final akv[] b;
    public final String[] c;
    public final Map d = new TreeMap();

    public ako(int i, akv[] akvVarArr, String[] strArr) {
        this.a = i;
        this.b = akvVarArr;
        for (akv akvVar : akvVarArr) {
            this.d.put(akvVar.a, akvVar);
        }
        this.c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((ako) obj).a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ako) {
            ako akoVar = (ako) obj;
            if (this.a == akoVar.a && ii.X(this.d, akoVar.d) && Arrays.equals(this.c, akoVar.c)) {
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
            sb.append((akv) it.next());
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
        int iH = qq.h(parcel);
        qq.m(parcel, 2, this.a);
        qq.x(parcel, 3, this.b, i);
        qq.v(parcel, 4, this.c);
        qq.j(parcel, iH);
    }
}
