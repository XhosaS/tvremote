package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
class ldp implements Runnable {
    final /* synthetic */ leo a;

    public ldp(leo leoVar) {
        this.a = leoVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ktm ktmVar = this.a.i;
        lbk lbkVar = ktmVar.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        if (ktmVar.b()) {
            if (ktmVar.c()) {
                lao laoVar = lbkVar.e;
                lbkVar.m(laoVar);
                laoVar.v.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                leo leoVar = lbkVar.l;
                lbkVar.n(leoVar);
                leoVar.t("auto", "_cmpx", bundle);
            } else {
                lao laoVar2 = lbkVar.e;
                lbkVar.m(laoVar2);
                lan lanVar = laoVar2.v;
                lanVar.a();
                String str = lanVar.a;
                if (TextUtils.isEmpty(str)) {
                    lab labVar = lbkVar.f;
                    lbkVar.o(labVar);
                    labVar.d.a("Cache still valid but referrer not found");
                } else {
                    lbkVar.m(laoVar2);
                    lal lalVar = laoVar2.w;
                    lalVar.a();
                    long j = lalVar.a / 3600000;
                    Uri uri = Uri.parse(str);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str2 : uri.getQueryParameterNames()) {
                        bundle2.putString(str2, uri.getQueryParameter(str2));
                    }
                    ((Bundle) pair.second).putLong("_cc", (j - 1) * 3600000);
                    String str3 = pair.first == null ? "app" : (String) pair.first;
                    leo leoVar2 = lbkVar.l;
                    lbkVar.n(leoVar2);
                    leoVar2.t(str3, "_cmp", (Bundle) pair.second);
                }
                lbkVar.m(laoVar2);
                lanVar.b(null);
            }
            lao laoVar3 = lbkVar.e;
            lbkVar.m(laoVar3);
            laoVar3.w.b(0L);
        }
    }
}
