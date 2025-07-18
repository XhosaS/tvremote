package defpackage;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nue {
    private static volatile nue c;
    public int a;
    public final Object b;

    public nue(byte[] bArr) {
        this.b = new int[10];
    }

    public static nue b() {
        if (c == null) {
            synchronized (nue.class) {
                if (c == null) {
                    c = new nue();
                }
            }
        }
        return c;
    }

    private final void q() {
        int i = this.a;
        this.a = i + 1;
        if (i >= 10) {
            i();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    final synchronized ntt a() {
        ArrayList arrayList;
        ?? r0 = this.b;
        arrayList = new ArrayList(r0.values());
        int i = this.a;
        if (i > 0) {
            arrayList.add(new nuf("UNKNOWN", 1002, i));
            this.a = 0;
        }
        r0.clear();
        return new ntt(arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized void c(nuf nufVar) {
        cui cuiVar = new cui(nufVar.a, Integer.valueOf(nufVar.b));
        ?? r1 = this.b;
        nuf nufVar2 = (nuf) r1.get(cuiVar);
        if (nufVar2 != null) {
            nufVar2.c = udo.f(nufVar2.c, nufVar.c);
        } else if (((ko) r1).d >= 100) {
            this.a = udo.f(this.a, nufVar.c);
        } else {
            r1.put(cuiVar, nufVar);
        }
    }

    public final int d(int i) {
        return ((int[]) this.b)[i];
    }

    public final int e() {
        if ((this.a & 2) != 0) {
            return ((int[]) this.b)[1];
        }
        return -1;
    }

    public final boolean f(int i) {
        return ((1 << i) & this.a) != 0;
    }

    public final void g(int i, int i2) {
        if (i >= 10) {
            return;
        }
        this.a = (1 << i) | this.a;
        ((int[]) this.b)[i] = i2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized gzb h(gza gzaVar) {
        ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.b).get(gzaVar);
        gzb gzbVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            gze gzeVar = (gze) arrayList.get(i);
            Bitmap bitmap = (Bitmap) ((WeakReference) gzeVar.c).get();
            gzb gzbVar2 = bitmap != null ? new gzb(bitmap, gzeVar.d) : null;
            if (gzbVar2 != null) {
                gzbVar = gzbVar2;
                break;
            }
            i++;
        }
        q();
        return gzbVar;
    }

    public final void i() {
        this.a = 0;
        Iterator it = ((LinkedHashMap) this.b).values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ArrayList arrayList = (ArrayList) next;
            if (arrayList.size() <= 1) {
                gze gzeVar = (gze) yfm.U(arrayList);
                if ((gzeVar != null ? (Bitmap) ((WeakReference) gzeVar.c).get() : null) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((WeakReference) ((gze) arrayList.get(i3)).c).get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void j(gza gzaVar, Bitmap bitmap, Map map, int i) {
        ?? r0 = this.b;
        Object arrayList = r0.get(gzaVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            r0.put(gzaVar, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        int iIdentityHashCode = System.identityHashCode(bitmap);
        gze gzeVar = new gze(iIdentityHashCode, new WeakReference(bitmap), map, i);
        int size = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                arrayList2.add(gzeVar);
                break;
            }
            Object obj = arrayList2.get(i2);
            obj.getClass();
            gze gzeVar2 = (gze) obj;
            if (i < gzeVar2.b) {
                i2++;
            } else if (gzeVar2.a == iIdentityHashCode && ((WeakReference) gzeVar2.c).get() == bitmap) {
                arrayList2.set(i2, gzeVar);
            } else {
                arrayList2.add(i2, gzeVar);
            }
        }
        q();
    }

    public final synchronized void k(int i) {
        if (i < 10 || i == 20) {
            return;
        }
        i();
    }

    public final long l(fdq fdqVar) {
        int i;
        edi ediVar = (edi) this.b;
        int i2 = 0;
        fdqVar.i(ediVar.a, 0, 1);
        int i3 = ediVar.a[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        fdqVar.i(ediVar.a, 1, i5);
        while (i2 < i5) {
            i2++;
            i6 = (ediVar.a[i2] & 255) + (i6 << 8);
        }
        this.a += i;
        return i6;
    }

    public final void m() {
        this.a = 1332;
    }

    public final ob n(Object obj, int i) {
        ob obVar = new ob(obj, no.c);
        ((jc) this.b).f(i, obVar);
        return obVar;
    }

    public final Object o() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i2;
        return obj;
    }

    public final void p(Object obj) {
        int i = this.a;
        if (i < 256) {
            ((Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }

    public nue(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new Object[256];
    }

    public nue(char[] cArr, byte[] bArr) {
        this.a = kwx.JSON3;
        jc jcVar = jd.a;
        this.b = new jc((byte[]) null);
    }

    public nue(byte[] bArr, byte[] bArr2) {
        this.b = new edi(8);
    }

    public nue(char[] cArr) {
        this.b = new LinkedHashMap();
    }

    private nue() {
        this.a = 0;
        this.b = new ir();
    }
}
