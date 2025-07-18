package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfw {
    private final List c;
    public static final uof b = uof.g(';').f().i();
    public static final Pattern a = Pattern.compile("^(\\d+)(\\+|-|-\\d+)?:(.+)$", 2);

    public lfw(List list) {
        this.c = list;
    }

    public final String a(int i) {
        int i2;
        int i3;
        gb gbVar = null;
        for (gb gbVar2 : this.c) {
            int i4 = gbVar2.b;
            if (i >= i4 && i <= (i2 = gbVar2.a) && (gbVar == null || (((i3 = gbVar.b) == i4 && gbVar.a == i2) || i3 < i4 || gbVar.a > i2))) {
                gbVar = gbVar2;
            }
        }
        if (gbVar == null) {
            return null;
        }
        return (String) gbVar.c;
    }
}
