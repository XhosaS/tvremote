package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahjj implements ahjz {
    public final agte a;
    public final int b;
    public final int c;

    public ahjj(agte agteVar, int i, int i2) {
        this.a = agteVar;
        this.b = i;
        this.c = i2;
        boolean z = ahbx.a;
    }

    static /* synthetic */ Object e(ahjj ahjjVar, ahgs ahgsVar, agsw agswVar) {
        Object objA = ahbu.a(new ahjh(ahgsVar, ahjjVar, null), agswVar);
        return objA == agtg.a ? objA : agpu.a;
    }

    protected abstract Object b(ahge ahgeVar, agsw agswVar);

    protected abstract ahjj c(agte agteVar, int i, int i2);

    public ahgg f(ahbt ahbtVar) {
        ahji ahjiVar = new ahji(this, null);
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        int i2 = this.c;
        return ahgd.b(ahbtVar, this.a, i, i2, 3, ahjiVar);
    }

    @Override // defpackage.ahgr
    public Object fD(ahgs ahgsVar, agsw agswVar) {
        return e(this, ahgsVar, agswVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[PHI: r5
  0x0019: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v5 int) binds: [B:7:0x0011, B:11:0x0017, B:14:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ahjz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ahgr h(defpackage.agte r3, int r4, int r5) {
        /*
            r2 = this;
            boolean r0 = defpackage.ahbx.a
            agte r0 = r2.a
            agte r3 = r3.plus(r0)
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
            boolean r0 = defpackage.agvy.c(r3, r0)
            if (r0 == 0) goto L32
            int r0 = r2.b
            if (r4 != r0) goto L32
            int r0 = r2.c
            if (r5 != r0) goto L32
            return r2
        L32:
            ahjj r3 = r2.c(r3, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahjj.h(agte, int, int):ahgr");
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        agte agteVar = this.a;
        if (agteVar != agtf.a) {
            Objects.toString(agteVar);
            arrayList.add("context=".concat(String.valueOf(agteVar)));
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add(a.b(i, "capacity="));
        }
        int i2 = this.c;
        if (i2 != 1) {
            Objects.toString(ahfe.a(i2));
            arrayList.add("onBufferOverflow=".concat(ahfe.a(i2)));
        }
        return getClass().getSimpleName() + "[" + agqq.G(arrayList, ", ", null, null, null, 62) + "]";
    }
}
