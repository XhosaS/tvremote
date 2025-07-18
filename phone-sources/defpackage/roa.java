package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class roa implements roc {
    private final zbe a;
    private final Comparable b;

    public roa(zbe zbeVar, Comparable comparable) {
        this.a = zbeVar;
        this.b = comparable;
    }

    @Override // defpackage.roc
    public final long a() {
        int iK;
        zbe zbeVar = this.a;
        if (zbeVar.A()) {
            iK = zbeVar.k(null);
            if (iK < 0) {
                throw new IllegalStateException(a.cf(iK, "serialized size must be non-negative, was "));
            }
        } else {
            int iK2 = zbeVar.O & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            if (iK2 == Integer.MAX_VALUE) {
                iK2 = zbeVar.k(null);
                if (iK2 < 0) {
                    throw new IllegalStateException(a.cf(iK2, "serialized size must be non-negative, was "));
                }
                zbeVar.O = (zbeVar.O & Integer.MIN_VALUE) | iK2;
            }
            iK = iK2;
        }
        return iK;
    }

    @Override // defpackage.roc
    public final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b.compareTo(((roa) obj).b);
    }
}
