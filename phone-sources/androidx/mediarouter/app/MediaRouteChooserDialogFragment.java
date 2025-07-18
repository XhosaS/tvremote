package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import defpackage.bl;
import defpackage.fur;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaRouteChooserDialogFragment extends bl {
    public boolean a = false;
    public Dialog b;
    private fur c;

    public MediaRouteChooserDialogFragment() {
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
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.b;
        if (dialog == null) {
            return;
        }
        if (this.a) {
            ((MediaRouteDynamicChooserDialog) dialog).a();
        } else {
            ((MediaRouteChooserDialog) dialog).b();
        }
    }

    public MediaRouteChooserDialog onCreateChooserDialog(Context context, Bundle bundle) {
        return new MediaRouteChooserDialog(context);
    }

    @Override // defpackage.bl
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.a) {
            MediaRouteDynamicChooserDialog mediaRouteDynamicChooserDialogOnCreateDynamicChooserDialog = onCreateDynamicChooserDialog(getContext());
            this.b = mediaRouteDynamicChooserDialogOnCreateDynamicChooserDialog;
            mediaRouteDynamicChooserDialogOnCreateDynamicChooserDialog.setRouteSelector(getRouteSelector());
        } else {
            MediaRouteChooserDialog mediaRouteChooserDialogOnCreateChooserDialog = onCreateChooserDialog(getContext(), bundle);
            this.b = mediaRouteChooserDialogOnCreateChooserDialog;
            mediaRouteChooserDialogOnCreateChooserDialog.setRouteSelector(getRouteSelector());
        }
        return this.b;
    }

    public MediaRouteDynamicChooserDialog onCreateDynamicChooserDialog(Context context) {
        return new MediaRouteDynamicChooserDialog(context);
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
        if (dialog != null) {
            if (this.a) {
                ((MediaRouteDynamicChooserDialog) dialog).setRouteSelector(furVar);
            } else {
                ((MediaRouteChooserDialog) dialog).setRouteSelector(furVar);
            }
        }
    }
}
