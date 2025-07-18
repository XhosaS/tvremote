package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hsn implements hrw {
    private final hsl a;
    private final hwf b;

    public hsn(hsl hslVar, hwf hwfVar) {
        this.a = hslVar;
        this.b = hwfVar;
    }

    @Override // defpackage.hrw
    public final void a(hod hodVar, Bitmap bitmap) throws IOException {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            hodVar.d(bitmap);
            throw iOException;
        }
    }

    @Override // defpackage.hrw
    public final void b() {
        this.a.a();
    }
}
