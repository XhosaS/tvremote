package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mzx {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final ImmutableList e;
    public final ImmutableList f;
    public final ImmutableList g;
    public final ImmutableList h;
    public final lio i;
    public final tst j;
    public final tst k;

    public mzx() {
        throw null;
    }

    public static mzw a() {
        mzw mzwVar = new mzw(null);
        mzwVar.a = "";
        mzwVar.e(false);
        mzwVar.g(false);
        mzwVar.d(false);
        mzwVar.b(ImmutableList.of());
        mzwVar.c(ImmutableList.of());
        mzwVar.f(ImmutableList.of());
        mzwVar.h(ImmutableList.of());
        trk trkVar = trk.a;
        mzwVar.c = trkVar;
        mzwVar.d = trkVar;
        return mzwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzx) {
            mzx mzxVar = (mzx) obj;
            if (this.a.equals(mzxVar.a) && this.b == mzxVar.b && this.c == mzxVar.c && this.d == mzxVar.d && this.e.equals(mzxVar.e) && this.f.equals(mzxVar.f) && this.g.equals(mzxVar.g) && this.h.equals(mzxVar.h)) {
                if (((lif) this.i).e(mzxVar.i) && this.j.equals(mzxVar.j) && this.k.equals(mzxVar.k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ ((lif) this.i).a()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    public final String toString() {
        tst tstVar = this.k;
        tst tstVar2 = this.j;
        lio lioVar = this.i;
        ImmutableList immutableList = this.h;
        ImmutableList immutableList2 = this.g;
        ImmutableList immutableList3 = this.f;
        return "SynopsisViewModel{description=" + this.a + ", isExpanded=" + this.b + ", useReplayTwoLinesDetailsDescription=" + this.c + ", forceExpandedForA11y=" + this.d + ", actors=" + String.valueOf(this.e) + ", directors=" + String.valueOf(immutableList3) + ", producers=" + String.valueOf(immutableList2) + ", writers=" + String.valueOf(immutableList) + ", uiElementNode=" + String.valueOf(lioVar) + ", visualElements=" + String.valueOf(tstVar2) + ", interactionLogger=" + String.valueOf(tstVar) + "}";
    }

    public mzx(String str, boolean z, boolean z2, boolean z3, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, lio lioVar, tst tstVar, tst tstVar2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = immutableList;
        this.f = immutableList2;
        this.g = immutableList3;
        this.h = immutableList4;
        this.i = lioVar;
        this.j = tstVar;
        this.k = tstVar2;
    }
}
