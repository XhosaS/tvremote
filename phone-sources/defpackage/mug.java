package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mug extends hvk {
    public mug(ImageView imageView) {
        super(imageView);
    }

    @Override // defpackage.hvl, defpackage.hvm
    public final /* bridge */ /* synthetic */ void b(Object obj, hvv hvvVar) {
        Drawable drawable = (Drawable) obj;
        super.b(drawable, hvvVar);
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        ((ImageView) this.b).setImageMatrix(sdy.a(intrinsicWidth, intrinsicHeight, r0.getWidth(), r0.getHeight()));
    }
}
