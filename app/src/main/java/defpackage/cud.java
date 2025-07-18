package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cud implements ctn {
    public final String a;
    public final csy b;
    public final List c;
    public final csx d;
    public final cta e;
    public final csy f;
    public final float g;
    public final boolean h;
    public final int i;
    public final int j;

    public cud(String str, csy csyVar, List list, csx csxVar, cta ctaVar, csy csyVar2, int i, int i2, float f, boolean z) {
        this.a = str;
        this.b = csyVar;
        this.c = list;
        this.d = csxVar;
        this.e = ctaVar;
        this.f = csyVar2;
        this.i = i;
        this.j = i2;
        this.g = f;
        this.h = z;
    }

    @Override // defpackage.ctn
    public final cqw a(cqd cqdVar, cph cphVar, cug cugVar) {
        return new crm(cqdVar, cugVar, this);
    }
}
