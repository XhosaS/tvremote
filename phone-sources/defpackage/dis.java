package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dis implements djl {
    public final Bitmap a;

    public dis(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapImageProvider(bitmap=Bitmap(");
        Bitmap bitmap = this.a;
        sb.append(bitmap.getWidth());
        sb.append("px x ");
        sb.append(bitmap.getHeight());
        sb.append("px))");
        return sb.toString();
    }
}
