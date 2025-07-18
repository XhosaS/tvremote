package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htr implements hts {
    private final hod a;
    private final hts b;
    private final hts c;

    public htr(hod hodVar, hts htsVar, hts htsVar2) {
        this.a = hodVar;
        this.b = htsVar;
        this.c = htsVar2;
    }

    @Override // defpackage.hts
    public final hnv a(hnv hnvVar, hll hllVar) {
        Drawable drawable = (Drawable) hnvVar.c();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(hsj.g(((BitmapDrawable) drawable).getBitmap(), this.a), hllVar);
        }
        if (drawable instanceof hti) {
            return this.c.a(hnvVar, hllVar);
        }
        return null;
    }
}
