package defpackage;

import com.google.protobuf.MessageLite;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwr {
    public static final abwr a = new abwr(null);
    public final abzp b = new abzl();
    public boolean c;
    public boolean d;

    private abwr() {
    }

    static int a(acap acapVar, int i, Object obj) {
        int iH = abvz.H(i << 3);
        if (acapVar == acap.GROUP) {
            abxt.c((MessageLite) obj);
            iH += iH;
        }
        return iH + b(acapVar, obj);
    }

    static int b(acap acapVar, Object obj) {
        int iD;
        int iH;
        acap acapVar2 = acap.DOUBLE;
        acaq acaqVar = acaq.INT;
        switch (acapVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                boolean z = abvz.e;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                boolean z2 = abvz.e;
                return 4;
            case 2:
                return abvz.I(((Long) obj).longValue());
            case 3:
                return abvz.I(((Long) obj).longValue());
            case 4:
                return abvz.I(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                boolean z3 = abvz.e;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                boolean z4 = abvz.e;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                boolean z5 = abvz.e;
                return 1;
            case 8:
                if (!(obj instanceof abvo)) {
                    return abvz.G((String) obj);
                }
                boolean z6 = abvz.e;
                iD = ((abvo) obj).d();
                iH = abvz.H(iD);
                break;
            case 9:
                return ((MessageLite) obj).g();
            case 10:
                if (!(obj instanceof abya)) {
                    return abvz.D((MessageLite) obj);
                }
                boolean z7 = abvz.e;
                iD = ((abya) obj).a();
                iH = abvz.H(iD);
                break;
            case 11:
                if (!(obj instanceof abvo)) {
                    boolean z8 = abvz.e;
                    iD = ((byte[]) obj).length;
                    iH = abvz.H(iD);
                    break;
                } else {
                    boolean z9 = abvz.e;
                    iD = ((abvo) obj).d();
                    iH = abvz.H(iD);
                    break;
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return abvz.H(((Integer) obj).intValue());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return obj instanceof abxf ? abvz.I(((abxf) obj).a()) : abvz.I(((Integer) obj).intValue());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((Integer) obj).intValue();
                boolean z10 = abvz.e;
                return 4;
            case 15:
                ((Long) obj).longValue();
                boolean z11 = abvz.e;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return abvz.H((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return abvz.I((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iH + iD;
    }

    static void h(abvz abvzVar, acap acapVar, int i, Object obj) {
        if (acapVar == acap.GROUP) {
            MessageLite messageLite = (MessageLite) obj;
            abxt.c(messageLite);
            abvzVar.v(i, 3);
            messageLite.f(abvzVar);
            abvzVar.v(i, 4);
            return;
        }
        abvzVar.v(i, acapVar.t);
        acaq acaqVar = acaq.INT;
        switch (acapVar.ordinal()) {
            case 0:
                abvzVar.m(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                abvzVar.k(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                abvzVar.z(((Long) obj).longValue());
                break;
            case 3:
                abvzVar.z(((Long) obj).longValue());
                break;
            case 4:
                abvzVar.o(((Integer) obj).intValue());
                break;
            case 5:
                abvzVar.m(((Long) obj).longValue());
                break;
            case 6:
                abvzVar.k(((Integer) obj).intValue());
                break;
            case 7:
                abvzVar.P(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof abvo)) {
                    abvzVar.u((String) obj);
                    break;
                } else {
                    abvzVar.i((abvo) obj);
                    break;
                }
            case 9:
                ((MessageLite) obj).f(abvzVar);
                break;
            case 10:
                abvzVar.q((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof abvo)) {
                    byte[] bArr = (byte[]) obj;
                    abvzVar.A(bArr, bArr.length);
                    break;
                } else {
                    abvzVar.i((abvo) obj);
                    break;
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                abvzVar.x(((Integer) obj).intValue());
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                if (!(obj instanceof abxf)) {
                    abvzVar.o(((Integer) obj).intValue());
                    break;
                } else {
                    abvzVar.o(((abxf) obj).a());
                    break;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                abvzVar.k(((Integer) obj).intValue());
                break;
            case 15:
                abvzVar.m(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abvzVar.x((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abvzVar.z((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public static int j(abxb abxbVar, Object obj) {
        acap acapVar = abxbVar.c;
        int i = abxbVar.b;
        if (!abxbVar.d) {
            return a(acapVar, i, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i2 = 0;
        if (!abxbVar.e) {
            int iA = 0;
            while (i2 < size) {
                iA += a(acapVar, i, list.get(i2));
                i2++;
            }
            return iA;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iB = 0;
        while (i2 < size) {
            iB += b(acapVar, list.get(i2));
            i2++;
        }
        return abvz.H(i << 3) + iB + abvz.H(iB);
    }

    private static Object o(Object obj) {
        if (obj instanceof abyv) {
            return ((abyv) obj).c();
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

    private static boolean p(Map.Entry entry) {
        abxb abxbVar = (abxb) entry.getKey();
        if (abxbVar.c.s != acaq.MESSAGE) {
            return true;
        }
        if (!abxbVar.d) {
            return q(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!q(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean q(Object obj) {
        if (obj instanceof abyr) {
            return ((abyr) obj).z();
        }
        if (obj instanceof abya) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void r(defpackage.abxb r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = defpackage.abxt.a
            r6.getClass()
            acap r0 = r5.c
            acap r1 = defpackage.acap.DOUBLE
            acaq r1 = defpackage.acaq.INT
            acaq r0 = r0.s
            int r1 = r0.ordinal()
            switch(r1) {
                case 0: goto L3f;
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L27;
                case 7: goto L1e;
                case 8: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r1 = r6 instanceof com.google.protobuf.MessageLite
            if (r1 != 0) goto L43
            boolean r1 = r6 instanceof defpackage.abya
            if (r1 == 0) goto L44
            goto L43
        L1e:
            boolean r1 = r6 instanceof java.lang.Integer
            if (r1 != 0) goto L43
            boolean r1 = r6 instanceof defpackage.abxf
            if (r1 == 0) goto L44
            goto L43
        L27:
            boolean r1 = r6 instanceof defpackage.abvo
            if (r1 != 0) goto L43
            boolean r1 = r6 instanceof byte[]
            if (r1 == 0) goto L44
            goto L43
        L30:
            boolean r1 = r6 instanceof java.lang.String
            goto L41
        L33:
            boolean r1 = r6 instanceof java.lang.Boolean
            goto L41
        L36:
            boolean r1 = r6 instanceof java.lang.Double
            goto L41
        L39:
            boolean r1 = r6 instanceof java.lang.Float
            goto L41
        L3c:
            boolean r1 = r6 instanceof java.lang.Long
            goto L41
        L3f:
            boolean r1 = r6 instanceof java.lang.Integer
        L41:
            if (r1 == 0) goto L44
        L43:
            return
        L44:
            int r5 = r5.b
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r0
            r5 = 2
            r2[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abwr.r(abxb, java.lang.Object):void");
    }

    public final int c(Map.Entry entry) {
        int i;
        int iH;
        int iH2;
        abxb abxbVar = (abxb) entry.getKey();
        acaq acaqVar = abxbVar.c.s;
        Object value = entry.getValue();
        if (acaqVar != acaq.MESSAGE || abxbVar.d || abxbVar.e) {
            return j(abxbVar, value);
        }
        if (value instanceof abya) {
            int i2 = ((abxb) entry.getKey()).b;
            int iH3 = abvz.H(8);
            i = iH3 + iH3;
            iH = abvz.H(16) + abvz.H(i2);
            int iH4 = abvz.H(24);
            int iA = ((abya) value).a();
            iH2 = iH4 + abvz.H(iA) + iA;
        } else {
            int i3 = ((abxb) entry.getKey()).b;
            int iH5 = abvz.H(8);
            i = iH5 + iH5;
            iH = abvz.H(16) + abvz.H(i3);
            iH2 = abvz.H(24) + abvz.D((MessageLite) value);
        }
        return i + iH + iH2;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final abwr clone() {
        abwr abwrVar = new abwr();
        abzp abzpVar = this.b;
        int i = abzpVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Map.Entry entryD = abzpVar.d(i2);
            abwrVar.m((abxb) entryD.getKey(), entryD.getValue());
        }
        for (Map.Entry entry : abzpVar.a()) {
            abwrVar.m((abxb) entry.getKey(), entry.getValue());
        }
        abwrVar.d = this.d;
        return abwrVar;
    }

    public final Iterator e() {
        abzp abzpVar = this.b;
        return abzpVar.isEmpty() ? Collections.emptyIterator() : this.d ? new abxz(abzpVar.entrySet().iterator()) : abzpVar.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abwr) {
            return this.b.equals(((abwr) obj).b);
        }
        return false;
    }

    public final void f() {
        if (this.c) {
            return;
        }
        abzp abzpVar = this.b;
        int i = abzpVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object value = abzpVar.d(i2).getValue();
            if (value instanceof abxd) {
                abxd abxdVar = (abxd) value;
                abza.a.a(abxdVar.getClass()).g(abxdVar);
                abxdVar.memoizedSerializedSize = Integer.MAX_VALUE & abxdVar.memoizedSerializedSize;
            }
        }
        Iterator it = abzpVar.a().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof abxd) {
                abxd abxdVar2 = (abxd) value2;
                abza.a.a(abxdVar2.getClass()).g(abxdVar2);
                abxdVar2.memoizedSerializedSize &= Integer.MAX_VALUE;
            }
        }
        if (!abzpVar.d) {
            for (int i3 = 0; i3 < abzpVar.b; i3++) {
                Map.Entry entryD = abzpVar.d(i3);
                if (((abxb) entryD.getKey()).d) {
                    entryD.setValue(DesugarCollections.unmodifiableList((List) entryD.getValue()));
                }
            }
            for (Map.Entry entry : abzpVar.a()) {
                if (((abxb) entry.getKey()).d) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!abzpVar.d) {
            abzpVar.c = abzpVar.c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(abzpVar.c);
            abzpVar.e = abzpVar.e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(abzpVar.e);
            abzpVar.d = true;
        }
        this.c = true;
    }

    public final void g(Map.Entry entry) {
        abxb abxbVar = (abxb) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof abya;
        if (abxbVar.d) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objK = k(abxbVar);
            List list = (List) value;
            int size = list.size();
            if (objK == null) {
                objK = new ArrayList(size);
            }
            List list2 = (List) objK;
            for (int i = 0; i < size; i++) {
                list2.add(o(list.get(i)));
            }
            this.b.put(abxbVar, objK);
            return;
        }
        if (abxbVar.c.s != acaq.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.b.put(abxbVar, o(value));
            return;
        }
        Object objK2 = k(abxbVar);
        if (objK2 == null) {
            this.b.put(abxbVar, o(value));
            if (z) {
                this.d = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        if (objK2 instanceof abyv) {
            throw new UnsupportedOperationException();
        }
        abyq abyqVarCN = ((MessageLite) objK2).cN();
        ((abww) abyqVarCN).B((abxd) ((MessageLite) value));
        this.b.put(abxbVar, abyqVarCN.v());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean i() {
        abzp abzpVar = this.b;
        int i = abzpVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!p(abzpVar.d(i2))) {
                return false;
            }
        }
        Iterator it = abzpVar.a().iterator();
        while (it.hasNext()) {
            if (!p((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object k(abxb abxbVar) {
        Object obj = this.b.get(abxbVar);
        if (!(obj instanceof abya)) {
            return obj;
        }
        throw null;
    }

    public final void l(abxb abxbVar, Object obj) {
        List arrayList;
        if (!abxbVar.d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        r(abxbVar, obj);
        Object objK = k(abxbVar);
        if (objK == null) {
            arrayList = new ArrayList();
            this.b.put(abxbVar, arrayList);
        } else {
            arrayList = (List) objK;
        }
        arrayList.add(obj);
    }

    public final void m(abxb abxbVar, Object obj) {
        if (!abxbVar.d) {
            r(abxbVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                r(abxbVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof abya) {
            this.d = true;
        }
        this.b.put(abxbVar, obj);
    }

    public final boolean n(abxb abxbVar) {
        if (abxbVar.d) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.b.get(abxbVar) != null;
    }

    private abwr(byte[] bArr) {
        f();
        f();
    }
}
