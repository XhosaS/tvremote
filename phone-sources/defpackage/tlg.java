package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tlg {
    public final byte[] a;
    private final int c;
    public int b = 0;
    private final Map d = new HashMap();

    public tlg(DatagramPacket datagramPacket) {
        this.a = datagramPacket.getData();
        this.c = datagramPacket.getLength();
    }

    public final int a() {
        return this.c - this.b;
    }

    public final int b() throws EOFException {
        e(2);
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte[] bArr = this.a;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (bArr[i2] & 255) | (i3 << 8);
    }

    public final int c() throws EOFException {
        e(1);
        int i = this.b;
        this.b = i + 1;
        return this.a[i] & 255;
    }

    public final String d() throws EOFException {
        int iC = c();
        e(iC);
        String str = new String(this.a, this.b, iC, tlc.a);
        this.b += iC;
        return str;
    }

    public final void e(int i) throws EOFException {
        if (a() < i) {
            throw new EOFException();
        }
    }

    public final void f(byte[] bArr) throws EOFException {
        int length = bArr.length;
        e(length);
        System.arraycopy(this.a, this.b, bArr, 0, length);
        this.b += length;
    }

    public final String[] g() throws IOException {
        List list;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (a() <= 0) {
                break;
            }
            e(1);
            byte[] bArr = this.a;
            int i = this.b;
            byte b = bArr[i];
            if (b == 0) {
                this.b = i + 1;
                break;
            }
            boolean z = (b & 192) == 192;
            if (z) {
                list = (List) this.d.get(Integer.valueOf(((c() & 63) << 8) | c()));
                if (list == null) {
                    throw new IOException("invalid label pointer");
                }
            } else {
                String strD = d();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(strD);
                list = arrayList2;
            }
            arrayList.addAll(list);
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((List) it.next()).addAll(list);
            }
            map.put(Integer.valueOf(i), list);
            if (z) {
                break;
            }
        }
        this.d.putAll(map);
        return (String[]) arrayList.toArray(new String[0]);
    }
}
