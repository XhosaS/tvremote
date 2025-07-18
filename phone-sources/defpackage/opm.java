package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class opm {
    public static ContentResolver a;
    public final String b;
    public final Object c;

    protected opm(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static void b(Context context) {
        a = context.getContentResolver();
    }

    public static opm c(String str) {
        return new opk(str, false);
    }

    public abstract Object a();
}
