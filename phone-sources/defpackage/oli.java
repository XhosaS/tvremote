package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oli extends ocg implements Parcelable {
    public static final Parcelable.Creator<oli> CREATOR = new oeg(5);
    public final String a;
    public final Long b;
    public final String c;
    public final Long d;
    public final Long e;
    public final olk f;
    private final List g;
    private List h;

    public oli(String str, Long l, List list, String str2, Long l2, Long l3, olk olkVar) {
        this.a = str;
        this.b = l;
        this.g = list;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        this.f = olkVar;
    }

    public final List a() {
        List list;
        if (this.h == null && (list = this.g) != null) {
            this.h = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.h.add((olr) it.next());
            }
        }
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oli)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        oli oliVar = (oli) obj;
        return a.Q(this.a, oliVar.a) && a.Q(this.b, oliVar.b) && a.Q(a(), oliVar.a()) && a.Q(this.c, oliVar.c) && a.Q(this.d, oliVar.d) && a.Q(this.e, oliVar.e) && a.Q(this.f, oliVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, a(), this.c, this.d, this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, str);
        ocv.S(parcel, 3, a());
        ocv.O(parcel, 4, this.c);
        ocv.M(parcel, 5, this.d);
        ocv.M(parcel, 6, this.e);
        ocv.M(parcel, 7, this.b);
        ocv.N(parcel, 8, this.f, i);
        ocv.x(parcel, iV);
    }
}
