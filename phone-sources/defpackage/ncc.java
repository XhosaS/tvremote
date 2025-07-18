package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ncc extends nde {
    public ncc() {
        super("THINKING");
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        ndf.n(ndmVar);
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
        ndl ndlVar = ndmVar.b;
        ndmVar.f(0.0f, ndlVar);
        float fE = ndlVar.e();
        ndl ndlVar2 = ndmVar.c;
        float fE2 = ndlVar2.e();
        ndl ndlVar3 = ndmVar.d;
        float fE3 = ndlVar3.e();
        ndl ndlVar4 = ndmVar.e;
        float f = fE2 - fE;
        float f2 = fE3 - fE2;
        float fE4 = ndlVar4.e() - fE3;
        if (f > 1.5707964f) {
            ndmVar.f(0.0f, ndlVar2);
        } else if (f2 > 1.5707964f) {
            ndmVar.f(1.5707964f, ndlVar2);
        } else if (fE4 > 1.5707964f) {
            ndmVar.f(3.1415927f, ndlVar4);
        } else {
            ndmVar.f(4.712389f, ndlVar);
        }
        ndlVar.g(4.712389f);
        ndlVar2.g(0.0f);
        ndlVar3.g(1.5707964f);
        ndlVar4.g(3.1415927f);
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        float f;
        float fB = ndf.b(j, j2, 6000L) - ((int) r1);
        ndl ndlVar = ndmVar.e;
        ndl ndlVar2 = ndmVar.d;
        ndl ndlVar3 = ndmVar.c;
        ndl ndlVar4 = ndmVar.b;
        if (fB >= 0.16749999f) {
            double d = fB;
            if (d < 0.25d) {
                ndlVar4.g(4.712389f);
                ndlVar3.g(1.5707964f);
                ndlVar2.g(2.6179938f);
                ndlVar.g(3.6651917f);
            } else if (fB < 0.4175f) {
                ndlVar4.g(0.0f);
                ndlVar3.g(1.5707964f);
                ndlVar2.g(3.1415927f);
                ndlVar.g(4.712389f);
            } else {
                if (d >= 0.5d) {
                    if (fB < 0.6675f) {
                        ndlVar4.g(1.5707964f);
                        ndlVar3.g(3.1415927f);
                        ndlVar2.g(4.712389f);
                        ndlVar.g(0.0f);
                    } else if (d < 0.75d) {
                        ndlVar4.g(2.6179938f);
                        ndlVar3.g(3.6651917f);
                        ndlVar2.g(4.712389f);
                        ndlVar.g(1.5707964f);
                    } else if (fB < 0.9175f) {
                        ndlVar4.g(3.1415927f);
                        ndlVar3.g(4.712389f);
                        ndlVar2.g(0.0f);
                        ndlVar.g(1.5707964f);
                    } else if (fB < 1.0f) {
                        ndlVar4.g(4.712389f);
                        ndlVar3.g(5.759587f);
                        ndlVar2.g(0.5235988f);
                        ndlVar.g(1.5707964f);
                    }
                    f = 1.0f;
                    ndmVar.j(f * 3.0f);
                    return true;
                }
                ndlVar4.g(0.5235988f);
                ndlVar3.g(1.5707964f);
                ndlVar2.g(4.712389f);
                ndlVar.g(5.759587f);
            }
            f = 2.0f;
            ndmVar.j(f * 3.0f);
            return true;
        }
        ndlVar4.g(4.712389f);
        ndlVar3.g(0.0f);
        ndlVar2.g(1.5707964f);
        ndlVar.g(3.1415927f);
        f = 1.0f;
        ndmVar.j(f * 3.0f);
        return true;
    }
}
