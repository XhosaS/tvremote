package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class khl implements yjz {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ khl(bkp bkpVar, boolean z, boolean z2, awr awrVar, kw kwVar, bol bolVar, int i, int i2) {
        this.h = i2;
        this.g = bkpVar;
        this.a = z;
        this.b = z2;
        this.d = awrVar;
        this.f = kwVar;
        this.e = bolVar;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r3v5, types: [djh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [bol, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        int i = this.h;
        if (i == 0) {
            bao baoVar = (bao) obj;
            ((Integer) obj2).intValue();
            int i2 = this.c;
            Object obj3 = this.g;
            ?? r4 = this.f;
            boolean z = this.b;
            ?? r2 = this.e;
            ((khn) this.d).d(this.a, r2, z, r4, (Integer) obj3, baoVar, bdi.n(i2 | 1));
            return ygi.a;
        }
        if (i == 1) {
            bao baoVar2 = (bao) obj;
            ((Integer) obj2).intValue();
            ?? r5 = this.e;
            Object obj4 = this.f;
            Object obj5 = this.d;
            boolean z2 = this.b;
            awt.b(this.g, this.a, z2, (awr) obj5, (kw) obj4, r5, baoVar2, bdi.n(1 | this.c));
            return ygi.a;
        }
        bao baoVar3 = (bao) obj;
        ((Integer) obj2).intValue();
        int i3 = this.c;
        boolean z3 = this.b;
        boolean z4 = this.a;
        ?? r52 = this.e;
        ?? r42 = this.g;
        ((klm) this.d).o(this.f, r42, r52, z4, z3, baoVar3, bdi.n(i3 | 1));
        return ygi.a;
    }

    public /* synthetic */ khl(khn khnVar, boolean z, yjk yjkVar, boolean z2, bkp bkpVar, Integer num, int i, int i2) {
        this.h = i2;
        this.d = khnVar;
        this.a = z;
        this.e = yjkVar;
        this.b = z2;
        this.f = bkpVar;
        this.g = num;
        this.c = i;
    }

    public /* synthetic */ khl(klm klmVar, djh djhVar, List list, List list2, boolean z, boolean z2, int i, int i2) {
        this.h = i2;
        this.d = klmVar;
        this.f = djhVar;
        this.g = list;
        this.e = list2;
        this.a = z;
        this.b = z2;
        this.c = i;
    }
}
