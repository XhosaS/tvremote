package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axw implements cpi {
    private final cpm a;
    private final cpm b;
    private final cpm c;
    private final cpm d;
    private final cpm e;
    private final cpm f;
    private final cpm g;
    private final cpm h;
    private final cpm i;
    private final /* synthetic */ int j;

    public axw(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, cpm cpmVar6, cpm cpmVar7, cpm cpmVar8, cpm cpmVar9, int i) {
        this.j = i;
        this.a = cpmVar;
        this.b = cpmVar2;
        this.c = cpmVar3;
        this.d = cpmVar4;
        this.e = cpmVar5;
        this.f = cpmVar6;
        this.g = cpmVar7;
        this.h = cpmVar8;
        this.i = cpmVar9;
    }

    @Override // defpackage.crv, defpackage.cru
    public final /* synthetic */ Object a() {
        if (this.j != 0) {
            Context context = (Context) ((cpj) this.b).a;
            byg bygVar = (byg) this.h.a();
            Object obj = ((cpj) this.e).a;
            cpm cpmVar = this.a;
            cpm cpmVar2 = this.d;
            return new aui(context, bygVar, ((aul) this.g).a(), this.f, ((atx) cpmVar2).a(), ((bnl) cpmVar).b(), (byg) obj, (byg) ((cpj) this.c).a, this.i);
        }
        Object obj2 = ((cpj) this.b).a;
        auf aufVarA = ((aug) this.a).a();
        asq asqVar = (asq) this.c.a();
        cjd cjdVar = (cjd) this.d.a();
        cpm cpmVar3 = this.h;
        cpm cpmVar4 = this.f;
        cov covVarB = cph.b(this.e);
        cov covVarB2 = cph.b(cpmVar4);
        Executor executor = (Executor) cpmVar3.a();
        return new axv(aufVarA, asqVar, cjdVar, covVarB, covVarB2, this.g, executor);
    }

    public axw(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, cpm cpmVar6, cpm cpmVar7, cpm cpmVar8, cpm cpmVar9, int i, byte[] bArr) {
        this.j = i;
        this.b = cpmVar;
        this.h = cpmVar2;
        this.g = cpmVar3;
        this.f = cpmVar4;
        this.d = cpmVar5;
        this.a = cpmVar6;
        this.e = cpmVar7;
        this.c = cpmVar8;
        this.i = cpmVar9;
    }
}
