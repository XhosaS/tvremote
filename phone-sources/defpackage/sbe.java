package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbe extends sbf {
    public final long a;
    public sbb b;
    public long c;
    private static final ulp g = new ulp((char[]) null);
    public static final Parcelable.Creator<sbe> CREATOR = new ous(12);

    public sbe(vtw vtwVar, ImmutableSet immutableSet, long j) {
        super(vtwVar, immutableSet);
        this.b = new sbb(whh.a, udj.a);
        this.a = j;
        this.c = 0L;
    }

    public final void a(sbb sbbVar) {
        this.c = g.aA();
        this.b = sbbVar;
    }

    @Override // defpackage.sbf, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f);
        f(parcel);
        h(parcel);
        e(parcel);
        g(parcel);
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, 0);
        parcel.writeLong(this.c);
    }

    public sbe(vtw vtwVar, Set set, ImmutableSet immutableSet, long j, long j2, sbb sbbVar, long j3) {
        super(vtwVar, set, immutableSet, j);
        this.b = sbbVar;
        this.a = j2;
        this.c = j3;
    }
}
