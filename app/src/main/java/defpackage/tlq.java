package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlq {
    public static final zdy a = zdy.h("com/google/android/libraries/search/rendering/xuikit/runtime/libraryloader/XUiKitLibraryLoader");
    public final vrf b;

    public tlq(final Context context, zyh zyhVar) {
        abns.d = new abnp() { // from class: tlo
            @Override // defpackage.abnp
            public final void a(String str) {
                tfr.b(context, str, true);
            }
        };
        this.b = new vrf(new zvh() { // from class: tlp
            @Override // defpackage.zvh
            public final zyd a() {
                try {
                    mhw.a();
                    return zxy.a;
                } catch (Throwable th) {
                    ((zdv) ((zdv) ((zdv) tlq.a.c()).p(th)).q("com/google/android/libraries/search/rendering/xuikit/runtime/libraryloader/XUiKitLibraryLoader", "libraryLoadFuture", '\\', "XUiKitLibraryLoader.java")).u("Failed to load the Elements native library");
                    return zxn.g(th);
                }
            }
        }, zyhVar);
    }
}
