package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nlk extends ocg {
    public static final Parcelable.Creator<nlk> CREATOR = new nld(6);
    public String a;
    public String b;
    public int c;
    public String d;
    public nlj e;
    public int f;
    public List g;
    public int h;
    public long i;
    public boolean j;

    public nlk(String str, String str2, int i, String str3, nlj nljVar, int i2, List list, int i3, long j, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = nljVar;
        this.f = i2;
        this.g = list;
        this.h = i3;
        this.i = j;
        this.j = z;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.f = 0;
        this.g = null;
        this.h = 0;
        this.i = -1L;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlk)) {
            return false;
        }
        nlk nlkVar = (nlk) obj;
        return TextUtils.equals(this.a, nlkVar.a) && TextUtils.equals(this.b, nlkVar.b) && this.c == nlkVar.c && TextUtils.equals(this.d, nlkVar.d) && a.Q(this.e, nlkVar.e) && this.f == nlkVar.f && a.Q(this.g, nlkVar.g) && this.h == nlkVar.h && this.i == nlkVar.i && this.j == nlkVar.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Long.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, this.a);
        ocv.O(parcel, 3, this.b);
        ocv.B(parcel, 4, this.c);
        ocv.O(parcel, 5, this.d);
        ocv.N(parcel, 6, this.e, i);
        ocv.B(parcel, 7, this.f);
        List list = this.g;
        ocv.S(parcel, 8, list == null ? null : DesugarCollections.unmodifiableList(list));
        ocv.B(parcel, 9, this.h);
        ocv.C(parcel, 10, this.i);
        ocv.y(parcel, 11, this.j);
        ocv.x(parcel, iV);
    }

    public nlk(nlk nlkVar) {
        this.a = nlkVar.a;
        this.b = nlkVar.b;
        this.c = nlkVar.c;
        this.d = nlkVar.d;
        this.e = nlkVar.e;
        this.f = nlkVar.f;
        this.g = nlkVar.g;
        this.h = nlkVar.h;
        this.i = nlkVar.i;
        this.j = nlkVar.j;
    }

    public nlk() {
        a();
    }
}
