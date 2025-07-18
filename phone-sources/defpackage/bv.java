package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bv implements ComponentCallbacks, View.OnCreateContextMenuListener, dvk, dxd, duz, ghe {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    public boolean mAdded;
    br mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    private boolean mCalled;
    public cr mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    dwx mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public cr mFragmentManager;
    public boolean mFromLayout;
    boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public cd<?> mHost;
    public boolean mInDynamicContainer;
    public boolean mInLayout;
    public boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    dvl mLifecycleRegistry;
    public dvd mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<bt> mOnPreAttachedListeners;
    public bv mParentFragment;
    public boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    private final bt mSavedStateAttachListener;
    public ghd mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public bv mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mTransitioning;
    public boolean mUserVisibleHint;
    public View mView;
    public dh mViewLifecycleOwner;
    public dvv<dvk> mViewLifecycleOwnerLiveData;
    public String mWho;

    public bv() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new cr();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new bf(this, 5, null);
        this.mMaxState = dvd.e;
        this.mViewLifecycleOwnerLiveData = new dvv<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new bn(this);
        initLifecycle();
    }

    private br ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new br();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        dvd dvdVar = this.mMaxState;
        return (dvdVar == dvd.b || this.mParentFragment == null) ? dvdVar.ordinal() : Math.min(dvdVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new dvl(this);
        this.mSavedStateRegistryController = gez.y(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @Deprecated
    public static bv instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private <I, O> gp<I> prepareCallInternal(gx<I, O> gxVar, ho<Void, gt> hoVar, go<O> goVar) {
        if (this.mState > 1) {
            throw new IllegalStateException(a.cj(this, "Fragment ", " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new bq(this, hoVar, atomicReference, gxVar, goVar));
        return new bm(atomicReference);
    }

    private void registerOnPreAttachListener(bt btVar) {
        if (this.mState >= 0) {
            btVar.a();
        } else {
            this.mOnPreAttachedListeners.add(btVar);
        }
    }

    private void restoreViewState() {
        if (cr.Y(3)) {
            toString();
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        cr crVar;
        br brVar = this.mAnimationInfo;
        if (brVar != null) {
            brVar.u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (crVar = this.mFragmentManager) == null) {
            return;
        }
        dp dpVarC = dp.c(viewGroup, crVar);
        dpVarC.h();
        if (z) {
            this.mHost.d.post(new bf(dpVarC, 7, null));
        } else {
            dpVarC.f();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public ca createFragmentContainer() {
        return new bo(this);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        bv targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            dxr.a(this).d(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.F(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public bv findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.z.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final by getActivity() {
        cd<?> cdVar = this.mHost;
        if (cdVar == null) {
            return null;
        }
        return (by) cdVar.b;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        br brVar = this.mAnimationInfo;
        if (brVar == null || (bool = brVar.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        br brVar = this.mAnimationInfo;
        if (brVar == null || (bool = brVar.o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final cr getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(a.cj(this, "Fragment ", " has not been attached yet."));
    }

    public Context getContext() {
        cd<?> cdVar = this.mHost;
        if (cdVar == null) {
            return null;
        }
        return cdVar.c;
    }

    @Override // defpackage.duz
    public dxj getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && cr.Y(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        dxl dxlVar = new dxl();
        if (application != null) {
            dxlVar.b(dww.b, application);
        }
        dxlVar.b(dwn.a, this);
        dxlVar.b(dwn.b, this);
        if (getArguments() != null) {
            dxlVar.b(dwn.c, getArguments());
        }
        return dxlVar;
    }

    @Override // defpackage.duz
    public dwx getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && cr.Y(3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new dwq(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return 0;
        }
        return brVar.b;
    }

    public Object getEnterTransition() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return null;
        }
        return brVar.i;
    }

    public cry getEnterTransitionCallback() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return null;
        }
        return brVar.q;
    }

    public int getExitAnim() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return 0;
        }
        return brVar.c;
    }

    public Object getExitTransition() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return null;
        }
        return brVar.k;
    }

    public cry getExitTransitionCallback() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return null;
        }
        return brVar.r;
    }

    public View getFocusedView() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return null;
        }
        return brVar.t;
    }

    @Deprecated
    public final cr getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        cd<?> cdVar = this.mHost;
        if (cdVar == null) {
            return null;
        }
        return cdVar.d();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // defpackage.dvk
    public dve getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public dxr getLoaderManager() {
        return dxr.a(this);
    }

    public int getNextTransition() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return 0;
        }
        return brVar.f;
    }

    public final bv getParentFragment() {
        return this.mParentFragment;
    }

    public final cr getParentFragmentManager() {
        cr crVar = this.mFragmentManager;
        if (crVar != null) {
            return crVar;
        }
        throw new IllegalStateException(a.cj(this, "Fragment ", " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return false;
        }
        return brVar.a;
    }

    public int getPopEnterAnim() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return 0;
        }
        return brVar.d;
    }

    public int getPopExitAnim() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return 0;
        }
        return brVar.e;
    }

    public float getPostOnViewCreatedAlpha() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return 1.0f;
        }
        return brVar.s;
    }

    public Object getReenterTransition() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return null;
        }
        Object obj = brVar.l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        int i = dia.a;
        dic dicVar = new dic(this);
        dia.d(dicVar);
        dhz dhzVarB = dia.b(this);
        if (dhzVarB.b.contains(dhy.f) && dia.e(dhzVarB, getClass(), dicVar.getClass())) {
            dia.c(dhzVarB, dicVar);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return null;
        }
        Object obj = brVar.j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // defpackage.ghe
    public final ghc getSavedStateRegistry() {
        return (ghc) this.mSavedStateRegistryController.b;
    }

    public Object getSharedElementEnterTransition() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return null;
        }
        return brVar.m;
    }

    public Object getSharedElementReturnTransition() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return null;
        }
        Object obj = brVar.n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        br brVar = this.mAnimationInfo;
        return (brVar == null || (arrayList = brVar.g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        br brVar = this.mAnimationInfo;
        return (brVar == null || (arrayList = brVar.h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final bv getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        int i = dia.a;
        did didVar = new did(this);
        dia.d(didVar);
        dhz dhzVarB = dia.b(this);
        if (dhzVarB.b.contains(dhy.h) && dia.e(dhzVarB, getClass(), didVar.getClass())) {
            dia.c(dhzVarB, didVar);
        }
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public dvk getViewLifecycleOwner() {
        dh dhVar = this.mViewLifecycleOwner;
        if (dhVar != null) {
            return dhVar;
        }
        throw new IllegalStateException(a.cj(this, "Can't access the Fragment View's LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public dvs<dvk> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // defpackage.dxd
    public dxc getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == dvd.b.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.mFragmentManager.y.d;
        dxc dxcVar = (dxc) map.get(this.mWho);
        if (dxcVar != null) {
            return dxcVar;
        }
        dxc dxcVar2 = new dxc();
        map.put(this.mWho, dxcVar2);
        return dxcVar2;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new cr();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        bv bvVar;
        if (this.mHidden) {
            return true;
        }
        return (this.mFragmentManager == null || (bvVar = this.mParentFragment) == null || !bvVar.isHidden()) ? false : true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (this.mMenuVisible) {
            return this.mFragmentManager == null || cr.ai(this.mParentFragment);
        }
        return false;
    }

    public boolean isPostponed() {
        br brVar = this.mAnimationInfo;
        if (brVar == null) {
            return false;
        }
        return brVar.u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        cr crVar = this.mFragmentManager;
        if (crVar == null) {
            return false;
        }
        return crVar.ab();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    /* renamed from: lambda$performCreateView$0$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m79lambda$performCreateView$0$androidsupportv4appFragment() {
        dh dhVar = this.mViewLifecycleOwner;
        dhVar.b.b(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.L();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (cr.Y(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        cr crVar = this.mChildFragmentManager;
        if (crVar.l > 0) {
            return;
        }
        crVar.s();
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.L();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new dq(a.cj(this, "Fragment ", " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        this.mChildFragmentManager.q();
    }

    public void performAttach() {
        ArrayList<bt> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.n(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.c);
        if (!this.mCalled) {
            throw new dq(a.cj(this, "Fragment ", " did not call through to super.onAttach()"));
        }
        Iterator it = this.mFragmentManager.k.iterator();
        while (it.hasNext()) {
            ((cu) it.next()).g(this);
        }
        cr crVar = this.mChildFragmentManager;
        crVar.v = false;
        crVar.w = false;
        crVar.y.g = false;
        crVar.D(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.U(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.L();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.c(new fe(this, 1, null));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new dq(a.cj(this, "Fragment ", " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.e(dvc.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return this.mChildFragmentManager.V(menu, menuInflater) | z;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.L();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new dh(this, getViewModelStore(), new bf(this, 4));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.a != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (cr.Y(3)) {
            Objects.toString(this.mView);
            toString();
        }
        dwf.f(this.mView, this.mViewLifecycleOwner);
        dwf.d(this.mView, this.mViewLifecycleOwner);
        gez.w(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.k(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.t();
        this.mLifecycleRegistry.e(dvc.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new dq(a.cj(this, "Fragment ", " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.D(1);
        if (this.mView != null && ((dvl) this.mViewLifecycleOwner.getLifecycle()).b.a(dvd.c)) {
            this.mViewLifecycleOwner.a(dvc.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new dq(a.cj(this, "Fragment ", " did not call through to super.onDestroyView()"));
        }
        kp kpVar = dxr.a(this).a.b;
        int iC = kpVar.c();
        for (int i = 0; i < iC; i++) {
            ((dxs) kpVar.e(i)).n();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new dq(a.cj(this, "Fragment ", " did not call through to super.onDetach()"));
        }
        cr crVar = this.mChildFragmentManager;
        if (crVar.x) {
            return;
        }
        crVar.t();
        this.mChildFragmentManager = new cr();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.W(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.x(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.z();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(dvc.ON_PAUSE);
        }
        this.mLifecycleRegistry.e(dvc.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new dq(a.cj(this, "Fragment ", " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return this.mChildFragmentManager.X(menu) | z;
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean zAa = this.mFragmentManager.aa(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zAa) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zAa);
            onPrimaryNavigationFragmentChanged(zAa);
            cr crVar = this.mChildFragmentManager;
            crVar.T();
            crVar.y(crVar.p);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.L();
        this.mChildFragmentManager.ak(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new dq(a.cj(this, "Fragment ", " did not call through to super.onResume()"));
        }
        this.mLifecycleRegistry.e(dvc.ON_RESUME);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(dvc.ON_RESUME);
        }
        this.mChildFragmentManager.B();
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.L();
        this.mChildFragmentManager.ak(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new dq(a.cj(this, "Fragment ", " did not call through to super.onStart()"));
        }
        this.mLifecycleRegistry.e(dvc.ON_START);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(dvc.ON_START);
        }
        this.mChildFragmentManager.C();
    }

    public void performStop() {
        this.mChildFragmentManager.E();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(dvc.ON_STOP);
        }
        this.mLifecycleRegistry.e(dvc.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new dq(a.cj(this, "Fragment ", " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.D(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().u = true;
    }

    public final <I, O> gp<I> registerForActivityResult(gx<I, O> gxVar, go<O> goVar) {
        return prepareCallInternal(gxVar, new bp(this, 1), goVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost == null) {
            throw new IllegalStateException(a.cj(this, "Fragment ", " not attached to Activity"));
        }
        cr parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.s == null) {
            strArr.getClass();
            return;
        }
        parentFragmentManager.t.addLast(new cm(this.mWho, i));
        parentFragmentManager.s.b(strArr);
    }

    public final by requireActivity() {
        by activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(a.cj(this, "Fragment ", " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(a.cj(this, "Fragment ", " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(a.cj(this, "Fragment ", " not attached to a context."));
    }

    @Deprecated
    public final cr requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(a.cj(this, "Fragment ", " not attached to a host."));
    }

    public final bv requireParentFragment() {
        bv parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(a.cj(this, "Fragment ", " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a.cj(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.O(bundle);
        this.mChildFragmentManager.s();
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().o = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        ensureAnimationInfo().b = i;
        ensureAnimationInfo().c = i2;
        ensureAnimationInfo().d = i3;
        ensureAnimationInfo().e = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(cry cryVar) {
        ensureAnimationInfo().q = cryVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().i = obj;
    }

    public void setExitSharedElementCallback(cry cryVar) {
        ensureAnimationInfo().r = cryVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.e();
        }
    }

    public void setInitialSavedState(bu buVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        Bundle bundle2 = null;
        if (buVar != null && (bundle = buVar.a) != null) {
            bundle2 = bundle;
        }
        this.mSavedFragmentState = bundle2;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.e();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().a = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().s = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        int i = dia.a;
        dig digVar = new dig(this);
        dia.d(digVar);
        dhz dhzVarB = dia.b(this);
        if (dhzVarB.b.contains(dhy.f) && dia.e(dhzVarB, getClass(), digVar.getClass())) {
            dia.c(dhzVarB, digVar);
        }
        this.mRetainInstance = z;
        cr crVar = this.mFragmentManager;
        if (crVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            crVar.y.a(this);
        } else {
            crVar.y.e(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        br brVar = this.mAnimationInfo;
        brVar.g = arrayList;
        brVar.h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().n = obj;
    }

    @Deprecated
    public void setTargetFragment(bv bvVar, int i) {
        if (bvVar != null) {
            int i2 = dia.a;
            dih dihVar = new dih(this, bvVar, i);
            dia.d(dihVar);
            dhz dhzVarB = dia.b(this);
            if (dhzVarB.b.contains(dhy.h) && dia.e(dhzVarB, getClass(), dihVar.getClass())) {
                dia.c(dhzVarB, dihVar);
            }
        }
        cr crVar = this.mFragmentManager;
        cr crVar2 = bvVar != null ? bvVar.mFragmentManager : null;
        if (crVar != null && crVar2 != null && crVar != crVar2) {
            throw new IllegalArgumentException(a.cj(bvVar, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
        }
        for (bv targetFragment = bvVar; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + bvVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (bvVar == null) {
            this.mTargetWho = null;
        } else {
            if (this.mFragmentManager == null || bvVar.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = bvVar;
                this.mTargetRequestCode = i;
            }
            this.mTargetWho = bvVar.mWho;
        }
        this.mTarget = null;
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        cr crVar;
        int i = dia.a;
        dii diiVar = new dii(this, z);
        dia.d(diiVar);
        dhz dhzVarB = dia.b(this);
        if (dhzVarB.b.contains(dhy.g) && dia.e(dhzVarB, getClass(), diiVar.getClass())) {
            dia.c(dhzVarB, diiVar);
        }
        if (!this.mUserVisibleHint && z && this.mState < 5 && (crVar = this.mFragmentManager) != null && isAdded() && this.mIsCreated) {
            crVar.ao(crVar.an(this));
        }
        this.mUserVisibleHint = z;
        boolean z2 = false;
        if (this.mState < 5 && !z) {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        cd<?> cdVar = this.mHost;
        if (cdVar != null) {
            return cdVar.f(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2;
        if (this.mHost == null) {
            throw new IllegalStateException(a.cj(this, "Fragment ", " not attached to Activity"));
        }
        if (cr.Y(2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        cr parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.r == null) {
            cd cdVar = parentFragmentManager.m;
            intentSender.getClass();
            if (i != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            cdVar.b.startIntentSenderForResult(intentSender, -1, intent, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (cr.Y(2)) {
                Objects.toString(bundle);
                Objects.toString(intent2);
                toString();
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        gv gvVar = new gv(intentSender);
        gvVar.a = intent2;
        gvVar.b(i3, i2);
        gw gwVarA = gvVar.a();
        parentFragmentManager.t.addLast(new cm(this.mWho, i));
        if (cr.Y(2)) {
            toString();
        }
        parentFragmentManager.r.b(gwVarA);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().u = false;
        } else if (Looper.myLooper() != this.mHost.d.getLooper()) {
            this.mHost.d.postAtFrontOfQueue(new bf(this, 6, null));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    private bv getTargetFragment(boolean z) {
        String str;
        if (z) {
            int i = dia.a;
            die dieVar = new die(this);
            dia.d(dieVar);
            dhz dhzVarB = dia.b(this);
            if (dhzVarB.b.contains(dhy.h) && dia.e(dhzVarB, getClass(), dieVar.getClass())) {
                dia.c(dhzVarB, dieVar);
            }
        }
        bv bvVar = this.mTarget;
        if (bvVar != null) {
            return bvVar;
        }
        cr crVar = this.mFragmentManager;
        if (crVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return crVar.c(str);
    }

    @Deprecated
    public static bv instantiate(Context context, String str, Bundle bundle) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            int i = cc.a;
            try {
                bv bvVar = (bv) cc.a(classLoader, str).getConstructor(null).newInstance(null);
                if (bundle != null) {
                    bundle.setClassLoader(bvVar.getClass().getClassLoader());
                    bvVar.setArguments(bundle);
                }
                return bvVar;
            } catch (ClassCastException e) {
                throw new bs("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
            } catch (ClassNotFoundException e2) {
                throw new bs("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
            }
        } catch (IllegalAccessException e3) {
            throw new bs(a.cg(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (InstantiationException e4) {
            throw new bs(a.cg(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e5) {
            throw new bs(a.cg(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e5);
        } catch (InvocationTargetException e6) {
            throw new bs(a.cg(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e6);
        }
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        cd<?> cdVar = this.mHost;
        if (cdVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterC = cdVar.c();
        layoutInflaterC.setFactory2(this.mChildFragmentManager.d);
        return layoutInflaterC;
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        cd<?> cdVar = this.mHost;
        Activity activity = cdVar == null ? null : cdVar.b;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        cd<?> cdVar = this.mHost;
        Activity activity = cdVar == null ? null : cdVar.b;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        ensureAnimationInfo().u = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        cr crVar = this.mFragmentManager;
        if (crVar != null) {
            this.mPostponedHandler = crVar.m.d;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> gp<I> registerForActivityResult(gx<I, O> gxVar, gt gtVar, go<O> goVar) {
        return prepareCallInternal(gxVar, new bp(gtVar, 0), goVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        cd<?> cdVar = this.mHost;
        if (cdVar == null) {
            throw new IllegalStateException(a.cj(this, "Fragment ", " not attached to Activity"));
        }
        cdVar.i(intent, -1, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(a.cj(this, "Fragment ", " not attached to Activity"));
        }
        cr parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.q == null) {
            parentFragmentManager.m.i(intent, i, bundle);
            return;
        }
        parentFragmentManager.t.addLast(new cm(this.mWho, i));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        parentFragmentManager.q.b(intent);
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(dvc.ON_CREATE);
                return;
            }
            return;
        }
        throw new dq(a.cj(this, "Fragment ", " did not call through to super.onViewStateRestored()"));
    }

    public bv(int i) {
        this();
        this.mContentLayoutId = i;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @Deprecated
    public void onAttachFragment(bv bvVar) {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }
}
