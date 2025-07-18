package defpackage;

import android.support.v7.widget.ActivityChooserView;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyz extends ezb implements Comparable {
    private final int e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;

    /* JADX WARN: Multi-variable type inference failed */
    public eyz(int i, eba ebaVar, int i2, eyv eyvVar, int i3, String str, String str2) {
        int iA;
        super(i, ebaVar, i2);
        int i4 = 0;
        this.f = clw.N(i3, false);
        int i5 = this.d.O & (~eyvVar.ah);
        this.g = 1 == (i5 & 1);
        this.h = (i5 & 2) != 0;
        ImmutableList immutableListOf = str2 != null ? ImmutableList.of(str2) : eyvVar.ae.isEmpty() ? ImmutableList.of("") : eyvVar.ae;
        int i6 = 0;
        while (true) {
            if (i6 >= immutableListOf.size()) {
                i6 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                iA = 0;
                break;
            } else {
                iA = ezd.a(this.d, (String) immutableListOf.get(i6), eyvVar.ai);
                if (iA > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.i = i6;
        this.j = iA;
        int iB = ezd.b(this.d.P, str2 != null ? 1088 : eyvVar.af);
        this.k = iB;
        this.m = (1088 & this.d.P) != 0;
        int iA2 = ezd.a(this.d, str, ezd.g(str) == null);
        this.l = iA2;
        boolean z = iA > 0 || (eyvVar.ae.isEmpty() && iB > 0) || this.g || (this.h && iA2 > 0);
        if (clw.N(i3, eyvVar.aA) && z) {
            i4 = 1;
        }
        this.e = i4;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(eyz eyzVar) {
        ComparisonChain comparisonChainCompare = ComparisonChain.start().compareFalseFirst(this.f, eyzVar.f).compare(Integer.valueOf(this.i), Integer.valueOf(eyzVar.i), Ordering.natural().reverse());
        int i = this.j;
        ComparisonChain comparisonChainCompare2 = comparisonChainCompare.compare(i, eyzVar.j);
        int i2 = this.k;
        ComparisonChain comparisonChainCompare3 = comparisonChainCompare2.compare(i2, eyzVar.k).compareFalseFirst(this.g, eyzVar.g).compare(Boolean.valueOf(this.h), Boolean.valueOf(eyzVar.h), i == 0 ? Ordering.natural() : Ordering.natural().reverse()).compare(this.l, eyzVar.l);
        if (i2 == 0) {
            comparisonChainCompare3 = comparisonChainCompare3.compareTrueFirst(this.m, eyzVar.m);
        }
        return comparisonChainCompare3.result();
    }

    @Override // defpackage.ezb
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ezb
    public final /* bridge */ /* synthetic */ boolean c(ezb ezbVar) {
        return false;
    }
}
