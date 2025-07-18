package com.google.android.libraries.onegoogle.accountmenu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.AvatarView;
import com.google.android.videos.R;
import defpackage.jcd;
import defpackage.nay;
import defpackage.qub;
import defpackage.qun;
import defpackage.qvz;
import defpackage.qwn;
import defpackage.rrx;
import defpackage.sij;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SelectedAccountDisc<T> extends FrameLayout {
    public final ImageView a;
    public final AccountParticleDisc b;
    public View.OnTouchListener c;
    public View.OnTouchListener d;
    public qwn e;
    public qun f;
    public qub g;
    public qub h;

    public SelectedAccountDisc(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new nay(this, onClickListener, 4, null));
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.c = onTouchListener;
    }

    public void setScale(float f) {
        AvatarView avatarView = this.b.a;
        AvatarView.b(f, avatarView.b);
        avatarView.c = f;
        avatarView.m();
        avatarView.invalidate();
    }

    public SelectedAccountDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectedAccountDisc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Rect();
        new Rect();
        new WeakReference(null);
        LayoutInflater.from(context).inflate(R.layout.selected_account_disc, (ViewGroup) this, true);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) findViewById(R.id.og_selected_account_disc_apd);
        this.b = accountParticleDisc;
        ImageView imageView = (ImageView) findViewById(R.id.incognito_on_image_view);
        this.a = imageView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qvz.a, i, 0);
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            if (dimensionPixelSize != -1) {
                sij.x(!accountParticleDisc.p(), "setMaxDiscContentSize is only allowed before calling initialize.");
                accountParticleDisc.l(dimensionPixelSize);
            }
            typedArrayObtainStyledAttributes.recycle();
            int iAk = rrx.ak(context);
            if (iAk != 0) {
                accountParticleDisc.setBackgroundResource(iAk);
                imageView.setBackgroundResource(iAk);
            }
            super.setOnTouchListener(new jcd(this, 5));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
