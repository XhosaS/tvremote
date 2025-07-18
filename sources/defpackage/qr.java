package defpackage;

import android.content.Context;
import android.view.View;
import android.view.WindowInsets;
import android.view.inputmethod.EditorInfo;
import com.google.android.tv.remote.service.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qr {
    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    static CharSequence b(View view) {
        return view.getStateDescription();
    }

    static void c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    public static void d(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static final void e(View view, yc ycVar) {
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, ycVar);
    }

    public static final void f(View view, xf xfVar) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, xfVar);
    }

    public static final ExecutorService g(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static final akh h(Context context, String str, akg akgVar) {
        int iB;
        akh akhVar = new akh();
        int iA = akgVar.a(context, str);
        akhVar.a = iA;
        int i = 1;
        int i2 = 0;
        if (iA != 0) {
            iB = akgVar.b(context, str, false);
            akhVar.b = iB;
        } else {
            iB = akgVar.b(context, str, true);
            akhVar.b = iB;
        }
        int i3 = akhVar.a;
        if (i3 == 0) {
            if (iB == 0) {
                i = 0;
            }
            akhVar.c = i;
            return akhVar;
        }
        i2 = i3;
        if (i2 >= iB) {
            i = -1;
        }
        akhVar.c = i;
        return akhVar;
    }

    public static Object i(Class cls, String str, awy... awyVarArr) {
        int length = awyVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < awyVarArr.length; i++) {
            awy awyVar = awyVarArr[i];
            awyVar.getClass();
            clsArr[i] = (Class) awyVar.b;
            objArr[i] = awyVarArr[i].a;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
