package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cur {
    private static final String TAG = "ActionProvider(support)";
    private final Context mContext;
    private cup mSubUiVisibilityListener;
    private cuq mVisibilityListener;

    public cur(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public abstract View onCreateActionView();

    public View onCreateActionView(MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if (this.mVisibilityListener == null || !overridesItemVisibility()) {
            return;
        }
        this.mVisibilityListener.onActionProviderVisibilityChanged(isVisible());
    }

    public void reset() {
        this.mVisibilityListener = null;
        this.mSubUiVisibilityListener = null;
    }

    public void setSubUiVisibilityListener(cup cupVar) {
        this.mSubUiVisibilityListener = cupVar;
    }

    public void setVisibilityListener(cuq cuqVar) {
        if (this.mVisibilityListener != null && cuqVar != null) {
            Log.w(TAG, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.mVisibilityListener = cuqVar;
    }

    public void subUiVisibilityChanged(boolean z) {
        cup cupVar = this.mSubUiVisibilityListener;
        if (cupVar != null) {
            cupVar.onSubUiVisibilityChanged(z);
        }
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
    }
}
