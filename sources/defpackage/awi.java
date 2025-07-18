package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awi implements cpi {
    private final cpm a;
    private final cpm b;
    private final cpm c;
    private final cpm d;
    private final cpm e;
    private final cpm f;
    private final cpm g;
    private final cpm h;
    private final cpm i;
    private final cpm j;
    private final cpm k;
    private final cpm l;
    private final cpm m;
    private final cpm n;

    public awi(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, cpm cpmVar6, cpm cpmVar7, cpm cpmVar8, cpm cpmVar9, cpm cpmVar10, cpm cpmVar11, cpm cpmVar12, cpm cpmVar13, cpm cpmVar14) {
        this.a = cpmVar;
        this.b = cpmVar2;
        this.c = cpmVar3;
        this.d = cpmVar4;
        this.e = cpmVar5;
        this.f = cpmVar6;
        this.g = cpmVar7;
        this.h = cpmVar8;
        this.i = cpmVar9;
        this.j = cpmVar10;
        this.k = cpmVar11;
        this.l = cpmVar12;
        this.m = cpmVar13;
        this.n = cpmVar14;
    }

    @Override // defpackage.crv, defpackage.cru
    public final /* bridge */ /* synthetic */ Object a() {
        Object obj = ((cpj) this.b).a;
        auf aufVarA = ((aug) this.a).a();
        Context context = (Context) obj;
        asv asvVar = (asv) this.c.a();
        cov covVarB = cph.b(this.d);
        Object objA = this.e.a();
        Executor executor = (Executor) this.h.a();
        Object obj2 = ((cpj) this.m).a;
        return new awh(aufVarA, context, asvVar, covVarB, (awb) objA, this.f, this.g, executor, ((awz) this.i).a(), this.j, ((awp) this.k).a(), ((awr) this.l).a(), (byg) obj2, this.n);
    }
}
