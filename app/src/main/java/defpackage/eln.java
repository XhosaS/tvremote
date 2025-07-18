package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eln implements elp {
    @Override // defpackage.elp
    public final void a(int i, String str, Throwable th, Map map) {
        if (i - 1 == 2) {
            throw new RuntimeException(str);
        }
    }
}
