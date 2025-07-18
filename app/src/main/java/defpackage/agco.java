package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agco {
    public final agcm a;
    public final agdi b;
    public int c;
    public final agcl d;

    public agco(agcm agcmVar, agdi agdiVar) {
        this.a = agcmVar;
        agdiVar.getClass();
        this.b = agdiVar;
        this.c = 65535;
        this.d = new agcl(this, 0, 65535, null);
    }

    public final void a(boolean z, agcl agclVar, ahwx ahwxVar, boolean z2) {
        ahwxVar.getClass();
        int iB = agclVar.b();
        boolean zD = agclVar.d();
        int i = (int) ahwxVar.b;
        if (zD || iB < i) {
            if (!zD && iB > 0) {
                agclVar.c(ahwxVar, iB, false);
            }
            agclVar.a.fF(ahwxVar, (int) ahwxVar.b);
            agclVar.d = z | agclVar.d;
        } else {
            agclVar.c(ahwxVar, i, z);
        }
        if (z2) {
            b();
        }
    }

    public final void b() {
        try {
            this.b.d();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void c() {
        agcm agcmVar = this.a;
        agcl[] agclVarArrS = agcmVar.s();
        Collections.shuffle(Arrays.asList(agclVarArrS));
        int length = agclVarArrS.length;
        int i = this.d.b;
        while (true) {
            int i2 = 0;
            if (length <= 0 || i <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(i / length);
            for (int i3 = 0; i3 < length && i > 0; i3++) {
                agcl agclVar = agclVarArrS[i3];
                int iMin = Math.min(i, Math.min(agclVar.a() - agclVar.c, iCeil));
                if (iMin > 0) {
                    agclVar.c += iMin;
                    i -= iMin;
                }
                if (agclVar.a() - agclVar.c > 0) {
                    agclVarArrS[i2] = agclVar;
                    i2++;
                }
            }
            length = i2;
        }
        agcn agcnVar = new agcn();
        for (agcl agclVar2 : agcmVar.s()) {
            agclVar2.e(agclVar2.c, agcnVar);
            agclVar2.c = 0;
        }
        if (agcnVar.a()) {
            b();
        }
    }

    public final void d(agcl agclVar, int i) {
        if (agclVar == null) {
            this.d.f(i);
            c();
            return;
        }
        agclVar.f(i);
        agcn agcnVar = new agcn();
        agclVar.e(agclVar.b(), agcnVar);
        if (agcnVar.a()) {
            b();
        }
    }
}
