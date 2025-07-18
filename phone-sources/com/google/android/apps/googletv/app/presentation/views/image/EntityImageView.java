package com.google.android.apps.googletv.app.presentation.views.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.ctd;
import defpackage.ykn;
import defpackage.yln;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class EntityImageView extends RoundedImageView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EntityImageView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    @Override // com.google.android.apps.googletv.app.presentation.views.image.RoundedImageView, android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        if (bitmap != null && (bitmap.getWidth() + 5 < getWidth() || bitmap.getHeight() + 5 < getHeight())) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, yln.v(bitmap.getWidth() * 0.4f), yln.v(bitmap.getHeight() * 0.4f), false);
            bitmapCreateScaledBitmap.getClass();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
            bitmapCreateBitmap.getClass();
            RenderScript renderScriptCreate = RenderScript.create(getContext());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
            allocationCreateFromBitmap.getClass();
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            allocationCreateFromBitmap2.getClass();
            scriptIntrinsicBlurCreate.setRadius(25.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            scriptIntrinsicBlurCreate.destroy();
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            allocationCreateFromBitmap.destroy();
            allocationCreateFromBitmap2.destroy();
            ctd ctdVar = new ctd(getResources(), bitmapCreateBitmap);
            ctdVar.b(this.b);
            setBackground(ctdVar);
        }
        super.setImageBitmap(bitmap);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EntityImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        b(1.78f);
    }

    public /* synthetic */ EntityImageView(Context context, AttributeSet attributeSet, int i, int i2, ykn yknVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
