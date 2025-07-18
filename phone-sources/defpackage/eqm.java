package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqm extends exw {
    public static final /* synthetic */ int o = 0;
    private static final AtomicInteger z = new AtomicInteger();
    private final ees A;
    private final boolean B;
    private final boolean C;
    private final edo D;
    private final eql E;
    private final List F;
    private final dza G;
    private final boolean H;
    private final boolean I;
    private int J;
    private boolean K;
    private volatile boolean L;
    private final eqe M;
    public final int a;
    public final int b;
    public final Uri c;
    public final boolean d;
    public final int e;
    public final eey f;
    public final fgh g;
    public final edi h;
    public eqt i;
    public boolean j;
    public ImmutableList k;
    public boolean l;
    public long m;
    public eqe n;

    public eqm(eql eqlVar, ees eesVar, eey eeyVar, dze dzeVar, boolean z2, ees eesVar2, eey eeyVar2, boolean z3, Uri uri, List list, int i, long j, long j2, long j3, int i2, boolean z4, int i3, boolean z5, boolean z6, edo edoVar, dza dzaVar, eqe eqeVar, fgh fghVar, edi ediVar, boolean z7) {
        super(eesVar, eeyVar, dzeVar, i, j, j2, j3);
        this.H = z2;
        this.e = i2;
        this.m = z4 ? j2 - j : -9223372036854775807L;
        this.b = i3;
        this.f = eeyVar2;
        this.A = eesVar2;
        this.K = eeyVar2 != null;
        this.I = z3;
        this.c = uri;
        this.B = z6;
        this.D = edoVar;
        this.C = z5;
        this.E = eqlVar;
        this.F = list;
        this.G = dzaVar;
        this.M = eqeVar;
        this.g = fghVar;
        this.h = ediVar;
        this.d = z7;
        this.k = ImmutableList.of();
        this.a = z.getAndIncrement();
    }

    public static ees b(ees eesVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return eesVar;
        }
        bArr2.getClass();
        return new eqd(eesVar, bArr, bArr2);
    }

    public static byte[] h(String str) {
        if (sij.J(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length;
        int i = length > 16 ? length - 16 : 0;
        System.arraycopy(byteArray, i, bArr, (16 - length) + i, length - i);
        return bArr;
    }

    private final long j(fdq fdqVar) {
        fdqVar.k();
        try {
            edi ediVar = this.h;
            ediVar.G(10);
            fdqVar.i(ediVar.a, 0, 10);
            edi ediVar2 = this.h;
            if (ediVar2.l() != 4801587) {
                return -9223372036854775807L;
            }
            ediVar2.L(3);
            int i = ediVar2.i();
            int i2 = i + 10;
            if (i2 > ediVar2.b()) {
                byte[] bArr = ediVar2.a;
                ediVar2.G(i2);
                System.arraycopy(bArr, 0, ediVar2.a, 0, 10);
            }
            fdqVar.i(ediVar2.a, 10, i);
            ead eadVarC = this.g.c(ediVar2.a, i);
            if (eadVarC == null) {
                return -9223372036854775807L;
            }
            int iA = eadVarC.a();
            for (int i3 = 0; i3 < iA; i3++) {
                eac eacVarB = eadVarC.b(i3);
                if (eacVarB instanceof fgm) {
                    fgm fgmVar = (fgm) eacVarB;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(fgmVar.a)) {
                        System.arraycopy(fgmVar.b, 0, ediVar2.a, 0, 8);
                        ediVar2.K(0);
                        ediVar2.J(8);
                        return ediVar2.q() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
            return -9223372036854775807L;
        }
    }

    private final fdi k(ees eesVar, eey eeyVar, boolean z2) throws IOException {
        eqe eqeVar;
        eqe eqeVar2;
        eql eqlVar;
        ArrayList arrayList;
        int i;
        edo edoVar;
        int i2;
        fdp flfVar;
        int i3;
        fdp fhwVar;
        List listSingletonList;
        int i4;
        fjg fjgVar;
        fjg fjgVar2;
        int i5;
        char c;
        fdp fhgVar;
        long jB = eesVar.b(eeyVar);
        if (z2) {
            try {
                this.D.k(this.B, this.v);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        fdi fdiVar = new fdi(eesVar, eeyVar.f, jB);
        if (this.n == null) {
            long j = j(fdiVar);
            fdiVar.k();
            eqe eqeVar3 = this.M;
            int i6 = 1;
            if (eqeVar3 != null) {
                a.ab(!eqeVar3.a());
                fdp fdpVar = eqeVar3.a;
                eci.b(true, "Can't recreate wrapped extractors. Outer type: ".concat(String.valueOf(String.valueOf(fdpVar.getClass()))));
                if (fdpVar instanceof eqx) {
                    fhgVar = new eqx(eqeVar3.b.N, eqeVar3.c, eqeVar3.d, eqeVar3.e);
                } else if (fdpVar instanceof flj) {
                    fhgVar = new flj();
                } else if (fdpVar instanceof flf) {
                    fhgVar = new flf();
                } else if (fdpVar instanceof flh) {
                    fhgVar = new flh();
                } else {
                    if (!(fdpVar instanceof fhg)) {
                        throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(String.valueOf(fdpVar.getClass().getSimpleName())));
                    }
                    fhgVar = new fhg((byte[]) null);
                }
                eqeVar2 = new eqe(fhgVar, eqeVar3.b, eqeVar3.c, eqeVar3.d, eqeVar3.e);
            } else {
                eql eqlVar2 = this.E;
                Uri uri = eeyVar.a;
                dze dzeVar = this.s;
                List list = this.F;
                edo edoVar2 = this.D;
                Map mapE = eesVar.e();
                int iJ = dvb.j(dzeVar.Y);
                int iK = dvb.k(mapE);
                int iL = dvb.l(uri);
                ArrayList arrayList2 = new ArrayList(7);
                eqf.b(iJ, arrayList2);
                eqf.b(iK, arrayList2);
                eqf.b(iL, arrayList2);
                int[] iArr = eqf.a;
                for (int i7 = 0; i7 < 7; i7++) {
                    eqf.b(iArr[i7], arrayList2);
                }
                fdiVar.k();
                int i8 = 0;
                fdp fdpVar2 = null;
                while (true) {
                    if (i8 >= arrayList2.size()) {
                        fdpVar2.getClass();
                        eqf eqfVar = (eqf) eqlVar2;
                        eqeVar = new eqe(fdpVar2, dzeVar, edoVar2, eqfVar.b, eqfVar.c);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList2.get(i8)).intValue();
                    int i9 = iJ;
                    if (iIntValue == 0) {
                        eqlVar = eqlVar2;
                        arrayList = arrayList2;
                        i = i8;
                        edoVar = edoVar2;
                        i2 = i9;
                        flfVar = new flf();
                    } else if (iIntValue == i6) {
                        eqlVar = eqlVar2;
                        arrayList = arrayList2;
                        i = i8;
                        edoVar = edoVar2;
                        i2 = i9;
                        flfVar = new flh();
                    } else if (iIntValue == 2) {
                        eqlVar = eqlVar2;
                        arrayList = arrayList2;
                        i = i8;
                        edoVar = edoVar2;
                        i2 = i9;
                        flfVar = new flj();
                    } else if (iIntValue != 7) {
                        if (iIntValue == 8) {
                            eqlVar = eqlVar2;
                            arrayList = arrayList2;
                            edo edoVar3 = edoVar2;
                            i2 = i9;
                            eqf eqfVar2 = (eqf) eqlVar;
                            fjg fjgVar3 = eqfVar2.b;
                            boolean z3 = eqfVar2.c;
                            ead eadVar = dzeVar.V;
                            if (eadVar != null) {
                                i = i8;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= eadVar.a()) {
                                        break;
                                    }
                                    eac eacVarB = eadVar.b(i10);
                                    int i11 = i10;
                                    if (eacVarB instanceof eqv) {
                                        i3 = ((eqv) eacVarB).c.isEmpty() ? 0 : 4;
                                    } else {
                                        i10 = i11 + 1;
                                    }
                                }
                            } else {
                                i = i8;
                            }
                            if (!z3) {
                                i3 |= 32;
                                fjgVar3 = fjg.a;
                            }
                            int i12 = i3;
                            fjg fjgVar4 = fjgVar3;
                            int i13 = fhw.b;
                            fhwVar = new fhw(fjgVar4, i12, edoVar3, list != null ? list : ImmutableList.of(), null);
                            edoVar = edoVar3;
                        } else if (iIntValue == 11) {
                            eqlVar = eqlVar2;
                            arrayList = arrayList2;
                            eqf eqfVar3 = (eqf) eqlVar;
                            fjg fjgVar5 = eqfVar3.b;
                            boolean z4 = eqfVar3.c;
                            if (list != null) {
                                i4 = 48;
                                listSingletonList = list;
                            } else {
                                dzd dzdVar = new dzd();
                                dzdVar.d("application/cea-608");
                                listSingletonList = Collections.singletonList(new dze(dzdVar));
                                i4 = 16;
                            }
                            String str = dzeVar.U;
                            if (TextUtils.isEmpty(str)) {
                                fjgVar = fjgVar5;
                            } else {
                                fjgVar = fjgVar5;
                                if (!eae.k(str, "audio/mp4a-latm")) {
                                    i4 |= 2;
                                }
                                if (!eae.k(str, "video/avc")) {
                                    i4 |= 4;
                                }
                            }
                            if (z4) {
                                fjgVar2 = fjgVar;
                                i5 = 0;
                                c = 11;
                                edoVar = edoVar2;
                            } else {
                                fjgVar2 = fjg.a;
                                i5 = 1;
                                edoVar = edoVar2;
                                c = 11;
                            }
                            i2 = i9;
                            fhwVar = new fmq(2, i5, fjgVar2, edoVar, new zuw(i4, listSingletonList));
                            i = i8;
                        } else if (iIntValue != 13) {
                            eqlVar = eqlVar2;
                            arrayList = arrayList2;
                            i = i8;
                            edoVar = edoVar2;
                            flfVar = null;
                            i2 = i9;
                        } else {
                            eqlVar = eqlVar2;
                            eqf eqfVar4 = (eqf) eqlVar;
                            arrayList = arrayList2;
                            flfVar = new eqx(dzeVar.N, edoVar2, eqfVar4.b, eqfVar4.c);
                            i2 = i9;
                            i = i8;
                            edoVar = edoVar2;
                        }
                        flfVar = fhwVar;
                    } else {
                        eqlVar = eqlVar2;
                        arrayList = arrayList2;
                        i = i8;
                        edoVar = edoVar2;
                        i2 = i9;
                        flfVar = new fhg(0L);
                    }
                    flfVar.getClass();
                    if (eqf.c(flfVar, fdiVar)) {
                        eqf eqfVar5 = (eqf) eqlVar;
                        eqeVar = new eqe(flfVar, dzeVar, edoVar, eqfVar5.b, eqfVar5.c);
                        break;
                    }
                    if (fdpVar2 == null && (iIntValue == i2 || iIntValue == iK || iIntValue == iL || iIntValue == 11)) {
                        fdpVar2 = flfVar;
                    }
                    i8 = i + 1;
                    iJ = i2;
                    edoVar2 = edoVar;
                    eqlVar2 = eqlVar;
                    arrayList2 = arrayList;
                    i6 = 1;
                }
                eqeVar2 = eqeVar;
            }
            this.n = eqeVar2;
            fdp fdpVar3 = eqeVar2.a;
            if ((fdpVar3 instanceof flj) || (fdpVar3 instanceof flf) || (fdpVar3 instanceof flh) || (fdpVar3 instanceof fhg)) {
                this.i.t(j != -9223372036854775807L ? this.D.b(j) : this.v);
            } else {
                this.i.t(0L);
            }
            this.i.i.clear();
            this.n.a.y(this.i);
        }
        eqt eqtVar = this.i;
        dza dzaVar = this.G;
        if (!Objects.equals(eqtVar.B, dzaVar)) {
            eqtVar.B = dzaVar;
            int i14 = 0;
            while (true) {
                eqs[] eqsVarArr = eqtVar.h;
                if (i14 >= eqsVarArr.length) {
                    break;
                }
                if (eqtVar.w[i14]) {
                    eqsVarArr[i14].i(dzaVar);
                }
                i14++;
            }
        }
        return fdiVar;
    }

    private final void l(ees eesVar, eey eeyVar, boolean z2, boolean z3) {
        eey eeyVarA;
        long j;
        long j2;
        if (z2) {
            z = this.J != 0;
            eeyVarA = eeyVar;
        } else {
            eeyVarA = eeyVar.a(this.J);
        }
        try {
            fdi fdiVarK = k(eesVar, eeyVarA, z3);
            if (z) {
                fdiVarK.l(this.J);
            }
            do {
                try {
                    try {
                        if (this.L) {
                            break;
                        }
                    } catch (EOFException e) {
                        if ((this.s.P & 16384) == 0) {
                            throw e;
                        }
                        this.n.a.d(0L, 0L);
                        j = fdiVarK.b;
                        j2 = eeyVar.f;
                    }
                } catch (Throwable th) {
                    this.J = (int) (fdiVarK.b - eeyVar.f);
                    throw th;
                }
            } while (this.n.a.g(fdiVarK, eqe.f) == 0);
            j = fdiVarK.b;
            j2 = eeyVar.f;
            this.J = (int) (j - j2);
        } finally {
            ecm.e(eesVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(int i) {
        a.ab(!this.d);
        if (i >= this.k.size()) {
            return 0;
        }
        return ((Integer) this.k.get(i)).intValue();
    }

    @Override // defpackage.ezt
    public final void c() {
        this.L = true;
    }

    public final void d() {
        this.l = true;
    }

    @Override // defpackage.ezt
    public final void e() {
        eqe eqeVar;
        this.i.getClass();
        if (this.n == null && (eqeVar = this.M) != null && eqeVar.a()) {
            this.n = eqeVar;
            this.K = false;
        }
        if (this.K) {
            ees eesVar = this.A;
            eesVar.getClass();
            eey eeyVar = this.f;
            eeyVar.getClass();
            l(eesVar, eeyVar, this.I, false);
            this.J = 0;
            this.K = false;
        }
        if (this.L) {
            return;
        }
        if (!this.C) {
            l(this.x, this.q, this.H, true);
        }
        this.j = !this.L;
    }

    @Override // defpackage.exw
    public final boolean f() {
        throw null;
    }

    public final boolean g() {
        return this.m != -9223372036854775807L;
    }
}
