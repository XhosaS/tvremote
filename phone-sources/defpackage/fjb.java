package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjb implements fdp {
    public final List a;
    public long b;
    private final fji c;
    private final dze d;
    private fel g;
    private int h;
    private int i;
    private long[] j;
    private byte[] f = edt.b;
    private final edi e = new edi();

    public fjb(fji fjiVar, dze dzeVar) {
        dze dzeVar2;
        this.c = fjiVar;
        if (dzeVar != null) {
            dzd dzdVar = new dzd(dzeVar);
            dzdVar.d("application/x-media3-cues");
            dzdVar.j = dzeVar.Y;
            dzdVar.K = fjiVar.a();
            dzeVar2 = new dze(dzdVar);
        } else {
            dzeVar2 = null;
        }
        this.d = dzeVar2;
        this.a = new ArrayList();
        this.i = 0;
        this.j = edt.c;
        this.b = -9223372036854775807L;
    }

    @Override // defpackage.fdp
    public final void c() {
        if (this.i == 5) {
            return;
        }
        this.c.d();
        this.i = 5;
    }

    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        int i = this.i;
        boolean z = false;
        if (i != 0 && i != 5) {
            z = true;
        }
        a.ab(z);
        this.b = j2;
        int i2 = this.i;
        if (i2 == 2) {
            this.i = 1;
        } else if (i2 == 4) {
            this.i = 3;
        }
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007a A[EXC_TOP_SPLITTER, PHI: r15
  0x007a: PHI (r15v3 long) = (r15v4 long), (r15v5 long) binds: [B:31:0x0077, B:28:0x006f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // defpackage.fdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(defpackage.fdq r24, defpackage.rsj r25) throws defpackage.eaf {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjb.g(fdq, rsj):int");
    }

    public final void h(jdw jdwVar) {
        eci.e(this.g);
        byte[] bArr = (byte[]) jdwVar.b;
        int length = bArr.length;
        edi ediVar = this.e;
        ediVar.H(bArr);
        this.g.c(ediVar, length);
        this.g.e(jdwVar.a, 1, length, 0, null);
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        return ImmutableList.of();
    }

    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        a.ab(this.i == 0);
        fel felVarDq = fdrVar.dq(0, 3);
        this.g = felVarDq;
        dze dzeVar = this.d;
        if (dzeVar != null) {
            felVarDq.b(dzeVar);
            fdrVar.j();
            fdrVar.r(new fdz(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.i = 1;
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
