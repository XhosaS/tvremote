package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class twr {
    private static final twr a = new twl();

    public static twr g(twa twaVar, twa twaVar2) {
        int iB = twaVar2.b();
        return iB == 0 ? a : iB <= 28 ? new twp(twaVar, twaVar2) : new twq(twaVar, twaVar2);
    }

    public abstract int a();

    public abstract Object b(tuy tuyVar);

    public abstract Set c();

    public abstract void d(twh twhVar, Object obj);
}
