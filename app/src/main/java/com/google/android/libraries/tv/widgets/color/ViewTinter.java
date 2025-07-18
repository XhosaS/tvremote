package com.google.android.libraries.tv.widgets.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import defpackage.lu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ViewTinter {

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.tv.widgets.color.ViewTinter$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static int $default$getBackgroundAlpha(ViewTinter viewTinter) {
            return ((View) viewTinter).getBackground().getAlpha();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int $default$getBackgroundTint(ViewTinter viewTinter) {
            return a(((View) viewTinter).getBackgroundTintList());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int $default$getForegroundColor(ViewTinter viewTinter) {
            return ((View) viewTinter).getForeground().getAlpha();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int $default$getForegroundTint(ViewTinter viewTinter) {
            return a(((View) viewTinter).getForegroundTintList());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static float $default$getScale(ViewTinter viewTinter) {
            return ((View) viewTinter).getScaleX();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int $default$getShadowColor(ViewTinter viewTinter) {
            return ((View) viewTinter).getOutlineAmbientShadowColor();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static float $default$getTranslationStart(ViewTinter viewTinter) {
            View view = (View) viewTinter;
            float translationX = view.getTranslationX();
            return view.getLayoutDirection() == 0 ? translationX : -translationX;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void $default$setBackgroundAlpha(ViewTinter viewTinter, int i) {
            ((View) viewTinter).getBackground().setAlpha(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void $default$setBackgroundTint(ViewTinter viewTinter, int i) {
            ((View) viewTinter).setBackgroundTintList(ColorStateList.valueOf(i));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void $default$setForegroundAlpha(ViewTinter viewTinter, int i) {
            ((View) viewTinter).getForeground().setAlpha(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void $default$setForegroundTint(ViewTinter viewTinter, int i) {
            ((View) viewTinter).setForegroundTintList(ColorStateList.valueOf(i));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void $default$setScale(ViewTinter viewTinter, float f) {
            View view = (View) viewTinter;
            view.setScaleX(f);
            view.setScaleY(f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void $default$setShadowColor(ViewTinter viewTinter, int i) {
            View view = (View) viewTinter;
            view.setOutlineAmbientShadowColor(i);
            view.setOutlineSpotShadowColor(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void $default$setTranslationStart(ViewTinter viewTinter, float f) {
            View view = (View) viewTinter;
            if (view.getLayoutDirection() != 0) {
                f = -f;
            }
            view.setTranslationX(f);
        }

        public static int a(ColorStateList colorStateList) {
            if (colorStateList != null) {
                return colorStateList.getDefaultColor();
            }
            return -1;
        }
    }

    /* compiled from: PG */
    public interface ImageTinter extends ViewTinter {

        /* compiled from: PG */
        /* renamed from: com.google.android.libraries.tv.widgets.color.ViewTinter$ImageTinter$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            /* JADX WARN: Multi-variable type inference failed */
            public static int $default$getImageTint(ImageTinter imageTinter) {
                return CC.a(((ImageView) imageTinter).getImageTintList());
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static void $default$setImageTint(ImageTinter imageTinter, int i) {
                ((ImageView) imageTinter).setImageTintList(ColorStateList.valueOf(i));
            }
        }

        int getImageTint();

        void setImageTint(int i);
    }

    /* compiled from: PG */
    public interface TextTinter extends ViewTinter {

        /* compiled from: PG */
        /* renamed from: com.google.android.libraries.tv.widgets.color.ViewTinter$TextTinter$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }

        int getDrawableTint();

        int getTextColor();

        void setDrawableTint(int i);

        void setTextColor(int i);
    }

    /* compiled from: PG */
    public class TintedImageView extends lu implements ImageTinter {
        public TintedImageView(Context context) {
            super(context);
        }

        @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
        public /* synthetic */ int getBackgroundAlpha() {
            return CC.$default$getBackgroundAlpha(this);
        }

        @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
        public /* synthetic */ int getBackgroundTint() {
            return CC.$default$getBackgroundTint(this);
        }

        @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
        public /* synthetic */ int getForegroundColor() {
            return CC.$default$getForegroundColor(this);
        }

        @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
        public /* synthetic */ int getForegroundTint() {
            return CC.$default$getForegroundTint(this);
        }

        @Override // com.google.android.libraries.tv.widgets.color.ViewTinter.ImageTinter
        public /* synthetic */ int getImageTint() {
            return ImageTinter.CC.$default$getImageTint(this);
        }

        @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
        public /* synthetic */ float getScale() {
            return CC.$default$getScale(this);
        }

        @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
        public /* synthetic */ int getShadowColor() {
            return CC.$default$getShadowColor(this);
        }

        @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
        public /* synthetic */ float getTranslationStart() {
            return CC.$default$getTranslationStart(this);
        }

        @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
        public /* synthetic */ void setBackgroundAlpha(int i) {
            CC.$default$setBackgroundAlpha(this, i);
        }

        @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
        public /* synthetic */ void setBackgroundTint(int i) {
            CC.$default$setBackgroundTint(this, i);
        }

        @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
        public /* synthetic */ void setForegroundAlpha(int i) {
            CC.$default$setForegroundAlpha(this, i);
        }

        @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
        public /* synthetic */ void setForegroundTint(int i) {
            CC.$default$setForegroundTint(this, i);
        }

        @Override // com.google.android.libraries.tv.widgets.color.ViewTinter.ImageTinter
        public /* synthetic */ void setImageTint(int i) {
            ImageTinter.CC.$default$setImageTint(this, i);
        }

        @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
        public /* synthetic */ void setScale(float f) {
            CC.$default$setScale(this, f);
        }

        @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
        public /* synthetic */ void setShadowColor(int i) {
            CC.$default$setShadowColor(this, i);
        }

        @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
        public /* synthetic */ void setTranslationStart(float f) {
            CC.$default$setTranslationStart(this, f);
        }

        public TintedImageView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public TintedImageView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    int getBackgroundAlpha();

    int getBackgroundTint();

    int getForegroundColor();

    int getForegroundTint();

    float getScale();

    int getShadowColor();

    float getTranslationStart();

    void setBackgroundAlpha(int i);

    void setBackgroundTint(int i);

    void setForegroundAlpha(int i);

    void setForegroundTint(int i);

    void setScale(float f);

    void setShadowColor(int i);

    void setTranslationStart(float f);
}
