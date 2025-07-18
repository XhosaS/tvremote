package defpackage;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafm {
    public static final aafm a = new aafm(new aafn());
    public static final aafm b = new aafm(new aafr());
    private final aafl c;

    static {
        new aafm(new aaft());
        new aafm(new aafs());
        new aafm(new aafo());
        new aafm(new aafq());
        new aafm(new aafp());
    }

    public aafm(aafu aafuVar) {
        this.c = !aaaf.a() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new aafi(aafuVar) : new aafj(aafuVar) : new aafk(aafuVar);
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        return this.c.a(str);
    }
}
