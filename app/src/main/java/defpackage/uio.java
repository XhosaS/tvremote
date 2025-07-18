package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uio implements uln {
    public static final TimeUnit a = TimeUnit.MILLISECONDS;
    public final Context b;
    public final zvi c;
    public final String d;
    public final Handler e;
    public final yrp f;
    public final TimeUnit g;
    public final zas h = new zbn(new TreeMap(zbv.a), new zbm());
    public final Object i = new Object();

    public uio(uil uilVar) {
        this.b = uilVar.a;
        this.c = uilVar.b;
        this.d = uilVar.c;
        this.e = uilVar.d;
        this.f = uilVar.e;
        this.g = uilVar.f;
    }

    public final void a(Uri uri) {
        int i = yyk.e;
        yyf yyfVar = new yyf(4);
        synchronized (this.i) {
            yyfVar.h(this.h.e(uri));
        }
        yyk yykVarF = yyfVar.f();
        int i2 = ((zcg) yykVarF).d;
        for (int i3 = 0; i3 < i2; i3++) {
            ((Runnable) yykVarF.get(i3)).run();
        }
    }
}
