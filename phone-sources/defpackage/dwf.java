package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwf {
    public static final void a(Activity activity) {
        activity.getClass();
        activity.registerActivityLifecycleCallbacks(new dwg());
    }

    public static final dwi b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            return new dwi();
        }
        ClassLoader classLoader = dwi.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        yhu yhuVar = new yhu(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            yhuVar.put(str, bundle.get(str));
        }
        return new dwi(yhuVar.e());
    }

    public static final dxd c(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            dxd dxdVar = tag instanceof dxd ? (dxd) tag : null;
            if (dxdVar != null) {
                return dxdVar;
            }
            Object objD = cws.d(view);
            view = objD instanceof View ? (View) objD : null;
        }
        return null;
    }

    public static final void d(View view, dxd dxdVar) {
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, dxdVar);
    }

    public static final dvk e(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            dvk dvkVar = tag instanceof dvk ? (dvk) tag : null;
            if (dvkVar != null) {
                return dvkVar;
            }
            Object objD = cws.d(view);
            view = objD instanceof View ? (View) objD : null;
        }
        return null;
    }

    public static final void f(View view, dvk dvkVar) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, dvkVar);
    }
}
