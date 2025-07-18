package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvg extends hvl {
    public hvg(ImageView imageView) {
        super(imageView);
    }

    @Override // defpackage.hvl
    protected final /* bridge */ /* synthetic */ void i(Object obj) {
        ((ImageView) this.b).setImageBitmap((Bitmap) obj);
    }
}
