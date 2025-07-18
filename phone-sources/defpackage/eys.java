package defpackage;

import com.google.common.collect.ComparisonChain;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eys implements Comparable {
    private final boolean a;
    private final boolean b;

    public eys(dze dzeVar, int i) {
        this.a = 1 == (dzeVar.O & 1);
        this.b = clw.N(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(eys eysVar) {
        return ComparisonChain.start().compareFalseFirst(this.b, eysVar.b).compareFalseFirst(this.a, eysVar.a).result();
    }
}
