package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mmd implements Parcelable {
    public final boolean a;
    public final ieg b;
    public final ieg c;
    public final ieg d;
    public final ieg e;
    public final ieg f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public mmd() {
        throw null;
    }

    public static mmc b() {
        mmc mmcVar = new mmc();
        mmcVar.f(false);
        ieg iegVar = ieg.a;
        mmcVar.h(iegVar);
        mmcVar.e(iegVar);
        mmcVar.g(iegVar);
        mmcVar.d(iegVar);
        mmcVar.b(iegVar);
        mmcVar.i(false);
        mmcVar.c(false);
        mmcVar.a = 2;
        mmcVar.j();
        return mmcVar;
    }

    public final ieg a() {
        ieg iegVar = this.e;
        return iegVar.m() ? ieg.f(xbm.b(((Integer) iegVar.g()).intValue())) : ieg.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mmd) {
            mmd mmdVar = (mmd) obj;
            if (this.a == mmdVar.a && this.b.equals(mmdVar.b) && this.c.equals(mmdVar.c) && this.d.equals(mmdVar.d) && this.e.equals(mmdVar.e) && this.f.equals(mmdVar.f) && this.g == mmdVar.g && this.h == mmdVar.h && this.j == mmdVar.j && this.i == mmdVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
        int i = this.j;
        a.bl(i);
        return (((((((iHashCode * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ i) * 1000003) ^ (true == this.i ? 1231 : 1237);
    }

    public final String toString() {
        ieg iegVar = this.f;
        ieg iegVar2 = this.e;
        ieg iegVar3 = this.d;
        ieg iegVar4 = this.c;
        return "DetailsViewState{isSynopsisExpanded=" + this.a + ", selectedSeason=" + this.b.toString() + ", initialSeasonLocationNumber=" + iegVar4.toString() + ", selectedDistributor=" + iegVar3.toString() + ", initialDistributorSelectionTypeNumber=" + iegVar2.toString() + ", expandedEpisode=" + iegVar.toString() + ", showAllEpisodes=" + this.g + ", fromSavedInstanceState=" + this.h + ", displayActionType=" + mnu.r(this.j) + ", isRedirectedForBirthdayEntry=" + this.i + "}";
    }

    public mmd(boolean z, ieg iegVar, ieg iegVar2, ieg iegVar3, ieg iegVar4, ieg iegVar5, boolean z2, boolean z3, int i, boolean z4) {
        this.a = z;
        if (iegVar == null) {
            throw new NullPointerException("Null selectedSeason");
        }
        this.b = iegVar;
        if (iegVar2 == null) {
            throw new NullPointerException("Null initialSeasonLocationNumber");
        }
        this.c = iegVar2;
        if (iegVar3 == null) {
            throw new NullPointerException("Null selectedDistributor");
        }
        this.d = iegVar3;
        if (iegVar4 == null) {
            throw new NullPointerException("Null initialDistributorSelectionTypeNumber");
        }
        this.e = iegVar4;
        if (iegVar5 == null) {
            throw new NullPointerException("Null expandedEpisode");
        }
        this.f = iegVar5;
        this.g = z2;
        this.h = z3;
        this.j = i;
        this.i = z4;
    }
}
