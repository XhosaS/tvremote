package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sfg extends AppCompatDialogFragment {
    private static final String STATE_ALLOW_COLLAPSED_BOTTOM_SHEET = "allow_collapsed_bottom_sheet";
    private static final String STATE_BOTTOM_SHEET_DIALOG_THEME = "bottom_sheet_dialog_theme";
    private static final String STATE_CENTERED_DIALOG_THEME = "centered_dialog_theme";
    private static final String STATE_DISABLE_DIMMING = "disable_dimming";
    private static final String STATE_ENABLE_CLOSE_ICON = "enable_close_icon";
    private int bottomSheetDialogTheme;
    private int centeredDialogTheme;
    private sfu replayDialogScroller;
    private boolean allowCollapseBottomSheet = true;
    private boolean disableDimming = false;
    private boolean enableCloseIcon = true;
    private sff dialogType = sff.AUTO;

    private void checkDialogNotCreated(String str) {
        if (getDialog() != null) {
            throw new RuntimeException(String.valueOf(str).concat(" should be called before onCreateDialog(Bundle) get called."));
        }
    }

    private boolean showAsCenteredDialog() {
        sff sffVar = this.dialogType;
        if (sffVar == sff.BOTTOM_SHEET) {
            return false;
        }
        if (sffVar == sff.CENTERED) {
            return true;
        }
        if (getContext() != null) {
            Context context = getContext();
            context.getClass();
            if (sfy.c(context)) {
                return true;
            }
        }
        return false;
    }

    public void allowCollapseBottomSheet(boolean z) {
        checkDialogNotCreated("allowCollapseBottomSheet(boolean)");
        this.allowCollapseBottomSheet = z;
    }

    public void alwaysShowAsCenteredDialog(boolean z) {
        checkDialogNotCreated("alwaysShowAsCenteredDialog(boolean)");
        if (z) {
            setDialogType(sff.CENTERED);
        }
    }

    public void disableDimming(boolean z) {
        checkDialogNotCreated("disableDimming(boolean)");
        this.disableDimming = z;
    }

    @Override // defpackage.bl
    public void dismiss() {
        if (showAsCenteredDialog()) {
            super.dismiss();
            return;
        }
        sfs sfsVar = (sfs) getDialog();
        if (sfsVar == null) {
            super.dismiss();
        } else {
            sfsVar.m = true;
            sfsVar.cancel();
        }
    }

    public void enableCloseIconOnFullscreenBottomSheet(boolean z) {
        checkDialogNotCreated("enableCloseIconOnFullscreenBottomSheet(boolean)");
        this.enableCloseIcon = z;
    }

    public View getRootView() {
        Dialog dialog = getDialog();
        if (dialog == null) {
            return null;
        }
        return dialog.findViewById(R.id.replay_dialog_container);
    }

    protected boolean isScrolledToBottom() {
        sfu sfuVar = this.replayDialogScroller;
        if (sfuVar == null) {
            return true;
        }
        return sfuVar.i();
    }

    @Override // defpackage.bl, defpackage.bv
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.centeredDialogTheme = bundle.getInt(STATE_CENTERED_DIALOG_THEME);
            this.bottomSheetDialogTheme = bundle.getInt(STATE_BOTTOM_SHEET_DIALOG_THEME);
            this.allowCollapseBottomSheet = bundle.getBoolean(STATE_ALLOW_COLLAPSED_BOTTOM_SHEET);
            this.disableDimming = bundle.getBoolean(STATE_DISABLE_DIMMING);
            this.enableCloseIcon = bundle.getBoolean(STATE_ENABLE_CLOSE_ICON);
        }
    }

    @Override // android.support.v7.app.AppCompatDialogFragment, defpackage.bl
    public Dialog onCreateDialog(Bundle bundle) {
        if (showAsCenteredDialog()) {
            Context context = getContext();
            int theme = this.centeredDialogTheme;
            if (theme == 0) {
                theme = getTheme();
            }
            return new AppCompatDialog(context, theme);
        }
        by activity = getActivity();
        activity.getClass();
        int theme2 = this.bottomSheetDialogTheme;
        if (theme2 == 0) {
            theme2 = getTheme();
        }
        return new sfs(activity, theme2, this.allowCollapseBottomSheet, this.disableDimming, this.enableCloseIcon);
    }

    public abstract View onCreateReplayDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bv
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateReplayDialogView = onCreateReplayDialogView(layoutInflater, viewGroup, bundle);
        if (viewOnCreateReplayDialogView instanceof sfu) {
            this.replayDialogScroller = (sfu) viewOnCreateReplayDialogView;
        }
        if (!showAsCenteredDialog()) {
            return viewOnCreateReplayDialogView;
        }
        sfo sfoVar = new sfo(new ContextThemeWrapper(getContext(), this.centeredDialogTheme));
        viewOnCreateReplayDialogView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        sfoVar.addView(viewOnCreateReplayDialogView);
        return sfoVar;
    }

    @Override // defpackage.bl, defpackage.bv
    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // defpackage.bl, defpackage.bv
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(STATE_CENTERED_DIALOG_THEME, this.centeredDialogTheme);
        bundle.putInt(STATE_BOTTOM_SHEET_DIALOG_THEME, this.bottomSheetDialogTheme);
        bundle.putBoolean(STATE_ALLOW_COLLAPSED_BOTTOM_SHEET, this.allowCollapseBottomSheet);
        bundle.putBoolean(STATE_DISABLE_DIMMING, this.disableDimming);
        bundle.putBoolean(STATE_ENABLE_CLOSE_ICON, this.enableCloseIcon);
    }

    protected void scrollDown() {
        sfu sfuVar = this.replayDialogScroller;
        if (sfuVar == null) {
            return;
        }
        sfuVar.e();
    }

    public void setBottomSheetDialogTheme(int i) {
        checkDialogNotCreated("setBottomSheetDialogTheme(int)");
        this.bottomSheetDialogTheme = i;
    }

    public void setCenteredDialogTheme(int i) {
        checkDialogNotCreated("setCenteredDialogTheme(int)");
        this.centeredDialogTheme = i;
    }

    public void setDialogType(sff sffVar) {
        this.dialogType = sffVar;
    }

    protected void setScrollbarsEnabled(boolean z) {
        sfu sfuVar = this.replayDialogScroller;
        if (sfuVar == null) {
            return;
        }
        sfuVar.f(z);
    }

    protected void setScrollbarsFadingEnabled(boolean z) {
        sfu sfuVar = this.replayDialogScroller;
        if (sfuVar == null) {
            return;
        }
        sfuVar.g(z);
    }

    protected boolean shownAsCenteredDialog() {
        return showAsCenteredDialog();
    }
}
