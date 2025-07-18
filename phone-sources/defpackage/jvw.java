package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvw extends ixi implements jek {
    public final Context d;
    public final ihi e;
    public final ino f;
    public final iea g;
    public final wll h;
    public final isw i;

    /* JADX WARN: Illegal instructions before constructor call */
    public jvw(Context context, isw iswVar, ihi ihiVar, ino inoVar, iea ieaVar, wkx wkxVar) {
        vvd vvdVar = wun.r;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.d = context;
        this.i = iswVar;
        this.e = ihiVar;
        this.f = inoVar;
        this.g = ieaVar;
        wll wllVar = ((wun) this.b).f;
        wllVar = wllVar == null ? wll.a : wllVar;
        wllVar.getClass();
        this.h = wllVar;
    }

    @Override // defpackage.jek
    public final wll a() {
        return this.h;
    }

    public final wni i() {
        vun vunVar = ((wun) this.b).o;
        vunVar.getClass();
        return (wni) yfm.U(vunVar);
    }

    public final void j(boolean z) {
        wll wllVar = ((wun) this.b).f;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        isw iswVar = this.i;
        wllVar.getClass();
        iswVar.s(new iog(wllVar, ((ksn) ((ldy) this.g).a().g()).a), z);
    }

    public final boolean k() {
        wll wllVar = ((wun) this.b).f;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        isw iswVar = this.i;
        wllVar.getClass();
        return iswVar.t(new iog(wllVar, ((ksn) ((ldy) this.g).a().g()).a));
    }
}
