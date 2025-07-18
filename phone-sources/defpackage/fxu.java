package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxu extends fxm {
    @Override // defpackage.fxm
    public final /* bridge */ /* synthetic */ Object b(String str) {
        if (yks.e(str, "null")) {
            return null;
        }
        return str;
    }

    @Override // defpackage.fxm
    public final String c() {
        return "string";
    }

    @Override // defpackage.fxm
    public final /* bridge */ /* synthetic */ void d(Bundle bundle, String str, Object obj) {
        String str2 = (String) obj;
        if (str2 != null) {
            ghf.c(bundle, str, str2);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // defpackage.fxm
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str) {
        str.getClass();
        if (!ggz.f(bundle, str) || ggz.g(bundle, str)) {
            return;
        }
        ggz.c(bundle, str);
    }
}
