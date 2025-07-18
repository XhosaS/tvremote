package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import defpackage.cvc;
import defpackage.cvd;
import defpackage.fm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatDialog extends fm implements AppCompatCallback {
    private AppCompatDelegate mDelegate;
    private final cvc mKeyDispatcher;

    public AppCompatDialog(Context context) {
        this(context, 0);
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.fm, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().addContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().onDestroy();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return cvd.a(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().findViewById(i);
    }

    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.create(this, this);
        }
        return this.mDelegate;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().getSupportActionBar();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    @Override // defpackage.fm, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        getDelegate().installViewFactory();
        super.onCreate(bundle);
        getDelegate().onCreate(bundle);
    }

    @Override // defpackage.fm, android.app.Dialog
    protected void onStop() {
        super.onStop();
        getDelegate().onStop();
    }

    @Override // android.support.v7.app.AppCompatCallback
    public ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // defpackage.fm, android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().setContentView(i);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().setTitle(getContext().getString(i));
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().requestWindowFeature(i);
    }

    public AppCompatDialog(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new cvc() { // from class: android.support.v7.app.AppCompatDialog$$ExternalSyntheticLambda0
            @Override // defpackage.cvc
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f$0.superDispatchKeyEvent(keyEvent);
            }
        };
        AppCompatDelegate delegate = getDelegate();
        delegate.setTheme(getThemeResId(context, i));
        delegate.onCreate(null);
    }

    @Override // defpackage.fm, android.app.Dialog
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().setContentView(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().setTitle(charSequence);
    }

    @Override // defpackage.fm, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().setContentView(view, layoutParams);
    }

    protected AppCompatDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new cvc() { // from class: android.support.v7.app.AppCompatDialog$$ExternalSyntheticLambda0
            @Override // defpackage.cvc
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f$0.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    @Override // android.support.v7.app.AppCompatCallback
    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // android.support.v7.app.AppCompatCallback
    public void onSupportActionModeStarted(ActionMode actionMode) {
    }
}
