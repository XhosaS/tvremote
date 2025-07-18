package defpackage;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcd extends tce {
    public tcd(tcc tccVar) {
        super(tccVar);
    }

    @Override // defpackage.szk
    protected final void I(Canvas canvas) {
        if (this.a.x.isEmpty()) {
            super.I(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.a.x);
        } else {
            canvas.clipRect(this.a.x, Region.Op.DIFFERENCE);
        }
        super.I(canvas);
        canvas.restore();
    }
}
