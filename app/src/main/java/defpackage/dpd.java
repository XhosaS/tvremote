package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpd extends dow {
    private static final Handler b = new Handler(Looper.getMainLooper(), new dpc());
    public final czb a;

    public dpd(czb czbVar, int i, int i2) {
        super(i, i2);
        this.a = czbVar;
    }

    @Override // defpackage.dpf
    public final void b(Object obj, dpm dpmVar) {
        don donVar = this.c;
        if (donVar == null || !donVar.l()) {
            return;
        }
        b.obtainMessage(1, this).sendToTarget();
    }

    @Override // defpackage.dpf
    public final void c(Drawable drawable) {
    }
}
