package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arm implements cpi {
    private final cpm a;
    private final cpm b;
    private final cpm c;
    private final cpm d;
    private final cpm e;
    private final /* synthetic */ int f;

    public arm(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, int i) {
        this.f = i;
        this.a = cpmVar;
        this.b = cpmVar2;
        this.c = cpmVar3;
        this.d = cpmVar4;
        this.e = cpmVar5;
    }

    @Override // defpackage.crv, defpackage.cru
    public final /* synthetic */ Object a() {
        int i = this.f;
        if (i == 0) {
            cpm cpmVar = this.e;
            return new arl(this.b, this.c, this.d, cpmVar);
        }
        if (i == 1) {
            Executor executor = (Executor) this.e.a();
            cpm cpmVar2 = this.a;
            cpm cpmVar3 = this.d;
            Set setA = ((cpo) this.c).a();
            ayv ayvVarA = ((arb) cpmVar3).a();
            return new are(executor, setA, ayvVarA, this.b);
        }
        if (i == 2) {
            cpm cpmVar4 = this.d;
            cpm cpmVar5 = this.c;
            String strA = ((aul) this.b).a();
            awy awyVarA = ((atv) cpmVar5).a();
            sd sdVar = (sd) cpmVar4.a();
            return new awq(strA, awyVarA, sdVar, this.e);
        }
        if (i == 3) {
            Context context = (Context) ((cpj) this.a).a;
            awy awyVar = (awy) this.c.a();
            return new axq(this.e, context, this.b, this.d, awyVar);
        }
        if (i != 4) {
            return new bqw((Context) ((cpj) this.c).a, (bsi) this.d.a(), (bqo) this.a.a(), (bqy) this.b.a());
        }
        ((bnl) this.c).b();
        return new cbf((((byg) ((cpj) this.d).a).f() && ((aym) this.e).a().f()) ? (auh) this.b.a() : (auh) this.a.a());
    }

    public arm(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, int i, byte[] bArr) {
        this.f = i;
        this.e = cpmVar;
        this.c = cpmVar2;
        this.d = cpmVar3;
        this.a = cpmVar4;
        this.b = cpmVar5;
    }

    public arm(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, int i, char[] cArr) {
        this.f = i;
        this.b = cpmVar;
        this.c = cpmVar2;
        this.d = cpmVar3;
        this.e = cpmVar4;
        this.a = cpmVar5;
    }

    public arm(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, int i, int[] iArr) {
        this.f = i;
        this.c = cpmVar;
        this.d = cpmVar2;
        this.e = cpmVar3;
        this.a = cpmVar4;
        this.b = cpmVar5;
    }

    public arm(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, int i, short[] sArr) {
        this.f = i;
        this.e = cpmVar;
        this.a = cpmVar2;
        this.b = cpmVar3;
        this.d = cpmVar4;
        this.c = cpmVar5;
    }
}
