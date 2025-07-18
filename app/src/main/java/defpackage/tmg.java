package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmg {
    public final yrp a;
    public final String b;
    public final addl c;
    public final tmd d;

    public tmg(final Context context, final zyh zyhVar, addl addlVar, yqt yqtVar) {
        this.c = addlVar;
        this.b = context.getPackageName();
        this.d = (tmd) yqtVar.e(new tmd(0, 7));
        this.a = yru.a(new yrp() { // from class: tmf
            @Override // defpackage.yrp
            public final Object eV() {
                Context context2 = context;
                Context applicationContext = context2.getApplicationContext();
                return new tlw(zyhVar, new uqn(context2, "STREAMZ_XUIKIT_CLIENT_ERRORS"), applicationContext instanceof Application ? (Application) applicationContext : null);
            }
        });
    }
}
