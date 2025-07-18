package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bl extends bv implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private dvw<dvk> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    public bl() {
        this.mDismissRunnable = new bf(this, 3, null);
        this.mOnCancelListener = new bj(this);
        this.mOnDismissListener = new kee(this, 1);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new id(this, 1);
        this.mDialogCreated = false;
    }

    private void dismissInternal(boolean z, boolean z2, boolean z3) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId < 0) {
            at atVar = new at(getParentFragmentManager());
            atVar.v();
            atVar.m(this);
            if (z3) {
                atVar.e();
                return;
            } else if (z) {
                atVar.l();
                return;
            } else {
                atVar.a();
                return;
            }
        }
        if (z3) {
            cr parentFragmentManager = getParentFragmentManager();
            int i = this.mBackStackId;
            if (i < 0) {
                throw new IllegalArgumentException(a.cf(i, "Bad id: "));
            }
            parentFragmentManager.ad(null, i, 1);
        } else {
            cr parentFragmentManager2 = getParentFragmentManager();
            int i2 = this.mBackStackId;
            if (i2 < 0) {
                throw new IllegalArgumentException(a.cf(i2, "Bad id: "));
            }
            parentFragmentManager2.H(new cp(parentFragmentManager2, i2, 1), z);
        }
        this.mBackStackId = -1;
    }

    private void prepareDialog(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.mDialog = dialogOnCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(dialogOnCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
    }

    @Override // defpackage.bv
    public ca createFragmentContainer() {
        return new bk(this, super.createFragmentContainer());
    }

    public void dismiss() {
        dismissInternal(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false, false);
    }

    public void dismissNow() {
        dismissInternal(false, false, true);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // defpackage.bv
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // defpackage.bv
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().e(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // defpackage.bv
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (cr.Y(3)) {
            toString();
        }
        return new fm(requireContext(), getTheme());
    }

    @Override // defpackage.bv
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // defpackage.bv
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().i(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (cr.Y(3)) {
            toString();
        }
        dismissInternal(true, true, false);
    }

    public View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.bv
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            prepareDialog(bundle);
            if (cr.Y(2)) {
                toString();
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (cr.Y(2)) {
            toString();
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // defpackage.bv
    public void onSaveInstanceState(Bundle bundle) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(SAVED_THEME, i2);
        }
        if (!this.mCancelable) {
            bundle.putBoolean(SAVED_CANCELABLE, false);
        }
        if (!this.mShowsDialog) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, false);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i3);
        }
    }

    @Override // defpackage.bv
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            dwf.f(decorView, this);
            dwf.d(decorView, this);
            gez.w(decorView, this);
        }
    }

    @Override // defpackage.bv
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.bv
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.bv
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final fm requireComponentDialog() {
        Dialog dialogRequireDialog = requireDialog();
        if (dialogRequireDialog instanceof fm) {
            return (fm) dialogRequireDialog;
        }
        throw new IllegalStateException(a.ck(dialogRequireDialog, this, "DialogFragment ", " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is "));
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException(a.cj(this, "DialogFragment ", " does not have a Dialog."));
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void setStyle(int i, int i2) {
        if (cr.Y(2)) {
            toString();
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    public void setupDialog(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(cr crVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        at atVar = new at(crVar);
        atVar.v();
        atVar.r(this, str);
        atVar.a();
    }

    public void showNow(cr crVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        at atVar = new at(crVar);
        atVar.v();
        atVar.r(this, str);
        atVar.e();
    }

    public bl(int i) {
        super(i);
        this.mDismissRunnable = new bf(this, 3, null);
        this.mOnCancelListener = new bj(this);
        this.mOnDismissListener = new kee(this, 1);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new id(this, 1);
        this.mDialogCreated = false;
    }

    public int show(cy cyVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        cyVar.r(this, str);
        this.mViewDestroyed = false;
        int iA = cyVar.a();
        this.mBackStackId = iA;
        return iA;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
