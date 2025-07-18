package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxq extends sxm {
    public final sxo a;
    public final sxp b;
    public Drawable c;

    public sxq(Context context, swu swuVar, sxo sxoVar, sxp sxpVar) {
        super(context, swuVar);
        this.a = sxoVar;
        this.b = sxpVar;
        sxpVar.j = this;
    }

    private final boolean a() {
        return this.p != null && sim.h(this.i.getContentResolver()) == 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125 A[SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxq.draw(android.graphics.Canvas):void");
    }

    @Override // defpackage.sxm
    public final boolean e(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean zE = super.e(z, z2, z3);
        if (a() && (drawable = this.c) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.b.a();
        }
        if (z && z3) {
            this.b.e();
        }
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.sxm, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }
}
