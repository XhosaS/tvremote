package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsz implements hnv {
    private final /* synthetic */ int a;
    private final Object b;

    public hsz(Bitmap bitmap, int i) {
        this.a = i;
        this.b = bitmap;
    }

    @Override // defpackage.hnv
    public final int a() {
        int i = this.a;
        if (i == 0) {
            return ((byte[]) this.b).length;
        }
        if (i == 1) {
            return hwp.a((Bitmap) this.b);
        }
        if (i != 2) {
            PictureDrawable pictureDrawable = (PictureDrawable) this.b;
            return pictureDrawable.getIntrinsicHeight() * pictureDrawable.getIntrinsicWidth() * 4;
        }
        Object obj = this.b;
        int intrinsicWidth = eo$$ExternalSyntheticApiModelOutline0.m351m(obj).getIntrinsicWidth() * eo$$ExternalSyntheticApiModelOutline0.m351m(obj).getIntrinsicHeight() * hwp.b(Bitmap.Config.ARGB_8888);
        return intrinsicWidth + intrinsicWidth;
    }

    @Override // defpackage.hnv
    public final Class b() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? PictureDrawable.class : Drawable.class : Bitmap.class : byte[].class;
    }

    @Override // defpackage.hnv
    public final /* synthetic */ Object c() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? this.b : this.b : this.b : this.b;
    }

    @Override // defpackage.hnv
    public final void e() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return;
        }
        if (i != 2) {
            ((PictureDrawable) this.b).setPicture(null);
            return;
        }
        Object obj = this.b;
        eo$$ExternalSyntheticApiModelOutline0.m351m(obj).stop();
        eo$$ExternalSyntheticApiModelOutline0.m351m(obj).clearAnimationCallbacks();
    }

    public hsz(AnimatedImageDrawable animatedImageDrawable, int i) {
        this.a = i;
        this.b = animatedImageDrawable;
    }

    public hsz(PictureDrawable pictureDrawable, int i) {
        this.a = i;
        hju.p(pictureDrawable);
        this.b = pictureDrawable;
    }

    public hsz(byte[] bArr, int i) {
        this.a = i;
        hju.p(bArr);
        this.b = bArr;
    }
}
