package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.ActionBarPolicy;
import android.support.v7.view.ActionMode;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.support.v7.view.menu.MenuPopupHelper;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.ScrollingTabContainerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import defpackage.at;
import defpackage.by;
import defpackage.cwk;
import defpackage.cwm;
import defpackage.cww;
import defpackage.cxe;
import defpackage.cxf;
import defpackage.cxg;
import defpackage.cxh;
import defpackage.ez;
import defpackage.fb;
import defpackage.fc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class WindowDecorActionBar extends ActionBar implements ActionBarOverlayLayout.ActionBarVisibilityCallback {
    private static final long FADE_IN_DURATION_MS = 200;
    private static final long FADE_OUT_DURATION_MS = 100;
    private static final int INVALID_POSITION = -1;
    private static final String TAG = "WindowDecorActionBar";
    private static final Interpolator sHideInterpolator = new AccelerateInterpolator();
    private static final Interpolator sShowInterpolator = new DecelerateInterpolator();
    ActionModeImpl mActionMode;
    private Activity mActivity;
    ActionBarContainer mContainerView;
    View mContentView;
    Context mContext;
    ActionBarContextView mContextView;
    ViewPropertyAnimatorCompatSet mCurrentShowAnim;
    DecorToolbar mDecorToolbar;
    ActionMode mDeferredDestroyActionMode;
    ActionMode.Callback mDeferredModeDestroyCallback;
    private boolean mDisplayHomeAsUpSet;
    private boolean mHasEmbeddedTabs;
    boolean mHiddenByApp;
    boolean mHiddenBySystem;
    boolean mHideOnContentScroll;
    private boolean mLastMenuVisibility;
    ActionBarOverlayLayout mOverlayLayout;
    private TabImpl mSelectedTab;
    private boolean mShowHideAnimationEnabled;
    private boolean mShowingForMode;
    ScrollingTabContainerView mTabScrollView;
    private Context mThemedContext;
    private ArrayList<TabImpl> mTabs = new ArrayList<>();
    private int mSavedTabPosition = -1;
    private ArrayList<ActionBar.OnMenuVisibilityListener> mMenuVisibilityListeners = new ArrayList<>();
    private int mCurWindowVisibility = 0;
    boolean mContentAnimations = true;
    private boolean mNowShowing = true;
    final cxf mHideListener = new cxg() { // from class: android.support.v7.app.WindowDecorActionBar.1
        @Override // defpackage.cxg, defpackage.cxf
        public void onAnimationEnd(View view) {
            View view2;
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.mContentAnimations && (view2 = windowDecorActionBar.mContentView) != null) {
                view2.setTranslationY(0.0f);
                WindowDecorActionBar.this.mContainerView.setTranslationY(0.0f);
            }
            WindowDecorActionBar.this.mContainerView.setVisibility(8);
            WindowDecorActionBar.this.mContainerView.setTransitioning(false);
            WindowDecorActionBar windowDecorActionBar2 = WindowDecorActionBar.this;
            windowDecorActionBar2.mCurrentShowAnim = null;
            windowDecorActionBar2.completeDeferredDestroyActionMode();
            ActionBarOverlayLayout actionBarOverlayLayout = WindowDecorActionBar.this.mOverlayLayout;
            if (actionBarOverlayLayout != null) {
                int[] iArr = cww.a;
                cwk.e(actionBarOverlayLayout);
            }
        }
    };
    final cxf mShowListener = new cxg() { // from class: android.support.v7.app.WindowDecorActionBar.2
        @Override // defpackage.cxg, defpackage.cxf
        public void onAnimationEnd(View view) {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            windowDecorActionBar.mCurrentShowAnim = null;
            windowDecorActionBar.mContainerView.requestLayout();
        }
    };
    final cxh mUpdateListener = new cxh() { // from class: android.support.v7.app.WindowDecorActionBar.3
        @Override // defpackage.cxh
        public void onAnimationUpdate(View view) {
            ((View) WindowDecorActionBar.this.mContainerView.getParent()).invalidate();
        }
    };

    /* compiled from: PG */
    public class ActionModeImpl extends ActionMode implements ez {
        private final Context mActionModeContext;
        private ActionMode.Callback mCallback;
        private WeakReference<View> mCustomView;
        private final fb mMenu;

        public ActionModeImpl(Context context, ActionMode.Callback callback) {
            this.mActionModeContext = context;
            this.mCallback = callback;
            fb fbVar = new fb(context);
            fbVar.F();
            this.mMenu = fbVar;
            fbVar.r(this);
        }

        public boolean dispatchOnCreate() {
            this.mMenu.u();
            try {
                return this.mCallback.onCreateActionMode(this, this.mMenu);
            } finally {
                this.mMenu.t();
            }
        }

        @Override // android.support.v7.view.ActionMode
        public void finish() {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.mActionMode != this) {
                return;
            }
            if (WindowDecorActionBar.checkShowingFlags(windowDecorActionBar.mHiddenByApp, windowDecorActionBar.mHiddenBySystem, false)) {
                this.mCallback.onDestroyActionMode(this);
            } else {
                windowDecorActionBar.mDeferredDestroyActionMode = this;
                windowDecorActionBar.mDeferredModeDestroyCallback = this.mCallback;
            }
            this.mCallback = null;
            WindowDecorActionBar.this.animateToMode(false);
            WindowDecorActionBar.this.mContextView.closeMode();
            WindowDecorActionBar windowDecorActionBar2 = WindowDecorActionBar.this;
            windowDecorActionBar2.mOverlayLayout.setHideOnContentScrollEnabled(windowDecorActionBar2.mHideOnContentScroll);
            WindowDecorActionBar.this.mActionMode = null;
        }

        @Override // android.support.v7.view.ActionMode
        public View getCustomView() {
            WeakReference<View> weakReference = this.mCustomView;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // android.support.v7.view.ActionMode
        public Menu getMenu() {
            return this.mMenu;
        }

        @Override // android.support.v7.view.ActionMode
        public MenuInflater getMenuInflater() {
            return new SupportMenuInflater(this.mActionModeContext);
        }

        @Override // android.support.v7.view.ActionMode
        public CharSequence getSubtitle() {
            return WindowDecorActionBar.this.mContextView.getSubtitle();
        }

        @Override // android.support.v7.view.ActionMode
        public CharSequence getTitle() {
            return WindowDecorActionBar.this.mContextView.getTitle();
        }

        @Override // android.support.v7.view.ActionMode
        public void invalidate() {
            if (WindowDecorActionBar.this.mActionMode != this) {
                return;
            }
            this.mMenu.u();
            try {
                this.mCallback.onPrepareActionMode(this, this.mMenu);
            } finally {
                this.mMenu.t();
            }
        }

        @Override // android.support.v7.view.ActionMode
        public boolean isTitleOptional() {
            return WindowDecorActionBar.this.mContextView.isTitleOptional();
        }

        @Override // defpackage.ez
        public boolean onMenuItemSelected(fb fbVar, MenuItem menuItem) {
            ActionMode.Callback callback = this.mCallback;
            if (callback != null) {
                return callback.onActionItemClicked(this, menuItem);
            }
            return false;
        }

        @Override // defpackage.ez
        public void onMenuModeChange(fb fbVar) {
            if (this.mCallback == null) {
                return;
            }
            invalidate();
            WindowDecorActionBar.this.mContextView.showOverflowMenu();
        }

        public boolean onSubMenuSelected(fc fcVar) {
            if (this.mCallback == null) {
                return false;
            }
            if (!fcVar.hasVisibleItems()) {
                return true;
            }
            new MenuPopupHelper(WindowDecorActionBar.this.getThemedContext(), fcVar).show();
            return true;
        }

        @Override // android.support.v7.view.ActionMode
        public void setCustomView(View view) {
            WindowDecorActionBar.this.mContextView.setCustomView(view);
            this.mCustomView = new WeakReference<>(view);
        }

        @Override // android.support.v7.view.ActionMode
        public void setSubtitle(int i) {
            setSubtitle(WindowDecorActionBar.this.mContext.getResources().getString(i));
        }

        @Override // android.support.v7.view.ActionMode
        public void setTitle(int i) {
            setTitle(WindowDecorActionBar.this.mContext.getResources().getString(i));
        }

        @Override // android.support.v7.view.ActionMode
        public void setTitleOptionalHint(boolean z) {
            super.setTitleOptionalHint(z);
            WindowDecorActionBar.this.mContextView.setTitleOptional(z);
        }

        @Override // android.support.v7.view.ActionMode
        public void setSubtitle(CharSequence charSequence) {
            WindowDecorActionBar.this.mContextView.setSubtitle(charSequence);
        }

        @Override // android.support.v7.view.ActionMode
        public void setTitle(CharSequence charSequence) {
            WindowDecorActionBar.this.mContextView.setTitle(charSequence);
        }

        public void onCloseSubMenu(fc fcVar) {
        }

        public void onCloseMenu(fb fbVar, boolean z) {
        }
    }

    /* compiled from: PG */
    public class TabImpl extends ActionBar.Tab {
        private ActionBar.TabListener mCallback;
        private CharSequence mContentDesc;
        private View mCustomView;
        private Drawable mIcon;
        private int mPosition = -1;
        private Object mTag;
        private CharSequence mText;

        public TabImpl() {
        }

        public ActionBar.TabListener getCallback() {
            return this.mCallback;
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public CharSequence getContentDescription() {
            return this.mContentDesc;
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public View getCustomView() {
            return this.mCustomView;
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public Drawable getIcon() {
            return this.mIcon;
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public int getPosition() {
            return this.mPosition;
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public Object getTag() {
            return this.mTag;
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public CharSequence getText() {
            return this.mText;
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public void select() {
            WindowDecorActionBar.this.selectTab(this);
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public ActionBar.Tab setContentDescription(int i) {
            return setContentDescription(WindowDecorActionBar.this.mContext.getResources().getText(i));
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public ActionBar.Tab setCustomView(int i) {
            return setCustomView(LayoutInflater.from(WindowDecorActionBar.this.getThemedContext()).inflate(i, (ViewGroup) null));
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public ActionBar.Tab setIcon(int i) {
            return setIcon(AppCompatResources.getDrawable(WindowDecorActionBar.this.mContext, i));
        }

        public void setPosition(int i) {
            this.mPosition = i;
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public ActionBar.Tab setTabListener(ActionBar.TabListener tabListener) {
            this.mCallback = tabListener;
            return this;
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public ActionBar.Tab setTag(Object obj) {
            this.mTag = obj;
            return this;
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public ActionBar.Tab setText(int i) {
            return setText(WindowDecorActionBar.this.mContext.getResources().getText(i));
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public ActionBar.Tab setContentDescription(CharSequence charSequence) {
            this.mContentDesc = charSequence;
            int i = this.mPosition;
            if (i >= 0) {
                WindowDecorActionBar.this.mTabScrollView.updateTab(i);
            }
            return this;
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public ActionBar.Tab setIcon(Drawable drawable) {
            this.mIcon = drawable;
            int i = this.mPosition;
            if (i >= 0) {
                WindowDecorActionBar.this.mTabScrollView.updateTab(i);
            }
            return this;
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public ActionBar.Tab setText(CharSequence charSequence) {
            this.mText = charSequence;
            int i = this.mPosition;
            if (i >= 0) {
                WindowDecorActionBar.this.mTabScrollView.updateTab(i);
            }
            return this;
        }

        @Override // android.support.v7.app.ActionBar.Tab
        public ActionBar.Tab setCustomView(View view) {
            this.mCustomView = view;
            int i = this.mPosition;
            if (i >= 0) {
                WindowDecorActionBar.this.mTabScrollView.updateTab(i);
            }
            return this;
        }
    }

    public WindowDecorActionBar(Activity activity, boolean z) {
        this.mActivity = activity;
        View decorView = activity.getWindow().getDecorView();
        init(decorView);
        if (z) {
            return;
        }
        this.mContentView = decorView.findViewById(R.id.content);
    }

    static boolean checkShowingFlags(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    private void cleanupTabs() {
        if (this.mSelectedTab != null) {
            selectTab(null);
        }
        this.mTabs.clear();
        ScrollingTabContainerView scrollingTabContainerView = this.mTabScrollView;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.removeAllTabs();
        }
        this.mSavedTabPosition = -1;
    }

    private void configureTab(ActionBar.Tab tab, int i) {
        TabImpl tabImpl = (TabImpl) tab;
        if (tabImpl.getCallback() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        tabImpl.setPosition(i);
        this.mTabs.add(i, tabImpl);
        int size = this.mTabs.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.mTabs.get(i).setPosition(i);
            }
        }
    }

    private void ensureTabsExist() {
        if (this.mTabScrollView != null) {
            return;
        }
        ScrollingTabContainerView scrollingTabContainerView = new ScrollingTabContainerView(this.mContext);
        if (this.mHasEmbeddedTabs) {
            scrollingTabContainerView.setVisibility(0);
            this.mDecorToolbar.setEmbeddedTabView(scrollingTabContainerView);
        } else {
            if (getNavigationMode() == 2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.mOverlayLayout;
                if (actionBarOverlayLayout != null) {
                    int[] iArr = cww.a;
                    cwk.e(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
            this.mContainerView.setTabContainer(scrollingTabContainerView);
        }
        this.mTabScrollView = scrollingTabContainerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DecorToolbar getDecorToolbar(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void hideForActionMode() {
        if (this.mShowingForMode) {
            this.mShowingForMode = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.mOverlayLayout;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            updateVisibility(false);
        }
    }

    private void init(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.google.android.videos.R.id.decor_content_parent);
        this.mOverlayLayout = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.mDecorToolbar = getDecorToolbar(view.findViewById(com.google.android.videos.R.id.action_bar));
        this.mContextView = (ActionBarContextView) view.findViewById(com.google.android.videos.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.google.android.videos.R.id.action_bar_container);
        this.mContainerView = actionBarContainer;
        DecorToolbar decorToolbar = this.mDecorToolbar;
        if (decorToolbar == null || this.mContextView == null || actionBarContainer == null) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        this.mContext = decorToolbar.getContext();
        boolean z = (this.mDecorToolbar.getDisplayOptions() & 4) != 0;
        if (z) {
            this.mDisplayHomeAsUpSet = true;
        }
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(this.mContext);
        setHomeButtonEnabled(actionBarPolicy.enableHomeButtonByDefault() || z);
        setHasEmbeddedTabs(actionBarPolicy.hasEmbeddedTabs());
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(null, android.support.v7.appcompat.R.styleable.ActionBar, com.google.android.videos.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setHasEmbeddedTabs(boolean z) {
        this.mHasEmbeddedTabs = z;
        if (z) {
            this.mContainerView.setTabContainer(null);
            this.mDecorToolbar.setEmbeddedTabView(this.mTabScrollView);
        } else {
            this.mDecorToolbar.setEmbeddedTabView(null);
            this.mContainerView.setTabContainer(this.mTabScrollView);
        }
        boolean z2 = getNavigationMode() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.mTabScrollView;
        if (scrollingTabContainerView != null) {
            if (z2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.mOverlayLayout;
                if (actionBarOverlayLayout != null) {
                    int[] iArr = cww.a;
                    cwk.e(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.mDecorToolbar.setCollapsible(!this.mHasEmbeddedTabs && z2);
        this.mOverlayLayout.setHasNonEmbeddedTabs(!this.mHasEmbeddedTabs && z2);
    }

    private boolean shouldAnimateContextView() {
        return this.mContainerView.isLaidOut();
    }

    private void showForActionMode() {
        if (this.mShowingForMode) {
            return;
        }
        this.mShowingForMode = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.mOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        updateVisibility(false);
    }

    private void updateVisibility(boolean z) {
        if (checkShowingFlags(this.mHiddenByApp, this.mHiddenBySystem, this.mShowingForMode)) {
            if (this.mNowShowing) {
                return;
            }
            this.mNowShowing = true;
            doShow(z);
            return;
        }
        if (this.mNowShowing) {
            this.mNowShowing = false;
            doHide(z);
        }
    }

    @Override // android.support.v7.app.ActionBar
    public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onMenuVisibilityListener) {
        this.mMenuVisibilityListeners.add(onMenuVisibilityListener);
    }

    @Override // android.support.v7.app.ActionBar
    public void addTab(ActionBar.Tab tab) {
        addTab(tab, this.mTabs.isEmpty());
    }

    public void animateToMode(boolean z) {
        cxe cxeVar;
        cxe cxeVar2;
        if (z) {
            showForActionMode();
        } else {
            hideForActionMode();
        }
        if (!shouldAnimateContextView()) {
            if (z) {
                this.mDecorToolbar.setVisibility(4);
                this.mContextView.setVisibility(0);
                return;
            } else {
                this.mDecorToolbar.setVisibility(0);
                this.mContextView.setVisibility(8);
                return;
            }
        }
        if (z) {
            cxeVar2 = this.mDecorToolbar.setupAnimatorToVisibility(4, FADE_OUT_DURATION_MS);
            cxeVar = this.mContextView.setupAnimatorToVisibility(0, FADE_IN_DURATION_MS);
        } else {
            cxeVar = this.mDecorToolbar.setupAnimatorToVisibility(0, FADE_IN_DURATION_MS);
            cxeVar2 = this.mContextView.setupAnimatorToVisibility(8, FADE_OUT_DURATION_MS);
        }
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
        viewPropertyAnimatorCompatSet.playSequentially(cxeVar2, cxeVar);
        viewPropertyAnimatorCompatSet.start();
    }

    @Override // android.support.v7.app.ActionBar
    public boolean collapseActionView() {
        DecorToolbar decorToolbar = this.mDecorToolbar;
        if (decorToolbar == null || !decorToolbar.hasExpandedActionView()) {
            return false;
        }
        this.mDecorToolbar.collapseActionView();
        return true;
    }

    public void completeDeferredDestroyActionMode() {
        ActionMode.Callback callback = this.mDeferredModeDestroyCallback;
        if (callback != null) {
            callback.onDestroyActionMode(this.mDeferredDestroyActionMode);
            this.mDeferredDestroyActionMode = null;
            this.mDeferredModeDestroyCallback = null;
        }
    }

    @Override // android.support.v7.app.ActionBar
    public void dispatchMenuVisibilityChanged(boolean z) {
        if (z == this.mLastMenuVisibility) {
            return;
        }
        this.mLastMenuVisibility = z;
        int size = this.mMenuVisibilityListeners.size();
        for (int i = 0; i < size; i++) {
            this.mMenuVisibilityListeners.get(i).onMenuVisibilityChanged(z);
        }
    }

    public void doHide(boolean z) {
        View view;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.mCurrentShowAnim;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.cancel();
        }
        if (this.mCurWindowVisibility == 0) {
            if (!this.mShowHideAnimationEnabled) {
                if (z) {
                    z = true;
                }
            }
            this.mContainerView.setAlpha(1.0f);
            this.mContainerView.setTransitioning(true);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
            float f = -this.mContainerView.getHeight();
            if (z) {
                this.mContainerView.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            cxe cxeVarD = cww.d(this.mContainerView);
            cxeVarD.g(f);
            cxeVarD.f(this.mUpdateListener);
            viewPropertyAnimatorCompatSet2.play(cxeVarD);
            if (this.mContentAnimations && (view = this.mContentView) != null) {
                cxe cxeVarD2 = cww.d(view);
                cxeVarD2.g(f);
                viewPropertyAnimatorCompatSet2.play(cxeVarD2);
            }
            viewPropertyAnimatorCompatSet2.setInterpolator(sHideInterpolator);
            viewPropertyAnimatorCompatSet2.setDuration(250L);
            viewPropertyAnimatorCompatSet2.setListener(this.mHideListener);
            this.mCurrentShowAnim = viewPropertyAnimatorCompatSet2;
            viewPropertyAnimatorCompatSet2.start();
            return;
        }
        this.mHideListener.onAnimationEnd(null);
    }

    public void doShow(boolean z) {
        View view;
        View view2;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.mCurrentShowAnim;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.cancel();
        }
        this.mContainerView.setVisibility(0);
        if (this.mCurWindowVisibility != 0) {
            this.mContainerView.setAlpha(1.0f);
            this.mContainerView.setTranslationY(0.0f);
            if (this.mContentAnimations && (view = this.mContentView) != null) {
                view.setTranslationY(0.0f);
            }
            this.mShowListener.onAnimationEnd(null);
        } else {
            if (!this.mShowHideAnimationEnabled) {
                if (z) {
                    z = true;
                }
                this.mContainerView.setAlpha(1.0f);
                this.mContainerView.setTranslationY(0.0f);
                if (this.mContentAnimations) {
                    view.setTranslationY(0.0f);
                }
                this.mShowListener.onAnimationEnd(null);
            }
            this.mContainerView.setTranslationY(0.0f);
            float f = -this.mContainerView.getHeight();
            if (z) {
                this.mContainerView.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.mContainerView.setTranslationY(f);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
            cxe cxeVarD = cww.d(this.mContainerView);
            cxeVarD.g(0.0f);
            cxeVarD.f(this.mUpdateListener);
            viewPropertyAnimatorCompatSet2.play(cxeVarD);
            if (this.mContentAnimations && (view2 = this.mContentView) != null) {
                view2.setTranslationY(f);
                cxe cxeVarD2 = cww.d(this.mContentView);
                cxeVarD2.g(0.0f);
                viewPropertyAnimatorCompatSet2.play(cxeVarD2);
            }
            viewPropertyAnimatorCompatSet2.setInterpolator(sShowInterpolator);
            viewPropertyAnimatorCompatSet2.setDuration(250L);
            viewPropertyAnimatorCompatSet2.setListener(this.mShowListener);
            this.mCurrentShowAnim = viewPropertyAnimatorCompatSet2;
            viewPropertyAnimatorCompatSet2.start();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.mOverlayLayout;
        if (actionBarOverlayLayout != null) {
            int[] iArr = cww.a;
            cwk.e(actionBarOverlayLayout);
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void enableContentAnimations(boolean z) {
        this.mContentAnimations = z;
    }

    @Override // android.support.v7.app.ActionBar
    public View getCustomView() {
        return this.mDecorToolbar.getCustomView();
    }

    @Override // android.support.v7.app.ActionBar
    public int getDisplayOptions() {
        return this.mDecorToolbar.getDisplayOptions();
    }

    @Override // android.support.v7.app.ActionBar
    public float getElevation() {
        ActionBarContainer actionBarContainer = this.mContainerView;
        int[] iArr = cww.a;
        return cwm.a(actionBarContainer);
    }

    @Override // android.support.v7.app.ActionBar
    public int getHeight() {
        return this.mContainerView.getHeight();
    }

    @Override // android.support.v7.app.ActionBar
    public int getHideOffset() {
        return this.mOverlayLayout.getActionBarHideOffset();
    }

    @Override // android.support.v7.app.ActionBar
    public int getNavigationItemCount() {
        int navigationMode = this.mDecorToolbar.getNavigationMode();
        if (navigationMode == 1) {
            return this.mDecorToolbar.getDropdownItemCount();
        }
        if (navigationMode != 2) {
            return 0;
        }
        return this.mTabs.size();
    }

    @Override // android.support.v7.app.ActionBar
    public int getNavigationMode() {
        return this.mDecorToolbar.getNavigationMode();
    }

    @Override // android.support.v7.app.ActionBar
    public int getSelectedNavigationIndex() {
        TabImpl tabImpl;
        int navigationMode = this.mDecorToolbar.getNavigationMode();
        if (navigationMode == 1) {
            return this.mDecorToolbar.getDropdownSelectedPosition();
        }
        if (navigationMode == 2 && (tabImpl = this.mSelectedTab) != null) {
            return tabImpl.getPosition();
        }
        return -1;
    }

    @Override // android.support.v7.app.ActionBar
    public ActionBar.Tab getSelectedTab() {
        return this.mSelectedTab;
    }

    @Override // android.support.v7.app.ActionBar
    public CharSequence getSubtitle() {
        return this.mDecorToolbar.getSubtitle();
    }

    @Override // android.support.v7.app.ActionBar
    public ActionBar.Tab getTabAt(int i) {
        return this.mTabs.get(i);
    }

    @Override // android.support.v7.app.ActionBar
    public int getTabCount() {
        return this.mTabs.size();
    }

    @Override // android.support.v7.app.ActionBar
    public Context getThemedContext() {
        if (this.mThemedContext == null) {
            TypedValue typedValue = new TypedValue();
            this.mContext.getTheme().resolveAttribute(com.google.android.videos.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.mThemedContext = new ContextThemeWrapper(this.mContext, i);
            } else {
                this.mThemedContext = this.mContext;
            }
        }
        return this.mThemedContext;
    }

    @Override // android.support.v7.app.ActionBar
    public CharSequence getTitle() {
        return this.mDecorToolbar.getTitle();
    }

    public boolean hasIcon() {
        return this.mDecorToolbar.hasIcon();
    }

    public boolean hasLogo() {
        return this.mDecorToolbar.hasLogo();
    }

    @Override // android.support.v7.app.ActionBar
    public void hide() {
        if (this.mHiddenByApp) {
            return;
        }
        this.mHiddenByApp = true;
        updateVisibility(false);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void hideForSystem() {
        if (this.mHiddenBySystem) {
            return;
        }
        this.mHiddenBySystem = true;
        updateVisibility(true);
    }

    @Override // android.support.v7.app.ActionBar
    public boolean isHideOnContentScrollEnabled() {
        return this.mOverlayLayout.isHideOnContentScrollEnabled();
    }

    @Override // android.support.v7.app.ActionBar
    public boolean isShowing() {
        int height = getHeight();
        if (this.mNowShowing) {
            return height == 0 || getHideOffset() < height;
        }
        return false;
    }

    @Override // android.support.v7.app.ActionBar
    public boolean isTitleTruncated() {
        DecorToolbar decorToolbar = this.mDecorToolbar;
        return decorToolbar != null && decorToolbar.isTitleTruncated();
    }

    @Override // android.support.v7.app.ActionBar
    public ActionBar.Tab newTab() {
        return new TabImpl();
    }

    @Override // android.support.v7.app.ActionBar
    public void onConfigurationChanged(Configuration configuration) {
        setHasEmbeddedTabs(ActionBarPolicy.get(this.mContext).hasEmbeddedTabs());
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStarted() {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.mCurrentShowAnim;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.cancel();
            this.mCurrentShowAnim = null;
        }
    }

    @Override // android.support.v7.app.ActionBar
    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        Menu menu;
        ActionModeImpl actionModeImpl = this.mActionMode;
        if (actionModeImpl == null || (menu = actionModeImpl.getMenu()) == null) {
            return false;
        }
        menu.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menu.performShortcut(i, keyEvent, 0);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onWindowVisibilityChanged(int i) {
        this.mCurWindowVisibility = i;
    }

    @Override // android.support.v7.app.ActionBar
    public void removeAllTabs() {
        cleanupTabs();
    }

    @Override // android.support.v7.app.ActionBar
    public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onMenuVisibilityListener) {
        this.mMenuVisibilityListeners.remove(onMenuVisibilityListener);
    }

    @Override // android.support.v7.app.ActionBar
    public void removeTab(ActionBar.Tab tab) {
        removeTabAt(tab.getPosition());
    }

    @Override // android.support.v7.app.ActionBar
    public void removeTabAt(int i) {
        if (this.mTabScrollView == null) {
            return;
        }
        TabImpl tabImpl = this.mSelectedTab;
        int position = tabImpl != null ? tabImpl.getPosition() : this.mSavedTabPosition;
        this.mTabScrollView.removeTabAt(i);
        TabImpl tabImplRemove = this.mTabs.remove(i);
        if (tabImplRemove != null) {
            tabImplRemove.setPosition(-1);
        }
        int size = this.mTabs.size();
        for (int i2 = i; i2 < size; i2++) {
            this.mTabs.get(i2).setPosition(i2);
        }
        if (position == i) {
            selectTab(this.mTabs.isEmpty() ? null : this.mTabs.get(Math.max(0, i - 1)));
        }
    }

    @Override // android.support.v7.app.ActionBar
    public boolean requestFocus() {
        ViewGroup viewGroup = this.mDecorToolbar.getViewGroup();
        if (viewGroup == null || viewGroup.hasFocus()) {
            return false;
        }
        viewGroup.requestFocus();
        return true;
    }

    @Override // android.support.v7.app.ActionBar
    public void selectTab(ActionBar.Tab tab) {
        at atVar;
        if (getNavigationMode() != 2) {
            this.mSavedTabPosition = tab != null ? tab.getPosition() : -1;
            return;
        }
        if (!(this.mActivity instanceof by) || this.mDecorToolbar.getViewGroup().isInEditMode()) {
            atVar = null;
        } else {
            atVar = new at(((by) this.mActivity).getSupportFragmentManager());
            atVar.t();
        }
        TabImpl tabImpl = this.mSelectedTab;
        if (tabImpl != tab) {
            ScrollingTabContainerView scrollingTabContainerView = this.mTabScrollView;
            if (tab != null) {
                position = tab.getPosition();
            } else {
                tab = null;
            }
            scrollingTabContainerView.setTabSelected(position);
            TabImpl tabImpl2 = this.mSelectedTab;
            if (tabImpl2 != null) {
                tabImpl2.getCallback().onTabUnselected(this.mSelectedTab, atVar);
            }
            TabImpl tabImpl3 = (TabImpl) tab;
            this.mSelectedTab = tabImpl3;
            if (tabImpl3 != null) {
                tabImpl3.getCallback().onTabSelected(this.mSelectedTab, atVar);
            }
        } else if (tabImpl != null) {
            tabImpl.getCallback().onTabReselected(this.mSelectedTab, atVar);
            this.mTabScrollView.animateToTab(tab.getPosition());
        }
        if (atVar == null || atVar.k()) {
            return;
        }
        atVar.a();
    }

    @Override // android.support.v7.app.ActionBar
    public void setBackgroundDrawable(Drawable drawable) {
        this.mContainerView.setPrimaryBackground(drawable);
    }

    @Override // android.support.v7.app.ActionBar
    public void setCustomView(int i) {
        setCustomView(LayoutInflater.from(getThemedContext()).inflate(i, this.mDecorToolbar.getViewGroup(), false));
    }

    @Override // android.support.v7.app.ActionBar
    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
        if (this.mDisplayHomeAsUpSet) {
            return;
        }
        setDisplayHomeAsUpEnabled(z);
    }

    @Override // android.support.v7.app.ActionBar
    public void setDisplayHomeAsUpEnabled(boolean z) {
        setDisplayOptions(true != z ? 0 : 4, 4);
    }

    @Override // android.support.v7.app.ActionBar
    public void setDisplayOptions(int i) {
        if ((i & 4) != 0) {
            this.mDisplayHomeAsUpSet = true;
        }
        this.mDecorToolbar.setDisplayOptions(i);
    }

    @Override // android.support.v7.app.ActionBar
    public void setDisplayShowCustomEnabled(boolean z) {
        setDisplayOptions(true != z ? 0 : 16, 16);
    }

    @Override // android.support.v7.app.ActionBar
    public void setDisplayShowHomeEnabled(boolean z) {
        setDisplayOptions(true != z ? 0 : 2, 2);
    }

    @Override // android.support.v7.app.ActionBar
    public void setDisplayShowTitleEnabled(boolean z) {
        setDisplayOptions(true != z ? 0 : 8, 8);
    }

    @Override // android.support.v7.app.ActionBar
    public void setDisplayUseLogoEnabled(boolean z) {
        setDisplayOptions(z ? 1 : 0, 1);
    }

    @Override // android.support.v7.app.ActionBar
    public void setElevation(float f) {
        ActionBarContainer actionBarContainer = this.mContainerView;
        int[] iArr = cww.a;
        cwm.j(actionBarContainer, f);
    }

    @Override // android.support.v7.app.ActionBar
    public void setHideOffset(int i) {
        if (i != 0 && !this.mOverlayLayout.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.mOverlayLayout.setActionBarHideOffset(i);
    }

    @Override // android.support.v7.app.ActionBar
    public void setHideOnContentScrollEnabled(boolean z) {
        if (z && !this.mOverlayLayout.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.mHideOnContentScroll = z;
        this.mOverlayLayout.setHideOnContentScrollEnabled(z);
    }

    @Override // android.support.v7.app.ActionBar
    public void setHomeActionContentDescription(int i) {
        this.mDecorToolbar.setNavigationContentDescription(i);
    }

    @Override // android.support.v7.app.ActionBar
    public void setHomeAsUpIndicator(int i) {
        this.mDecorToolbar.setNavigationIcon(i);
    }

    @Override // android.support.v7.app.ActionBar
    public void setHomeButtonEnabled(boolean z) {
        this.mDecorToolbar.setHomeButtonEnabled(z);
    }

    @Override // android.support.v7.app.ActionBar
    public void setIcon(int i) {
        this.mDecorToolbar.setIcon(i);
    }

    @Override // android.support.v7.app.ActionBar
    public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, ActionBar.OnNavigationListener onNavigationListener) {
        this.mDecorToolbar.setDropdownParams(spinnerAdapter, new NavItemSelectedListener(onNavigationListener));
    }

    @Override // android.support.v7.app.ActionBar
    public void setLogo(int i) {
        this.mDecorToolbar.setLogo(i);
    }

    @Override // android.support.v7.app.ActionBar
    public void setNavigationMode(int i) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int navigationMode = this.mDecorToolbar.getNavigationMode();
        if (navigationMode == 2) {
            this.mSavedTabPosition = getSelectedNavigationIndex();
            selectTab(null);
            this.mTabScrollView.setVisibility(8);
        }
        if (navigationMode != i && !this.mHasEmbeddedTabs && (actionBarOverlayLayout = this.mOverlayLayout) != null) {
            int[] iArr = cww.a;
            cwk.e(actionBarOverlayLayout);
        }
        this.mDecorToolbar.setNavigationMode(i);
        boolean z = false;
        if (i == 2) {
            ensureTabsExist();
            this.mTabScrollView.setVisibility(0);
            int i2 = this.mSavedTabPosition;
            if (i2 != -1) {
                setSelectedNavigationItem(i2);
                this.mSavedTabPosition = -1;
            }
        }
        this.mDecorToolbar.setCollapsible(i == 2 && !this.mHasEmbeddedTabs);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.mOverlayLayout;
        if (i == 2 && !this.mHasEmbeddedTabs) {
            z = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z);
    }

    @Override // android.support.v7.app.ActionBar
    public void setSelectedNavigationItem(int i) {
        int navigationMode = this.mDecorToolbar.getNavigationMode();
        if (navigationMode == 1) {
            this.mDecorToolbar.setDropdownSelectedPosition(i);
        } else {
            if (navigationMode != 2) {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
            selectTab(this.mTabs.get(i));
        }
    }

    @Override // android.support.v7.app.ActionBar
    public void setShowHideAnimationEnabled(boolean z) {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet;
        this.mShowHideAnimationEnabled = z;
        if (z || (viewPropertyAnimatorCompatSet = this.mCurrentShowAnim) == null) {
            return;
        }
        viewPropertyAnimatorCompatSet.cancel();
    }

    @Override // android.support.v7.app.ActionBar
    public void setStackedBackgroundDrawable(Drawable drawable) {
        this.mContainerView.setStackedBackground(drawable);
    }

    @Override // android.support.v7.app.ActionBar
    public void setSubtitle(int i) {
        setSubtitle(this.mContext.getString(i));
    }

    @Override // android.support.v7.app.ActionBar
    public void setTitle(int i) {
        setTitle(this.mContext.getString(i));
    }

    @Override // android.support.v7.app.ActionBar
    public void setWindowTitle(CharSequence charSequence) {
        this.mDecorToolbar.setWindowTitle(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public void show() {
        if (this.mHiddenByApp) {
            this.mHiddenByApp = false;
            updateVisibility(false);
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void showForSystem() {
        if (this.mHiddenBySystem) {
            this.mHiddenBySystem = false;
            updateVisibility(true);
        }
    }

    @Override // android.support.v7.app.ActionBar
    public ActionMode startActionMode(ActionMode.Callback callback) {
        ActionModeImpl actionModeImpl = this.mActionMode;
        if (actionModeImpl != null) {
            actionModeImpl.finish();
        }
        this.mOverlayLayout.setHideOnContentScrollEnabled(false);
        this.mContextView.killMode();
        ActionModeImpl actionModeImpl2 = new ActionModeImpl(this.mContextView.getContext(), callback);
        if (!actionModeImpl2.dispatchOnCreate()) {
            return null;
        }
        this.mActionMode = actionModeImpl2;
        actionModeImpl2.invalidate();
        this.mContextView.initForMode(actionModeImpl2);
        animateToMode(true);
        return actionModeImpl2;
    }

    @Override // android.support.v7.app.ActionBar
    public void addTab(ActionBar.Tab tab, int i) {
        addTab(tab, i, this.mTabs.isEmpty());
    }

    @Override // android.support.v7.app.ActionBar
    public void setDisplayOptions(int i, int i2) {
        int displayOptions = this.mDecorToolbar.getDisplayOptions();
        if ((i2 & 4) != 0) {
            this.mDisplayHomeAsUpSet = true;
        }
        this.mDecorToolbar.setDisplayOptions((i & i2) | ((~i2) & displayOptions));
    }

    @Override // android.support.v7.app.ActionBar
    public void setHomeActionContentDescription(CharSequence charSequence) {
        this.mDecorToolbar.setNavigationContentDescription(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public void setHomeAsUpIndicator(Drawable drawable) {
        this.mDecorToolbar.setNavigationIcon(drawable);
    }

    @Override // android.support.v7.app.ActionBar
    public void setIcon(Drawable drawable) {
        this.mDecorToolbar.setIcon(drawable);
    }

    @Override // android.support.v7.app.ActionBar
    public void setLogo(Drawable drawable) {
        this.mDecorToolbar.setLogo(drawable);
    }

    @Override // android.support.v7.app.ActionBar
    public void setSubtitle(CharSequence charSequence) {
        this.mDecorToolbar.setSubtitle(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public void setTitle(CharSequence charSequence) {
        this.mDecorToolbar.setTitle(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public void addTab(ActionBar.Tab tab, int i, boolean z) {
        ensureTabsExist();
        this.mTabScrollView.addTab(tab, i, z);
        configureTab(tab, i);
        if (z) {
            selectTab(tab);
        }
    }

    @Override // android.support.v7.app.ActionBar
    public void setCustomView(View view) {
        this.mDecorToolbar.setCustomView(view);
    }

    @Override // android.support.v7.app.ActionBar
    public void setCustomView(View view, ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.mDecorToolbar.setCustomView(view);
    }

    public WindowDecorActionBar(Dialog dialog) {
        init(dialog.getWindow().getDecorView());
    }

    @Override // android.support.v7.app.ActionBar
    public void addTab(ActionBar.Tab tab, boolean z) {
        ensureTabsExist();
        this.mTabScrollView.addTab(tab, z);
        configureTab(tab, this.mTabs.size());
        if (z) {
            selectTab(tab);
        }
    }

    public WindowDecorActionBar(View view) {
        init(view);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStopped() {
    }

    @Override // android.support.v7.app.ActionBar
    public void setSplitBackgroundDrawable(Drawable drawable) {
    }
}
