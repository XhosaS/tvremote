package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class njd extends nwq {
    static int a = 1;

    public njd(Context context, GoogleSignInOptions googleSignInOptions) {
        jzs jzsVar = nis.c;
        nwo nwoVar = new nwo();
        nwoVar.a = new ujd(1);
        super(context, jzsVar, googleSignInOptions, nwoVar.a());
    }

    public final synchronized int a() {
        int i;
        i = a;
        if (i == 1) {
            Context context = this.w;
            nvj nvjVar = nvj.a;
            int iH = nvjVar.h(context, 12451000);
            if (iH == 0) {
                i = 4;
                a = 4;
            } else if (nvjVar.i(context, iH, null) != null || odp.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                i = 2;
                a = 2;
            } else {
                i = 3;
                a = 3;
            }
        }
        return i;
    }
}
