package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ctq implements ctn {
    public final String a;
    public final csz b;
    public final cta c;
    public final ctc d;
    public final ctc e;
    public final csy f;
    public final float g;
    public final List h;
    public final csy i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;

    public ctq(String str, int i, csz cszVar, cta ctaVar, ctc ctcVar, ctc ctcVar2, csy csyVar, int i2, int i3, float f, List list, csy csyVar2, boolean z) {
        this.a = str;
        this.k = i;
        this.b = cszVar;
        this.c = ctaVar;
        this.d = ctcVar;
        this.e = ctcVar2;
        this.f = csyVar;
        this.l = i2;
        this.m = i3;
        this.g = f;
        this.h = list;
        this.i = csyVar2;
        this.j = z;
    }

    @Override // defpackage.ctn
    public final cqw a(cqd cqdVar, cph cphVar, cug cugVar) {
        return new crc(cqdVar, cugVar, this);
    }
}
