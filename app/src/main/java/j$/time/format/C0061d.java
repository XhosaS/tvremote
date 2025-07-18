package j$.time.format;

import java.util.ArrayList;

/* renamed from: j$.time.format.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0061d implements InterfaceC0062e {
    public final InterfaceC0062e[] a;
    public final boolean b;

    public C0061d(ArrayList arrayList, boolean z) {
        this((InterfaceC0062e[]) arrayList.toArray(new InterfaceC0062e[arrayList.size()]), z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        return true;
     */
    @Override // j$.time.format.InterfaceC0062e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(j$.time.format.y r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 1
            boolean r2 = r7.b
            if (r2 == 0) goto Le
            int r3 = r8.c
            int r3 = r3 + r1
            r8.c = r3
        Le:
            j$.time.format.e[] r3 = r7.a     // Catch: java.lang.Throwable -> L27
            int r4 = r3.length     // Catch: java.lang.Throwable -> L27
            r5 = 0
        L12:
            if (r5 >= r4) goto L2c
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L27
            boolean r6 = r6.i(r8, r9)     // Catch: java.lang.Throwable -> L27
            if (r6 != 0) goto L29
            r9.setLength(r0)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2f
        L21:
            int r9 = r8.c
            int r9 = r9 - r1
            r8.c = r9
            return r1
        L27:
            r9 = move-exception
            goto L30
        L29:
            int r5 = r5 + 1
            goto L12
        L2c:
            if (r2 == 0) goto L2f
            goto L21
        L2f:
            return r1
        L30:
            if (r2 == 0) goto L37
            int r0 = r8.c
            int r0 = r0 - r1
            r8.c = r0
        L37:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.C0061d.i(j$.time.format.y, java.lang.StringBuilder):boolean");
    }

    @Override // j$.time.format.InterfaceC0062e
    public final int l(v vVar, CharSequence charSequence, int i) {
        ArrayList arrayList = vVar.d;
        boolean z = this.b;
        InterfaceC0062e[] interfaceC0062eArr = this.a;
        int i2 = 0;
        if (!z) {
            int length = interfaceC0062eArr.length;
            while (i2 < length) {
                i = interfaceC0062eArr[i2].l(vVar, charSequence, i);
                if (i < 0) {
                    return i;
                }
                i2++;
            }
            return i;
        }
        D dC = vVar.c();
        dC.getClass();
        D d = new D();
        d.a.putAll(dC.a);
        d.b = dC.b;
        d.c = dC.c;
        d.d = dC.d;
        arrayList.add(d);
        int length2 = interfaceC0062eArr.length;
        int iL = i;
        while (i2 < length2) {
            iL = interfaceC0062eArr[i2].l(vVar, charSequence, iL);
            if (iL < 0) {
                arrayList.remove(arrayList.size() - 1);
                return i;
            }
            i2++;
        }
        arrayList.remove(arrayList.size() - 2);
        return iL;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC0062e[] interfaceC0062eArr = this.a;
        if (interfaceC0062eArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (InterfaceC0062e interfaceC0062e : interfaceC0062eArr) {
                sb.append(interfaceC0062e);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }

    public C0061d(InterfaceC0062e[] interfaceC0062eArr, boolean z) {
        this.a = interfaceC0062eArr;
        this.b = z;
    }
}
