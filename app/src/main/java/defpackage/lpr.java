package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpr extends kil {
    public lpr(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public final String b() {
        return lqt.a.a(a("avatar"));
    }

    public final String c() {
        return !TextUtils.isEmpty(a("display_name")) ? a("display_name") : a("account_name");
    }

    public final String d() {
        return f() ? a("family_name") : "null";
    }

    public final String e() {
        return g() ? a("given_name") : "null";
    }

    public final boolean f() {
        return !TextUtils.isEmpty(a("family_name"));
    }

    public final boolean g() {
        return !TextUtils.isEmpty(a("given_name"));
    }
}
