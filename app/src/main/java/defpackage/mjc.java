package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjc {
    public static int a(acsw acswVar) {
        int iOrdinal = acswVar.ordinal();
        if (iOrdinal != 11) {
            return (iOrdinal == 12 || iOrdinal == 26) ? 5 : 6;
        }
        return 4;
    }

    public static Level b(int i) {
        return i != 4 ? i != 5 ? Level.SEVERE : Level.WARNING : Level.INFO;
    }
}
