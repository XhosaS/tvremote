package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmx implements eer {
    private final String a;
    private final Handler b;
    private final int c;
    private final boolean d;
    private final lmi e;

    private lmx(String str, lmi lmiVar, Handler handler, boolean z, int i) {
        this.a = str.concat(" AndroidXMedia3/1.8.0-alpha01");
        this.e = lmiVar;
        this.b = handler;
        this.d = z;
        this.c = i;
    }

    public static lmx b(String str, lfn lfnVar) {
        return new lmx(str, null, null, lfnVar.cs(), -1);
    }

    public static lmx c(String str, lfn lfnVar, lmi lmiVar, Handler handler) {
        return new lmx(str, lmiVar, handler, lfnVar.cs(), lfnVar.E());
    }

    @Override // defpackage.eer
    public final ees a() {
        efb efbVar = new efb();
        efbVar.a = this.a;
        return new lmw(efbVar.a(), this.c, this.d, this.e, this.b);
    }
}
