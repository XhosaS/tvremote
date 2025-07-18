package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.ActionMode;
import android.support.v7.view.StandaloneActionMode;
import android.support.v7.view.SupportActionModeWrapper;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.WindowCallbackWrapper;
import android.support.v7.view.menu.ListMenuPresenter;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.DecorContentParent;
import android.support.v7.widget.FitWindowsViewGroup;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.TintTypedArray;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.ViewUtils;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.crh;
import defpackage.csn;
import defpackage.csr;
import defpackage.ctn;
import defpackage.cvc;
import defpackage.cvq;
import defpackage.cwk;
import defpackage.cwm;
import defpackage.cww;
import defpackage.cxe;
import defpackage.cxg;
import defpackage.cxr;
import defpackage.cxs;
import defpackage.cxt;
import defpackage.cxu;
import defpackage.cxv;
import defpackage.cxw;
import defpackage.cyh;
import defpackage.dvd;
import defpackage.dvk;
import defpackage.ez;
import defpackage.fb;
import defpackage.fm$$ExternalSyntheticApiModelOutline0;
import defpackage.hc;
import defpackage.ko;
import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
class AppCompatDelegateImpl extends AppCompatDelegate implements LayoutInflater.Factory2, ez {
    static final String EXCEPTION_HANDLER_MESSAGE_SUFFIX = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    private static boolean sInstalledExceptionHandler;
    ActionBar mActionBar;
    private ActionMenuPresenterCallback mActionMenuPresenterCallback;
    ActionMode mActionMode;
    PopupWindow mActionModePopup;
    ActionBarContextView mActionModeView;
    private int mActivityHandlesConfigFlags;
    private boolean mActivityHandlesConfigFlagsChecked;
    final AppCompatCallback mAppCompatCallback;
    private AppCompatViewInflater mAppCompatViewInflater;
    private AppCompatWindowCallback mAppCompatWindowCallback;
    private AutoNightModeManager mAutoBatteryNightModeManager;
    private AutoNightModeManager mAutoTimeNightModeManager;
    private OnBackInvokedCallback mBackCallback;
    private boolean mBaseContextAttached;
    private boolean mClosingActionMenu;
    final Context mContext;
    private boolean mCreated;
    private DecorContentParent mDecorContentParent;
    boolean mDestroyed;
    private OnBackInvokedDispatcher mDispatcher;
    private Configuration mEffectiveConfiguration;
    private boolean mEnableDefaultActionBarUp;
    cxe mFadeAnim;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private boolean mHandleNativeActionModes;
    boolean mHasActionBar;
    final Object mHost;
    int mInvalidatePanelMenuFeatures;
    boolean mInvalidatePanelMenuPosted;
    private final Runnable mInvalidatePanelMenuRunnable;
    boolean mIsFloating;
    private LayoutIncludeDetector mLayoutIncludeDetector;
    private int mLocalNightMode;
    private boolean mLongPressBackDown;
    MenuInflater mMenuInflater;
    boolean mOverlayActionBar;
    boolean mOverlayActionMode;
    private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private PanelFeatureState[] mPanels;
    private PanelFeatureState mPreparedPanel;
    Runnable mShowActionModePopup;
    ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private Rect mTempRect1;
    private Rect mTempRect2;
    private int mThemeResId;
    private CharSequence mTitle;
    private TextView mTitleView;
    Window mWindow;
    boolean mWindowNoTitle;
    private static final ko<String, Integer> sLocalNightModes = new ko<>();
    private static final boolean IS_PRE_LOLLIPOP = false;
    private static final int[] sWindowBackgroundStyleable = {R.attr.windowBackground};
    private static final boolean sCanReturnDifferentContext = !"robolectric".equals(Build.FINGERPRINT);

    /* compiled from: PG */
    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$1, reason: invalid class name */
    class AnonymousClass1 implements Thread.UncaughtExceptionHandler {
        final /* synthetic */ Thread.UncaughtExceptionHandler val$defHandler;

        public AnonymousClass1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.val$defHandler = uncaughtExceptionHandler;
        }

        private boolean shouldWrapException(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!shouldWrapException(th)) {
                this.val$defHandler.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(String.valueOf(th.getMessage()).concat(AppCompatDelegateImpl.EXCEPTION_HANDLER_MESSAGE_SUFFIX));
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.val$defHandler.uncaughtException(thread, notFoundException);
        }
    }

    /* compiled from: PG */
    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$4, reason: invalid class name */
    class AnonymousClass4 implements FitWindowsViewGroup.OnFitSystemWindowsListener {
        AnonymousClass4() {
        }

        @Override // android.support.v7.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
        public void onFitSystemWindows(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.updateActionModeInsets(null, rect);
        }
    }

    /* compiled from: PG */
    class ActionBarDrawableToggleImpl implements ActionBarDrawerToggle.Delegate {
        public ActionBarDrawableToggleImpl() {
        }

        @Override // android.support.v7.app.ActionBarDrawerToggle.Delegate
        public Context getActionBarThemedContext() {
            return AppCompatDelegateImpl.this.getActionBarThemedContext();
        }

        @Override // android.support.v7.app.ActionBarDrawerToggle.Delegate
        public Drawable getThemeUpIndicator() {
            TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getActionBarThemedContext(), (AttributeSet) null, new int[]{com.google.android.videos.R.attr.homeAsUpIndicator});
            Drawable drawable = tintTypedArrayObtainStyledAttributes.getDrawable(0);
            tintTypedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // android.support.v7.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            ActionBar supportActionBar = AppCompatDelegateImpl.this.getSupportActionBar();
            return (supportActionBar == null || (supportActionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // android.support.v7.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            ActionBar supportActionBar = AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeActionContentDescription(i);
            }
        }

        @Override // android.support.v7.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(Drawable drawable, int i) {
            ActionBar supportActionBar = AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeAsUpIndicator(drawable);
                supportActionBar.setHomeActionContentDescription(i);
            }
        }
    }

    /* compiled from: PG */
    interface ActionBarMenuCallback {
        View onCreatePanelView(int i);

        boolean onPreparePanel(int i);
    }

    /* compiled from: PG */
    final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        public ActionMenuPresenterCallback() {
        }

        @Override // android.support.v7.view.menu.MenuPresenter.Callback
        public void onCloseMenu(fb fbVar, boolean z) {
            AppCompatDelegateImpl.this.checkCloseActionMenu(fbVar);
        }

        @Override // android.support.v7.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(fb fbVar) {
            Window.Callback windowCallback = AppCompatDelegateImpl.this.getWindowCallback();
            if (windowCallback == null) {
                return true;
            }
            windowCallback.onMenuOpened(108, fbVar);
            return true;
        }
    }

    /* compiled from: PG */
    class ActionModeCallbackWrapperV9 implements ActionMode.Callback {
        private ActionMode.Callback mWrapped;

        public ActionModeCallbackWrapperV9(ActionMode.Callback callback) {
            this.mWrapped = callback;
        }

        @Override // android.support.v7.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.mWrapped.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.support.v7.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.mWrapped.onCreateActionMode(actionMode, menu);
        }

        @Override // android.support.v7.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.mWrapped.onDestroyActionMode(actionMode);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.mActionModePopup != null) {
                appCompatDelegateImpl.mWindow.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.mShowActionModePopup);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.mActionModeView != null) {
                appCompatDelegateImpl2.endOnGoingFadeAnimation();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                cxe cxeVarD = cww.d(appCompatDelegateImpl3.mActionModeView);
                cxeVarD.c(0.0f);
                appCompatDelegateImpl3.mFadeAnim = cxeVarD;
                AppCompatDelegateImpl.this.mFadeAnim.e(new cxg() { // from class: android.support.v7.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9.1
                    @Override // defpackage.cxg, defpackage.cxf
                    public void onAnimationEnd(View view) {
                        AppCompatDelegateImpl.this.mActionModeView.setVisibility(8);
                        AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
                        PopupWindow popupWindow = appCompatDelegateImpl4.mActionModePopup;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        } else if (appCompatDelegateImpl4.mActionModeView.getParent() instanceof View) {
                            View view2 = (View) AppCompatDelegateImpl.this.mActionModeView.getParent();
                            int[] iArr = cww.a;
                            cwk.e(view2);
                        }
                        AppCompatDelegateImpl.this.mActionModeView.killMode();
                        AppCompatDelegateImpl.this.mFadeAnim.e(null);
                        AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
                        appCompatDelegateImpl5.mFadeAnim = null;
                        ViewGroup viewGroup = appCompatDelegateImpl5.mSubDecor;
                        int[] iArr2 = cww.a;
                        cwk.e(viewGroup);
                    }
                });
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            AppCompatCallback appCompatCallback = appCompatDelegateImpl4.mAppCompatCallback;
            if (appCompatCallback != null) {
                appCompatCallback.onSupportActionModeFinished(appCompatDelegateImpl4.mActionMode);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.mActionMode = null;
            ViewGroup viewGroup = appCompatDelegateImpl5.mSubDecor;
            int[] iArr = cww.a;
            cwk.e(viewGroup);
            AppCompatDelegateImpl.this.updateBackInvokedCallbackState();
        }

        @Override // android.support.v7.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            ViewGroup viewGroup = AppCompatDelegateImpl.this.mSubDecor;
            int[] iArr = cww.a;
            cwk.e(viewGroup);
            return this.mWrapped.onPrepareActionMode(actionMode, menu);
        }
    }

    /* compiled from: PG */
    class Api21Impl {
        private Api21Impl() {
        }

        static boolean isPowerSaveMode(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String toLanguageTag(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* compiled from: PG */
    class Api24Impl {
        private Api24Impl() {
        }

        static void generateConfigDelta_locale(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static ctn getLocales(Configuration configuration) {
            return ctn.c(configuration.getLocales().toLanguageTags());
        }

        public static void setDefaultLocales(ctn ctnVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(ctnVar.e()));
        }

        static void setLocales(Configuration configuration, ctn ctnVar) {
            configuration.setLocales(LocaleList.forLanguageTags(ctnVar.e()));
        }
    }

    /* compiled from: PG */
    class Api26Impl {
        private Api26Impl() {
        }

        static void generateConfigDelta_colorMode(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    /* compiled from: PG */
    class Api33Impl {
        private Api33Impl() {
        }

        static OnBackInvokedDispatcher getOnBackInvokedDispatcher(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback registerOnBackPressedCallback(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            appCompatDelegateImpl.getClass();
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: android.support.v7.app.AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticLambda0
                public final void onBackInvoked() {
                    appCompatDelegateImpl.onBackPressed();
                }
            };
            fm$$ExternalSyntheticApiModelOutline0.m405m(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void unregisterOnBackInvokedCallback(Object obj, Object obj2) {
            fm$$ExternalSyntheticApiModelOutline0.m405m(obj).unregisterOnBackInvokedCallback(fm$$ExternalSyntheticApiModelOutline0.m404m(obj2));
        }
    }

    /* compiled from: PG */
    class AppCompatWindowCallback extends WindowCallbackWrapper {
        private ActionBarMenuCallback mActionBarCallback;
        private boolean mDispatchKeyEventBypassEnabled;
        private boolean mOnContentChangedBypassEnabled;
        private boolean mOnPanelClosedBypassEnabled;

        public AppCompatWindowCallback(Window.Callback callback) {
            super(callback);
        }

        public boolean bypassDispatchKeyEvent(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.mDispatchKeyEventBypassEnabled = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.mDispatchKeyEventBypassEnabled = false;
            }
        }

        public void bypassOnContentChanged(Window.Callback callback) {
            try {
                this.mOnContentChangedBypassEnabled = true;
                callback.onContentChanged();
            } finally {
                this.mOnContentChangedBypassEnabled = false;
            }
        }

        public void bypassOnPanelClosed(Window.Callback callback, int i, Menu menu) {
            try {
                this.mOnPanelClosedBypassEnabled = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.mOnPanelClosedBypassEnabled = false;
            }
        }

        @Override // android.support.v7.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.mDispatchKeyEventBypassEnabled ? getWrapped().dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.support.v7.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.onKeyShortcut(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.support.v7.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onContentChanged() {
            if (this.mOnContentChangedBypassEnabled) {
                getWrapped().onContentChanged();
            }
        }

        @Override // android.support.v7.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i == 0) {
                if (!(menu instanceof fb)) {
                    return false;
                }
                i = 0;
            }
            return super.onCreatePanelMenu(i, menu);
        }

        @Override // android.support.v7.view.WindowCallbackWrapper, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View viewOnCreatePanelView;
            ActionBarMenuCallback actionBarMenuCallback = this.mActionBarCallback;
            return (actionBarMenuCallback == null || (viewOnCreatePanelView = actionBarMenuCallback.onCreatePanelView(i)) == null) ? super.onCreatePanelView(i) : viewOnCreatePanelView;
        }

        @Override // android.support.v7.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.onMenuOpened(i);
            return true;
        }

        @Override // android.support.v7.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.mOnPanelClosedBypassEnabled) {
                getWrapped().onPanelClosed(i, menu);
            } else {
                super.onPanelClosed(i, menu);
                AppCompatDelegateImpl.this.onPanelClosed(i);
            }
        }

        @Override // android.support.v7.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            fb fbVar = menu instanceof fb ? (fb) menu : null;
            if (i == 0) {
                if (fbVar == null) {
                    return false;
                }
                i = 0;
            }
            if (fbVar != null) {
                fbVar.k = true;
            }
            ActionBarMenuCallback actionBarMenuCallback = this.mActionBarCallback;
            boolean zOnPreparePanel = actionBarMenuCallback != null && actionBarMenuCallback.onPreparePanel(i);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i, view, menu);
            }
            if (fbVar != null) {
                fbVar.k = false;
            }
            return zOnPreparePanel;
        }

        @Override // android.support.v7.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            fb fbVar;
            PanelFeatureState panelState = AppCompatDelegateImpl.this.getPanelState(0, true);
            if (panelState == null || (fbVar = panelState.menu) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, fbVar, i);
            }
        }

        @Override // android.support.v7.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public void setActionBarCallback(ActionBarMenuCallback actionBarMenuCallback) {
            this.mActionBarCallback = actionBarMenuCallback;
        }

        final android.view.ActionMode startAsSupportActionMode(ActionMode.Callback callback) {
            SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(AppCompatDelegateImpl.this.mContext, callback);
            android.support.v7.view.ActionMode actionModeStartSupportActionMode = AppCompatDelegateImpl.this.startSupportActionMode(callbackWrapper);
            if (actionModeStartSupportActionMode != null) {
                return callbackWrapper.getActionModeWrapper(actionModeStartSupportActionMode);
            }
            return null;
        }

        @Override // android.support.v7.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (AppCompatDelegateImpl.this.isHandleNativeActionModesEnabled() && i == 0) ? startAsSupportActionMode(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    /* compiled from: PG */
    class AutoBatteryNightModeManager extends AutoNightModeManager {
        private final PowerManager mPowerManager;

        public AutoBatteryNightModeManager(Context context) {
            super();
            this.mPowerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // android.support.v7.app.AppCompatDelegateImpl.AutoNightModeManager
        public IntentFilter createIntentFilterForBroadcastReceiver() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // android.support.v7.app.AppCompatDelegateImpl.AutoNightModeManager
        public int getApplyableNightMode() {
            return Api21Impl.isPowerSaveMode(this.mPowerManager) ? 2 : 1;
        }

        @Override // android.support.v7.app.AppCompatDelegateImpl.AutoNightModeManager
        public void onChange() {
            AppCompatDelegateImpl.this.applyDayNight();
        }
    }

    /* compiled from: PG */
    abstract class AutoNightModeManager {
        private BroadcastReceiver mReceiver;

        public AutoNightModeManager() {
        }

        public void cleanup() {
            BroadcastReceiver broadcastReceiver = this.mReceiver;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.mContext.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.mReceiver = null;
            }
        }

        public abstract IntentFilter createIntentFilterForBroadcastReceiver();

        public abstract int getApplyableNightMode();

        boolean isListening() {
            return this.mReceiver != null;
        }

        public abstract void onChange();

        public void setup() {
            cleanup();
            IntentFilter intentFilterCreateIntentFilterForBroadcastReceiver = createIntentFilterForBroadcastReceiver();
            if (intentFilterCreateIntentFilterForBroadcastReceiver == null || intentFilterCreateIntentFilterForBroadcastReceiver.countActions() == 0) {
                return;
            }
            if (this.mReceiver == null) {
                this.mReceiver = new BroadcastReceiver() { // from class: android.support.v7.app.AppCompatDelegateImpl.AutoNightModeManager.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        AutoNightModeManager.this.onChange();
                    }
                };
            }
            AppCompatDelegateImpl.this.mContext.registerReceiver(this.mReceiver, intentFilterCreateIntentFilterForBroadcastReceiver);
        }
    }

    /* compiled from: PG */
    class AutoTimeNightModeManager extends AutoNightModeManager {
        private final TwilightManager mTwilightManager;

        public AutoTimeNightModeManager(TwilightManager twilightManager) {
            super();
            this.mTwilightManager = twilightManager;
        }

        @Override // android.support.v7.app.AppCompatDelegateImpl.AutoNightModeManager
        public IntentFilter createIntentFilterForBroadcastReceiver() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // android.support.v7.app.AppCompatDelegateImpl.AutoNightModeManager
        public int getApplyableNightMode() {
            return this.mTwilightManager.isNight() ? 2 : 1;
        }

        @Override // android.support.v7.app.AppCompatDelegateImpl.AutoNightModeManager
        public void onChange() {
            AppCompatDelegateImpl.this.applyDayNight();
        }
    }

    /* compiled from: PG */
    class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(Context context) {
            super(context);
        }

        private boolean isOutOfBounds(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !isOutOfBounds((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.closePanel(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(AppCompatResources.getDrawable(getContext(), i));
        }
    }

    /* compiled from: PG */
    public final class PanelFeatureState {
        int background;
        View createdPanelView;
        ViewGroup decorView;
        int featureId;
        Bundle frozenActionViewState;
        Bundle frozenMenuState;
        int gravity;
        boolean isHandled;
        boolean isOpen;
        boolean isPrepared;
        ListMenuPresenter listMenuPresenter;
        Context listPresenterContext;
        fb menu;
        public boolean qwertyMode;
        boolean refreshDecorView = false;
        boolean refreshMenuContent;
        View shownPanelView;
        boolean wasLastOpen;
        int windowAnimations;
        int x;
        int y;

        /* compiled from: PG */
        class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.v7.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.1
                @Override // android.os.Parcelable.Creator
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.readFromParcel(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.readFromParcel(parcel, classLoader);
                }
            };
            int featureId;
            boolean isOpen;
            Bundle menuState;

            static SavedState readFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.featureId = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                savedState.isOpen = z;
                if (z) {
                    savedState.menuState = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.featureId);
                parcel.writeInt(this.isOpen ? 1 : 0);
                if (this.isOpen) {
                    parcel.writeBundle(this.menuState);
                }
            }
        }

        public PanelFeatureState(int i) {
            this.featureId = i;
        }

        void applyFrozenState() {
            Bundle bundle;
            fb fbVar = this.menu;
            if (fbVar == null || (bundle = this.frozenMenuState) == null) {
                return;
            }
            fbVar.j(bundle);
            this.frozenMenuState = null;
        }

        public void clearMenuPresenters() {
            fb fbVar = this.menu;
            if (fbVar != null) {
                fbVar.o(this.listMenuPresenter);
            }
            this.listMenuPresenter = null;
        }

        public MenuView getListMenuView(MenuPresenter.Callback callback) {
            if (this.menu == null) {
                return null;
            }
            if (this.listMenuPresenter == null) {
                ListMenuPresenter listMenuPresenter = new ListMenuPresenter(this.listPresenterContext, com.google.android.videos.R.layout.abc_list_menu_item_layout);
                this.listMenuPresenter = listMenuPresenter;
                listMenuPresenter.setCallback(callback);
                this.menu.g(this.listMenuPresenter);
            }
            return this.listMenuPresenter.getMenuView(this.decorView);
        }

        public boolean hasPanelItems() {
            if (this.shownPanelView == null) {
                return false;
            }
            return this.createdPanelView != null || this.listMenuPresenter.getAdapter().getCount() > 0;
        }

        void onRestoreInstanceState(Parcelable parcelable) {
            SavedState savedState = (SavedState) parcelable;
            this.featureId = savedState.featureId;
            this.wasLastOpen = savedState.isOpen;
            this.frozenMenuState = savedState.menuState;
            this.shownPanelView = null;
            this.decorView = null;
        }

        Parcelable onSaveInstanceState() {
            SavedState savedState = new SavedState();
            savedState.featureId = this.featureId;
            savedState.isOpen = this.isOpen;
            if (this.menu != null) {
                savedState.menuState = new Bundle();
                this.menu.k(savedState.menuState);
            }
            return savedState;
        }

        public void setMenu(fb fbVar) {
            ListMenuPresenter listMenuPresenter;
            fb fbVar2 = this.menu;
            if (fbVar == fbVar2) {
                return;
            }
            if (fbVar2 != null) {
                fbVar2.o(this.listMenuPresenter);
            }
            this.menu = fbVar;
            if (fbVar == null || (listMenuPresenter = this.listMenuPresenter) == null) {
                return;
            }
            fbVar.g(listMenuPresenter);
        }

        public void setStyle(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(com.google.android.videos.R.attr.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            themeNewTheme.resolveAttribute(com.google.android.videos.R.attr.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            } else {
                themeNewTheme.applyStyle(2132084433, true);
            }
            hc hcVar = new hc(context, 0);
            hcVar.getTheme().setTo(themeNewTheme);
            this.listPresenterContext = hcVar;
            TypedArray typedArrayObtainStyledAttributes = hcVar.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme);
            this.background = typedArrayObtainStyledAttributes.getResourceId(86, 0);
            this.windowAnimations = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: PG */
    final class PanelMenuPresenterCallback implements MenuPresenter.Callback {
        public PanelMenuPresenterCallback() {
        }

        @Override // android.support.v7.view.menu.MenuPresenter.Callback
        public void onCloseMenu(fb fbVar, boolean z) {
            fb fbVarA = fbVar.a();
            PanelFeatureState panelFeatureStateFindMenuPanel = AppCompatDelegateImpl.this.findMenuPanel(fbVarA != fbVar ? fbVarA : fbVar);
            if (panelFeatureStateFindMenuPanel != null) {
                if (fbVarA == fbVar) {
                    AppCompatDelegateImpl.this.closePanel(panelFeatureStateFindMenuPanel, z);
                } else {
                    AppCompatDelegateImpl.this.callOnPanelClosed(panelFeatureStateFindMenuPanel.featureId, panelFeatureStateFindMenuPanel, fbVarA);
                    AppCompatDelegateImpl.this.closePanel(panelFeatureStateFindMenuPanel, true);
                }
            }
        }

        @Override // android.support.v7.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(fb fbVar) {
            Window.Callback windowCallback;
            if (fbVar != fbVar.a()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.mHasActionBar || (windowCallback = appCompatDelegateImpl.getWindowCallback()) == null || AppCompatDelegateImpl.this.mDestroyed) {
                return true;
            }
            windowCallback.onMenuOpened(108, fbVar);
            return true;
        }
    }

    public AppCompatDelegateImpl(Activity activity, AppCompatCallback appCompatCallback) {
        this(activity, null, appCompatCallback, activity);
    }

    private boolean applyApplicationSpecificConfig(boolean z) {
        return applyApplicationSpecificConfig(z, true);
    }

    private void applyFixedSizeWindow() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.mSubDecor.findViewById(R.id.content);
        View decorView = this.mWindow.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme);
        typedArrayObtainStyledAttributes.getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes.getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes.getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes.getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes.getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void attachToWindow(Window window) {
        if (this.mWindow != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof AppCompatWindowCallback) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        AppCompatWindowCallback appCompatWindowCallback = new AppCompatWindowCallback(callback);
        this.mAppCompatWindowCallback = appCompatWindowCallback;
        window.setCallback(appCompatWindowCallback);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mContext, (AttributeSet) null, sWindowBackgroundStyleable);
        Drawable drawableIfKnown = tintTypedArrayObtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            window.setBackgroundDrawable(drawableIfKnown);
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        this.mWindow = window;
        if (Build.VERSION.SDK_INT < 33 || this.mDispatcher != null) {
            return;
        }
        setOnBackInvokedDispatcher(null);
    }

    private int calculateNightMode() {
        int i = this.mLocalNightMode;
        return i != -100 ? i : getDefaultNightMode();
    }

    private void cleanupAutoManagers() {
        AutoNightModeManager autoNightModeManager = this.mAutoTimeNightModeManager;
        if (autoNightModeManager != null) {
            autoNightModeManager.cleanup();
        }
        AutoNightModeManager autoNightModeManager2 = this.mAutoBatteryNightModeManager;
        if (autoNightModeManager2 != null) {
            autoNightModeManager2.cleanup();
        }
    }

    private Configuration createOverrideAppConfiguration(Context context, int i, ctn ctnVar, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (ctnVar != null) {
            setConfigurationLocales(configuration2, ctnVar);
        }
        return configuration2;
    }

    private ViewGroup createSubDecor() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme);
        if (!typedArrayObtainStyledAttributes.hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowNoTitle, false)) {
            requestWindowFeature(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBar, false)) {
            requestWindowFeature(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            requestWindowFeature(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            requestWindowFeature(10);
        }
        this.mIsFloating = typedArrayObtainStyledAttributes.getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        ensureWindow();
        this.mWindow.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.mContext);
        if (this.mWindowNoTitle) {
            viewGroup = this.mOverlayActionMode ? (ViewGroup) layoutInflaterFrom.inflate(com.google.android.videos.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.google.android.videos.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.mIsFloating) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.google.android.videos.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.mOverlayActionBar = false;
            this.mHasActionBar = false;
        } else if (this.mHasActionBar) {
            TypedValue typedValue = new TypedValue();
            this.mContext.getTheme().resolveAttribute(com.google.android.videos.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new hc(this.mContext, typedValue.resourceId) : this.mContext).inflate(com.google.android.videos.R.layout.abc_screen_toolbar, (ViewGroup) null);
            DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(com.google.android.videos.R.id.decor_content_parent);
            this.mDecorContentParent = decorContentParent;
            decorContentParent.setWindowCallback(getWindowCallback());
            if (this.mOverlayActionBar) {
                this.mDecorContentParent.initFeature(109);
            }
            if (this.mFeatureProgress) {
                this.mDecorContentParent.initFeature(2);
            }
            if (this.mFeatureIndeterminateProgress) {
                this.mDecorContentParent.initFeature(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.mHasActionBar + ", windowActionBarOverlay: " + this.mOverlayActionBar + ", android:windowIsFloating: " + this.mIsFloating + ", windowActionModeOverlay: " + this.mOverlayActionMode + ", windowNoTitle: " + this.mWindowNoTitle + " }");
        }
        cvq cvqVar = new cvq() { // from class: android.support.v7.app.AppCompatDelegateImpl.3
            @Override // defpackage.cvq
            public cyh onApplyWindowInsets(View view, cyh cyhVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                int iD = cyhVar.d();
                int iUpdateActionModeInsets = AppCompatDelegateImpl.this.updateActionModeInsets(cyhVar, null);
                if (iD != iUpdateActionModeInsets) {
                    int iB = cyhVar.b();
                    int iC = cyhVar.c();
                    int iA = cyhVar.a();
                    cxw cxvVar = Build.VERSION.SDK_INT >= 34 ? new cxv(cyhVar) : Build.VERSION.SDK_INT >= 31 ? new cxu(cyhVar) : Build.VERSION.SDK_INT >= 30 ? new cxt(cyhVar) : Build.VERSION.SDK_INT >= 29 ? new cxs(cyhVar) : new cxr(cyhVar);
                    cxvVar.c(csr.e(iB, iUpdateActionModeInsets, iC, iA));
                    cyhVar = cxvVar.a();
                }
                return cww.f(view, cyhVar);
            }
        };
        int[] iArr = cww.a;
        cwm.l(viewGroup, cvqVar);
        if (this.mDecorContentParent == null) {
            this.mTitleView = (TextView) viewGroup.findViewById(com.google.android.videos.R.id.title);
        }
        ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.google.android.videos.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.mWindow.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.mWindow.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ContentFrameLayout.OnAttachListener() { // from class: android.support.v7.app.AppCompatDelegateImpl.5
            @Override // android.support.v7.widget.ContentFrameLayout.OnAttachListener
            public void onDetachedFromWindow() {
                AppCompatDelegateImpl.this.dismissPopups();
            }

            @Override // android.support.v7.widget.ContentFrameLayout.OnAttachListener
            public void onAttachedFromWindow() {
            }
        });
        return viewGroup;
    }

    private void ensureSubDecor() {
        if (this.mSubDecorInstalled) {
            return;
        }
        this.mSubDecor = createSubDecor();
        CharSequence title = getTitle();
        if (!TextUtils.isEmpty(title)) {
            DecorContentParent decorContentParent = this.mDecorContentParent;
            if (decorContentParent != null) {
                decorContentParent.setWindowTitle(title);
            } else if (peekSupportActionBar() != null) {
                peekSupportActionBar().setWindowTitle(title);
            } else {
                TextView textView = this.mTitleView;
                if (textView != null) {
                    textView.setText(title);
                }
            }
        }
        applyFixedSizeWindow();
        onSubDecorInstalled(this.mSubDecor);
        this.mSubDecorInstalled = true;
        PanelFeatureState panelState = getPanelState(0, false);
        if (this.mDestroyed) {
            return;
        }
        if (panelState == null || panelState.menu == null) {
            invalidatePanelMenu(108);
        }
    }

    private void ensureWindow() {
        if (this.mWindow == null) {
            Object obj = this.mHost;
            if (obj instanceof Activity) {
                attachToWindow(((Activity) obj).getWindow());
            }
        }
        if (this.mWindow == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration generateConfigDelta(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            if (configuration.fontScale != configuration2.fontScale) {
                configuration3.fontScale = configuration2.fontScale;
            }
            if (configuration.mcc != configuration2.mcc) {
                configuration3.mcc = configuration2.mcc;
            }
            if (configuration.mnc != configuration2.mnc) {
                configuration3.mnc = configuration2.mnc;
            }
            Api24Impl.generateConfigDelta_locale(configuration, configuration2, configuration3);
            if (configuration.touchscreen != configuration2.touchscreen) {
                configuration3.touchscreen = configuration2.touchscreen;
            }
            if (configuration.keyboard != configuration2.keyboard) {
                configuration3.keyboard = configuration2.keyboard;
            }
            if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                configuration3.keyboardHidden = configuration2.keyboardHidden;
            }
            if (configuration.navigation != configuration2.navigation) {
                configuration3.navigation = configuration2.navigation;
            }
            if (configuration.navigationHidden != configuration2.navigationHidden) {
                configuration3.navigationHidden = configuration2.navigationHidden;
            }
            if (configuration.orientation != configuration2.orientation) {
                configuration3.orientation = configuration2.orientation;
            }
            if ((configuration.screenLayout & 15) != (configuration2.screenLayout & 15)) {
                configuration3.screenLayout |= configuration2.screenLayout & 15;
            }
            if ((configuration.screenLayout & 192) != (configuration2.screenLayout & 192)) {
                configuration3.screenLayout |= configuration2.screenLayout & 192;
            }
            if ((configuration.screenLayout & 48) != (configuration2.screenLayout & 48)) {
                configuration3.screenLayout |= configuration2.screenLayout & 48;
            }
            if ((configuration.screenLayout & 768) != (configuration2.screenLayout & 768)) {
                configuration3.screenLayout |= configuration2.screenLayout & 768;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Api26Impl.generateConfigDelta_colorMode(configuration, configuration2, configuration3);
            }
            if ((configuration.uiMode & 15) != (configuration2.uiMode & 15)) {
                configuration3.uiMode |= configuration2.uiMode & 15;
            }
            if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                configuration3.uiMode |= configuration2.uiMode & 48;
            }
            if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                configuration3.screenWidthDp = configuration2.screenWidthDp;
            }
            if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                configuration3.screenHeightDp = configuration2.screenHeightDp;
            }
            if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                configuration3.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
            }
            if (configuration.densityDpi != configuration2.densityDpi) {
                configuration3.densityDpi = configuration2.densityDpi;
            }
        }
        return configuration3;
    }

    private int getActivityHandlesConfigChangesFlags(Context context) throws PackageManager.NameNotFoundException {
        if (!this.mActivityHandlesConfigFlagsChecked && (this.mHost instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.mHost.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.mActivityHandlesConfigFlags = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.mActivityHandlesConfigFlags = 0;
            }
        }
        this.mActivityHandlesConfigFlagsChecked = true;
        return this.mActivityHandlesConfigFlags;
    }

    private AutoNightModeManager getAutoBatteryNightModeManager(Context context) {
        if (this.mAutoBatteryNightModeManager == null) {
            this.mAutoBatteryNightModeManager = new AutoBatteryNightModeManager(context);
        }
        return this.mAutoBatteryNightModeManager;
    }

    private void initWindowDecorActionBar() {
        ensureSubDecor();
        if (this.mHasActionBar && this.mActionBar == null) {
            Object obj = this.mHost;
            if (obj instanceof Activity) {
                this.mActionBar = new WindowDecorActionBar((Activity) obj, this.mOverlayActionBar);
            } else if (obj instanceof Dialog) {
                this.mActionBar = new WindowDecorActionBar((Dialog) obj);
            }
            ActionBar actionBar = this.mActionBar;
            if (actionBar != null) {
                actionBar.setDefaultDisplayHomeAsUpEnabled(this.mEnableDefaultActionBarUp);
            }
        }
    }

    private boolean initializePanelContent(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.createdPanelView;
        if (view != null) {
            panelFeatureState.shownPanelView = view;
            return true;
        }
        if (panelFeatureState.menu == null) {
            return false;
        }
        if (this.mPanelMenuPresenterCallback == null) {
            this.mPanelMenuPresenterCallback = new PanelMenuPresenterCallback();
        }
        panelFeatureState.shownPanelView = (View) panelFeatureState.getListMenuView(this.mPanelMenuPresenterCallback);
        return panelFeatureState.shownPanelView != null;
    }

    private boolean initializePanelDecor(PanelFeatureState panelFeatureState) {
        panelFeatureState.setStyle(getActionBarThemedContext());
        panelFeatureState.decorView = new ListMenuDecorView(panelFeatureState.listPresenterContext);
        panelFeatureState.gravity = 81;
        return true;
    }

    private boolean initializePanelMenu(PanelFeatureState panelFeatureState) {
        Resources.Theme themeNewTheme;
        Context context = this.mContext;
        int i = panelFeatureState.featureId;
        if ((i == 0 || i == 108) && this.mDecorContentParent != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(com.google.android.videos.R.attr.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(com.google.android.videos.R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(com.google.android.videos.R.attr.actionBarWidgetTheme, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                hc hcVar = new hc(context, 0);
                hcVar.getTheme().setTo(themeNewTheme);
                context = hcVar;
            }
        }
        fb fbVar = new fb(context);
        fbVar.b = this;
        panelFeatureState.setMenu(fbVar);
        return true;
    }

    private static csr inset(csr csrVar, int i, int i2, int i3, int i4) {
        return csr.e(Math.max(0, csrVar.b - i), Math.max(0, csrVar.c - i2), Math.max(0, csrVar.d - i3), Math.max(0, csrVar.e - i4));
    }

    private void invalidatePanelMenu(int i) {
        this.mInvalidatePanelMenuFeatures = (1 << i) | this.mInvalidatePanelMenuFeatures;
        if (this.mInvalidatePanelMenuPosted) {
            return;
        }
        View decorView = this.mWindow.getDecorView();
        Runnable runnable = this.mInvalidatePanelMenuRunnable;
        int[] iArr = cww.a;
        decorView.postOnAnimation(runnable);
        this.mInvalidatePanelMenuPosted = true;
    }

    private boolean onKeyDownPanel(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState panelState = getPanelState(i, true);
        if (panelState.isOpen) {
            return false;
        }
        return preparePanel(panelState, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean onKeyUpPanel(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            android.support.v7.view.ActionMode r0 = r4.mActionMode
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState r2 = r4.getPanelState(r5, r0)
            if (r5 != 0) goto L43
            android.support.v7.widget.DecorContentParent r5 = r4.mDecorContentParent
            if (r5 == 0) goto L43
            boolean r5 = r5.canShowOverflowMenu()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.mContext
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            android.support.v7.widget.DecorContentParent r5 = r4.mDecorContentParent
            boolean r5 = r5.isOverflowMenuShowing()
            if (r5 != 0) goto L3c
            boolean r5 = r4.mDestroyed
            if (r5 != 0) goto L60
            boolean r5 = r4.preparePanel(r2, r6)
            if (r5 == 0) goto L60
            android.support.v7.widget.DecorContentParent r5 = r4.mDecorContentParent
            boolean r0 = r5.showOverflowMenu()
            goto L66
        L3c:
            android.support.v7.widget.DecorContentParent r5 = r4.mDecorContentParent
            boolean r0 = r5.hideOverflowMenu()
            goto L66
        L43:
            boolean r5 = r2.isOpen
            if (r5 != 0) goto L62
            boolean r3 = r2.isHandled
            if (r3 == 0) goto L4c
            goto L62
        L4c:
            boolean r5 = r2.isPrepared
            if (r5 == 0) goto L60
            boolean r5 = r2.refreshMenuContent
            if (r5 == 0) goto L5c
            r2.isPrepared = r1
            boolean r5 = r4.preparePanel(r2, r6)
            if (r5 == 0) goto L60
        L5c:
            r4.openPanel(r2, r6)
            goto L66
        L60:
            r0 = r1
            goto L66
        L62:
            r4.closePanel(r2, r0)
            r0 = r5
        L66:
            if (r0 == 0) goto L83
            android.content.Context r5 = r4.mContext
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7c
            r5.playSoundEffect(r1)
            return r0
        L7c:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImpl.onKeyUpPanel(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void openPanel(android.support.v7.app.AppCompatDelegateImpl.PanelFeatureState r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImpl.openPanel(android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    private boolean performPanelShortcut(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        fb fbVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.isPrepared || preparePanel(panelFeatureState, keyEvent)) && (fbVar = panelFeatureState.menu) != null) {
            zPerformShortcut = fbVar.performShortcut(i, keyEvent, i2);
        }
        if (!zPerformShortcut || (i2 & 1) != 0 || this.mDecorContentParent != null) {
            return zPerformShortcut;
        }
        closePanel(panelFeatureState, true);
        return true;
    }

    private boolean preparePanel(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        DecorContentParent decorContentParent3;
        DecorContentParent decorContentParent4;
        if (this.mDestroyed) {
            return false;
        }
        if (panelFeatureState.isPrepared) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.mPreparedPanel;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            closePanel(panelFeatureState2, false);
        }
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null) {
            panelFeatureState.createdPanelView = windowCallback.onCreatePanelView(panelFeatureState.featureId);
        }
        int i = panelFeatureState.featureId;
        boolean z = i == 0 || i == 108;
        if (z && (decorContentParent4 = this.mDecorContentParent) != null) {
            decorContentParent4.setMenuPrepared();
        }
        if (panelFeatureState.createdPanelView == null && (!z || !(peekSupportActionBar() instanceof ToolbarActionBar))) {
            fb fbVar = panelFeatureState.menu;
            if (fbVar == null || panelFeatureState.refreshMenuContent) {
                if (fbVar == null) {
                    initializePanelMenu(panelFeatureState);
                    if (panelFeatureState.menu == null) {
                        return false;
                    }
                }
                if (z && (decorContentParent2 = this.mDecorContentParent) != null) {
                    if (this.mActionMenuPresenterCallback == null) {
                        this.mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
                    }
                    decorContentParent2.setMenu(panelFeatureState.menu, this.mActionMenuPresenterCallback);
                }
                panelFeatureState.menu.u();
                if (!windowCallback.onCreatePanelMenu(panelFeatureState.featureId, panelFeatureState.menu)) {
                    panelFeatureState.setMenu(null);
                    if (z && (decorContentParent = this.mDecorContentParent) != null) {
                        decorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
                    }
                    return false;
                }
                panelFeatureState.refreshMenuContent = false;
            }
            panelFeatureState.menu.u();
            Bundle bundle = panelFeatureState.frozenActionViewState;
            if (bundle != null) {
                panelFeatureState.menu.p(bundle);
                panelFeatureState.frozenActionViewState = null;
            }
            if (!windowCallback.onPreparePanel(0, panelFeatureState.createdPanelView, panelFeatureState.menu)) {
                if (z && (decorContentParent3 = this.mDecorContentParent) != null) {
                    decorContentParent3.setMenu(null, this.mActionMenuPresenterCallback);
                }
                panelFeatureState.menu.t();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.qwertyMode = z2;
            panelFeatureState.menu.setQwertyMode(z2);
            panelFeatureState.menu.t();
        }
        panelFeatureState.isPrepared = true;
        panelFeatureState.isHandled = false;
        this.mPreparedPanel = panelFeatureState;
        return true;
    }

    private void reopenMenu(boolean z) {
        DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent == null || !decorContentParent.canShowOverflowMenu() || (ViewConfiguration.get(this.mContext).hasPermanentMenuKey() && !this.mDecorContentParent.isOverflowMenuShowPending())) {
            PanelFeatureState panelState = getPanelState(0, true);
            panelState.refreshDecorView = true;
            closePanel(panelState, false);
            openPanel(panelState, null);
            return;
        }
        Window.Callback windowCallback = getWindowCallback();
        if (this.mDecorContentParent.isOverflowMenuShowing() && z) {
            this.mDecorContentParent.hideOverflowMenu();
            if (this.mDestroyed) {
                return;
            }
            windowCallback.onPanelClosed(108, getPanelState(0, true).menu);
            return;
        }
        if (windowCallback == null || this.mDestroyed) {
            return;
        }
        if (this.mInvalidatePanelMenuPosted && (this.mInvalidatePanelMenuFeatures & 1) != 0) {
            this.mWindow.getDecorView().removeCallbacks(this.mInvalidatePanelMenuRunnable);
            this.mInvalidatePanelMenuRunnable.run();
        }
        PanelFeatureState panelState2 = getPanelState(0, true);
        fb fbVar = panelState2.menu;
        if (fbVar == null || panelState2.refreshMenuContent || !windowCallback.onPreparePanel(0, panelState2.createdPanelView, fbVar)) {
            return;
        }
        windowCallback.onMenuOpened(108, panelState2.menu);
        this.mDecorContentParent.showOverflowMenu();
    }

    private int sanitizeWindowFeatureId(int i) {
        if (i == 8) {
            return 108;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    private boolean shouldInheritContext(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.mWindow.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private void throwFeatureRequestIfSubDecorInstalled() {
        if (this.mSubDecorInstalled) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private AppCompatActivity tryUnwrapContext() {
        for (Context baseContext = this.mContext; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AppCompatActivity) {
                return (AppCompatActivity) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateActivityConfiguration(Configuration configuration) {
        Activity activity = (Activity) this.mHost;
        if (activity instanceof dvk) {
            if (((dvk) activity).getLifecycle().a().a(dvd.c)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.mCreated || this.mDestroyed) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean updateAppConfiguration(int r12, defpackage.ctn r13, boolean r14) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImpl.updateAppConfiguration(int, ctn, boolean):boolean");
    }

    private void updateResourcesConfiguration(int i, ctn ctnVar, boolean z, Configuration configuration) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Resources resources = this.mContext.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        if (ctnVar != null) {
            setConfigurationLocales(configuration2, ctnVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            ResourcesFlusher.flush(resources);
        }
        int i2 = this.mThemeResId;
        if (i2 != 0) {
            this.mContext.setTheme(i2);
            this.mContext.getTheme().applyStyle(this.mThemeResId, true);
        }
        if (z && (this.mHost instanceof Activity)) {
            updateActivityConfiguration(configuration2);
        }
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ensureSubDecor();
        ((ViewGroup) this.mSubDecor.findViewById(R.id.content)).addView(view, layoutParams);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public boolean applyAppLocales() {
        if (isAutoStorageOptedIn(this.mContext) && getRequestedAppLocales() != null && !getRequestedAppLocales().equals(getStoredAppLocales())) {
            asyncExecuteSyncRequestedAndStoredLocales(this.mContext);
        }
        return applyApplicationSpecificConfig(true);
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public boolean applyDayNight() {
        return applyApplicationSpecificConfig(true);
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public Context attachBaseContext2(Context context) {
        Context context2;
        this.mBaseContextAttached = true;
        int iMapNightMode = mapNightMode(context, calculateNightMode());
        if (isAutoStorageOptedIn(context)) {
            syncRequestedAndStoredLocales(context);
        }
        ctn ctnVarCalculateApplicationLocales = calculateApplicationLocales(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(createOverrideAppConfiguration(context2, iMapNightMode, ctnVarCalculateApplicationLocales, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof hc) {
            try {
                ((hc) context2).a(createOverrideAppConfiguration(context2, iMapNightMode, ctnVarCalculateApplicationLocales, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!sCanReturnDifferentContext) {
            super.attachBaseContext2(context2);
            return context2;
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationCreateOverrideAppConfiguration = createOverrideAppConfiguration(context2, iMapNightMode, ctnVarCalculateApplicationLocales, !configuration2.equals(configuration3) ? generateConfigDelta(configuration2, configuration3) : null, true);
        hc hcVar = new hc(context2, 2132084445);
        hcVar.a(configurationCreateOverrideAppConfiguration);
        try {
            if (context2.getTheme() != null) {
                Resources.Theme theme = hcVar.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    theme.rebase();
                } else {
                    synchronized (csn.a) {
                        if (!csn.c) {
                            try {
                                csn.b = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                csn.b.setAccessible(true);
                            } catch (NoSuchMethodException unused3) {
                            }
                            csn.c = true;
                        }
                        Method method = csn.b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException unused4) {
                                csn.b = null;
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException unused5) {
        }
        super.attachBaseContext2(hcVar);
        return hcVar;
    }

    public ctn calculateApplicationLocales(Context context) {
        ctn requestedAppLocales;
        if (Build.VERSION.SDK_INT >= 33 || (requestedAppLocales = getRequestedAppLocales()) == null) {
            return null;
        }
        ctn configurationLocales = getConfigurationLocales(context.getApplicationContext().getResources().getConfiguration());
        ctn ctnVarCombineLocalesIfOverlayExists = LocaleOverlayHelper.combineLocalesIfOverlayExists(requestedAppLocales, configurationLocales);
        return ctnVarCombineLocalesIfOverlayExists.g() ? configurationLocales : ctnVarCombineLocalesIfOverlayExists;
    }

    public void callOnPanelClosed(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.mPanels;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.menu;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.isOpen) && !this.mDestroyed) {
            this.mAppCompatWindowCallback.bypassOnPanelClosed(this.mWindow.getCallback(), i, menu);
        }
    }

    public void checkCloseActionMenu(fb fbVar) {
        if (this.mClosingActionMenu) {
            return;
        }
        this.mClosingActionMenu = true;
        this.mDecorContentParent.dismissPopups();
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null && !this.mDestroyed) {
            windowCallback.onPanelClosed(108, fbVar);
        }
        this.mClosingActionMenu = false;
    }

    public void closePanel(int i) {
        closePanel(getPanelState(i, true), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.app.AppCompatDelegate
    public View createView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        if (this.mAppCompatViewInflater == null) {
            TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme);
            String string = typedArrayObtainStyledAttributes.getString(android.support.v7.appcompat.R.styleable.AppCompatTheme_viewInflaterClass);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.mAppCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.mAppCompatViewInflater = (AppCompatViewInflater) this.mContext.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.mAppCompatViewInflater = new AppCompatViewInflater();
                }
            }
        }
        boolean z2 = IS_PRE_LOLLIPOP;
        boolean zShouldInheritContext = false;
        if (z2) {
            if (this.mLayoutIncludeDetector == null) {
                this.mLayoutIncludeDetector = new LayoutIncludeDetector();
            }
            if (!this.mLayoutIncludeDetector.detect(attributeSet)) {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zShouldInheritContext = shouldInheritContext((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                }
                z = zShouldInheritContext;
            }
            z = true;
        } else {
            z = zShouldInheritContext;
        }
        return this.mAppCompatViewInflater.createView(view, str, context, attributeSet, z, z2, true, false);
    }

    public void dismissPopups() {
        fb fbVar;
        DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (this.mActionModePopup != null) {
            this.mWindow.getDecorView().removeCallbacks(this.mShowActionModePopup);
            if (this.mActionModePopup.isShowing()) {
                try {
                    this.mActionModePopup.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.mActionModePopup = null;
        }
        endOnGoingFadeAnimation();
        PanelFeatureState panelState = getPanelState(0, false);
        if (panelState == null || (fbVar = panelState.menu) == null) {
            return;
        }
        fbVar.close();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.mHost;
        if (((obj instanceof cvc) || (obj instanceof AppCompatDialog)) && (decorView = this.mWindow.getDecorView()) != null && cww.v(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.mAppCompatWindowCallback.bypassDispatchKeyEvent(this.mWindow.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent);
    }

    public void doInvalidatePanelMenu(int i) {
        PanelFeatureState panelState;
        PanelFeatureState panelState2 = getPanelState(i, true);
        if (panelState2.menu != null) {
            Bundle bundle = new Bundle();
            panelState2.menu.q(bundle);
            if (bundle.size() > 0) {
                panelState2.frozenActionViewState = bundle;
            }
            panelState2.menu.u();
            panelState2.menu.clear();
        }
        panelState2.refreshMenuContent = true;
        panelState2.refreshDecorView = true;
        if ((i != 108 && i != 0) || this.mDecorContentParent == null || (panelState = getPanelState(0, false)) == null) {
            return;
        }
        panelState.isPrepared = false;
        preparePanel(panelState, null);
    }

    public void endOnGoingFadeAnimation() {
        cxe cxeVar = this.mFadeAnim;
        if (cxeVar != null) {
            cxeVar.a();
        }
    }

    public PanelFeatureState findMenuPanel(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.menu == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public <T extends View> T findViewById(int i) {
        ensureSubDecor();
        return (T) this.mWindow.findViewById(i);
    }

    final Context getActionBarThemedContext() {
        ActionBar supportActionBar = getSupportActionBar();
        Context themedContext = supportActionBar != null ? supportActionBar.getThemedContext() : null;
        return themedContext == null ? this.mContext : themedContext;
    }

    final AutoNightModeManager getAutoTimeNightModeManager() {
        return getAutoTimeNightModeManager(this.mContext);
    }

    public ctn getConfigurationLocales(Configuration configuration) {
        return Api24Impl.getLocales(configuration);
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public Context getContextForDelegate() {
        return this.mContext;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return new ActionBarDrawableToggleImpl();
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public int getLocalNightMode() {
        return this.mLocalNightMode;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public MenuInflater getMenuInflater() {
        if (this.mMenuInflater == null) {
            initWindowDecorActionBar();
            ActionBar actionBar = this.mActionBar;
            this.mMenuInflater = new SupportMenuInflater(actionBar != null ? actionBar.getThemedContext() : this.mContext);
        }
        return this.mMenuInflater;
    }

    protected PanelFeatureState getPanelState(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.mPanels = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    ViewGroup getSubDecor() {
        return this.mSubDecor;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public ActionBar getSupportActionBar() {
        initWindowDecorActionBar();
        return this.mActionBar;
    }

    final CharSequence getTitle() {
        Object obj = this.mHost;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.mTitle;
    }

    final Window.Callback getWindowCallback() {
        return this.mWindow.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0036 A[RETURN] */
    @Override // android.support.v7.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean hasWindowFeature(int r4) {
        /*
            r3 = this;
            int r0 = r3.sanitizeWindowFeatureId(r4)
            r1 = 1
            if (r0 == r1) goto L29
            r2 = 2
            if (r0 == r2) goto L26
            r2 = 5
            if (r0 == r2) goto L23
            r2 = 10
            if (r0 == r2) goto L20
            r2 = 108(0x6c, float:1.51E-43)
            if (r0 == r2) goto L1d
            r2 = 109(0x6d, float:1.53E-43)
            if (r0 == r2) goto L1a
            goto L2d
        L1a:
            boolean r0 = r3.mOverlayActionBar
            goto L2b
        L1d:
            boolean r0 = r3.mHasActionBar
            goto L2b
        L20:
            boolean r0 = r3.mOverlayActionMode
            goto L2b
        L23:
            boolean r0 = r3.mFeatureIndeterminateProgress
            goto L2b
        L26:
            boolean r0 = r3.mFeatureProgress
            goto L2b
        L29:
            boolean r0 = r3.mWindowNoTitle
        L2b:
            if (r0 != 0) goto L38
        L2d:
            android.view.Window r0 = r3.mWindow
            boolean r4 = r0.hasFeature(r4)
            if (r4 == 0) goto L36
            goto L38
        L36:
            r4 = 0
            return r4
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImpl.hasWindowFeature(int):boolean");
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void installViewFactory() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.mContext);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            layoutInflaterFrom.getFactory2();
        }
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void invalidateOptionsMenu() {
        if (peekSupportActionBar() == null || getSupportActionBar().invalidateOptionsMenu()) {
            return;
        }
        invalidatePanelMenu(0);
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public boolean isHandleNativeActionModesEnabled() {
        return this.mHandleNativeActionModes;
    }

    public int mapNightMode(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return getAutoTimeNightModeManager(context).getApplyableNightMode();
            }
            if (i != 1 && i != 2) {
                if (i == 3) {
                    return getAutoBatteryNightModeManager(context).getApplyableNightMode();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i;
    }

    public boolean onBackPressed() {
        boolean z = this.mLongPressBackDown;
        this.mLongPressBackDown = false;
        PanelFeatureState panelState = getPanelState(0, false);
        if (panelState != null && panelState.isOpen) {
            if (!z) {
                closePanel(panelState, true);
            }
            return true;
        }
        android.support.v7.view.ActionMode actionMode = this.mActionMode;
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        return supportActionBar != null && supportActionBar.collapseActionView();
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        ActionBar supportActionBar;
        if (this.mHasActionBar && this.mSubDecorInstalled && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.onConfigurationChanged(configuration);
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.mContext);
        this.mEffectiveConfiguration = new Configuration(this.mContext.getResources().getConfiguration());
        applyApplicationSpecificConfig(false, false);
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void onCreate(Bundle bundle) {
        String strF;
        this.mBaseContextAttached = true;
        applyApplicationSpecificConfig(false);
        ensureWindow();
        Object obj = this.mHost;
        if (obj instanceof Activity) {
            try {
                strF = crh.f((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strF = null;
            }
            if (strF != null) {
                ActionBar actionBarPeekSupportActionBar = peekSupportActionBar();
                if (actionBarPeekSupportActionBar == null) {
                    this.mEnableDefaultActionBarUp = true;
                } else {
                    actionBarPeekSupportActionBar.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            addActiveDelegate(this);
        }
        this.mEffectiveConfiguration = new Configuration(this.mContext.getResources().getConfiguration());
        this.mCreated = true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return createView(view, str, context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // android.support.v7.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDestroy() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mHost
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            removeActivityDelegate(r3)
        L9:
            boolean r0 = r3.mInvalidatePanelMenuPosted
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.mWindow
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.mInvalidatePanelMenuRunnable
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.mDestroyed = r0
            int r0 = r3.mLocalNightMode
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.mHost
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r3.mHost
            ko<java.lang.String, java.lang.Integer> r1 = android.support.v7.app.AppCompatDelegateImpl.sLocalNightModes
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            int r2 = r3.mLocalNightMode
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r2)
            goto L54
        L45:
            java.lang.Object r0 = r3.mHost
            ko<java.lang.String, java.lang.Integer> r1 = android.support.v7.app.AppCompatDelegateImpl.sLocalNightModes
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.remove(r0)
        L54:
            android.support.v7.app.ActionBar r0 = r3.mActionBar
            if (r0 == 0) goto L5b
            r0.onDestroy()
        L5b:
            r3.cleanupAutoManagers()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImpl.onDestroy():void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.mLongPressBackDown = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            onKeyDownPanel(0, keyEvent);
            return true;
        }
        return false;
    }

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null && supportActionBar.onKeyShortcut(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.mPreparedPanel;
        if (panelFeatureState != null && performPanelShortcut(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.mPreparedPanel;
            if (panelFeatureState2 != null) {
                panelFeatureState2.isHandled = true;
            }
            return true;
        }
        if (this.mPreparedPanel == null) {
            PanelFeatureState panelState = getPanelState(0, true);
            preparePanel(panelState, keyEvent);
            boolean zPerformPanelShortcut = performPanelShortcut(panelState, keyEvent.getKeyCode(), keyEvent, 1);
            panelState.isPrepared = false;
            if (zPerformPanelShortcut) {
                return true;
            }
        }
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (i == 82) {
                onKeyUpPanel(0, keyEvent);
                return true;
            }
        } else if (onBackPressed()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ez
    public boolean onMenuItemSelected(fb fbVar, MenuItem menuItem) {
        PanelFeatureState panelFeatureStateFindMenuPanel;
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback == null || this.mDestroyed || (panelFeatureStateFindMenuPanel = findMenuPanel(fbVar.a())) == null) {
            return false;
        }
        return windowCallback.onMenuItemSelected(panelFeatureStateFindMenuPanel.featureId, menuItem);
    }

    @Override // defpackage.ez
    public void onMenuModeChange(fb fbVar) {
        reopenMenu(true);
    }

    public void onMenuOpened(int i) {
        ActionBar supportActionBar;
        if (i != 108 || (supportActionBar = getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.dispatchMenuVisibilityChanged(true);
    }

    public void onPanelClosed(int i) {
        if (i == 108) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.dispatchMenuVisibilityChanged(false);
                return;
            }
            return;
        }
        if (i == 0) {
            PanelFeatureState panelState = getPanelState(0, true);
            if (panelState.isOpen) {
                closePanel(panelState, false);
            }
        }
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void onPostCreate(Bundle bundle) {
        ensureSubDecor();
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void onPostResume() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(true);
        }
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        applyApplicationSpecificConfig(true, false);
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void onStop() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
        }
    }

    final ActionBar peekSupportActionBar() {
        return this.mActionBar;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public boolean requestWindowFeature(int i) {
        int iSanitizeWindowFeatureId = sanitizeWindowFeatureId(i);
        if (this.mWindowNoTitle && iSanitizeWindowFeatureId == 108) {
            return false;
        }
        if (this.mHasActionBar && iSanitizeWindowFeatureId == 1) {
            this.mHasActionBar = false;
        }
        if (iSanitizeWindowFeatureId == 1) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mWindowNoTitle = true;
            return true;
        }
        if (iSanitizeWindowFeatureId == 2) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mFeatureProgress = true;
            return true;
        }
        if (iSanitizeWindowFeatureId == 5) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mFeatureIndeterminateProgress = true;
            return true;
        }
        if (iSanitizeWindowFeatureId == 10) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mOverlayActionMode = true;
            return true;
        }
        if (iSanitizeWindowFeatureId == 108) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mHasActionBar = true;
            return true;
        }
        if (iSanitizeWindowFeatureId != 109) {
            return this.mWindow.requestFeature(iSanitizeWindowFeatureId);
        }
        throwFeatureRequestIfSubDecorInstalled();
        this.mOverlayActionBar = true;
        return true;
    }

    public void setConfigurationLocales(Configuration configuration, ctn ctnVar) {
        Api24Impl.setLocales(configuration, ctnVar);
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void setContentView(int i) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.mContext).inflate(i, viewGroup);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    public void setDefaultLocalesForLocaleList(ctn ctnVar) {
        Api24Impl.setDefaultLocales(ctnVar);
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void setHandleNativeActionModesEnabled(boolean z) {
        this.mHandleNativeActionModes = z;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void setLocalNightMode(int i) {
        if (this.mLocalNightMode != i) {
            this.mLocalNightMode = i;
            if (this.mBaseContextAttached) {
                applyDayNight();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    @Override // android.support.v7.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            android.window.OnBackInvokedDispatcher r0 = r2.mDispatcher
            if (r0 == 0) goto Le
            android.window.OnBackInvokedCallback r1 = r2.mBackCallback
            if (r1 == 0) goto Le
            android.support.v7.app.AppCompatDelegateImpl.Api33Impl.unregisterOnBackInvokedCallback(r0, r1)
            r0 = 0
            r2.mBackCallback = r0
        Le:
            if (r3 != 0) goto L29
            java.lang.Object r0 = r2.mHost
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L29
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L29
            java.lang.Object r3 = r2.mHost
            android.app.Activity r3 = (android.app.Activity) r3
            android.window.OnBackInvokedDispatcher r3 = android.support.v7.app.AppCompatDelegateImpl.Api33Impl.getOnBackInvokedDispatcher(r3)
            r2.mDispatcher = r3
            goto L2b
        L29:
            r2.mDispatcher = r3
        L2b:
            r2.updateBackInvokedCallbackState()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImpl.setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher):void");
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void setSupportActionBar(Toolbar toolbar) {
        if (this.mHost instanceof Activity) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar instanceof WindowDecorActionBar) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.mMenuInflater = null;
            if (supportActionBar != null) {
                supportActionBar.onDestroy();
            }
            this.mActionBar = null;
            if (toolbar != null) {
                ToolbarActionBar toolbarActionBar = new ToolbarActionBar(toolbar, getTitle(), this.mAppCompatWindowCallback);
                this.mActionBar = toolbarActionBar;
                this.mAppCompatWindowCallback.setActionBarCallback(toolbarActionBar.mMenuCallback);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.mAppCompatWindowCallback.setActionBarCallback(null);
            }
            invalidateOptionsMenu();
        }
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void setTheme(int i) {
        this.mThemeResId = i;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public final void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        if (peekSupportActionBar() != null) {
            peekSupportActionBar().setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.mTitleView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    final boolean shouldAnimateActionModeView() {
        ViewGroup viewGroup;
        return this.mSubDecorInstalled && (viewGroup = this.mSubDecor) != null && viewGroup.isLaidOut();
    }

    public boolean shouldRegisterBackInvokedCallback() {
        if (this.mDispatcher == null) {
            return false;
        }
        PanelFeatureState panelState = getPanelState(0, false);
        return (panelState != null && panelState.isOpen) || this.mActionMode != null;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public android.support.v7.view.ActionMode startSupportActionMode(ActionMode.Callback callback) {
        AppCompatCallback appCompatCallback;
        if (callback == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        android.support.v7.view.ActionMode actionMode = this.mActionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9 = new ActionModeCallbackWrapperV9(callback);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            android.support.v7.view.ActionMode actionModeStartActionMode = supportActionBar.startActionMode(actionModeCallbackWrapperV9);
            this.mActionMode = actionModeStartActionMode;
            if (actionModeStartActionMode != null && (appCompatCallback = this.mAppCompatCallback) != null) {
                appCompatCallback.onSupportActionModeStarted(actionModeStartActionMode);
            }
        }
        if (this.mActionMode == null) {
            this.mActionMode = startSupportActionModeFromWindow(actionModeCallbackWrapperV9);
        }
        updateBackInvokedCallbackState();
        return this.mActionMode;
    }

    public android.support.v7.view.ActionMode startSupportActionModeFromWindow(ActionMode.Callback callback) {
        android.support.v7.view.ActionMode actionModeOnWindowStartingSupportActionMode;
        Context hcVar;
        AppCompatCallback appCompatCallback;
        endOnGoingFadeAnimation();
        android.support.v7.view.ActionMode actionMode = this.mActionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        if (!(callback instanceof ActionModeCallbackWrapperV9)) {
            callback = new ActionModeCallbackWrapperV9(callback);
        }
        AppCompatCallback appCompatCallback2 = this.mAppCompatCallback;
        if (appCompatCallback2 == null || this.mDestroyed) {
            actionModeOnWindowStartingSupportActionMode = null;
        } else {
            try {
                actionModeOnWindowStartingSupportActionMode = appCompatCallback2.onWindowStartingSupportActionMode(callback);
            } catch (AbstractMethodError unused) {
            }
        }
        if (actionModeOnWindowStartingSupportActionMode != null) {
            this.mActionMode = actionModeOnWindowStartingSupportActionMode;
        } else {
            if (this.mActionModeView == null) {
                if (this.mIsFloating) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.mContext.getTheme();
                    theme.resolveAttribute(com.google.android.videos.R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.mContext.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        hcVar = new hc(this.mContext, 0);
                        hcVar.getTheme().setTo(themeNewTheme);
                    } else {
                        hcVar = this.mContext;
                    }
                    this.mActionModeView = new ActionBarContextView(hcVar);
                    PopupWindow popupWindow = new PopupWindow(hcVar, (AttributeSet) null, com.google.android.videos.R.attr.actionModePopupWindowStyle);
                    this.mActionModePopup = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    this.mActionModePopup.setContentView(this.mActionModeView);
                    this.mActionModePopup.setWidth(-1);
                    hcVar.getTheme().resolveAttribute(com.google.android.videos.R.attr.actionBarSize, typedValue, true);
                    this.mActionModeView.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, hcVar.getResources().getDisplayMetrics()));
                    this.mActionModePopup.setHeight(-2);
                    this.mShowActionModePopup = new Runnable() { // from class: android.support.v7.app.AppCompatDelegateImpl.6
                        @Override // java.lang.Runnable
                        public void run() {
                            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                            appCompatDelegateImpl.mActionModePopup.showAtLocation(appCompatDelegateImpl.mActionModeView, 55, 0, 0);
                            AppCompatDelegateImpl.this.endOnGoingFadeAnimation();
                            if (!AppCompatDelegateImpl.this.shouldAnimateActionModeView()) {
                                AppCompatDelegateImpl.this.mActionModeView.setAlpha(1.0f);
                                AppCompatDelegateImpl.this.mActionModeView.setVisibility(0);
                                return;
                            }
                            AppCompatDelegateImpl.this.mActionModeView.setAlpha(0.0f);
                            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                            cxe cxeVarD = cww.d(appCompatDelegateImpl2.mActionModeView);
                            cxeVarD.c(1.0f);
                            appCompatDelegateImpl2.mFadeAnim = cxeVarD;
                            AppCompatDelegateImpl.this.mFadeAnim.e(new cxg() { // from class: android.support.v7.app.AppCompatDelegateImpl.6.1
                                @Override // defpackage.cxg, defpackage.cxf
                                public void onAnimationEnd(View view) {
                                    AppCompatDelegateImpl.this.mActionModeView.setAlpha(1.0f);
                                    AppCompatDelegateImpl.this.mFadeAnim.e(null);
                                    AppCompatDelegateImpl.this.mFadeAnim = null;
                                }

                                @Override // defpackage.cxg, defpackage.cxf
                                public void onAnimationStart(View view) {
                                    AppCompatDelegateImpl.this.mActionModeView.setVisibility(0);
                                }
                            });
                        }
                    };
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.mSubDecor.findViewById(com.google.android.videos.R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(getActionBarThemedContext()));
                        this.mActionModeView = (ActionBarContextView) viewStubCompat.inflate();
                    }
                }
            }
            if (this.mActionModeView != null) {
                endOnGoingFadeAnimation();
                this.mActionModeView.killMode();
                StandaloneActionMode standaloneActionMode = new StandaloneActionMode(this.mActionModeView.getContext(), this.mActionModeView, callback, this.mActionModePopup == null);
                if (callback.onCreateActionMode(standaloneActionMode, standaloneActionMode.getMenu())) {
                    standaloneActionMode.invalidate();
                    this.mActionModeView.initForMode(standaloneActionMode);
                    this.mActionMode = standaloneActionMode;
                    if (shouldAnimateActionModeView()) {
                        this.mActionModeView.setAlpha(0.0f);
                        cxe cxeVarD = cww.d(this.mActionModeView);
                        cxeVarD.c(1.0f);
                        this.mFadeAnim = cxeVarD;
                        cxeVarD.e(new cxg() { // from class: android.support.v7.app.AppCompatDelegateImpl.7
                            @Override // defpackage.cxg, defpackage.cxf
                            public void onAnimationEnd(View view) {
                                AppCompatDelegateImpl.this.mActionModeView.setAlpha(1.0f);
                                AppCompatDelegateImpl.this.mFadeAnim.e(null);
                                AppCompatDelegateImpl.this.mFadeAnim = null;
                            }

                            @Override // defpackage.cxg, defpackage.cxf
                            public void onAnimationStart(View view) {
                                AppCompatDelegateImpl.this.mActionModeView.setVisibility(0);
                                if (AppCompatDelegateImpl.this.mActionModeView.getParent() instanceof View) {
                                    View view2 = (View) AppCompatDelegateImpl.this.mActionModeView.getParent();
                                    int[] iArr = cww.a;
                                    cwk.e(view2);
                                }
                            }
                        });
                    } else {
                        this.mActionModeView.setAlpha(1.0f);
                        this.mActionModeView.setVisibility(0);
                        if (this.mActionModeView.getParent() instanceof View) {
                            View view = (View) this.mActionModeView.getParent();
                            int[] iArr = cww.a;
                            cwk.e(view);
                        }
                    }
                    if (this.mActionModePopup != null) {
                        this.mWindow.getDecorView().post(this.mShowActionModePopup);
                    }
                } else {
                    this.mActionMode = null;
                }
            }
        }
        android.support.v7.view.ActionMode actionMode2 = this.mActionMode;
        if (actionMode2 != null && (appCompatCallback = this.mAppCompatCallback) != null) {
            appCompatCallback.onSupportActionModeStarted(actionMode2);
        }
        updateBackInvokedCallbackState();
        return this.mActionMode;
    }

    final int updateActionModeInsets(cyh cyhVar, Rect rect) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        csr csrVarF;
        boolean z;
        boolean z2 = false;
        int iD = cyhVar != null ? cyhVar.d() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.mActionModeView;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mActionModeView.getLayoutParams();
            if (this.mActionModeView.isShown()) {
                if (this.mTempRect1 == null) {
                    this.mTempRect1 = new Rect();
                    this.mTempRect2 = new Rect();
                }
                Rect rect2 = this.mTempRect1;
                Rect rect3 = this.mTempRect2;
                if (cyhVar == null) {
                    rect2.set(rect);
                    csrVarF = csr.a;
                } else {
                    rect2.set(cyhVar.b(), cyhVar.d(), cyhVar.c(), cyhVar.a());
                    csrVarF = cyhVar.f(2);
                }
                ViewUtils.computeFitSystemWindows(this.mSubDecor, rect2, rect3);
                csr csrVarInset = inset(csrVarF, rect3.left, rect3.top, rect3.right, rect3.bottom);
                int i = marginLayoutParams.leftMargin;
                int i2 = csrVarInset.b;
                if (i == i2 && marginLayoutParams.rightMargin == csrVarInset.d) {
                    z = false;
                } else {
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = csrVarInset.d;
                    z = true;
                }
                this.mActionModeView.setPaddingForInsets(rect2.left - i2, rect2.top, rect2.right - csrVarInset.d, 0);
                if (!this.mOverlayActionMode && rect2.top > 0) {
                    iD = 0;
                }
                z2 = z;
            }
            if (z2) {
                this.mActionModeView.setLayoutParams(marginLayoutParams);
            }
        }
        return iD;
    }

    public void updateBackInvokedCallbackState() {
        if (Build.VERSION.SDK_INT >= 33) {
            if (shouldRegisterBackInvokedCallback()) {
                if (this.mBackCallback == null) {
                    this.mBackCallback = Api33Impl.registerOnBackPressedCallback(this.mDispatcher, this);
                }
            } else {
                OnBackInvokedCallback onBackInvokedCallback = this.mBackCallback;
                if (onBackInvokedCallback != null) {
                    Api33Impl.unregisterOnBackInvokedCallback(this.mDispatcher, onBackInvokedCallback);
                    this.mBackCallback = null;
                }
            }
        }
    }

    public AppCompatDelegateImpl(Dialog dialog, AppCompatCallback appCompatCallback) {
        this(dialog.getContext(), dialog.getWindow(), appCompatCallback, dialog);
    }

    private boolean applyApplicationSpecificConfig(boolean z, boolean z2) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        if (this.mDestroyed) {
            return false;
        }
        int iCalculateNightMode = calculateNightMode();
        int iMapNightMode = mapNightMode(this.mContext, iCalculateNightMode);
        ctn ctnVarCalculateApplicationLocales = Build.VERSION.SDK_INT < 33 ? calculateApplicationLocales(this.mContext) : null;
        if (!z2 && ctnVarCalculateApplicationLocales != null) {
            ctnVarCalculateApplicationLocales = getConfigurationLocales(this.mContext.getResources().getConfiguration());
        }
        boolean zUpdateAppConfiguration = updateAppConfiguration(iMapNightMode, ctnVarCalculateApplicationLocales, z);
        if (iCalculateNightMode == 0) {
            getAutoTimeNightModeManager(this.mContext).setup();
        } else {
            AutoNightModeManager autoNightModeManager = this.mAutoTimeNightModeManager;
            if (autoNightModeManager != null) {
                autoNightModeManager.cleanup();
            }
            if (iCalculateNightMode == 3) {
                getAutoBatteryNightModeManager(this.mContext).setup();
                return zUpdateAppConfiguration;
            }
        }
        AutoNightModeManager autoNightModeManager2 = this.mAutoBatteryNightModeManager;
        if (autoNightModeManager2 != null) {
            autoNightModeManager2.cleanup();
        }
        return zUpdateAppConfiguration;
    }

    private AutoNightModeManager getAutoTimeNightModeManager(Context context) {
        if (this.mAutoTimeNightModeManager == null) {
            this.mAutoTimeNightModeManager = new AutoTimeNightModeManager(TwilightManager.getInstance(context));
        }
        return this.mAutoTimeNightModeManager;
    }

    public void closePanel(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (z && panelFeatureState.featureId == 0 && (decorContentParent = this.mDecorContentParent) != null && decorContentParent.isOverflowMenuShowing()) {
            checkCloseActionMenu(panelFeatureState.menu);
            return;
        }
        WindowManager windowManager = (WindowManager) this.mContext.getSystemService("window");
        if (windowManager != null && panelFeatureState.isOpen && (viewGroup = panelFeatureState.decorView) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                callOnPanelClosed(panelFeatureState.featureId, panelFeatureState, null);
            }
        }
        panelFeatureState.isPrepared = false;
        panelFeatureState.isHandled = false;
        panelFeatureState.isOpen = false;
        panelFeatureState.shownPanelView = null;
        panelFeatureState.refreshDecorView = true;
        if (this.mPreparedPanel == panelFeatureState) {
            this.mPreparedPanel = null;
        }
        if (panelFeatureState.featureId == 0) {
            updateBackInvokedCallbackState();
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public AppCompatDelegateImpl(Context context, Activity activity, AppCompatCallback appCompatCallback) {
        this(context, null, appCompatCallback, activity);
    }

    public AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback) {
        this(context, window, appCompatCallback, context);
    }

    private AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        ko<String, Integer> koVar;
        Integer num;
        AppCompatActivity appCompatActivityTryUnwrapContext;
        this.mFadeAnim = null;
        this.mHandleNativeActionModes = true;
        this.mLocalNightMode = -100;
        this.mInvalidatePanelMenuRunnable = new Runnable() { // from class: android.support.v7.app.AppCompatDelegateImpl.2
            @Override // java.lang.Runnable
            public void run() {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if ((appCompatDelegateImpl.mInvalidatePanelMenuFeatures & 1) != 0) {
                    appCompatDelegateImpl.doInvalidatePanelMenu(0);
                }
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                if ((appCompatDelegateImpl2.mInvalidatePanelMenuFeatures & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    appCompatDelegateImpl2.doInvalidatePanelMenu(108);
                }
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.mInvalidatePanelMenuPosted = false;
                appCompatDelegateImpl3.mInvalidatePanelMenuFeatures = 0;
            }
        };
        this.mContext = context;
        this.mAppCompatCallback = appCompatCallback;
        this.mHost = obj;
        if ((obj instanceof Dialog) && (appCompatActivityTryUnwrapContext = tryUnwrapContext()) != null) {
            this.mLocalNightMode = appCompatActivityTryUnwrapContext.getDelegate().getLocalNightMode();
        }
        if (this.mLocalNightMode == -100 && (num = (koVar = sLocalNightModes).get(obj.getClass().getName())) != null) {
            this.mLocalNightMode = num.intValue();
            koVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            attachToWindow(window);
        }
        AppCompatDrawableManager.preload();
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void setContentView(View view) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onSubDecorInstalled(ViewGroup viewGroup) {
    }
}
