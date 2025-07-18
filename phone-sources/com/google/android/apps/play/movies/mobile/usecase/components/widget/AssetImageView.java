package com.google.android.apps.play.movies.mobile.usecase.components.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.yln;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AssetImageView extends AppCompatImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetImageView(Context context) {
        super(context);
        context.getClass();
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        if (bitmap != null && getScaleType() == ImageView.ScaleType.FIT_CENTER) {
            Resources resources = getContext().getResources();
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
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            setBackground(new BitmapDrawable(resources, bitmapCreateBitmap));
        }
        super.setImageBitmap(bitmap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
