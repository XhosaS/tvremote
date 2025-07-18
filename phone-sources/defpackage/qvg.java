package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvg {
    private static final String a = "qvg";

    private qvg() {
    }

    public static void a(View view, tst tstVar, int i, qth qthVar, Object obj, String str, tst tstVar2) {
        if (obj == null) {
            bv bvVarD = d(view);
            Activity activity = bvVarD != null ? bvVarD.getActivity() : null;
            if (activity == null) {
                activity = c(view.getContext());
            }
            try {
                new fx((byte[]) null).e().r(activity, Uri.parse(str));
                return;
            } catch (ActivityNotFoundException e) {
                Log.e(a, String.format("Can't open URL '%s'. This can happen if there is no browser app on the device.", str), e);
                return;
            }
        }
        qthVar.j(obj);
        String strD = qthVar.d(obj);
        vtw vtwVarM = uzl.a.m();
        int i2 = i - 1;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uzl uzlVar = (uzl) vtwVarM.b;
        uzlVar.b = 1 | uzlVar.b;
        uzlVar.c = i2;
        b(view, strD, (uzl) vtwVarM.r(), tstVar2);
    }

    public static void b(View view, String str, uzl uzlVar, tst tstVar) {
        bv bvVarD = d(view);
        Intent intentAn = rrx.an(str, uzlVar, trk.a, tstVar.b(new prn(9)));
        Activity activity = bvVarD != null ? bvVarD.getActivity() : null;
        if (activity == null) {
            activity = c(view.getContext());
        }
        activity.startActivityForResult(intentAn, 51332);
    }

    private static Activity c(Context context) {
        Object objCast;
        context.getClass();
        int i = 0;
        while (true) {
            objCast = null;
            if (i < 1000) {
                if (!Activity.class.isInstance(context)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                    i++;
                } else {
                    objCast = Activity.class.cast(context);
                    break;
                }
            } else {
                break;
            }
        }
        Activity activity = (Activity) objCast;
        activity.getClass();
        return activity;
    }

    private static bv d(View view) {
        try {
            return cr.d(view);
        } catch (IllegalStateException e) {
            Log.e(a, "Failed to find Fragment for view", e);
            return null;
        }
    }
}
