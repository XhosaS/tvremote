package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lan {
    public String a;
    final /* synthetic */ lao b;
    private final String c;
    private boolean d;

    public lan(lao laoVar, String str) {
        this.b = laoVar;
        kkk.h(str);
        this.c = str;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        lao laoVar = this.b;
        this.a = laoVar.c().getString(this.c, null);
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.b.c().edit();
        editorEdit.putString(this.c, str);
        editorEdit.apply();
        this.a = str;
    }
}
