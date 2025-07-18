package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akp extends ajh {
    public static final Parcelable.Creator CREATOR = new afi(16);
    public final String a;
    public final byte[] b;
    public final String c;
    public final ako[] d;
    public final Map e = new TreeMap();
    public final boolean f;
    public final long g;

    public akp(String str, String str2, ako[] akoVarArr, boolean z, byte[] bArr, long j) {
        this.a = str;
        this.c = str2;
        this.d = akoVarArr;
        this.f = z;
        this.b = bArr;
        this.g = j;
        for (ako akoVar : akoVarArr) {
            this.e.put(Integer.valueOf(akoVar.a), akoVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof akp) {
            akp akpVar = (akp) obj;
            if (ii.X(this.a, akpVar.a) && ii.X(this.c, akpVar.c) && this.e.equals(akpVar.e) && this.f == akpVar.f && Arrays.equals(this.b, akpVar.b) && this.g == akpVar.g) {
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
            sb.append((ako) it.next());
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
        int iH = qq.h(parcel);
        qq.u(parcel, 2, this.a);
        qq.u(parcel, 3, this.c);
        qq.x(parcel, 4, this.d, i);
        qq.k(parcel, 5, this.f);
        qq.p(parcel, 6, this.b);
        qq.n(parcel, 7, this.g);
        qq.j(parcel, iH);
    }
}
