package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.animation.AccelerateInterpolator;
import com.google.android.libraries.onegoogle.account.disc.AvatarView;
import com.google.android.libraries.onegoogle.account.disc.BadgeFrameLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class quj {
    public final BadgeFrameLayout a;
    public final AvatarView b;
    public rjg c;
    public Animator d = null;
    public pjs e;
    private qtz f;

    public quj(BadgeFrameLayout badgeFrameLayout, AvatarView avatarView) {
        this.a = badgeFrameLayout;
        avatarView.d();
        this.b = avatarView;
    }

    private static Drawable b(qtz qtzVar) {
        if (qtzVar == null) {
            return null;
        }
        return qtzVar.a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder$AlphaLayerDrawable, java.lang.Object] */
    public final void a(qtz qtzVar, boolean z) {
        ObjectAnimator objectAnimatorOfInt;
        sjl.c();
        if (a.Q(this.f, qtzVar)) {
            return;
        }
        final Drawable drawableB = b(this.f);
        this.f = qtzVar;
        final Drawable drawableB2 = b(qtzVar);
        if (drawableB == null) {
            objectAnimatorOfInt = ObjectAnimator.ofFloat(this.b, "badgeScale", 0.0f, 1.0f);
            objectAnimatorOfInt.addListener(new quh(this, drawableB2));
        } else if (qtzVar == null) {
            objectAnimatorOfInt = ObjectAnimator.ofFloat(this.b, "badgeScale", 1.0f, 0.0f);
            objectAnimatorOfInt.addListener(new qui(this));
        } else {
            ?? r2 = new LayerDrawable(drawableB, drawableB2) { // from class: com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder$AlphaLayerDrawable
                private final Drawable a;
                private final Drawable b;

                {
                    super(new Drawable[]{drawableB, drawableB2});
                    this.a = drawableB;
                    this.b = drawableB2;
                    drawableB2.setCallback(this);
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
                public int getAlpha() {
                    return this.b.getAlpha();
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
                public final int getOpacity() {
                    return this.a.getOpacity();
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
                public final void invalidateDrawable(Drawable drawable) {
                    invalidateSelf();
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
                public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                    scheduleSelf(runnable, j);
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
                public void setAlpha(int i) {
                    Drawable drawable = this.b;
                    drawable.setAlpha(i);
                    drawable.invalidateSelf();
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
                    this.a.setColorFilter(colorFilter);
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
                public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                    unscheduleSelf(runnable);
                }
            };
            objectAnimatorOfInt = ObjectAnimator.ofInt((Object) r2, "alpha", 0, 255);
            objectAnimatorOfInt.addListener(new qug(this, r2, drawableB2));
        }
        objectAnimatorOfInt.setDuration(z ? this.b.getResources().getInteger(R.integer.og_decoration_transition_duration) : 0L);
        objectAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfInt.addListener(new quf(this, qtzVar));
        Animator animator = this.d;
        if (animator != null) {
            animator.end();
        }
        this.d = objectAnimatorOfInt;
        objectAnimatorOfInt.start();
    }
}
