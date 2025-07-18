package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axn implements cpi {
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
    private final /* synthetic */ int l;

    public axn(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, cpm cpmVar6, cpm cpmVar7, cpm cpmVar8, cpm cpmVar9, cpm cpmVar10, cpm cpmVar11, int i) {
        this.l = i;
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
    }

    @Override // defpackage.crv, defpackage.cru
    public final /* synthetic */ Object a() {
        if (this.l != 0) {
            Object obj = ((cpj) this.j).a;
            auf aufVarA = ((aug) this.a).a();
            Context context = (Context) obj;
            Executor executor = (Executor) this.k.a();
            cpm cpmVar = this.d;
            cpm cpmVar2 = this.f;
            avq avqVarA = ((avr) this.c).a();
            cov covVarB = cph.b(cpmVar2);
            are areVar = (are) cpmVar.a();
            bfv bfvVar = (bfv) this.i.a();
            cpm cpmVar3 = this.e;
            cpm cpmVar4 = this.b;
            return new avu(aufVarA, context, executor, avqVarA, this.h, covVarB, areVar, bfvVar, this.g, cpmVar4, cpmVar3);
        }
        cpm cpmVar5 = this.b;
        auf aufVarA2 = ((aug) this.a).a();
        cpm cpmVar6 = this.e;
        Object objA = this.d.a();
        cjd cjdVar = (cjd) cpmVar6.a();
        cpm cpmVar7 = this.h;
        cpm cpmVar8 = this.g;
        cov covVarB2 = cph.b(this.f);
        Object objA2 = cpmVar8.a();
        return new axm(aufVarA2, (axg) objA, cjdVar, covVarB2, (axq) objA2, (aqp) cpmVar7.a(), this.i, (Executor) this.j.a(), (byg) ((cpj) this.k).a);
    }

    public axn(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, cpm cpmVar6, cpm cpmVar7, cpm cpmVar8, cpm cpmVar9, cpm cpmVar10, cpm cpmVar11, int i, byte[] bArr) {
        this.l = i;
        this.a = cpmVar;
        this.j = cpmVar2;
        this.k = cpmVar3;
        this.c = cpmVar4;
        this.h = cpmVar5;
        this.f = cpmVar6;
        this.d = cpmVar7;
        this.i = cpmVar8;
        this.g = cpmVar9;
        this.b = cpmVar10;
        this.e = cpmVar11;
    }
}
