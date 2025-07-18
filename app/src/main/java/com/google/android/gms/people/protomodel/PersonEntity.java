package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kki;
import defpackage.kkx;
import defpackage.lqo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PersonEntity extends AbstractSafeParcelable implements Person {
    public static final Parcelable.Creator CREATOR = new lqo();
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

    public PersonEntity(String str, List list, List list2, List list3, List list4, List list5, List list6) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = list6;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List b() {
        List list;
        if (this.m == null && (list = this.g) != null) {
            this.m = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.m.add((Photo) it.next());
            }
        }
        return this.m;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List c() {
        List list;
        if (this.l == null && (list = this.f) != null) {
            this.l = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.l.add((Birthday) it.next());
            }
        }
        return this.l;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List d() {
        List list;
        if (this.j == null && (list = this.d) != null) {
            this.j = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.j.add((Email) it.next());
            }
        }
        return this.j;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List e() {
        List list;
        if (this.h == null && (list = this.b) != null) {
            this.h = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.h.add((Name) it.next());
            }
        }
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Person person = (Person) obj;
        return kki.a(a(), person.a()) && kki.a(e(), person.e()) && kki.a(g(), person.g()) && kki.a(d(), person.d()) && kki.a(f(), person.f()) && kki.a(c(), person.c()) && kki.a(b(), person.b());
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List f() {
        List list;
        if (this.k == null && (list = this.e) != null) {
            this.k = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.k.add((Phone) it.next());
            }
        }
        return this.k;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List g() {
        List list;
        if (this.i == null && (list = this.c) != null) {
            this.i = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.i.add((Photo) it.next());
            }
        }
        return this.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), e(), g(), d(), f(), c(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 2, str);
        kkx.v(parcel, 4, e());
        kkx.v(parcel, 5, g());
        kkx.v(parcel, 9, c());
        kkx.v(parcel, 11, d());
        kkx.v(parcel, 13, f());
        kkx.v(parcel, 148, b());
        kkx.b(parcel, iA);
    }
}
