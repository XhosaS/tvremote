package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jtz extends ixi {
    public final Object d;
    public final icu e;

    /* JADX WARN: Illegal instructions before constructor call */
    public jtz(isw iswVar, iea ieaVar, wkx wkxVar) {
        vvd vvdVar = wuv.e;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.e = iswVar;
        this.d = ieaVar;
    }

    public final void i(boolean z) {
        wll wllVar = ((wuv) this.b).b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        icu icuVar = this.e;
        wllVar.getClass();
        ((isw) icuVar).s(new iog(wllVar, ((ksn) ((ldy) this.d).a().g()).a), z);
    }

    public final boolean j() {
        wll wllVar = ((wuv) this.b).b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        icu icuVar = this.e;
        wllVar.getClass();
        return ((isw) icuVar).t(new iog(wllVar, ((ksn) ((ldy) this.d).a().g()).a));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jtz(wkx wkxVar, isi isiVar, Context context) {
        vvd vvdVar = wty.h;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.e = isiVar;
        this.d = context;
    }
}
