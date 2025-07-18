package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oiq extends ocv {
    public oiq() {
        super((short[]) null);
    }

    @Override // defpackage.ocv
    public final /* synthetic */ nwj b(Context context, Looper looper, oav oavVar, Object obj, nws nwsVar, nwt nwtVar) {
        oip oipVar = new oip(context, looper, nwsVar, nwtVar, oavVar, (oil) obj);
        if (oip.m(context) == 1) {
            Activity activity = (Activity) context;
            activity.getApplication().registerActivityLifecycleCallbacks(new oio(activity, oipVar));
        }
        return oipVar;
    }

    @Override // defpackage.ocv
    public final void aO() {
    }
}
