package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnw {
    private final Context a;
    private final Set b;

    public rnw(Context context, Map map) {
        this.a = context;
        this.b = ((yyr) map).keySet();
    }

    public final boolean a() {
        if (!rnu.a()) {
            return false;
        }
        Context context = this.a;
        String strB = rnu.b();
        if (strB == null) {
            return true;
        }
        Set set = this.b;
        int size = set.size();
        if (size == 0) {
            return strB.equals(context.getPackageName());
        }
        if (size != 1) {
            throw new IllegalArgumentException("More than 1 custom main process specified");
        }
        String strA = ((rnv) zag.f(set)).a();
        yqw.F(strA.startsWith(":"), "The provided @CustomMainProcess is not an app-private one, i.e. the one staring with colon(':'). @CustomMainProcess value: %s", strA);
        return strB.equals(String.valueOf(context.getPackageName()).concat(strA));
    }
}
