package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlx {
    public final ddz a;
    public final ddx b;

    public dlx(ddz ddzVar, ddx ddxVar) {
        this.a = ddzVar;
        this.b = ddxVar;
    }

    public final void a(Bitmap bitmap) {
        this.a.d(bitmap);
    }

    public final void b(byte[] bArr) {
        this.b.c(bArr);
    }

    public final byte[] c(int i) {
        return (byte[]) this.b.a(i, byte[].class);
    }
}
