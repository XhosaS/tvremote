package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class juz {
    public static juy e() {
        jsw jswVar = new jsw();
        jswVar.c(0);
        jswVar.a = "";
        jswVar.b(-1);
        jswVar.d(false);
        return jswVar;
    }

    public static juz f(int i, Map map, String str) {
        juy juyVarE = e();
        ((jsw) juyVarE).a = yqv.b(str);
        boolean zContainsKey = true;
        if (i != 408) {
            if (i == 413) {
                zContainsKey = map.containsKey("Retry-After");
            } else if (i != 429) {
                if (i == 503) {
                    zContainsKey = map.containsKey("Retry-After");
                } else if (i != 504) {
                    zContainsKey = false;
                }
            }
        }
        juyVarE.d(zContainsKey);
        juyVarE.b(i);
        juyVarE.c(i);
        return juyVarE.a();
    }

    public abstract int a();

    public abstract int b();

    public abstract String c();

    public abstract boolean d();
}
