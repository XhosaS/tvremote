package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nmj extends ocg {
    public static final Parcelable.Creator<nmj> CREATOR;
    public static final nmh a = new nmh(false);
    public static final nmi b = new nmi(0);
    public static final now c;
    public String d;
    public final boolean e;
    public final nlc f;
    public final boolean g;
    public final now h;
    public final boolean i;
    public final double j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public List n;
    public final boolean o;
    public final boolean p;
    public final nmh q;
    public nmi r;
    public final boolean s;
    public final boolean t;
    private final List u;

    static {
        npj.l(null, npk.a, npk.b, npj.k("smallIconDrawableResId"), npj.k("stopLiveStreamDrawableResId"), npj.k("pauseDrawableResId"), npj.k("playDrawableResId"), npj.k("skipNextDrawableResId"), npj.k("skipPrevDrawableResId"), npj.k("forwardDrawableResId"), npj.k("forward10DrawableResId"), npj.k("forward30DrawableResId"), npj.k("rewindDrawableResId"), npj.k("rewind10DrawableResId"), npj.k("rewind30DrawableResId"), npj.k("disconnectDrawableResId"));
        c = npj.p(null, null, false);
        CREATOR = new nmk();
    }

    public nmj(String str, List list, boolean z, nlc nlcVar, boolean z2, now nowVar, boolean z3, double d, boolean z4, boolean z5, boolean z6, List list2, boolean z7, boolean z8, nmh nmhVar, nmi nmiVar, boolean z9, boolean z10) {
        this.d = true == TextUtils.isEmpty(str) ? "" : str;
        int size = list == null ? 0 : list.size();
        ArrayList arrayList = new ArrayList(size);
        this.u = arrayList;
        if (size > 0) {
            arrayList.addAll(list);
        }
        this.e = z;
        this.f = nlcVar == null ? new nlc() : nlcVar;
        this.g = z2;
        this.h = nowVar;
        this.i = z3;
        this.j = d;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = list2;
        this.o = z7;
        this.p = z8;
        this.q = nmhVar;
        this.r = nmiVar;
        this.s = z9;
        this.t = z10;
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.n);
    }

    public final List b() {
        return DesugarCollections.unmodifiableList(this.u);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, this.d);
        ocv.Q(parcel, 3, b());
        ocv.y(parcel, 4, this.e);
        ocv.N(parcel, 5, this.f, i);
        ocv.y(parcel, 6, this.g);
        ocv.N(parcel, 7, this.h, i);
        ocv.y(parcel, 8, this.i);
        ocv.z(parcel, 9, this.j);
        ocv.y(parcel, 10, this.k);
        ocv.y(parcel, 11, this.l);
        ocv.y(parcel, 12, this.m);
        ocv.Q(parcel, 13, a());
        ocv.y(parcel, 14, this.o);
        ocv.B(parcel, 15, 0);
        ocv.y(parcel, 16, this.p);
        ocv.N(parcel, 17, this.q, i);
        ocv.N(parcel, 18, this.r, i);
        ocv.y(parcel, 19, this.s);
        ocv.y(parcel, 20, this.t);
        ocv.x(parcel, iV);
    }
}
