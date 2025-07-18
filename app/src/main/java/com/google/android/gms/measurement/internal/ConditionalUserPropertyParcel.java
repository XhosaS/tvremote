package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkk;
import defpackage.kkx;
import defpackage.ktu;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ConditionalUserPropertyParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ktu();
    public String a;
    public String b;
    public UserAttributeParcel c;
    public long d;
    public boolean e;
    public String f;
    public final EventParcel g;
    public long h;
    public EventParcel i;
    public final long j;
    public final EventParcel k;

    public ConditionalUserPropertyParcel(String str, String str2, UserAttributeParcel userAttributeParcel, long j, boolean z, String str3, EventParcel eventParcel, long j2, EventParcel eventParcel2, long j3, EventParcel eventParcel3) {
        this.a = str;
        this.b = str2;
        this.c = userAttributeParcel;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.g = eventParcel;
        this.h = j2;
        this.i = eventParcel2;
        this.j = j3;
        this.k = eventParcel3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 2, this.a);
        kkx.r(parcel, 3, this.b);
        kkx.q(parcel, 4, this.c, i);
        kkx.g(parcel, 5, this.d);
        kkx.c(parcel, 6, this.e);
        kkx.r(parcel, 7, this.f);
        kkx.q(parcel, 8, this.g, i);
        kkx.g(parcel, 9, this.h);
        kkx.q(parcel, 10, this.i, i);
        kkx.g(parcel, 11, this.j);
        kkx.q(parcel, 12, this.k, i);
        kkx.b(parcel, iA);
    }

    public ConditionalUserPropertyParcel(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        kkk.k(conditionalUserPropertyParcel);
        this.a = conditionalUserPropertyParcel.a;
        this.b = conditionalUserPropertyParcel.b;
        this.c = conditionalUserPropertyParcel.c;
        this.d = conditionalUserPropertyParcel.d;
        this.e = conditionalUserPropertyParcel.e;
        this.f = conditionalUserPropertyParcel.f;
        this.g = conditionalUserPropertyParcel.g;
        this.h = conditionalUserPropertyParcel.h;
        this.i = conditionalUserPropertyParcel.i;
        this.j = conditionalUserPropertyParcel.j;
        this.k = conditionalUserPropertyParcel.k;
    }
}
