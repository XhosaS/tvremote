package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lu extends ImageView {
    private final le a;
    private final lt b;
    private boolean c;

    public lu(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        le leVar = this.a;
        if (leVar != null) {
            leVar.c();
        }
        lt ltVar = this.b;
        if (ltVar != null) {
            ltVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        le leVar = this.a;
        if (leVar != null) {
            return leVar.a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        le leVar = this.a;
        if (leVar != null) {
            return leVar.b();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.b.e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        le leVar = this.a;
        if (leVar != null) {
            leVar.g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        le leVar = this.a;
        if (leVar != null) {
            leVar.e(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        lt ltVar = this.b;
        if (ltVar != null) {
            ltVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        lt ltVar = this.b;
        if (ltVar != null && drawable != null && !this.c) {
            ltVar.a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (ltVar != null) {
            ltVar.b();
            if (this.c) {
                return;
            }
            ltVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        lt ltVar = this.b;
        if (ltVar != null) {
            ltVar.d(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        lt ltVar = this.b;
        if (ltVar != null) {
            ltVar.b();
        }
    }

    public lu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        rs.a(context);
        this.c = false;
        rq.d(this, getContext());
        le leVar = new le(this);
        this.a = leVar;
        leVar.d(attributeSet, i);
        lt ltVar = new lt(this);
        this.b = ltVar;
        ltVar.c(attributeSet, i);
    }
}
