package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyb implements aejg {
    public static Display b(agow agowVar, agow agowVar2) {
        Display defaultDisplay;
        if (Build.VERSION.SDK_INT >= 30) {
            defaultDisplay = ((DisplayManager) agowVar.a()).getDisplay(0);
            defaultDisplay.getClass();
        } else {
            defaultDisplay = ((WindowManager) agowVar2.a()).getDefaultDisplay();
            defaultDisplay.getClass();
        }
        defaultDisplay.getClass();
        return defaultDisplay;
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
