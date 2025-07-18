package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class laj {
    public boolean a;
    final /* synthetic */ lao b;
    private final String c;
    private final boolean d;
    private boolean e;

    public laj(lao laoVar, String str, boolean z) {
        this.b = laoVar;
        kkk.h(str);
        this.c = str;
        this.d = z;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        lao laoVar = this.b;
        this.a = laoVar.c().getBoolean(this.c, this.d);
    }

    public final void b(boolean z) {
        SharedPreferences.Editor editorEdit = this.b.c().edit();
        editorEdit.putBoolean(this.c, z);
        editorEdit.apply();
        this.a = z;
    }
}
