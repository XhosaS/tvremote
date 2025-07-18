package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kak {
    private final agow a;

    @Deprecated
    public kak() {
        this.a = new agow() { // from class: kaj
            @Override // defpackage.agow
            public final Object a() {
                return ypv.a;
            }
        };
    }

    public final jyw a(Context context, String str, String str2) {
        if (!((yqt) this.a.a()).g()) {
            return new jyw(context, str, str2);
        }
        List list = jyw.m;
        jyt jytVar = new jyt(context, str);
        b(jytVar);
        if (str2 != null) {
            jytVar.e = str2;
        }
        return jytVar.b();
    }

    public final void b(jyt jytVar) {
        jyx jyxVar = (jyx) ((yqt) this.a.a()).f();
        if (jyxVar != null) {
            jytVar.c = jyxVar;
        }
    }

    public kak(agow agowVar) {
        this.a = agowVar;
    }
}
