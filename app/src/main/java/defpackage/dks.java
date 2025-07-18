package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
class dks implements djx {
    private final dkq a;
    private final dpz b;

    public dks(dkq dkqVar, dpz dpzVar) {
        this.a = dkqVar;
        this.b = dpzVar;
    }

    @Override // defpackage.djx
    public final void a(ddz ddzVar, Bitmap bitmap) throws IOException {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            ddzVar.d(bitmap);
            throw iOException;
        }
    }

    @Override // defpackage.djx
    public final void b() {
        this.a.a();
    }
}
