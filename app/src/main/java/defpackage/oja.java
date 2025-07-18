package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oja implements oiv {
    private static final byte[] a;
    private final HashMap b;

    static {
        int i = zjr.b;
        a = zjq.a.a("fake_key", StandardCharsets.UTF_8).d();
    }

    public oja() {
        new HashMap();
        this.b = new HashMap();
        new HashMap();
    }

    @Override // defpackage.oiv
    public final zyd a(String str) {
        yqt yqtVarI = (yqt) this.b.get(str);
        if (yqtVarI == null) {
            yqtVarI = yqt.i(new oit(a));
        }
        return zxn.h(yqtVarI);
    }
}
