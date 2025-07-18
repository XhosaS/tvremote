package androidx.mediarouter.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import defpackage.cur;
import defpackage.fur;
import defpackage.fuy;
import defpackage.fva;
import defpackage.fvb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaRouteActionProvider extends cur {
    private static final String TAG = "MRActionProvider";
    private MediaRouteButton mButton;
    private MediaRouteDialogFactory mDialogFactory;
    private final fuy mRouter;
    private fur mSelector;

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.mSelector = fur.a;
        this.mDialogFactory = MediaRouteDialogFactory.getDefault();
        this.mRouter = fuy.b(context);
    }

    @Deprecated
    public void enableDynamicGroup() {
        fvb fvbVarL = fuy.l();
        fva fvaVar = fvbVarL == null ? new fva() : new fva(fvbVarL);
        fvaVar.a();
        fuy.p(new fvb(fvaVar));
    }

    public MediaRouteDialogFactory getDialogFactory() {
        return this.mDialogFactory;
    }

    public MediaRouteButton getMediaRouteButton() {
        return this.mButton;
    }

    public fur getRouteSelector() {
        return this.mSelector;
    }

    @Override // defpackage.cur
    public View onCreateActionView() {
        if (this.mButton != null) {
            Log.e(TAG, "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        MediaRouteButton mediaRouteButtonOnCreateMediaRouteButton = onCreateMediaRouteButton();
        this.mButton = mediaRouteButtonOnCreateMediaRouteButton;
        if (!mediaRouteButtonOnCreateMediaRouteButton.d) {
            mediaRouteButtonOnCreateMediaRouteButton.d = true;
            mediaRouteButtonOnCreateMediaRouteButton.c();
        }
        this.mButton.setRouteSelector(this.mSelector);
        this.mButton.setDialogFactory(this.mDialogFactory);
        this.mButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.mButton;
    }

    public MediaRouteButton onCreateMediaRouteButton() {
        return new MediaRouteButton(getContext());
    }

    @Override // defpackage.cur
    public boolean onPerformDefaultAction() {
        MediaRouteButton mediaRouteButton = this.mButton;
        if (mediaRouteButton != null) {
            return mediaRouteButton.showDialog();
        }
        return false;
    }

    public void setDialogFactory(MediaRouteDialogFactory mediaRouteDialogFactory) {
        if (mediaRouteDialogFactory == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        if (this.mDialogFactory != mediaRouteDialogFactory) {
            this.mDialogFactory = mediaRouteDialogFactory;
            MediaRouteButton mediaRouteButton = this.mButton;
            if (mediaRouteButton != null) {
                mediaRouteButton.setDialogFactory(mediaRouteDialogFactory);
            }
        }
    }

    public void setRouteSelector(fur furVar) {
        if (furVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.mSelector.equals(furVar)) {
            return;
        }
        this.mSelector = furVar;
        MediaRouteButton mediaRouteButton = this.mButton;
        if (mediaRouteButton != null) {
            mediaRouteButton.setRouteSelector(furVar);
        }
    }

    @Deprecated
    public void setAlwaysVisible(boolean z) {
    }
}
