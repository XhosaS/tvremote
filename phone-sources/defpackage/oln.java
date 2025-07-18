package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oln extends ocg implements Parcelable {
    public static final Parcelable.Creator<oln> CREATOR = new oeg(11);
    public final String a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private final List g;
    private List h;
    private List i;
    private List j;
    private List k;
    private List l;
    private List m;

    public oln(String str, List list, List list2, List list3, List list4, List list5, List list6) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = list6;
    }

    public final List a() {
        List list;
        if (this.m == null && (list = this.g) != null) {
            this.m = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.m.add((olq) it.next());
            }
        }
        return this.m;
    }

    public final List b() {
        List list;
        if (this.l == null && (list = this.f) != null) {
            this.l = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.l.add((olj) it.next());
            }
        }
        return this.l;
    }

    public final List c() {
        List list;
        if (this.j == null && (list = this.d) != null) {
            this.j = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.j.add((oll) it.next());
            }
        }
        return this.j;
    }

    public final List d() {
        List list;
        if (this.h == null && (list = this.b) != null) {
            this.h = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.h.add((olm) it.next());
            }
        }
        return this.h;
    }

    public final List e() {
        List list;
        if (this.k == null && (list = this.e) != null) {
            this.k = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.k.add((olp) it.next());
            }
        }
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oln)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        oln olnVar = (oln) obj;
        return a.Q(this.a, olnVar.a) && a.Q(d(), olnVar.d()) && a.Q(f(), olnVar.f()) && a.Q(c(), olnVar.c()) && a.Q(e(), olnVar.e()) && a.Q(b(), olnVar.b()) && a.Q(a(), olnVar.a());
    }

    public final List f() {
        List list;
        if (this.i == null && (list = this.c) != null) {
            this.i = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.i.add((olq) it.next());
            }
        }
        return this.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, d(), f(), c(), e(), b(), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, str);
        ocv.S(parcel, 4, d());
        ocv.S(parcel, 5, f());
        ocv.S(parcel, 9, b());
        ocv.S(parcel, 11, c());
        ocv.S(parcel, 13, e());
        ocv.S(parcel, 148, a());
        ocv.x(parcel, iV);
    }
}
