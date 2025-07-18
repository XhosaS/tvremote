package androidx.mediarouter.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.TooltipCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import defpackage.at;
import defpackage.by;
import defpackage.cr;
import defpackage.cww;
import defpackage.ftq;
import defpackage.fur;
import defpackage.fus;
import defpackage.fuw;
import defpackage.fux;
import defpackage.fuy;
import defpackage.fva;
import defpackage.fvb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaRouteButton extends View {
    static final SparseArray a = new SparseArray(2);
    private static final int[] e = {R.attr.state_checked};
    private static final int[] f = {R.attr.state_checkable};
    boolean b;
    RemoteIndicatorLoader c;
    public boolean d;
    private final fuy g;
    private final MediaRouterCallback h;
    private fur i;
    private MediaRouteDialogFactory j;
    private boolean k;
    private Drawable l;
    private int m;
    private int n;
    private int o;
    private ColorStateList p;
    private int q;
    private int r;

    /* compiled from: PG */
    final class MediaRouterCallback extends fus {
        public MediaRouterCallback() {
        }

        @Override // defpackage.fus
        public void onProviderAdded(fuy fuyVar, fuw fuwVar) {
            MediaRouteButton.this.a();
        }

        @Override // defpackage.fus
        public void onProviderChanged(fuy fuyVar, fuw fuwVar) {
            MediaRouteButton.this.a();
        }

        @Override // defpackage.fus
        public void onProviderRemoved(fuy fuyVar, fuw fuwVar) {
            MediaRouteButton.this.a();
        }

        @Override // defpackage.fus
        public void onRouteAdded(fuy fuyVar, fux fuxVar) {
            MediaRouteButton.this.a();
        }

        @Override // defpackage.fus
        public void onRouteChanged(fuy fuyVar, fux fuxVar) {
            MediaRouteButton.this.a();
        }

        @Override // defpackage.fus
        public void onRouteRemoved(fuy fuyVar, fux fuxVar) {
            MediaRouteButton.this.a();
        }

        @Override // defpackage.fus
        public void onRouteSelected(fuy fuyVar, fux fuxVar) {
            MediaRouteButton.this.a();
        }

        @Override // defpackage.fus
        public void onRouteUnselected(fuy fuyVar, fux fuxVar) {
            MediaRouteButton.this.a();
        }

        @Override // defpackage.fus
        public void onRouterParamsChanged(fuy fuyVar, fvb fvbVar) {
            boolean z = fvbVar != null ? fvbVar.f.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
            MediaRouteButton mediaRouteButton = MediaRouteButton.this;
            if (mediaRouteButton.b != z) {
                mediaRouteButton.b = z;
                mediaRouteButton.refreshDrawableState();
            }
        }
    }

    /* compiled from: PG */
    final class RemoteIndicatorLoader extends AsyncTask<Void, Void, Drawable> {
        private final int b;
        private final Context c;

        public RemoteIndicatorLoader(int i, Context context) {
            this.b = i;
            this.c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onCancelled(Drawable drawable) {
            if (drawable != null) {
                MediaRouteButton.a.put(this.b, drawable.getConstantState());
            }
            MediaRouteButton.this.c = null;
        }

        @Override // android.os.AsyncTask
        protected final /* bridge */ /* synthetic */ Drawable doInBackground(Void[] voidArr) {
            SparseArray sparseArray = MediaRouteButton.a;
            int i = this.b;
            if (((Drawable.ConstantState) sparseArray.get(i)) == null) {
                return AppCompatResources.getDrawable(this.c, i);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        protected final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) {
            Drawable drawableNewDrawable = drawable;
            if (drawableNewDrawable != null) {
                onCancelled(drawableNewDrawable);
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) MediaRouteButton.a.get(this.b);
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable();
                }
                MediaRouteButton.this.c = null;
            }
            MediaRouteButton.this.b(drawableNewDrawable);
        }
    }

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    private final void d() {
        if (this.m > 0) {
            RemoteIndicatorLoader remoteIndicatorLoader = this.c;
            if (remoteIndicatorLoader != null) {
                remoteIndicatorLoader.cancel(false);
            }
            RemoteIndicatorLoader remoteIndicatorLoader2 = new RemoteIndicatorLoader(this.m, getContext());
            this.c = remoteIndicatorLoader2;
            this.m = 0;
            remoteIndicatorLoader2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    private final boolean e(int i) {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        cr supportFragmentManager = activity instanceof by ? ((by) activity).getSupportFragmentManager() : null;
        if (supportFragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        if (fuy.n().q()) {
            if (supportFragmentManager.f("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            MediaRouteChooserDialogFragment mediaRouteChooserDialogFragmentOnCreateChooserDialogFragment = this.j.onCreateChooserDialogFragment();
            mediaRouteChooserDialogFragmentOnCreateChooserDialogFragment.setRouteSelector(this.i);
            if (i == 2) {
                if (mediaRouteChooserDialogFragmentOnCreateChooserDialogFragment.b != null) {
                    throw new IllegalStateException("This must be called before creating dialog");
                }
                mediaRouteChooserDialogFragmentOnCreateChooserDialogFragment.a = true;
            }
            at atVar = new at(supportFragmentManager);
            atVar.r(mediaRouteChooserDialogFragmentOnCreateChooserDialogFragment, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
            atVar.l();
        } else {
            if (supportFragmentManager.f("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
                return false;
            }
            MediaRouteControllerDialogFragment mediaRouteControllerDialogFragmentOnCreateControllerDialogFragment = this.j.onCreateControllerDialogFragment();
            mediaRouteControllerDialogFragmentOnCreateControllerDialogFragment.setRouteSelector(this.i);
            if (i == 2) {
                if (mediaRouteControllerDialogFragmentOnCreateControllerDialogFragment.b != null) {
                    throw new IllegalStateException("This must be called before creating dialog");
                }
                mediaRouteControllerDialogFragmentOnCreateControllerDialogFragment.a = true;
            }
            at atVar2 = new at(supportFragmentManager);
            atVar2.r(mediaRouteControllerDialogFragmentOnCreateControllerDialogFragment, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
            atVar2.l();
        }
        return true;
    }

    final void a() {
        fux fuxVarN = fuy.n();
        int i = !fuxVarN.q() ? fuxVarN.i : 0;
        if (this.o != i) {
            this.o = i;
            c();
            refreshDrawableState();
        }
        if (i == 1) {
            d();
        }
    }

    final void b(Drawable drawable) {
        RemoteIndicatorLoader remoteIndicatorLoader = this.c;
        if (remoteIndicatorLoader != null) {
            remoteIndicatorLoader.cancel(false);
        }
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.l);
        }
        if (drawable != null) {
            if (this.p != null) {
                drawable = drawable.mutate();
                drawable.setTintList(this.p);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.l = drawable;
        refreshDrawableState();
    }

    public final void c() {
        int i = this.o;
        String string = getContext().getString(i != 1 ? i != 2 ? com.google.android.videos.R.string.mr_cast_button_disconnected : com.google.android.videos.R.string.mr_cast_button_connected : com.google.android.videos.R.string.mr_cast_button_connecting);
        setContentDescription(string);
        if (!this.d || TextUtils.isEmpty(string)) {
            string = null;
        }
        TooltipCompat.setTooltipText(this, string);
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.l != null) {
            this.l.setState(getDrawableState());
            if (this.l.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.l.getCurrent();
                int i = this.o;
                if (i == 1 || this.n != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.n = this.o;
    }

    @Deprecated
    public void enableDynamicGroup() {
        fvb fvbVarL = fuy.l();
        fva fvaVar = fvbVarL == null ? new fva() : new fva(fvbVarL);
        fvaVar.a();
        fuy.p(new fvb(fvaVar));
    }

    public MediaRouteDialogFactory getDialogFactory() {
        return this.j;
    }

    public fur getRouteSelector() {
        return this.i;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.k = true;
        if (!this.i.d()) {
            this.g.c(this.i, this.h);
        }
        a();
    }

    @Override // android.view.View
    protected final int[] onCreateDrawableState(int i) {
        fuy fuyVar = this.g;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (fuyVar != null && !this.b) {
            int i2 = this.o;
            if (i2 == 1) {
                mergeDrawableStates(iArrOnCreateDrawableState, f);
            } else if (i2 == 2) {
                mergeDrawableStates(iArrOnCreateDrawableState, e);
                return iArrOnCreateDrawableState;
            }
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.k = false;
            if (!this.i.d()) {
                this.g.f(this.h);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.l != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.l.getIntrinsicWidth();
            int intrinsicHeight = this.l.getIntrinsicHeight();
            int i = paddingLeft + (((width - paddingLeft) - intrinsicWidth) / 2);
            int i2 = paddingTop + (((height - paddingTop) - intrinsicHeight) / 2);
            this.l.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.l.draw(canvas);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i3 = this.q;
        Drawable drawable = this.l;
        int iMax = Math.max(i3, drawable != null ? drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i4 = this.r;
        Drawable drawable2 = this.l;
        int iMax2 = Math.max(i4, drawable2 != null ? drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom() : 0);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, iMax);
        } else if (mode != 1073741824) {
            size = iMax;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, iMax2);
        } else if (mode2 != 1073741824) {
            size2 = iMax2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        d();
        return showDialog() || zPerformClick;
    }

    public void setDialogFactory(MediaRouteDialogFactory mediaRouteDialogFactory) {
        if (mediaRouteDialogFactory == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.j = mediaRouteDialogFactory;
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.m = 0;
        b(drawable);
    }

    public void setRouteSelector(fur furVar) {
        if (furVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.i.equals(furVar)) {
            return;
        }
        if (this.k) {
            if (!this.i.d()) {
                this.g.f(this.h);
            }
            if (!furVar.d()) {
                this.g.c(furVar, this.h);
            }
        }
        this.i = furVar;
        a();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    public boolean showDialog() {
        if (!this.k) {
            return false;
        }
        fvb fvbVarL = fuy.l();
        if (fvbVarL == null) {
            return e(1);
        }
        if (fvbVarL.c && fuy.h() && SystemOutputSwitcherDialogController.showDialog(getContext())) {
            return true;
        }
        return e(fvbVarL.a);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.l;
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.videos.R.attr.mediaRouteButtonStyle);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet, int i) {
        Drawable.ConstantState constantState;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, MediaRouterThemeHelper.d(context));
        int iF = MediaRouterThemeHelper.f(contextThemeWrapper, com.google.android.videos.R.attr.mediaRouteTheme);
        super(iF != 0 ? new ContextThemeWrapper(contextThemeWrapper, iF) : contextThemeWrapper, attributeSet, i);
        this.i = fur.a;
        this.j = MediaRouteDialogFactory.getDefault();
        Context context2 = getContext();
        int[] iArr = ftq.a;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        cww.o(this, context2, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        if (isInEditMode()) {
            this.g = null;
            this.h = null;
            this.l = AppCompatResources.getDrawable(context2, typedArrayObtainStyledAttributes.getResourceId(3, 0));
            return;
        }
        this.g = fuy.b(context2);
        this.h = new MediaRouterCallback();
        fux fuxVarN = fuy.n();
        int i2 = !fuxVarN.q() ? fuxVarN.i : 0;
        this.o = i2;
        this.n = i2;
        this.p = typedArrayObtainStyledAttributes.getColorStateList(4);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.m = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        typedArrayObtainStyledAttributes.recycle();
        int i3 = this.m;
        if (i3 != 0 && (constantState = (Drawable.ConstantState) a.get(i3)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.l == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) a.get(resourceId);
                if (constantState2 != null) {
                    b(constantState2.newDrawable());
                } else {
                    RemoteIndicatorLoader remoteIndicatorLoader = new RemoteIndicatorLoader(resourceId, getContext());
                    this.c = remoteIndicatorLoader;
                    remoteIndicatorLoader.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                d();
            }
        }
        c();
        setClickable(true);
    }

    @Deprecated
    public void setAlwaysVisible(boolean z) {
    }
}
