package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wbt {
    final /* synthetic */ Map a;

    public wbt(Map map) {
        this.a = map;
    }

    public final String a(String str) {
        str.getClass();
        String str2 = (String) this.a.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new IllegalStateException("Unknown package ".concat(str));
    }
}
