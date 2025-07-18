package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dpa extends dpb {
    public dpa(ImageView imageView) {
        super(imageView);
    }

    @Override // defpackage.dpb
    protected final /* bridge */ /* synthetic */ void i(Object obj) {
        ((ImageView) this.a).setImageDrawable((Drawable) obj);
    }
}
