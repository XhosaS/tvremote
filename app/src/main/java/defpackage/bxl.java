package defpackage;

import androidx.window.extensions.WindowExtensionsProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxl {
    public static final bxl a = new bxl();

    static {
        agwj agwjVar = agwi.a;
        new agvq(bxl.class).c();
    }

    private bxl() {
    }

    public final int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
