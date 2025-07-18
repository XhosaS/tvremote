package com.google.android.apps.play.movies.mobile.usecase.watch.bingewatch;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.msh;
import defpackage.msi;
import defpackage.mud;
import defpackage.nqq;
import java.text.NumberFormat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BingeWatchCard extends FrameLayout implements Animator.AnimatorListener, View.OnClickListener {
    public View a;
    public ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public msi g;
    private final mud h;
    private NumberFormat i;
    private TextView j;
    private TextView k;
    private int l;
    private int m;

    public BingeWatchCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new mud(new msh(this), getResources().getDisplayMetrics().density, ViewConfiguration.get(context).getScaledPagingTouchSlop());
        d();
    }

    private final void d() {
        this.i = NumberFormat.getIntegerInstance();
    }

    public final void a(int i) {
        this.k.setText(i < 0 ? null : this.i.format(i));
    }

    public final void b(String str, String str2) throws Resources.NotFoundException {
        TextView textView = this.j;
        if (!TextUtils.isEmpty(str)) {
            str2 = getResources().getString(R.string.binge_watch_next_episode, str, str2);
        }
        textView.setText(str2);
    }

    public final void c(boolean z) {
        int visibility = getVisibility();
        if (z) {
            if (visibility == 0) {
                return;
            }
        } else if (visibility != 0) {
            return;
        }
        if (this.l == 0) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int i = getResources().getDisplayMetrics().heightPixels - iArr[1];
            this.l = i;
            setTranslationY(i);
        }
        if (this.e) {
            if (z) {
                if (this.m == 0) {
                    return;
                }
            } else if (this.m == this.l) {
                return;
            }
        }
        this.m = z ? 0 : this.l;
        animate().translationY(this.m).setListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.e = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        if (this.c && !this.f) {
            ((View) getParent()).setWillNotDraw(this.d);
        }
        if (this.e) {
            msi msiVar = this.g;
            if (msiVar != null) {
                if (this.m == 0 && ((i = msiVar.b) == 2 || i == 4)) {
                    msiVar.b = 3;
                } else if (msiVar.b == 3) {
                    msiVar.b = 4;
                }
            }
            if (((int) getTranslationY()) + 1 >= this.l) {
                setVisibility(8);
            }
            this.e = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.e = true;
        if (this.c) {
            ((View) getParent()).setWillNotDraw(false);
        }
        setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        msi msiVar = this.g;
        if (msiVar != null) {
            msiVar.h();
            nqq.j(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor, msiVar.a);
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View childAt = getChildAt(0);
        this.a = childAt;
        childAt.setOnClickListener(this);
        this.b = (ImageView) this.a.findViewById(R.id.thumbnail_frame);
        this.j = (TextView) this.a.findViewById(R.id.episode_number_and_title);
        this.k = (TextView) this.a.findViewById(R.id.count_down);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h.d(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0165  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobile.usecase.watch.bingewatch.BingeWatchCard.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
