package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lal {
    public long a;
    final /* synthetic */ lao b;
    private final String c;
    private final long d;
    private boolean e;

    public lal(lao laoVar, String str, long j) {
        this.b = laoVar;
        kkk.h(str);
        this.c = str;
        this.d = j;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        lao laoVar = this.b;
        this.a = laoVar.c().getLong(this.c, this.d);
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.b.c().edit();
        editorEdit.putLong(this.c, j);
        editorEdit.apply();
        this.a = j;
    }
}
