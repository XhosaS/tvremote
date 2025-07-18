package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jaj extends dow {
    final /* synthetic */ jal a;
    final /* synthetic */ htg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jaj(jal jalVar, htg htgVar) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = jalVar;
        this.b = htgVar;
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void b(Object obj, dpm dpmVar) {
        if (((Drawable) obj).getIntrinsicHeight() == 0) {
            Thread.currentThread().getName();
            return;
        }
        Thread.currentThread().getName();
        jal jalVar = this.a;
        float intrinsicWidth = r3.getIntrinsicWidth() / r3.getIntrinsicHeight();
        this.b.m(intrinsicWidth > 1.555f ? jalVar.b.getResources().getDimensionPixelSize(R.dimen.carousel_item_image_landscape_16_9_width) : intrinsicWidth > 1.167f ? jalVar.g : intrinsicWidth > 0.833f ? jalVar.b.getResources().getDimensionPixelSize(R.dimen.carousel_item_image_square_width) : jalVar.b.getResources().getDimensionPixelSize(R.dimen.carousel_item_image_portrait_2_3_width), jalVar.f);
    }

    @Override // defpackage.dow, defpackage.dpf
    public final void a(Drawable drawable) {
    }

    @Override // defpackage.dpf
    public final void c(Drawable drawable) {
    }
}
