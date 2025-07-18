package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xac implements toy {
    private static final yqn a = yqn.b('.');
    private static final zdy b = zdy.h("com/google/apps/tiktok/tracing/contrib/xuikit/TikTokXUiKitTracer");
    private final wxc c;

    public xac(wxc wxcVar) {
        this.c = wxcVar;
    }

    private final wvl c() {
        if (!(wum.c().c instanceof wtx)) {
            return null;
        }
        ((zdv) ((zdv) b.d()).q("com/google/apps/tiktok/tracing/contrib/xuikit/TikTokXUiKitTracer", "maybeCleanUpErrorTrace", 68, "TikTokXUiKitTracer.java")).u("Temporarily overriding an ErrorTrace");
        return wum.a(null);
    }

    private final Object d(yrp yrpVar, String str, String... strArr) throws IOException {
        if (wum.t()) {
            return yrpVar.eV();
        }
        wvl wvlVarD = this.c.d("com/google/apps/tiktok/tracing/contrib/xuikit/TikTokXUiKitTracer", "ensureTraceNoError", 97, e(str, strArr), wwb.a);
        try {
            Object objEV = yrpVar.eV();
            wvlVarD.close();
            return objEV;
        } finally {
        }
    }

    private static String e(String str, String[] strArr) throws IOException {
        if (strArr.length == 0) {
            return str;
        }
        return str + "." + a.c(Arrays.asList(strArr));
    }

    private final void f(Runnable runnable, String str, String... strArr) throws IOException {
        if (wum.t()) {
            runnable.run();
            return;
        }
        wvl wvlVarD = this.c.d("com/google/apps/tiktok/tracing/contrib/xuikit/TikTokXUiKitTracer", "ensureTraceNoError", 81, e(str, strArr), wwb.a);
        try {
            runnable.run();
            wvlVarD.close();
        } finally {
        }
    }

    @Override // defpackage.toy
    public final Object a(yrp yrpVar, String str, String... strArr) {
        wvl wvlVarC = c();
        if (wvlVarC == null) {
            return d(yrpVar, str, strArr);
        }
        try {
            return d(yrpVar, str, strArr);
        } finally {
            wum.a(wvlVarC);
        }
    }

    @Override // defpackage.toy
    public final void b(Runnable runnable, String str, String... strArr) throws IOException {
        wvl wvlVarC = c();
        if (wvlVarC == null) {
            f(runnable, str, strArr);
            return;
        }
        try {
            f(runnable, str, strArr);
        } finally {
            wum.a(wvlVarC);
        }
    }
}
