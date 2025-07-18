package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axh implements cpi {
    private final cpm a;
    private final cpm b;
    private final cpm c;
    private final cpm d;
    private final cpm e;
    private final cpm f;
    private final /* synthetic */ int g;

    public axh(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, cpm cpmVar6, int i) {
        this.g = i;
        this.a = cpmVar;
        this.b = cpmVar2;
        this.c = cpmVar3;
        this.d = cpmVar4;
        this.e = cpmVar5;
        this.f = cpmVar6;
    }

    @Override // defpackage.crv, defpackage.cru
    public final /* synthetic */ Object a() {
        int i = this.g;
        if (i == 0) {
            asq asqVar = (asq) this.a.a();
            cjd cjdVar = (cjd) this.b.a();
            Executor executor = (Executor) this.c.a();
            cpm cpmVar = this.e;
            cov covVarB = cph.b(this.d);
            cph.b(cpmVar);
            return new axg(asqVar, cjdVar, executor, covVarB);
        }
        if (i == 1) {
            cpm cpmVar2 = this.f;
            cpm cpmVar3 = this.c;
            return new bfv((bfv) cpmVar2.a(), (cjd) cpmVar3.a(), (Random) this.e.a(), this.d, this.b, this.a);
        }
        if (i == 2) {
            cpm cpmVar4 = this.d;
            auf aufVarA = ((aug) this.b).a();
            cpm cpmVar5 = this.c;
            cov covVarB2 = cph.b(this.f);
            cph.b(cpmVar5);
            return new ayk(aufVarA, covVarB2, this.e, ((ayy) this.a).a());
        }
        if (i == 3) {
            cpm cpmVar6 = this.e;
            cpm cpmVar7 = this.c;
            cpm cpmVar8 = this.b;
            cpm cpmVar9 = this.f;
            return new bfv(this.d, this.a, cpmVar9, cpmVar8, cpmVar7, cpmVar6);
        }
        if (i == 4) {
            final Context context = (Context) ((cpj) this.b).a;
            final Set set = (Set) ((cpj) this.d).a;
            final byg bygVar = (byg) ((cpj) this.f).a;
            Object obj = ((cpj) this.a).a;
            final awy awyVarA = ((bds) this.e).a();
            final byg bygVar2 = (byg) obj;
            final cpm cpmVar10 = this.c;
            return new beb() { // from class: bdw
                @Override // defpackage.beb
                public final void a() {
                    Set set2 = set;
                    awy awyVar = awyVarA;
                    byg bygVar3 = bygVar2;
                    if (!set2.isEmpty() || awyVar.d() || ((Boolean) bygVar3.d(false)).booleanValue()) {
                        crv crvVar = cpmVar10;
                        byg bygVar4 = bygVar;
                        Application application = (Application) context;
                        Application.ActivityLifecycleCallbacks bdxVar = new bdx(application, bygVar4, set2, awyVar, bygVar3, crvVar);
                        if (bygVar4.f()) {
                            bdxVar = (Application.ActivityLifecycleCallbacks) ((byb) bygVar4.b()).a(bdxVar);
                        }
                        application.registerActivityLifecycleCallbacks(bdxVar);
                    }
                }
            };
        }
        if (i == 5) {
            return new bqc((Context) ((cpj) this.e).a, (bsi) this.a.a(), (bqo) this.d.a(), (btf) this.c.a(), (bqv) this.b.a(), ((Boolean) this.f.a()).booleanValue());
        }
        buf bufVar = (buf) ((cpj) this.b).a;
        bsi bsiVar = (bsi) this.c.a();
        cpm cpmVar11 = this.d;
        Object objA = this.e.a();
        return new bqv(bufVar, bsiVar, (bqy) objA, this.f, (btf) cpmVar11.a(), ((Boolean) this.a.a()).booleanValue());
    }

    public axh(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, cpm cpmVar6, int i, byte[] bArr) {
        this.g = i;
        this.f = cpmVar;
        this.c = cpmVar2;
        this.e = cpmVar3;
        this.d = cpmVar4;
        this.b = cpmVar5;
        this.a = cpmVar6;
    }

    public axh(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, cpm cpmVar6, int i, char[] cArr) {
        this.g = i;
        this.b = cpmVar;
        this.d = cpmVar2;
        this.f = cpmVar3;
        this.c = cpmVar4;
        this.e = cpmVar5;
        this.a = cpmVar6;
    }

    public axh(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, cpm cpmVar6, int i, float[] fArr) {
        this.g = i;
        this.b = cpmVar;
        this.c = cpmVar2;
        this.e = cpmVar3;
        this.f = cpmVar4;
        this.d = cpmVar5;
        this.a = cpmVar6;
    }

    public axh(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, cpm cpmVar6, int i, int[] iArr) {
        this.g = i;
        this.b = cpmVar;
        this.c = cpmVar2;
        this.d = cpmVar3;
        this.f = cpmVar4;
        this.e = cpmVar5;
        this.a = cpmVar6;
    }

    public axh(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, cpm cpmVar6, int i, short[] sArr) {
        this.g = i;
        this.d = cpmVar;
        this.a = cpmVar2;
        this.f = cpmVar3;
        this.b = cpmVar4;
        this.c = cpmVar5;
        this.e = cpmVar6;
    }

    public axh(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, cpm cpmVar5, cpm cpmVar6, int i, boolean[] zArr) {
        this.g = i;
        this.e = cpmVar;
        this.a = cpmVar2;
        this.d = cpmVar3;
        this.c = cpmVar4;
        this.b = cpmVar5;
        this.f = cpmVar6;
    }
}
