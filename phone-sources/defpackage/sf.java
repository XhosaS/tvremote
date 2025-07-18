package defpackage;

import android.widget.Magnifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sf extends se {
    public sf(Magnifier magnifier) {
        super(magnifier);
    }

    @Override // defpackage.se
    public final void c(long j) {
        if (!Float.isNaN(Float.NaN)) {
            this.a.setZoom(Float.NaN);
        }
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
    }
}
