package defpackage;

import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tha {
    public final String a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public tha(ieg iegVar, String str, ieg iegVar2) {
        String str2 = iegVar.k() ? null : ((ksy) iegVar.g()).b;
        Drawable drawable = (Drawable) iegVar2.c;
        this.c = str;
        this.d = null;
        this.e = str2;
        this.f = drawable;
        this.a = null;
        this.b = true;
    }

    public static tha a(String str, String str2, ieg iegVar) {
        return new tha(ieg.f(ksy.i(str)), str2, iegVar);
    }

    public static tha b(String str, ieg iegVar) {
        return new tha(ieg.a, str, iegVar);
    }

    public static tha c(String str, String str2, ieg iegVar) {
        return new tha(ieg.f(ksy.l(str)), str2, iegVar);
    }

    public tha(lyz lyzVar, idf idfVar, Locale locale, ksn ksnVar, ImmutableList immutableList, boolean z) {
        this.c = lyzVar;
        this.f = ksnVar;
        this.e = immutableList;
        this.b = z;
        this.a = (String) idfVar.b(ksnVar);
        this.d = locale;
    }
}
