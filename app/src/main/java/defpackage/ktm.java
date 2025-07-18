package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ktm {
    public final lbk a;

    public ktm(lbk lbkVar) {
        this.a = lbkVar;
    }

    final void a(String str, Bundle bundle) {
        String string;
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        if (lbkVar.s()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        lao laoVar = lbkVar.e;
        lbkVar.m(laoVar);
        laoVar.v.b(string);
        lbkVar.m(laoVar);
        laoVar.w.b(System.currentTimeMillis());
    }

    final boolean b() {
        lbk lbkVar = this.a;
        lao laoVar = lbkVar.e;
        lbkVar.m(laoVar);
        lal lalVar = laoVar.w;
        lalVar.a();
        return lalVar.a > 0;
    }

    final boolean c() {
        if (b()) {
            lbk lbkVar = this.a;
            lao laoVar = lbkVar.e;
            long jCurrentTimeMillis = System.currentTimeMillis();
            lbkVar.m(laoVar);
            lal lalVar = laoVar.w;
            lalVar.a();
            if (jCurrentTimeMillis - lalVar.a > lbkVar.d.m(null, kzg.aj)) {
                return true;
            }
        }
        return false;
    }
}
