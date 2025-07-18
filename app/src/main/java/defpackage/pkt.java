package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pkt {
    public static pkq a(pgm pgmVar) {
        pgg pggVar = new pgg();
        pggVar.c(true);
        pggVar.b(true);
        pggVar.a(false);
        if ((pgmVar.b & 1) != 0) {
            pggVar.c(pgmVar.c);
        }
        if ((pgmVar.b & 2) != 0) {
            pggVar.b(pgmVar.d);
        }
        if ((pgmVar.b & 4) != 0) {
            pggVar.a(pgmVar.e);
        }
        if (pggVar.d == 7) {
            return new pgh(pggVar.a, pggVar.b, pggVar.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & pggVar.d) == 0) {
            sb.append(" requiresDeviceIdle");
        }
        if ((pggVar.d & 2) == 0) {
            sb.append(" requiresCharging");
        }
        if ((pggVar.d & 4) == 0) {
            sb.append(" requiresBatteryNotLow");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
