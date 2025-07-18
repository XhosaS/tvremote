package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zhr extends zho {
    public static final zho a = new zhr();

    private zhr() {
    }

    @Override // defpackage.zho
    public final zft a(String str) {
        return new zht(Logger.getLogger(str.replace('$', '.')));
    }

    public final String toString() {
        return "Default logger backend factory";
    }
}
