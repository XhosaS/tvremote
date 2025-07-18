package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clk {
    public static final clk a = new clk(null);
    final cnt b = new cnt();
    public boolean c;
    public boolean d;

    private clk() {
    }

    public static int a(cog cogVar, int i, Object obj) {
        int iZ = cld.Z(i);
        if (cogVar == cog.GROUP) {
            cmf.f((cmz) obj);
            iZ += iZ;
        }
        coh cohVar = coh.INT;
        int iAd = 4;
        switch (cogVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                iAd = 8;
                return iZ + iAd;
            case FLOAT:
                ((Float) obj).floatValue();
                return iZ + iAd;
            case INT64:
                iAd = cld.ad(((Long) obj).longValue());
                return iZ + iAd;
            case UINT64:
                iAd = cld.ad(((Long) obj).longValue());
                return iZ + iAd;
            case INT32:
                iAd = cld.L(((Integer) obj).intValue());
                return iZ + iAd;
            case FIXED64:
                ((Long) obj).longValue();
                iAd = 8;
                return iZ + iAd;
            case FIXED32:
                ((Integer) obj).intValue();
                return iZ + iAd;
            case BOOL:
                ((Boolean) obj).booleanValue();
                iAd = 1;
                return iZ + iAd;
            case STRING:
                iAd = obj instanceof ckv ? cld.H((ckv) obj) : cld.Y((String) obj);
                return iZ + iAd;
            case GROUP:
                iAd = ((cmz) obj).n();
                return iZ + iAd;
            case MESSAGE:
                iAd = obj instanceof cml ? cld.O((cml) obj) : cld.Q((cmz) obj);
                return iZ + iAd;
            case BYTES:
                iAd = obj instanceof ckv ? cld.H((ckv) obj) : cld.P(((byte[]) obj).length);
                return iZ + iAd;
            case UINT32:
                iAd = cld.ab(((Integer) obj).intValue());
                return iZ + iAd;
            case ENUM:
                iAd = obj instanceof clx ? cld.L(((clx) obj).a()) : cld.L(((Integer) obj).intValue());
                return iZ + iAd;
            case SFIXED32:
                ((Integer) obj).intValue();
                return iZ + iAd;
            case SFIXED64:
                ((Long) obj).longValue();
                iAd = 8;
                return iZ + iAd;
            case SINT32:
                iAd = cld.U(((Integer) obj).intValue());
                return iZ + iAd;
            case SINT64:
                iAd = cld.W(((Long) obj).longValue());
                return iZ + iAd;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void g(cld cldVar, cog cogVar, int i, Object obj) {
        if (cogVar == cog.GROUP) {
            cmz cmzVar = (cmz) obj;
            cmf.f(cmzVar);
            cldVar.A(i, 3);
            cldVar.an(cmzVar);
            cldVar.A(i, 4);
            return;
        }
        cldVar.A(i, cogVar.t);
        coh cohVar = coh.INT;
        switch (cogVar) {
            case DOUBLE:
                cldVar.ak(((Double) obj).doubleValue());
                break;
            case FLOAT:
                cldVar.am(((Float) obj).floatValue());
                break;
            case INT64:
                cldVar.E(((Long) obj).longValue());
                break;
            case UINT64:
                cldVar.E(((Long) obj).longValue());
                break;
            case INT32:
                cldVar.t(((Integer) obj).intValue());
                break;
            case FIXED64:
                cldVar.r(((Long) obj).longValue());
                break;
            case FIXED32:
                cldVar.p(((Integer) obj).intValue());
                break;
            case BOOL:
                cldVar.j(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof ckv)) {
                    cldVar.z((String) obj);
                    break;
                } else {
                    cldVar.n((ckv) obj);
                    break;
                }
            case GROUP:
                cldVar.an((cmz) obj);
                break;
            case MESSAGE:
                cldVar.v((cmz) obj);
                break;
            case BYTES:
                if (!(obj instanceof ckv)) {
                    byte[] bArr = (byte[]) obj;
                    cldVar.F(bArr, bArr.length);
                    break;
                } else {
                    cldVar.n((ckv) obj);
                    break;
                }
            case UINT32:
                cldVar.C(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof clx)) {
                    cldVar.t(((Integer) obj).intValue());
                    break;
                } else {
                    cldVar.t(((clx) obj).a());
                    break;
                }
            case SFIXED32:
                cldVar.p(((Integer) obj).intValue());
                break;
            case SFIXED64:
                cldVar.r(((Long) obj).longValue());
                break;
            case SINT32:
                cldVar.ap(((Integer) obj).intValue());
                break;
            case SINT64:
                cldVar.ar(((Long) obj).longValue());
                break;
        }
    }

    public static int j(cls clsVar, Object obj) {
        return a(clsVar.b, clsVar.a, obj);
    }

    private static Object n(Object obj) {
        if (obj instanceof cne) {
            return ((cne) obj).c();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static boolean o(Map.Entry entry) {
        if (((cls) entry.getKey()).a() != coh.MESSAGE) {
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof cna) {
            return ((cna) value).m();
        }
        if (value instanceof cml) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int b(Map.Entry entry) {
        int iAa;
        int iZ;
        cls clsVar = (cls) entry.getKey();
        Object value = entry.getValue();
        if (clsVar.a() != coh.MESSAGE) {
            return j(clsVar, value);
        }
        if (value instanceof cml) {
            int i = ((cls) entry.getKey()).a;
            int iZ2 = cld.Z(1);
            iAa = iZ2 + iZ2 + cld.aa(2, i);
            iZ = cld.N(3, (cml) value);
        } else {
            int i2 = ((cls) entry.getKey()).a;
            int iZ3 = cld.Z(1);
            iAa = iZ3 + iZ3 + cld.aa(2, i2);
            iZ = cld.Z(3) + cld.Q((cmz) value);
        }
        return iAa + iZ;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final clk clone() {
        clk clkVar = new clk();
        cnt cntVar = this.b;
        int i = cntVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            cnq cnqVar = (cnq) cntVar.d(i2);
            clkVar.l((cls) cnqVar.a, cnqVar.b);
        }
        for (Map.Entry entry : cntVar.a()) {
            clkVar.l((cls) entry.getKey(), entry.getValue());
        }
        clkVar.d = this.d;
        return clkVar;
    }

    public final Iterator d() {
        return h() ? Collections.emptyIterator() : this.d ? new cmk(this.b.entrySet().iterator()) : this.b.entrySet().iterator();
    }

    public final void e() {
        if (this.c) {
            return;
        }
        cnt cntVar = this.b;
        int i = cntVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((cnq) cntVar.d(i2)).b;
            if (obj instanceof clt) {
                ((clt) obj).w();
            }
        }
        Iterator it = cntVar.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof clt) {
                ((clt) value).w();
            }
        }
        if (!cntVar.d) {
            for (int i3 = 0; i3 < cntVar.b; i3++) {
            }
            Iterator it2 = cntVar.a().iterator();
            while (it2.hasNext()) {
            }
        }
        if (!cntVar.d) {
            cntVar.c = cntVar.c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(cntVar.c);
            cntVar.e = cntVar.e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(cntVar.e);
            cntVar.d = true;
        }
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof clk) {
            return this.b.equals(((clk) obj).b);
        }
        return false;
    }

    public final void f(Map.Entry entry) {
        cls clsVar = (cls) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof cml;
        if (clsVar.a() != coh.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.b.put(clsVar, n(value));
            return;
        }
        Object objK = k(clsVar);
        if (objK == null) {
            this.b.put(clsVar, n(value));
            if (z) {
                this.d = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        if (objK instanceof cne) {
            throw new UnsupportedOperationException();
        }
        cmy cmyVarAJ = ((cmz) objK).aJ();
        ((clo) cmyVarAJ).n((clt) ((cmz) value));
        this.b.put(clsVar, cmyVarAJ.i());
    }

    final boolean h() {
        return this.b.isEmpty();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean i() {
        cnt cntVar = this.b;
        int i = cntVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!o(cntVar.d(i2))) {
                return false;
            }
        }
        Iterator it = cntVar.a().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object k(cls clsVar) {
        Object obj = this.b.get(clsVar);
        if (!(obj instanceof cml)) {
            return obj;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if ((r7 instanceof defpackage.clx) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if ((r7 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        if (r1 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if ((r7 instanceof defpackage.cml) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.cls r6, java.lang.Object r7) {
        /*
            r5 = this;
            defpackage.cmf.d(r7)
            cog r0 = defpackage.cog.DOUBLE
            coh r0 = defpackage.coh.INT
            cog r0 = r6.b
            coh r0 = r0.s
            int r1 = r0.ordinal()
            r2 = 1
            switch(r1) {
                case 0: goto L3e;
                case 1: goto L3b;
                case 2: goto L38;
                case 3: goto L35;
                case 4: goto L32;
                case 5: goto L2f;
                case 6: goto L26;
                case 7: goto L1d;
                case 8: goto L14;
                default: goto L13;
            }
        L13:
            goto L4e
        L14:
            boolean r1 = r7 instanceof defpackage.cmz
            if (r1 != 0) goto L42
            boolean r1 = r7 instanceof defpackage.cml
            if (r1 == 0) goto L4e
            goto L42
        L1d:
            boolean r1 = r7 instanceof java.lang.Integer
            if (r1 != 0) goto L42
            boolean r1 = r7 instanceof defpackage.clx
            if (r1 == 0) goto L4e
            goto L42
        L26:
            boolean r1 = r7 instanceof defpackage.ckv
            if (r1 != 0) goto L42
            boolean r1 = r7 instanceof byte[]
            if (r1 == 0) goto L4e
            goto L42
        L2f:
            boolean r1 = r7 instanceof java.lang.String
            goto L40
        L32:
            boolean r1 = r7 instanceof java.lang.Boolean
            goto L40
        L35:
            boolean r1 = r7 instanceof java.lang.Double
            goto L40
        L38:
            boolean r1 = r7 instanceof java.lang.Float
            goto L40
        L3b:
            boolean r1 = r7 instanceof java.lang.Long
            goto L40
        L3e:
            boolean r1 = r7 instanceof java.lang.Integer
        L40:
            if (r1 == 0) goto L4e
        L42:
            boolean r0 = r7 instanceof defpackage.cml
            if (r0 == 0) goto L48
            r5.d = r2
        L48:
            cnt r0 = r5.b
            r0.put(r6, r7)
            return
        L4e:
            int r6 = r6.a
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r6
            r3[r2] = r0
            r6 = 2
            r3[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r1.<init>(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clk.l(cls, java.lang.Object):void");
    }

    public final boolean m(cls clsVar) {
        return this.b.get(clsVar) != null;
    }

    private clk(byte[] bArr) {
        e();
        e();
    }
}
