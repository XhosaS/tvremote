package defpackage;

import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqr implements fel {
    private static final dze a;
    private final fel b;
    private dze d;
    private final dze c = a;
    private byte[] e = new byte[0];
    private int f = 0;

    static {
        dzd dzdVar = new dzd();
        dzdVar.d("application/id3");
        a = new dze(dzdVar);
        dzd dzdVar2 = new dzd();
        dzdVar2.d("application/x-emsg");
        new dze(dzdVar2);
    }

    public eqr(fel felVar) {
        this.b = felVar;
    }

    private final void h(int i) {
        byte[] bArr = this.e;
        if (bArr.length < i) {
            this.e = Arrays.copyOf(bArr, i + (i >> 1));
        }
    }

    @Override // defpackage.fel
    public final /* synthetic */ int a(dyu dyuVar, int i, boolean z) {
        return fki.L(this, dyuVar, i, z);
    }

    @Override // defpackage.fel
    public final void b(dze dzeVar) {
        this.d = dzeVar;
        this.b.b(this.c);
    }

    @Override // defpackage.fel
    public final /* synthetic */ void c(edi ediVar, int i) {
        fki.M(this, ediVar, i);
    }

    @Override // defpackage.fel
    public final void d(edi ediVar, int i, int i2) {
        h(this.f + i);
        ediVar.F(this.e, this.f, i);
        this.f += i;
    }

    @Override // defpackage.fel
    public final void e(long j, int i, int i2, int i3, fek fekVar) {
        this.d.getClass();
        int i4 = this.f - i3;
        edi ediVar = new edi(Arrays.copyOfRange(this.e, i4 - i2, i4));
        byte[] bArr = this.e;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f = i3;
        String str = this.d.Y;
        String str2 = this.c.Y;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.d.Y)) {
                edb.e("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: ".concat(String.valueOf(this.d.Y)));
                return;
            }
            ffu ffuVarC = ffv.c(ediVar);
            dze dzeVarA = ffuVarC.a();
            if (dzeVarA == null || !Objects.equals(str2, dzeVarA.Y)) {
                edb.e("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", str2, ffuVarC.a()));
                return;
            } else {
                byte[] bArrC = ffuVarC.c();
                bArrC.getClass();
                ediVar = new edi(bArrC);
            }
        }
        fel felVar = this.b;
        int iA = ediVar.a();
        felVar.c(ediVar, iA);
        felVar.e(j, i, iA, 0, fekVar);
    }

    @Override // defpackage.fel
    public final int g(dyu dyuVar, int i, boolean z) throws EOFException {
        h(this.f + i);
        int iA = dyuVar.a(this.e, this.f, i);
        if (iA != -1) {
            this.f += iA;
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
