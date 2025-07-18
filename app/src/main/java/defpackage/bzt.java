package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzt {
    static final /* synthetic */ bzt a = new bzt();
    public static final String b = "bzu";

    private bzt() {
    }

    public final bzu a() {
        return Build.VERSION.SDK_INT >= 30 ? bzx.b : Build.VERSION.SDK_INT >= 29 ? bzw.b : bzv.b;
    }
}
