package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcd {
    public final bce a(bcf bcfVar) {
        bcfVar.getClass();
        int iOrdinal = bcfVar.ordinal();
        if (iOrdinal == 1) {
            return bce.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return bce.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return bce.ON_RESUME;
    }
}
