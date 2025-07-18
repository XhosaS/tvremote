package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjl implements fel {
    public final fel a;
    public dze c;
    public boolean d;
    private final fjg e;
    private fji i;
    private int f = 0;
    private int g = 0;
    private byte[] h = edt.b;
    public final edi b = new edi();

    public fjl(fel felVar, fjg fjgVar) {
        this.a = felVar;
        this.e = fjgVar;
    }

    private final void h(int i) {
        int length = this.h.length;
        int i2 = this.g;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f;
        int iMax = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.h;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f, bArr2, 0, i3);
        this.f = 0;
        this.g = i3;
        this.h = bArr2;
    }

    @Override // defpackage.fel
    public final /* synthetic */ int a(dyu dyuVar, int i, boolean z) {
        return fki.L(this, dyuVar, i, z);
    }

    @Override // defpackage.fel
    public final void b(dze dzeVar) {
        String str = dzeVar.Y;
        str.getClass();
        a.H(eae.b(str) == 3);
        if (!dzeVar.equals(this.c)) {
            this.c = dzeVar;
            fjg fjgVar = this.e;
            this.i = fjgVar.c(dzeVar) ? fjgVar.b(dzeVar) : null;
        }
        if (this.i == null) {
            this.a.b(dzeVar);
            return;
        }
        fel felVar = this.a;
        dzd dzdVar = new dzd(dzeVar);
        dzdVar.d("application/x-media3-cues");
        dzdVar.j = str;
        dzdVar.r = Long.MAX_VALUE;
        dzdVar.K = this.e.a(dzeVar);
        felVar.b(new dze(dzdVar));
    }

    @Override // defpackage.fel
    public final /* synthetic */ void c(edi ediVar, int i) {
        fki.M(this, ediVar, i);
    }

    @Override // defpackage.fel
    public final void d(edi ediVar, int i, int i2) {
        if (this.i == null) {
            this.a.d(ediVar, i, i2);
            return;
        }
        h(i);
        ediVar.F(this.h, this.g, i);
        this.g += i;
    }

    @Override // defpackage.fel
    public final void e(final long j, final int i, int i2, int i3, fek fekVar) {
        if (this.i == null) {
            this.a.e(j, i, i2, i3, fekVar);
            return;
        }
        eci.a(fekVar == null, "DRM on subtitles is not supported");
        int i4 = (this.g - i3) - i2;
        try {
            this.i.c(this.h, i4, i2, fjh.a, new ecq() { // from class: fjk
                @Override // defpackage.ecq
                public final void a(Object obj) {
                    fjl fjlVar = this.a;
                    fit fitVar = (fit) obj;
                    eci.e(fjlVar.c);
                    byte[] bArrC = fki.c(fitVar.a, fitVar.c);
                    edi ediVar = fjlVar.b;
                    ediVar.H(bArrC);
                    int length = bArrC.length;
                    fel felVar = fjlVar.a;
                    felVar.c(ediVar, length);
                    long j2 = fitVar.b;
                    long j3 = j;
                    if (j2 == -9223372036854775807L) {
                        a.ab(fjlVar.c.ad == Long.MAX_VALUE);
                    } else {
                        long j4 = fjlVar.c.ad;
                        j3 = j4 == Long.MAX_VALUE ? j3 + j2 : j2 + j4;
                    }
                    felVar.e(j3, 1 | i, length, 0, null);
                }
            });
        } catch (RuntimeException e) {
            if (!this.d) {
                throw e;
            }
            edb.f("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.f = i5;
        if (i5 == this.g) {
            this.f = 0;
            this.g = 0;
        }
    }

    @Override // defpackage.fel
    public final int g(dyu dyuVar, int i, boolean z) throws EOFException {
        if (this.i == null) {
            return this.a.g(dyuVar, i, z);
        }
        h(i);
        int iA = dyuVar.a(this.h, this.g, i);
        if (iA != -1) {
            this.g += iA;
            return iA;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.fel
    public final /* synthetic */ void f() {
    }
}
