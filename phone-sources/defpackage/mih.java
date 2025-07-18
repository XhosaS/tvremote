package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mih {
    public static mjl a;
    public static mkc b;
    private idy c;
    private idf d;
    private mjc e;

    public static fuy a(Context context, eu euVar) {
        try {
            fuy fuyVarB = fuy.b(context);
            fuy.o(euVar);
            return fuyVarB;
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }

    public final synchronized idy b(lfn lfnVar, xbw xbwVar) {
        if (this.c == null) {
            this.c = lfnVar.di() ? (idy) xbwVar.b() : icz.a;
        }
        return this.c;
    }

    public final synchronized mjc c(nqq nqqVar) {
        if (this.e == null) {
            this.e = new mjc(lin.l(nqqVar, 337), lin.l(nqqVar, 338), lin.l(nqqVar, 301), lin.l(nqqVar, 309), lin.l(nqqVar, 325), lin.l(nqqVar, 302), lin.l(nqqVar, 342), lin.l(nqqVar, 343));
        }
        return this.e;
    }

    public final synchronized idf d(Context context, lfn lfnVar, lys lysVar, kuw kuwVar, iea ieaVar, lyz lyzVar, lge lgeVar, lrc lrcVar) {
        if (this.d == null) {
            this.d = new lut(context, lysVar, kuwVar, ieaVar, lgeVar, lrcVar, lyzVar, lfnVar.di(), lfnVar.J(), lfnVar.aE());
        }
        return this.d;
    }
}
