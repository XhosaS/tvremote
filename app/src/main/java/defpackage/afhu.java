package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class afhu {
    public static afhu c() {
        List listB = afhx.a().b();
        afhu afhuVar = listB.isEmpty() ? null : (afhu) listB.get(0);
        if (afhuVar != null) {
            return afhuVar;
        }
        throw new afht();
    }

    protected abstract int a();

    public abstract afhs b(String str, int i);

    protected abstract void d();
}
