package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lam {
    final String a;
    public final String b;
    public final String c;
    public final long d;
    final /* synthetic */ lao e;

    public lam(lao laoVar, long j) {
        this.e = laoVar;
        kkk.h("health_monitor");
        kkk.a(j > 0);
        this.a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.d = j;
    }

    public final long a() {
        return this.e.c().getLong(this.a, 0L);
    }

    public final void b() {
        lao laoVar = this.e;
        laoVar.g();
        klk klkVar = laoVar.y.B;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = laoVar.c().edit();
        editorEdit.remove(this.b);
        editorEdit.remove(this.c);
        editorEdit.putLong(this.a, jCurrentTimeMillis);
        editorEdit.apply();
    }
}
