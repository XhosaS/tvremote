package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ctp implements ctn {
    public final Path.FillType a;
    public final csz b;
    public final cta c;
    public final ctc d;
    public final ctc e;
    public final String f;
    public final boolean g;
    public final int h;

    public ctp(String str, int i, Path.FillType fillType, csz cszVar, cta ctaVar, ctc ctcVar, ctc ctcVar2, boolean z) {
        this.h = i;
        this.a = fillType;
        this.b = cszVar;
        this.c = ctaVar;
        this.d = ctcVar;
        this.e = ctcVar2;
        this.f = str;
        this.g = z;
    }

    @Override // defpackage.ctn
    public final cqw a(cqd cqdVar, cph cphVar, cug cugVar) {
        return new crb(cqdVar, cphVar, cugVar, this);
    }
}
