package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.afi;
import defpackage.ajh;
import defpackage.qq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Scope extends ajh implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new afi(4);
    final int a;
    public final String b;

    public Scope(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.b.equals(((Scope) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.m(parcel, 1, this.a);
        qq.u(parcel, 2, this.b);
        qq.j(parcel, iH);
    }

    public Scope(String str) {
        this(1, str);
    }
}
