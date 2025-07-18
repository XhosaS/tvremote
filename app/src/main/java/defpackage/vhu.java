package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vhu {
    public static Set a(Map map) {
        yzo yzoVar = new yzo();
        for (Map.Entry entry : ((yyr) map).entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            vhr vhrVar = (vhr) entry.getValue();
            if (vhrVar == null) {
                throw new NullPointerException("Null provider");
            }
            yzoVar.c(new vim(str, vhrVar));
        }
        return yzoVar.f();
    }
}
