package defpackage;

import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srn {
    public final int a;
    private final srl b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final List g = new ArrayList();
    private final List h = new ArrayList();
    private final List i = new ArrayList();
    private final List j = new ArrayList();
    private final boolean k;
    private final int l;

    public srn(boolean z, String... strArr) {
        byte[] bArr;
        this.k = z;
        int length = 0;
        for (String str : strArr) {
            if (this.k) {
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                byte[][] bArr2 = {srq.b((short) str.length()), srq.b((short) bytes.length), bytes, new byte[]{0}};
                int length2 = 0;
                for (int i = 0; i < 4; i++) {
                    length2 += bArr2[i].length;
                }
                bArr = new byte[length2];
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte[] bArr3 = bArr2[i3];
                    int length3 = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr, i2, length3);
                    i2 += length3;
                }
            } else {
                char[] charArray = str.toCharArray();
                int length4 = charArray.length;
                int i4 = length4 + length4;
                byte[] bArr4 = new byte[i4 + 4];
                byte[] bArrD = srq.d((short) length4);
                bArr4[0] = bArrD[0];
                bArr4[1] = bArrD[1];
                for (int i5 = 0; i5 < charArray.length; i5++) {
                    byte[] bArrA = srq.a(charArray[i5]);
                    int i6 = i5 + i5;
                    bArr4[i6 + 2] = bArrA[0];
                    bArr4[i6 + 3] = bArrA[1];
                }
                bArr4[i4 + 2] = 0;
                bArr4[i4 + 3] = 0;
                bArr = bArr4;
            }
            Pair pair = new Pair(bArr, Collections.EMPTY_LIST);
            this.g.add(Integer.valueOf(length));
            length += ((byte[]) pair.first).length;
            this.i.add((byte[]) pair.first);
            this.j.add((List) pair.second);
        }
        int size = 0;
        for (List list : this.j) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                xzg xzgVar = (xzg) it.next();
                this.g.add(Integer.valueOf(length));
                Object obj = xzgVar.a;
                throw null;
            }
            this.h.add(Integer.valueOf(size));
            size += (list.size() * 12) + 4;
        }
        int i7 = length % 4;
        int i8 = i7 == 0 ? 0 : 4 - i7;
        this.l = i8;
        int size2 = this.i.size();
        this.c = size2;
        int size3 = this.i.size();
        int length5 = strArr.length;
        this.d = size3 - length5;
        boolean z2 = this.i.size() - length5 > 0;
        if (!z2) {
            this.h.clear();
            this.j.clear();
        }
        int size4 = (size2 * 4) + 28 + (this.h.size() * 4);
        this.e = size4;
        int i9 = size4 + length + i8;
        this.f = true != z2 ? 0 : i9;
        int i10 = i9 + (true == z2 ? size : 0);
        this.a = i10;
        this.b = new srl((short) 1, (short) 28, i10);
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream) {
        this.b.a(byteArrayOutputStream);
        byteArrayOutputStream.write(srq.c(this.c));
        byteArrayOutputStream.write(srq.c(this.d));
        byteArrayOutputStream.write(srq.c(true != this.k ? 0 : 256));
        byteArrayOutputStream.write(srq.c(this.e));
        byteArrayOutputStream.write(srq.c(this.f));
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(srq.c(((Integer) it.next()).intValue()));
        }
        Iterator it2 = this.h.iterator();
        while (it2.hasNext()) {
            byteArrayOutputStream.write(srq.c(((Integer) it2.next()).intValue()));
        }
        Iterator it3 = this.i.iterator();
        while (it3.hasNext()) {
            byteArrayOutputStream.write((byte[]) it3.next());
        }
        int i = this.l;
        if (i > 0) {
            byteArrayOutputStream.write(new byte[i]);
        }
        Iterator it4 = this.j.iterator();
        while (it4.hasNext()) {
            for (xzg xzgVar : (List) it4.next()) {
                byteArrayOutputStream.write(srq.c(0));
                byteArrayOutputStream.write(srq.c(0));
                byteArrayOutputStream.write(srq.c(0));
            }
            byteArrayOutputStream.write(srq.c(-1));
        }
    }
}
