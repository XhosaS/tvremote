package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import defpackage.bl;
import defpackage.fur;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaRouteControllerDialogFragment extends bl {
    public boolean a = false;
    public Dialog b;
    private fur c;

    public MediaRouteControllerDialogFragment() {
        setCancelable(true);
    }

    private final void a() {
        if (this.c == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.c = fur.a(arguments.getBundle("selector"));
            }
            if (this.c == null) {
                this.c = fur.a;
            }
        }
    }

    public fur getRouteSelector() {
        a();
        return this.c;
    }

    @Override // defpackage.bv, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.b;
        if (dialog != null) {
            if (this.a) {
                ((MediaRouteDynamicControllerDialog) dialog).d();
            } else {
                ((MediaRouteControllerDialog) dialog).l();
            }
        }
    }

    public MediaRouteControllerDialog onCreateControllerDialog(Context context, Bundle bundle) {
        return new MediaRouteControllerDialog(context);
    }

    @Override // defpackage.bl
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.a) {
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialogOnCreateDynamicControllerDialog = onCreateDynamicControllerDialog(getContext());
            this.b = mediaRouteDynamicControllerDialogOnCreateDynamicControllerDialog;
            mediaRouteDynamicControllerDialogOnCreateDynamicControllerDialog.setRouteSelector(this.c);
        } else {
            this.b = onCreateControllerDialog(getContext(), bundle);
        }
        return this.b;
    }

    public MediaRouteDynamicControllerDialog onCreateDynamicControllerDialog(Context context) {
        return new MediaRouteDynamicControllerDialog(context);
    }

    @Override // defpackage.bl, defpackage.bv
    public void onStop() {
        super.onStop();
        Dialog dialog = this.b;
        if (dialog == null || this.a) {
            return;
        }
        ((MediaRouteControllerDialog) dialog).e(false);
    }

    public void setRouteSelector(fur furVar) {
        if (furVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        a();
        if (this.c.equals(furVar)) {
            return;
        }
        this.c = furVar;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle("selector", furVar.b);
        setArguments(arguments);
        Dialog dialog = this.b;
        if (dialog == null || !this.a) {
            return;
        }
        ((MediaRouteDynamicControllerDialog) dialog).setRouteSelector(furVar);
    }
}
