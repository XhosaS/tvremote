package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fn {
    private static final int a = Color.argb(230, 255, 255, 255);
    private static final int b = Color.argb(128, 27, 27, 27);

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, yjv] */
    public static /* synthetic */ void a(fl flVar) {
        gb gbVarC = d.c(0, 0);
        gb gbVarC2 = d.c(a, b);
        View decorView = flVar.getWindow().getDecorView();
        decorView.getClass();
        ?? r0 = gbVarC.c;
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) r0.a(resources)).booleanValue();
        ?? r02 = gbVarC2.c;
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean zBooleanValue2 = ((Boolean) r02.a(resources2)).booleanValue();
        fh fsVar = Build.VERSION.SDK_INT >= 30 ? new fs() : Build.VERSION.SDK_INT >= 29 ? new fr() : Build.VERSION.SDK_INT >= 28 ? new fq() : Build.VERSION.SDK_INT >= 26 ? new fp() : new fo();
        Window window = flVar.getWindow();
        window.getClass();
        fsVar.b(gbVarC, gbVarC2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = flVar.getWindow();
        window2.getClass();
        fsVar.a(window2);
    }
}
