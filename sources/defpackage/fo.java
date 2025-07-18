package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fo extends ImageButton {
    private final fg a;
    private boolean b;
    private final aei c;

    public fo(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        fg fgVar = this.a;
        if (fgVar != null) {
            fgVar.a();
        }
        aei aeiVar = this.c;
        if (aeiVar != null) {
            aeiVar.e();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.c.i() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fg fgVar = this.a;
        if (fgVar != null) {
            fgVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fg fgVar = this.a;
        if (fgVar != null) {
            fgVar.c(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        aei aeiVar = this.c;
        if (aeiVar != null) {
            aeiVar.e();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        aei aeiVar = this.c;
        if (aeiVar != null && drawable != null && !this.b) {
            aeiVar.g(drawable);
        }
        super.setImageDrawable(drawable);
        if (aeiVar != null) {
            aeiVar.e();
            if (this.b) {
                return;
            }
            aeiVar.d();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.b = true;
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.c.h(i);
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        aei aeiVar = this.c;
        if (aeiVar != null) {
            aeiVar.e();
        }
    }

    public fo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jn.a(context);
        this.b = false;
        jl.d(this, getContext());
        fg fgVar = new fg(this);
        this.a = fgVar;
        fgVar.b(attributeSet, i);
        aei aeiVar = new aei((ImageView) this);
        this.c = aeiVar;
        aeiVar.f(attributeSet, i);
    }
}
