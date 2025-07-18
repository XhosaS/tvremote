package defpackage;

import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhg implements fdp {
    public boolean a;
    private final long b;
    private final edi c;
    private final fea d;
    private final fdx e;
    private final fel f;
    private fdr g;
    private fel h;
    private fel i;
    private int j;
    private ead k;
    private long l;
    private long m;
    private long n;
    private long o;
    private int p;
    private fhh q;
    private final dhq r;

    public fhg() {
        this((byte[]) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int h(defpackage.fdq r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhg.h(fdq):int");
    }

    private final long i(long j) {
        return this.l + ((j * 1000000) / this.d.d);
    }

    private final void j() {
        fhh fhhVar = this.q;
        if ((fhhVar instanceof fhd) && fhhVar.z()) {
            long j = this.o;
            if (j == -1 || j == this.q.e()) {
                return;
            }
            fhd fhdVar = (fhd) this.q;
            this.q = new fhd(this.o, fhdVar.a, fhdVar.b, fhdVar.c);
            fdr fdrVar = this.g;
            fdrVar.getClass();
            fdrVar.r(this.q);
            this.h.getClass();
            this.q.a();
        }
    }

    private static boolean k(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean l(fdq fdqVar) {
        fhh fhhVar = this.q;
        if (fhhVar != null) {
            long jE = fhhVar.e();
            if (jE != -1 && fdqVar.e() > jE - 4) {
                return true;
            }
        }
        try {
            return !fdqVar.n(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean m(fdq fdqVar, boolean z) throws EOFException {
        int iE;
        int i;
        int iA;
        fdqVar.k();
        if (((fdi) fdqVar).b == 0) {
            ead eadVarD = this.r.D(fdqVar, null);
            this.k = eadVarD;
            if (eadVarD != null) {
                this.e.b(eadVarD);
            }
            iE = (int) fdqVar.e();
            if (!z) {
                fdqVar.l(iE);
            }
            i = 0;
        } else {
            iE = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (!l(fdqVar)) {
                edi ediVar = this.c;
                ediVar.K(0);
                int iE2 = ediVar.e();
                if ((i == 0 || k(iE2, i)) && (iA = feb.a(iE2)) != -1) {
                    i2++;
                    if (i2 != 1) {
                        if (i2 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(iE2);
                        i = iE2;
                    }
                    fdqVar.g(iA - 4);
                } else {
                    int i4 = i3 + 1;
                    if (i3 == (true != z ? 131072 : 32768)) {
                        if (z) {
                            return false;
                        }
                        j();
                        throw new EOFException();
                    }
                    if (z) {
                        fdqVar.k();
                        fdqVar.g(iE + i4);
                    } else {
                        fdqVar.l(1);
                    }
                    i = 0;
                    i3 = i4;
                    i2 = 0;
                }
            } else if (i2 <= 0) {
                j();
                throw new EOFException();
            }
        }
        if (z) {
            fdqVar.l(iE + i3);
        } else {
            fdqVar.k();
        }
        this.j = i;
        return true;
    }

    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        this.j = 0;
        this.l = -9223372036854775807L;
        this.m = 0L;
        this.p = 0;
        fhh fhhVar = this.q;
        if (fhhVar instanceof fhe) {
            throw null;
        }
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        return m(fdqVar, true);
    }

    @Override // defpackage.fdp
    public final int g(fdq fdqVar, rsj rsjVar) throws Throwable {
        eci.e(this.h);
        String str = edt.a;
        int iH = h(fdqVar);
        if (iH == -1 && (this.q instanceof fhe)) {
            if (this.q.a() != i(this.m)) {
                throw null;
            }
        }
        return iH;
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        return ImmutableList.of();
    }

    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        this.g = fdrVar;
        fel felVarDq = fdrVar.dq(0, 1);
        this.h = felVarDq;
        this.i = felVarDq;
        this.g.j();
    }

    public fhg(byte[] bArr) {
        this(-9223372036854775807L);
    }

    public fhg(long j) {
        this.b = j;
        this.c = new edi(10);
        this.d = new fea();
        this.e = new fdx();
        this.l = -9223372036854775807L;
        this.r = new dhq((char[]) null);
        fdm fdmVar = new fdm();
        this.f = fdmVar;
        this.i = fdmVar;
        this.o = -1L;
    }

    @Override // defpackage.fdp
    public final void c() {
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
