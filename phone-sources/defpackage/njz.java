package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class njz extends ocg {
    public static final Parcelable.Creator<njz> CREATOR = new nhv(16);
    public String a;
    String b;
    final List c;
    String d;
    Uri e;
    String f;
    public String g;
    public Boolean h;
    public Boolean i;
    public final int j;

    public njz(String str, String str2, List list, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = uri;
        this.f = str4;
        this.g = str5;
        this.h = bool;
        this.i = bool2;
        this.j = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof njz)) {
            return false;
        }
        njz njzVar = (njz) obj;
        return nrv.i(this.a, njzVar.a) && nrv.i(this.b, njzVar.b) && nrv.i(this.c, njzVar.c) && nrv.i(this.d, njzVar.d) && nrv.i(this.e, njzVar.e) && nrv.i(this.f, njzVar.f) && nrv.i(this.g, njzVar.g) && this.j == njzVar.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Integer.valueOf(this.j)});
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        List list = this.c;
        return "applicationId: " + str + ", name: " + str2 + ", namespaces.count: " + (list == null ? 0 : list.size()) + ", senderAppIdentifier: " + this.d + ", senderAppLaunchUrl: " + String.valueOf(this.e) + ", iconUrl: " + this.f + ", type: " + this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, this.a);
        ocv.O(parcel, 3, this.b);
        ocv.S(parcel, 4, null);
        ocv.Q(parcel, 5, DesugarCollections.unmodifiableList(this.c));
        ocv.O(parcel, 6, this.d);
        ocv.N(parcel, 7, this.e, i);
        ocv.O(parcel, 8, this.f);
        ocv.O(parcel, 9, this.g);
        ocv.D(parcel, 10, this.h);
        ocv.D(parcel, 11, this.i);
        ocv.B(parcel, 12, this.j);
        ocv.x(parcel, iV);
    }

    private njz() {
        this.c = new ArrayList();
        this.j = 1;
    }
}
