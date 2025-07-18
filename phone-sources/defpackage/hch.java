package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hch extends Paint {
    public hch() {
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(hhm.e(i));
        } else {
            setColor((hhm.e(i) << 24) | (getColor() & 16777215));
        }
    }

    public hch(int i) {
        super(i);
    }

    public hch(PorterDuff.Mode mode, byte[] bArr) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public hch(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
