package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcc extends szi {
    public final RectF x;

    public tcc(szq szqVar, RectF rectF) {
        super(szqVar);
        this.x = rectF;
    }

    @Override // defpackage.szi, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i = tce.b;
        tcd tcdVar = new tcd(this);
        tcdVar.invalidateSelf();
        return tcdVar;
    }

    public tcc(tcc tccVar) {
        super(tccVar);
        this.x = tccVar.x;
    }
}
