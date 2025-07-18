package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class km {
    private static final int a = Color.argb(230, 255, 255, 255);
    private static final int b = Color.argb(128, 27, 27, 27);

    /* JADX WARN: Type inference failed for: r0v3, types: [ctu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [ctu, java.lang.Object] */
    public static final void a(kk kkVar) {
        kx kxVarB = mo.B(0, 0);
        kx kxVarB2 = mo.B(a, b);
        View decorView = kkVar.getWindow().getDecorView();
        decorView.getClass();
        ?? r0 = kxVarB.c;
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) r0.a(resources)).booleanValue();
        ?? r02 = kxVarB2.c;
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean zBooleanValue2 = ((Boolean) r02.a(resources2)).booleanValue();
        ii krVar = Build.VERSION.SDK_INT >= 30 ? new kr() : Build.VERSION.SDK_INT >= 29 ? new kq() : Build.VERSION.SDK_INT >= 28 ? new kp() : Build.VERSION.SDK_INT >= 26 ? new ko() : new kn();
        Window window = kkVar.getWindow();
        window.getClass();
        krVar.q(kxVarB, kxVarB2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = kkVar.getWindow();
        window2.getClass();
        krVar.p(window2);
    }
}
