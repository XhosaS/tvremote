package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igy {
    public static final /* synthetic */ int a = 0;

    static {
        Math.ceil((Resources.getSystem().getDisplayMetrics().densityDpi / 160.0f) * 16.0f);
    }

    public static final void a(View view, final idr idrVar) {
        view.getClass();
        idrVar.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            final int i = 1;
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: igx
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    if (i != 0) {
                        int i2 = igy.a;
                        view2.getClass();
                        windowInsets.getClass();
                        idrVar.c(Integer.valueOf(windowInsets.getInsets(WindowInsets.Type.systemBars()).bottom));
                        return windowInsets;
                    }
                    int i3 = igy.a;
                    view2.getClass();
                    windowInsets.getClass();
                    idrVar.c(Integer.valueOf(windowInsets.getSystemWindowInsetBottom()));
                    return windowInsets;
                }
            });
        } else {
            final int i2 = 0;
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: igx
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    if (i2 != 0) {
                        int i22 = igy.a;
                        view2.getClass();
                        windowInsets.getClass();
                        idrVar.c(Integer.valueOf(windowInsets.getInsets(WindowInsets.Type.systemBars()).bottom));
                        return windowInsets;
                    }
                    int i3 = igy.a;
                    view2.getClass();
                    windowInsets.getClass();
                    idrVar.c(Integer.valueOf(windowInsets.getSystemWindowInsetBottom()));
                    return windowInsets;
                }
            });
        }
    }
}
