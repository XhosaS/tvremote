package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tru {
    public final Map a;
    public final yzq b;
    public final abwf c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    private final int k;

    public tru(esn esnVar, acfo acfoVar, abwf abwfVar, boolean z, long j, long j2, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        this.a = DesugarCollections.unmodifiableMap(new abxr(esnVar.b, esn.c));
        this.b = yzq.o(acfoVar.b);
        this.c = abwfVar;
        this.d = z;
        this.e = (int) j;
        this.k = (int) j2;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = str;
    }

    public final int a() {
        int i = trt.a;
        return Math.max(this.k, trt.a);
    }
}
