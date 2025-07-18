package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nan implements lhf {
    public final ksy a;
    public final boolean b;
    public final boolean c;
    public final View d;
    public final lio e;

    public nan() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nan) {
            nan nanVar = (nan) obj;
            if (this.a.equals(nanVar.a) && this.b == nanVar.b && this.c == nanVar.c && this.d.equals(nanVar.d)) {
                if (((lif) this.e).e(nanVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ ((lif) this.e).a();
    }

    public final String toString() {
        lio lioVar = this.e;
        View view = this.d;
        return "WatchlistClickEvent{assetId=" + this.a.toString() + ", isWatchlisted=" + this.b + ", isRestricted=" + this.c + ", view=" + view.toString() + ", watchlistNode=" + lioVar.toString() + "}";
    }

    public nan(ksy ksyVar, boolean z, boolean z2, View view, lio lioVar) {
        this.a = ksyVar;
        this.b = z;
        this.c = z2;
        if (view == null) {
            throw new NullPointerException("Null view");
        }
        this.d = view;
        this.e = lioVar;
    }
}
