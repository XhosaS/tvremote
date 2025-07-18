package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mzq implements lhf {
    public final muj a;
    public final View b;

    public mzq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzq) {
            mzq mzqVar = (mzq) obj;
            if (this.a.equals(mzqVar.a) && this.b.equals(mzqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        View view = this.b;
        return "SimilarAssetClickEvent{assetCard=" + this.a.toString() + ", view=" + view.toString() + "}";
    }

    public mzq(muj mujVar, View view) {
        if (mujVar == null) {
            throw new NullPointerException("Null assetCard");
        }
        this.a = mujVar;
        if (view == null) {
            throw new NullPointerException("Null view");
        }
        this.b = view;
    }
}
