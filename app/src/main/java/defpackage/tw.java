package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tw {
    private static final int a = Color.argb(230, 255, 255, 255);
    private static final int b = Color.argb(128, 27, 27, 27);

    public static /* synthetic */ void a(tt ttVar) {
        um umVarA = ul.a(0, 0);
        um umVarA2 = ul.a(a, b);
        View decorView = ttVar.getWindow().getDecorView();
        decorView.getClass();
        agux aguxVar = umVarA.a;
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) aguxVar.a(resources)).booleanValue();
        agux aguxVar2 = umVarA2.a;
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean zBooleanValue2 = ((Boolean) aguxVar2.a(resources2)).booleanValue();
        ub uaVar = Build.VERSION.SDK_INT >= 30 ? new ua() : Build.VERSION.SDK_INT >= 29 ? new tz() : new ty();
        Window window = ttVar.getWindow();
        window.getClass();
        uaVar.a(umVarA, umVarA2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = ttVar.getWindow();
        window2.getClass();
        uaVar.b(window2);
    }
}
