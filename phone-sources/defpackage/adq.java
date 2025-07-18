package defpackage;

import android.support.v7.appcompat.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adq implements bie, bib {
    public final kk a;
    private final bie b;
    private final bib c;

    public adq(bie bieVar, Map map, bib bibVar) {
        this.b = new bif(map, new zn(bieVar, 10));
        this.c = bibVar;
        int i = kl.a;
        this.a = new kk((byte[]) null);
    }

    @Override // defpackage.bie
    public final Object a(String str) {
        return this.b.a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    @Override // defpackage.bie
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map b() {
        /*
            r15 = this;
            kk r0 = r15.a
            java.lang.Object[] r1 = r0.b
            long[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            r8 = r3
        L20:
            int r9 = ~r7
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            if (r8 >= r9) goto L40
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r5
            r13 = 128(0x80, double:6.3E-322)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L3c
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r1[r9]
            bib r11 = r15.c
            r11.d(r9)
        L3c:
            long r5 = r5 >> r10
            int r8 = r8 + 1
            goto L20
        L40:
            if (r9 != r10) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            bie r0 = r15.b
            java.util.Map r0 = r0.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adq.b():java.util.Map");
    }

    @Override // defpackage.bib
    public final void c(Object obj, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-858296452);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(obj) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(this) ? 128 : 256;
        }
        if (baoVarD.L((i2 & 147) != 146, i2 & 1)) {
            this.c.c(obj, yjzVar, baoVarD, i2 & R.styleable.AppCompatTheme_windowNoTitle);
            boolean zH = baoVarD.H(this) | baoVarD.H(obj);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zH || objT == ban.a) {
                objT = new ox(this, obj, 19, null);
                basVar.ae(objT);
            }
            bbn.c(obj, (yjv) objT, baoVarD);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(this, obj, yjzVar, i, 2);
        }
    }

    @Override // defpackage.bib
    public final void d(Object obj) {
        this.c.d(obj);
    }

    @Override // defpackage.bie
    public final boolean e(Object obj) {
        return this.b.e(obj);
    }

    @Override // defpackage.bie
    public final gmz f(String str, yjk yjkVar) {
        return this.b.f(str, yjkVar);
    }
}
