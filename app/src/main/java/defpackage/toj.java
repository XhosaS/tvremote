package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class toj implements ofy {
    private static final zdy a = zdy.h("com/google/android/libraries/search/rendering/xuikit/runtime/theme/CachingTypefaceProvider");
    private final tol b;
    private final tmm c;
    private final tmz d;

    public toj(tmm tmmVar, tmz tmzVar, tol tolVar) {
        this.d = tmzVar;
        this.b = tolVar;
        this.c = tmmVar;
    }

    @Override // defpackage.ofy
    public final Typeface a(Context context, String str) {
        c(str);
        zyd zydVarA = this.b.a(str);
        zydVarA.getClass();
        try {
            if (!afdz.a.eV().i(context)) {
                return (Typeface) zydVarA.get();
            }
            if (zydVarA.isDone()) {
                return (Typeface) zxn.o(zydVarA);
            }
            ((zdv) ((zdv) ((zdv) a.c()).o(tmm.a, this.c.a(Level.WARNING).a())).q("com/google/android/libraries/search/rendering/xuikit/runtime/theme/CachingTypefaceProvider", "getTypeface", 145, "CachingTypefaceProvider.java")).x("Typeface was not loaded in time: %s", new aawt(aaws.NO_USER_DATA, str));
            return null;
        } catch (InterruptedException | ExecutionException e) {
            ((zdv) ((zdv) ((zdv) ((zdv) a.d()).o(tmm.a, this.c.a(Level.WARNING).a())).p(e)).q("com/google/android/libraries/search/rendering/xuikit/runtime/theme/CachingTypefaceProvider", "getTypeface", 159, "CachingTypefaceProvider.java")).x("Error loading typeface: %s", new aawt(aaws.NO_USER_DATA, str));
            return null;
        }
    }

    @Override // defpackage.ofy
    public final Typeface b(Context context, String str, int i, boolean z) {
        Typeface typefaceA = a(context, str);
        if (typefaceA != null) {
            return Typeface.create(typefaceA, i, z);
        }
        return null;
    }

    public final zyd c(final String str) {
        tol tolVar = this.b;
        Object obj = tolVar.b;
        tmz tmzVar = this.d;
        synchronized (obj) {
            Map map = tolVar.a;
            if (!map.containsKey(str)) {
                final Context context = tmzVar.b;
                final mjd mjdVar = tmzVar.a;
                map.put(str, str.startsWith("google-sans") ? tmzVar.c.submit(wyo.i(new Callable() { // from class: tmy
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return mjdVar.a(context, str);
                    }
                })) : zxy.a);
            }
        }
        zyd zydVarA = this.b.a(str);
        zydVarA.getClass();
        return zxn.i(zuz.g(zydVarA, wyo.a(new yqi() { // from class: toi
            @Override // defpackage.yqi
            public final Object apply(Object obj2) {
                return null;
            }
        }), zwk.a));
    }
}
