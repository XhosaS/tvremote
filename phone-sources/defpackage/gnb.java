package defpackage;

import androidx.window.extensions.WindowExtensionsProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnb {
    public static final /* synthetic */ int a = 0;

    static {
        int i = ylg.a;
        new ykl(gnb.class).c();
    }

    private gnb() {
    }

    public static final int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
