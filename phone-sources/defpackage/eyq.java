package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.ActivityChooserView;
import android.text.TextUtils;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyq extends ezb implements Comparable {
    private final int e;
    private final boolean f;
    private final String g;
    private final eyv h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;
    private final int n;
    private final int o;
    private final boolean p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final boolean u;
    private final boolean v;
    private final boolean w;

    /* JADX WARN: Multi-variable type inference failed */
    public eyq(int i, eba ebaVar, int i2, eyv eyvVar, int i3, boolean z, tsv tsvVar) {
        int i4;
        int iA;
        int iHashCode;
        int i5;
        int iA2;
        super(i, ebaVar, i2);
        this.h = eyvVar;
        int i6 = 1;
        int i7 = true != eyvVar.ay ? 16 : 24;
        boolean z2 = eyvVar.au;
        this.g = ezd.g(this.d.N);
        this.i = clw.N(i3, false);
        int i8 = 0;
        while (true) {
            int size = eyvVar.Y.size();
            i4 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            if (i8 >= size) {
                iA = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iA = ezd.a(this.d, (String) eyvVar.Y.get(i8), false);
                if (iA > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.k = i8;
        this.j = iA;
        this.l = ezd.b(this.d.P, eyvVar.Z);
        dze dzeVar = this.d;
        int i9 = dzeVar.P;
        this.m = i9 == 0 || (i9 & 1) != 0;
        this.p = 1 == (dzeVar.O & 1);
        String str = dzeVar.Y;
        this.w = str != null && ((iHashCode = str.hashCode()) == -2123537834 ? str.equals("audio/eac3-joc") : !(iHashCode == 187078297 ? !str.equals("audio/ac4") : !(iHashCode == 1504698186 && str.equals("audio/iamf"))));
        this.q = dzeVar.aq;
        this.r = dzeVar.ar;
        this.s = dzeVar.T;
        int i10 = dzeVar.T;
        this.f = (i10 == -1 || i10 <= eyvVar.ab) && ((i5 = dzeVar.aq) == -1 || i5 <= eyvVar.aa) && tsvVar.apply(dzeVar);
        String str2 = edt.a;
        String[] strArrAt = edt.at(Resources.getSystem().getConfiguration().getLocales().toLanguageTags(), ",");
        for (int i11 = 0; i11 < strArrAt.length; i11++) {
            strArrAt[i11] = edt.aa(strArrAt[i11]);
        }
        int i12 = 0;
        while (true) {
            if (i12 >= strArrAt.length) {
                iA2 = 0;
                i12 = Integer.MAX_VALUE;
                break;
            } else {
                iA2 = ezd.a(this.d, strArrAt[i12], false);
                if (iA2 > 0) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.n = i12;
        this.o = iA2;
        int i13 = 0;
        while (true) {
            if (i13 >= eyvVar.ac.size()) {
                break;
            }
            String str3 = this.d.Y;
            if (str3 != null && str3.equals(eyvVar.ac.get(i13))) {
                i4 = i13;
                break;
            }
            i13++;
        }
        this.t = i4;
        this.u = clw.K(i3) == 128;
        this.v = clw.M(i3) == 64;
        eyv eyvVar2 = this.h;
        if (!clw.N(i3, eyvVar2.aA) || (!(this.f || eyvVar2.at) || (eyvVar2.ad.e == 2 && !ezd.m(eyvVar2, i3, this.d)))) {
            i6 = 0;
        } else if (clw.N(i3, false) && this.f && this.d.T != -1) {
            eyv eyvVar3 = this.h;
            if (!eyvVar3.al && !eyvVar3.ak && ((eyvVar3.aC || !z) && eyvVar3.ad.e != 2 && (i7 & i3) != 0)) {
                i6 = 2;
            }
        }
        this.e = i6;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(eyq eyqVar) {
        boolean z = this.f;
        Ordering orderingReverse = (z && this.i) ? ezd.a : ezd.a.reverse();
        ComparisonChain comparisonChainCompare = ComparisonChain.start().compareFalseFirst(this.i, eyqVar.i).compare(Integer.valueOf(this.k), Integer.valueOf(eyqVar.k), Ordering.natural().reverse()).compare(this.j, eyqVar.j).compare(this.l, eyqVar.l).compareFalseFirst(this.p, eyqVar.p).compareFalseFirst(this.m, eyqVar.m).compare(Integer.valueOf(this.n), Integer.valueOf(eyqVar.n), Ordering.natural().reverse()).compare(this.o, eyqVar.o).compareFalseFirst(z, eyqVar.f).compare(Integer.valueOf(this.t), Integer.valueOf(eyqVar.t), Ordering.natural().reverse());
        if (this.h.ak) {
            comparisonChainCompare = comparisonChainCompare.compare(Integer.valueOf(this.s), Integer.valueOf(eyqVar.s), ezd.a.reverse());
        }
        ComparisonChain comparisonChainCompare2 = comparisonChainCompare.compareFalseFirst(this.u, eyqVar.u).compareFalseFirst(this.v, eyqVar.v).compareFalseFirst(this.w, eyqVar.w).compare(Integer.valueOf(this.q), Integer.valueOf(eyqVar.q), orderingReverse).compare(Integer.valueOf(this.r), Integer.valueOf(eyqVar.r), orderingReverse);
        if (Objects.equals(this.g, eyqVar.g)) {
            comparisonChainCompare2 = comparisonChainCompare2.compare(Integer.valueOf(this.s), Integer.valueOf(eyqVar.s), orderingReverse);
        }
        return comparisonChainCompare2.result();
    }

    @Override // defpackage.ezb
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ezb
    public final /* bridge */ /* synthetic */ boolean c(ezb ezbVar) {
        String str;
        int i;
        eyv eyvVar = this.h;
        eyq eyqVar = (eyq) ezbVar;
        boolean z = eyvVar.aw;
        dze dzeVar = this.d;
        int i2 = dzeVar.aq;
        if (i2 == -1) {
            return false;
        }
        dze dzeVar2 = eyqVar.d;
        if (i2 != dzeVar2.aq || (str = dzeVar.Y) == null || !TextUtils.equals(str, dzeVar2.Y)) {
            return false;
        }
        if (!eyvVar.av && ((i = dzeVar.ar) == -1 || i != dzeVar2.ar)) {
            return false;
        }
        boolean z2 = eyvVar.ax;
        return this.u == eyqVar.u && this.v == eyqVar.v;
    }
}
