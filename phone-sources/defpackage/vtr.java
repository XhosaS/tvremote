package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtr {
    public static final vtr a = new vtr(null);
    final vwc b = new vwc();
    public boolean c;
    public boolean d;

    private vtr() {
    }

    public static int a(vwo vwoVar, int i, Object obj) {
        int iAa = vtj.aa(i);
        if (vwoVar == vwo.GROUP) {
            vuo.a((vvj) obj);
            iAa += iAa;
        }
        vwp vwpVar = vwp.INT;
        int iAe = 4;
        switch (vwoVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                iAe = 8;
                return iAa + iAe;
            case FLOAT:
                ((Float) obj).floatValue();
                return iAa + iAe;
            case INT64:
                iAe = vtj.ae(((Long) obj).longValue());
                return iAa + iAe;
            case UINT64:
                iAe = vtj.ae(((Long) obj).longValue());
                return iAa + iAe;
            case INT32:
                iAe = vtj.M(((Integer) obj).intValue());
                return iAa + iAe;
            case FIXED64:
                ((Long) obj).longValue();
                iAe = 8;
                return iAa + iAe;
            case FIXED32:
                ((Integer) obj).intValue();
                return iAa + iAe;
            case BOOL:
                ((Boolean) obj).booleanValue();
                iAe = 1;
                return iAa + iAe;
            case STRING:
                iAe = obj instanceof vsz ? vtj.I((vsz) obj) : vtj.Z((String) obj);
                return iAa + iAe;
            case GROUP:
                iAe = ((vvj) obj).l();
                return iAa + iAe;
            case MESSAGE:
                iAe = obj instanceof vuv ? vtj.P((vuv) obj) : vtj.R((vvj) obj);
                return iAa + iAe;
            case BYTES:
                iAe = obj instanceof vsz ? vtj.I((vsz) obj) : vtj.Q(((byte[]) obj).length);
                return iAa + iAe;
            case UINT32:
                iAe = vtj.ac(((Integer) obj).intValue());
                return iAa + iAe;
            case ENUM:
                iAe = obj instanceof vug ? vtj.M(((vug) obj).a()) : vtj.M(((Integer) obj).intValue());
                return iAa + iAe;
            case SFIXED32:
                ((Integer) obj).intValue();
                return iAa + iAe;
            case SFIXED64:
                ((Long) obj).longValue();
                iAe = 8;
                return iAa + iAe;
            case SINT32:
                iAe = vtj.V(((Integer) obj).intValue());
                return iAa + iAe;
            case SINT64:
                iAe = vtj.X(((Long) obj).longValue());
                return iAa + iAe;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void g(vtj vtjVar, vwo vwoVar, int i, Object obj) {
        if (vwoVar == vwo.GROUP) {
            vvj vvjVar = (vvj) obj;
            vuo.a(vvjVar);
            vtjVar.B(i, 3);
            vtjVar.ao(vvjVar);
            vtjVar.B(i, 4);
            return;
        }
        vtjVar.B(i, vwoVar.t);
        vwp vwpVar = vwp.INT;
        switch (vwoVar) {
            case DOUBLE:
                vtjVar.al(((Double) obj).doubleValue());
                break;
            case FLOAT:
                vtjVar.an(((Float) obj).floatValue());
                break;
            case INT64:
                vtjVar.F(((Long) obj).longValue());
                break;
            case UINT64:
                vtjVar.F(((Long) obj).longValue());
                break;
            case INT32:
                vtjVar.u(((Integer) obj).intValue());
                break;
            case FIXED64:
                vtjVar.s(((Long) obj).longValue());
                break;
            case FIXED32:
                vtjVar.q(((Integer) obj).intValue());
                break;
            case BOOL:
                vtjVar.k(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof vsz)) {
                    vtjVar.A((String) obj);
                    break;
                } else {
                    vtjVar.o((vsz) obj);
                    break;
                }
            case GROUP:
                vtjVar.ao((vvj) obj);
                break;
            case MESSAGE:
                vtjVar.w((vvj) obj);
                break;
            case BYTES:
                if (!(obj instanceof vsz)) {
                    byte[] bArr = (byte[]) obj;
                    vtjVar.G(bArr, bArr.length);
                    break;
                } else {
                    vtjVar.o((vsz) obj);
                    break;
                }
            case UINT32:
                vtjVar.D(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof vug)) {
                    vtjVar.u(((Integer) obj).intValue());
                    break;
                } else {
                    vtjVar.u(((vug) obj).a());
                    break;
                }
            case SFIXED32:
                vtjVar.q(((Integer) obj).intValue());
                break;
            case SFIXED64:
                vtjVar.s(((Long) obj).longValue());
                break;
            case SINT32:
                vtjVar.aq(((Integer) obj).intValue());
                break;
            case SINT64:
                vtjVar.as(((Long) obj).longValue());
                break;
        }
    }

    public static int j(vub vubVar, Object obj) {
        return a(vubVar.b, vubVar.a, obj);
    }

    private static Object n(Object obj) {
        if (obj instanceof vvo) {
            return ((vvo) obj).c();
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
        if (((vub) entry.getKey()).a() != vwp.MESSAGE) {
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof vvk) {
            return ((vvk) value).v();
        }
        if (value instanceof vuv) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int b(Map.Entry entry) {
        int iAb;
        int iAa;
        vub vubVar = (vub) entry.getKey();
        Object value = entry.getValue();
        if (vubVar.a() != vwp.MESSAGE) {
            return j(vubVar, value);
        }
        if (value instanceof vuv) {
            int i = ((vub) entry.getKey()).a;
            int iAa2 = vtj.aa(1);
            iAb = iAa2 + iAa2 + vtj.ab(2, i);
            iAa = vtj.O(3, (vuv) value);
        } else {
            int i2 = ((vub) entry.getKey()).a;
            int iAa3 = vtj.aa(1);
            iAb = iAa3 + iAa3 + vtj.ab(2, i2);
            iAa = vtj.aa(3) + vtj.R((vvj) value);
        }
        return iAb + iAa;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final vtr clone() {
        vtr vtrVar = new vtr();
        vwc vwcVar = this.b;
        int i = vwcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            vwa vwaVar = (vwa) vwcVar.d(i2);
            vtrVar.l((vub) vwaVar.a, vwaVar.b);
        }
        for (Map.Entry entry : vwcVar.a()) {
            vtrVar.l((vub) entry.getKey(), entry.getValue());
        }
        vtrVar.d = this.d;
        return vtrVar;
    }

    public final Iterator d() {
        return h() ? Collections.emptyIterator() : this.d ? new vuu(this.b.entrySet().iterator()) : this.b.entrySet().iterator();
    }

    public final void e() {
        if (this.c) {
            return;
        }
        vwc vwcVar = this.b;
        int i = vwcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((vwa) vwcVar.d(i2)).b;
            if (obj instanceof vuc) {
                ((vuc) obj).w();
            }
        }
        Iterator it = vwcVar.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof vuc) {
                ((vuc) value).w();
            }
        }
        if (!vwcVar.d) {
            for (int i3 = 0; i3 < vwcVar.b; i3++) {
            }
            Iterator it2 = vwcVar.a().iterator();
            while (it2.hasNext()) {
            }
        }
        if (!vwcVar.d) {
            vwcVar.c = vwcVar.c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(vwcVar.c);
            vwcVar.e = vwcVar.e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(vwcVar.e);
            vwcVar.d = true;
        }
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vtr) {
            return this.b.equals(((vtr) obj).b);
        }
        return false;
    }

    public final void f(Map.Entry entry) {
        vub vubVar = (vub) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof vuv;
        if (vubVar.a() != vwp.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.b.put(vubVar, n(value));
            return;
        }
        Object objK = k(vubVar);
        if (objK == null) {
            this.b.put(vubVar, n(value));
            if (z) {
                this.d = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        if (objK instanceof vvo) {
            throw new UnsupportedOperationException();
        }
        vvi vviVarDZ = ((vvj) objK).dZ();
        ((vtw) vviVarDZ).x((vuc) ((vvj) value));
        this.b.put(vubVar, vviVarDZ.r());
    }

    final boolean h() {
        return this.b.isEmpty();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean i() {
        vwc vwcVar = this.b;
        int i = vwcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!o(vwcVar.d(i2))) {
                return false;
            }
        }
        Iterator it = vwcVar.a().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object k(vub vubVar) {
        Object obj = this.b.get(vubVar);
        if (!(obj instanceof vuv)) {
            return obj;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if ((r7 instanceof defpackage.vug) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if ((r7 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        if (r1 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if ((r7 instanceof defpackage.vuv) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.vub r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.nio.charset.Charset r0 = defpackage.vuo.a
            defpackage.a.aq(r7)
            vwo r0 = defpackage.vwo.DOUBLE
            vwp r0 = defpackage.vwp.INT
            vwo r0 = r6.b
            vwp r0 = r0.s
            int r1 = r0.ordinal()
            r2 = 1
            switch(r1) {
                case 0: goto L40;
                case 1: goto L3d;
                case 2: goto L3a;
                case 3: goto L37;
                case 4: goto L34;
                case 5: goto L31;
                case 6: goto L28;
                case 7: goto L1f;
                case 8: goto L16;
                default: goto L15;
            }
        L15:
            goto L50
        L16:
            boolean r1 = r7 instanceof defpackage.vvj
            if (r1 != 0) goto L44
            boolean r1 = r7 instanceof defpackage.vuv
            if (r1 == 0) goto L50
            goto L44
        L1f:
            boolean r1 = r7 instanceof java.lang.Integer
            if (r1 != 0) goto L44
            boolean r1 = r7 instanceof defpackage.vug
            if (r1 == 0) goto L50
            goto L44
        L28:
            boolean r1 = r7 instanceof defpackage.vsz
            if (r1 != 0) goto L44
            boolean r1 = r7 instanceof byte[]
            if (r1 == 0) goto L50
            goto L44
        L31:
            boolean r1 = r7 instanceof java.lang.String
            goto L42
        L34:
            boolean r1 = r7 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r1 = r7 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r1 = r7 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r1 = r7 instanceof java.lang.Long
            goto L42
        L40:
            boolean r1 = r7 instanceof java.lang.Integer
        L42:
            if (r1 == 0) goto L50
        L44:
            boolean r0 = r7 instanceof defpackage.vuv
            if (r0 == 0) goto L4a
            r5.d = r2
        L4a:
            vwc r0 = r5.b
            r0.put(r6, r7)
            return
        L50:
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtr.l(vub, java.lang.Object):void");
    }

    public final boolean m(vub vubVar) {
        return this.b.get(vubVar) != null;
    }

    private vtr(byte[] bArr) {
        e();
        e();
    }
}
