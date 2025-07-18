package defpackage;

import android.support.v7.widget.RecyclerView;
import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdm implements fel {
    private final byte[] a = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];

    @Override // defpackage.fel
    public final /* synthetic */ int a(dyu dyuVar, int i, boolean z) {
        return fki.L(this, dyuVar, i, z);
    }

    @Override // defpackage.fel
    public final /* synthetic */ void c(edi ediVar, int i) {
        fki.M(this, ediVar, i);
    }

    @Override // defpackage.fel
    public final void d(edi ediVar, int i, int i2) {
        ediVar.L(i);
    }

    @Override // defpackage.fel
    public final int g(dyu dyuVar, int i, boolean z) throws EOFException {
        int iA = dyuVar.a(this.a, 0, Math.min(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, i));
        if (iA != -1) {
            return iA;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.fel
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.fel
    public final void b(dze dzeVar) {
    }

    @Override // defpackage.fel
    public final void e(long j, int i, int i2, int i3, fek fekVar) {
    }
}
