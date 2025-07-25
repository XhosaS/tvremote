package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kki;
import defpackage.kkx;
import defpackage.lqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SourceStatsEntity extends AbstractSafeParcelable implements SourceStats {
    public static final Parcelable.Creator CREATOR = new lqs();
    public final String a;
    public final Integer b;
    public final Integer c;

    public SourceStatsEntity(String str, Integer num, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    @Override // com.google.android.gms.people.protomodel.SourceStats
    public final Integer a() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.SourceStats
    public final Integer b() {
        return this.c;
    }

    @Override // com.google.android.gms.people.protomodel.SourceStats
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SourceStats)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        SourceStats sourceStats = (SourceStats) obj;
        return kki.a(c(), sourceStats.c()) && kki.a(a(), sourceStats.a()) && kki.a(b(), sourceStats.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{c(), a(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 2, str);
        kkx.o(parcel, 3, this.b);
        kkx.o(parcel, 4, this.c);
        kkx.b(parcel, iA);
    }
}
