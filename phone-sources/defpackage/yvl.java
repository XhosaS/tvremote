package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yvl implements yvw {
    public final yil a;
    public final int b;
    public final int c;

    public yvl(yil yilVar, int i, int i2) {
        this.a = yilVar;
        this.b = i;
        this.c = i2;
        boolean z = yoy.a;
    }

    public static /* synthetic */ Object h(yvl yvlVar, ysy ysyVar, yih yihVar) {
        Object objK = yoz.k(new axy(ysyVar, yvlVar, (yih) null, 8), yihVar);
        return objK == yio.a ? objK : ygi.a;
    }

    @Override // defpackage.ysx
    public Object a(ysy ysyVar, yih yihVar) {
        return h(this, ysyVar, yihVar);
    }

    public abstract Object b(ysk yskVar, yih yihVar);

    protected abstract yvl c(yil yilVar, int i, int i2);

    protected String d() {
        return null;
    }

    public ysm e(yow yowVar) {
        daz dazVar = new daz(this, (yih) null, 12);
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        int i2 = this.c;
        yil yilVar = this.a;
        ysk yskVar = new ysk(yos.b(yowVar, yilVar), vyf.R(i, i2, 4));
        yoz.i(3, dazVar, yskVar, yskVar);
        return yskVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[PHI: r5
  0x0019: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v5 int) binds: [B:7:0x0011, B:11:0x0017, B:14:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.yvw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ysx eT(defpackage.yil r3, int r4, int r5) {
        /*
            r2 = this;
            boolean r0 = defpackage.yoy.a
            yil r0 = r2.a
            yil r3 = r3.plus(r0)
            r1 = 1
            if (r5 != r1) goto L23
            int r5 = r2.b
            r1 = -3
            if (r5 != r1) goto L11
            goto L21
        L11:
            if (r4 != r1) goto L14
            goto L19
        L14:
            r1 = -2
            if (r5 == r1) goto L21
            if (r4 != r1) goto L1b
        L19:
            r4 = r5
            goto L21
        L1b:
            int r5 = r5 + r4
            if (r5 >= 0) goto L19
            r4 = 2147483647(0x7fffffff, float:NaN)
        L21:
            int r5 = r2.c
        L23:
            boolean r0 = defpackage.yks.e(r3, r0)
            if (r0 == 0) goto L32
            int r0 = r2.b
            if (r4 != r0) goto L32
            int r0 = r2.c
            if (r5 != r0) goto L32
            return r2
        L32:
            yvl r3 = r2.c(r3, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvl.eT(yil, int, int):ysx");
    }

    public ysx f() {
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strD = d();
        if (strD != null) {
            arrayList.add(strD);
        }
        yil yilVar = this.a;
        if (yilVar != yim.a) {
            Objects.toString(yilVar);
            arrayList.add("context=".concat(String.valueOf(yilVar)));
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add(a.cf(i, "capacity="));
        }
        int i2 = this.c;
        if (i2 != 1) {
            Objects.toString(vyf.S(i2));
            arrayList.add("onBufferOverflow=".concat(vyf.S(i2)));
        }
        return yoz.a(this) + "[" + yfm.ax(arrayList, ", ", null, null, null, 62) + "]";
    }
}
