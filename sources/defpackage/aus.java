package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aus implements cpi {
    private final cpm a;
    private final cpm b;
    private final cpm c;
    private final cpm d;
    private final cpm e;
    private final cpm f;
    private final cpm g;
    private final /* synthetic */ int h;

    public aus(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, cpm cpmVar6, cpm cpmVar7, int i) {
        this.h = i;
        this.a = cpmVar;
        this.b = cpmVar2;
        this.c = cpmVar3;
        this.d = cpmVar4;
        this.e = cpmVar5;
        this.f = cpmVar6;
        this.g = cpmVar7;
    }

    @Override // defpackage.crv, defpackage.cru
    public final /* synthetic */ Object a() {
        int i = this.h;
        if (i == 0) {
            Object obj = ((cpj) this.b).a;
            auf aufVarA = ((aug) this.a).a();
            Context context = (Context) obj;
            cjd cjdVar = (cjd) this.c.a();
            cpm cpmVar = this.f;
            cov covVarB = cph.b(this.d);
            return new aup(aufVarA, context, cjdVar, covVarB, this.e, this.g);
        }
        if (i == 1) {
            are areVar = (are) this.a.a();
            byg bygVar = (byg) ((cpj) this.b).a;
            cpm cpmVar2 = this.d;
            cpm cpmVar3 = this.e;
            return new bfv(areVar, bygVar, this.c, this.g, cpmVar3, cpmVar2);
        }
        if (i == 2) {
            Object obj2 = ((cpj) this.f).a;
            return new ayf(((aug) this.a).a(), (Context) obj2, (asq) this.c.a(), (Executor) this.d.a(), cph.b(this.b), ((ayw) this.e).a(), this.g);
        }
        cpm cpmVar4 = this.b;
        auf aufVarA2 = ((aug) this.f).a();
        cjd cjdVar2 = (cjd) cpmVar4.a();
        cph.b(this.e);
        cpm cpmVar5 = this.c;
        cpm cpmVar6 = this.d;
        cov covVarB2 = cph.b(this.g);
        att attVarA = ((ayy) cpmVar6).a();
        ((azc) cpmVar5).a();
        return new ayr(aufVarA2, cjdVar2, covVarB2, this.a, attVarA);
    }

    public aus(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, cpm cpmVar6, cpm cpmVar7, int i, byte[] bArr) {
        this.h = i;
        this.a = cpmVar;
        this.b = cpmVar2;
        this.f = cpmVar3;
        this.c = cpmVar4;
        this.g = cpmVar5;
        this.e = cpmVar6;
        this.d = cpmVar7;
    }

    public aus(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, cpm cpmVar6, cpm cpmVar7, int i, char[] cArr) {
        this.h = i;
        this.a = cpmVar;
        this.f = cpmVar2;
        this.c = cpmVar3;
        this.d = cpmVar4;
        this.b = cpmVar5;
        this.e = cpmVar6;
        this.g = cpmVar7;
    }

    public aus(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, cpm cpmVar6, cpm cpmVar7, int i, short[] sArr) {
        this.h = i;
        this.f = cpmVar;
        this.b = cpmVar2;
        this.e = cpmVar3;
        this.g = cpmVar4;
        this.a = cpmVar5;
        this.d = cpmVar6;
        this.c = cpmVar7;
    }
}
