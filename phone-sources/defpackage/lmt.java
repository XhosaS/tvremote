package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmt extends eyi {
    private final idb a;
    private final idb b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final float g;
    private final int h;

    public lmt(idb idbVar, idb idbVar2, lfn lfnVar) {
        this.a = idbVar;
        this.b = idbVar2;
        this.c = lfnVar.aj();
        this.d = lfnVar.ah();
        this.e = lfnVar.ak();
        this.f = lfnVar.al();
        this.g = lfnVar.f();
        this.h = lfnVar.n();
    }

    @Override // defpackage.eyi
    protected final /* bridge */ /* synthetic */ eyj b(eba ebaVar, int[] iArr, ezm ezmVar, ImmutableList immutableList) {
        return new lmu(ebaVar, iArr, ezmVar, immutableList, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
