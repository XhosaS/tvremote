package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shc {
    public final Context a;
    public nsz b;
    private final ntm c;

    public shc(Context context, nsz nszVar) {
        this.a = context;
        this.b = nszVar;
        this.c = osr.b(context, new aagi());
    }

    public final void a(aagh aaghVar) {
        try {
            this.b.h(aaghVar, this.c).c();
        } catch (SQLiteException unused) {
        }
    }
}
