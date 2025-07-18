package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ywf extends yup implements yva {
    public ywf(int i) {
        super(1, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 2);
        eV(Integer.valueOf(i));
    }

    @Override // defpackage.yva
    public final /* bridge */ /* synthetic */ Object d() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) g()).intValue());
        }
        return numValueOf;
    }

    public final void n(int i) {
        synchronized (this) {
            eV(Integer.valueOf(((Number) g()).intValue() + i));
        }
    }
}
