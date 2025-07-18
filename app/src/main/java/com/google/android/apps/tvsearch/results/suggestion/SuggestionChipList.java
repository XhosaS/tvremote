package com.google.android.apps.tvsearch.results.suggestion;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hsw;
import defpackage.hsx;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SuggestionChipList implements Parcelable {
    public static final Set b;
    public final String c;
    public final List d;
    public final int e;
    public final boolean f;
    public final int g;
    public static final hsx a = new hsx();
    public static final Parcelable.Creator CREATOR = new hsw();

    static {
        Set setSingleton = Collections.singleton("search results");
        setSingleton.getClass();
        b = setSingleton;
    }

    public SuggestionChipList(String str, List list, int i) {
        this.c = str;
        this.d = list;
        this.e = i;
        this.f = list.isEmpty();
        this.g = list.size();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.c);
        parcel.writeInt(this.e);
        parcel.writeList(this.d);
    }
}
