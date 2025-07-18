package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrc implements hlo {
    private final hod a;
    private final hlo b;

    public hrc(hod hodVar, hlo hloVar) {
        this.a = hodVar;
        this.b = hloVar;
    }

    @Override // defpackage.hkw
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, hll hllVar) {
        return this.b.a(new hsj(((BitmapDrawable) ((hnv) obj).c()).getBitmap(), this.a, 1), file, hllVar);
    }

    @Override // defpackage.hlo
    public final int b() {
        return 2;
    }
}
