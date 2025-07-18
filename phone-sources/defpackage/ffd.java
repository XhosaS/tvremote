package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffd extends ffh {
    private static final int[] a = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int e;

    public ffd(fel felVar) {
        super(felVar);
    }

    @Override // defpackage.ffh
    protected final boolean a(edi ediVar) throws ffg {
        if (this.b) {
            ediVar.L(1);
        } else {
            int iJ = ediVar.j();
            int i = iJ >> 4;
            this.e = i;
            if (i == 2) {
                int i2 = a[(iJ >> 2) & 3];
                dzd dzdVar = new dzd();
                dzdVar.a("video/x-flv");
                dzdVar.d("audio/mpeg");
                dzdVar.E = 1;
                dzdVar.F = i2;
                this.d.b(new dze(dzdVar));
                this.c = true;
            } else if (i == 7 || i == 8) {
                dzd dzdVar2 = new dzd();
                dzdVar2.a("video/x-flv");
                dzdVar2.d(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                dzdVar2.E = 1;
                dzdVar2.F = 8000;
                this.d.b(new dze(dzdVar2));
                this.c = true;
            } else if (i != 10) {
                throw new ffg(a.cf(i, "Audio format not supported: "));
            }
            this.b = true;
        }
        return true;
    }

    @Override // defpackage.ffh
    protected final boolean b(edi ediVar, long j) {
        if (this.e == 2) {
            int iA = ediVar.a();
            fel felVar = this.d;
            felVar.c(ediVar, iA);
            felVar.e(j, 1, iA, 0, null);
            return true;
        }
        int iJ = ediVar.j();
        if (iJ != 0 || this.c) {
            if (this.e == 10 && iJ != 1) {
                return false;
            }
            int iA2 = ediVar.a();
            fel felVar2 = this.d;
            felVar2.c(ediVar, iA2);
            felVar2.e(j, 1, iA2, 0, null);
            return true;
        }
        int iA3 = ediVar.a();
        byte[] bArr = new byte[iA3];
        ediVar.F(bArr, 0, iA3);
        gb gbVarA = fcu.a(bArr);
        dzd dzdVar = new dzd();
        dzdVar.a("video/x-flv");
        dzdVar.d("audio/mp4a-latm");
        dzdVar.j = (String) gbVarA.c;
        dzdVar.E = gbVarA.b;
        dzdVar.F = gbVarA.a;
        dzdVar.p = Collections.singletonList(bArr);
        this.d.b(new dze(dzdVar));
        this.c = true;
        return false;
    }
}
