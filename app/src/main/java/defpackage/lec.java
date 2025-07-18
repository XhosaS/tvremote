package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
class lec implements lin {
    final /* synthetic */ leo a;

    public lec(leo leoVar) {
        this.a = leoVar;
    }

    @Override // defpackage.lin
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.a.r("auto", "_err", bundle);
        } else {
            this.a.L("_err", bundle, str);
        }
    }
}
