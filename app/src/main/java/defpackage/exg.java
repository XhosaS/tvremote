package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.InputQueue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.tvsearch.app.hover.HoverWindow$HoverLayoutParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exg extends Window {
    private static final zdy f = zdy.h("com/google/android/apps/tvsearch/app/hover/HoverWindow");
    public final LayoutInflater a;
    public exb b;
    public HoverWindow$HoverLayoutParams c;
    boolean d;
    public boolean e;

    public exg(Context context) {
        super(context);
        this.c = new HoverWindow$HoverLayoutParams();
        this.d = false;
        this.a = LayoutInflater.from(context);
    }

    private final void d() {
        exb exbVar = new exb(getContext());
        this.b = exbVar;
        exbVar.b = this;
        exbVar.setId(R.id.content);
    }

    final View a() {
        exb exbVar = this.b;
        if (exbVar == null) {
            return null;
        }
        return exbVar.getChildAt(0);
    }

    @Override // android.view.Window
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ((zdv) ((zdv) f.c()).q("com/google/android/apps/tvsearch/app/hover/HoverWindow", "addContentView", 76, "HoverWindow.java")).u("#addContentView not supported");
    }

    @Override // android.view.Window
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ViewGroup getDecorView() {
        if (this.b == null) {
            d();
        }
        return this.b;
    }

    public final void c() {
        exb exbVar = this.b;
        if (exbVar != null) {
            exbVar.removeAllViews();
        }
    }

    @Override // android.view.Window
    public final View getCurrentFocus() {
        exb exbVar = this.b;
        if (exbVar != null) {
            return exbVar.findFocus();
        }
        return null;
    }

    @Override // android.view.Window
    public final LayoutInflater getLayoutInflater() {
        return this.a;
    }

    @Override // android.view.Window
    public final int getNavigationBarColor() {
        return 0;
    }

    @Override // android.view.Window
    public final int getStatusBarColor() {
        return 0;
    }

    @Override // android.view.Window
    public final int getVolumeControlStream() {
        ((zdv) ((zdv) f.c()).q("com/google/android/apps/tvsearch/app/hover/HoverWindow", "getVolumeControlStream", 163, "HoverWindow.java")).u("#getVolumeControlStream not supported");
        return 0;
    }

    @Override // android.view.Window
    public final boolean isFloating() {
        return false;
    }

    @Override // android.view.Window
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Window
    public final /* synthetic */ View peekDecorView() {
        return this.b;
    }

    @Override // android.view.Window
    public final boolean performContextMenuIdentifierAction(int i, int i2) {
        return false;
    }

    @Override // android.view.Window
    public final boolean performPanelIdentifierAction(int i, int i2, int i3) {
        return false;
    }

    @Override // android.view.Window
    public final boolean performPanelShortcut(int i, int i2, KeyEvent keyEvent, int i3) {
        return false;
    }

    @Override // android.view.Window
    public final void restoreHierarchyState(Bundle bundle) {
        if (this.b == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("tvsearch:views");
        if (sparseParcelableArray != null) {
            this.b.restoreHierarchyState(sparseParcelableArray);
        }
        int i = bundle.getInt("tvsearch:focusedViewId", -1);
        if (i != -1) {
            View viewFindViewById = this.b.findViewById(i);
            if (viewFindViewById != null) {
                viewFindViewById.requestFocus();
            } else {
                ((zdv) ((zdv) f.d()).q("com/google/android/apps/tvsearch/app/hover/HoverWindow", "restoreHierarchyState", 264, "HoverWindow.java")).v("Previously focused view reported id %s during save, but can't be found during restore.", i);
            }
        }
    }

    @Override // android.view.Window
    public final Bundle saveHierarchyState() {
        if (this.b == null) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.b.saveHierarchyState(sparseArray);
        bundle.putSparseParcelableArray("tvsearch:views", sparseArray);
        View viewFindFocus = this.b.findFocus();
        if (viewFindFocus != null && viewFindFocus.getId() != -1) {
            bundle.putInt("tvsearch:focusedViewId", viewFindFocus.getId());
        }
        return bundle;
    }

    @Override // android.view.Window
    public final void setContentView(int i) {
        if (this.b == null) {
            d();
        } else {
            c();
        }
        this.a.inflate(i, this.b);
    }

    @Override // android.view.Window
    public final void setVolumeControlStream(int i) {
        ((zdv) ((zdv) f.c()).q("com/google/android/apps/tvsearch/app/hover/HoverWindow", "setVolumeControlStream", 169, "HoverWindow.java")).u("#setVolumeControlStream not supported");
    }

    @Override // android.view.Window
    public final boolean superDispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.d && ((exb) getDecorView()).a(motionEvent);
    }

    @Override // android.view.Window
    public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return this.d && ((exb) getDecorView()).b(keyEvent);
    }

    @Override // android.view.Window
    public final boolean superDispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.d && ((exb) getDecorView()).c(keyEvent);
    }

    @Override // android.view.Window
    public final boolean superDispatchTouchEvent(MotionEvent motionEvent) {
        return this.d && ((exb) getDecorView()).d(motionEvent);
    }

    @Override // android.view.Window
    public final boolean superDispatchTrackballEvent(MotionEvent motionEvent) {
        return this.d && ((exb) getDecorView()).e(motionEvent);
    }

    @Override // android.view.Window
    public final void takeKeyEvents(boolean z) {
        getDecorView().setFocusable(z);
    }

    @Override // android.view.Window
    public final void setContentView(View view) {
        setContentView(view, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.view.Window
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.b == null) {
            d();
        } else {
            c();
        }
        this.b.addView(view, layoutParams);
    }

    @Override // android.view.Window
    public final void closeAllPanels() {
    }

    @Override // android.view.Window
    protected final void onActive() {
    }

    @Override // android.view.Window
    public final void closePanel(int i) {
    }

    @Override // android.view.Window
    public final void invalidatePanelMenu(int i) {
    }

    @Override // android.view.Window
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.view.Window
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.Window
    public final void setDecorCaptionShade(int i) {
    }

    @Override // android.view.Window
    public final void setNavigationBarColor(int i) {
    }

    @Override // android.view.Window
    public final void setResizingCaptionDrawable(Drawable drawable) {
    }

    @Override // android.view.Window
    public final void setStatusBarColor(int i) {
    }

    @Override // android.view.Window
    public final void setTitle(CharSequence charSequence) {
    }

    @Override // android.view.Window
    public final void setTitleColor(int i) {
    }

    @Override // android.view.Window
    public final void takeInputQueue(InputQueue.Callback callback) {
    }

    @Override // android.view.Window
    public final void takeSurface(SurfaceHolder.Callback2 callback2) {
    }

    @Override // android.view.Window
    public final void openPanel(int i, KeyEvent keyEvent) {
    }

    @Override // android.view.Window
    public final void setChildDrawable(int i, Drawable drawable) {
    }

    @Override // android.view.Window
    public final void setChildInt(int i, int i2) {
    }

    @Override // android.view.Window
    public final void setFeatureDrawable(int i, Drawable drawable) {
    }

    @Override // android.view.Window
    public final void setFeatureDrawableAlpha(int i, int i2) {
    }

    @Override // android.view.Window
    public final void setFeatureDrawableResource(int i, int i2) {
    }

    @Override // android.view.Window
    public final void setFeatureDrawableUri(int i, Uri uri) {
    }

    @Override // android.view.Window
    public final void setFeatureInt(int i, int i2) {
    }

    @Override // android.view.Window
    public final void togglePanel(int i, KeyEvent keyEvent) {
    }
}
