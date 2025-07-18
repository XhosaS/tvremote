package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gay {
    public static final gay a;
    public final List b;
    public int c;
    public int d;
    public int e;

    static {
        fzz fzzVar = fzz.a;
        fzzVar.getClass();
        int i = fzzVar.e;
        a = new gay(fzzVar.c, fzzVar.d, i);
    }

    public gay(List list, int i, int i2) {
        list.getClass();
        this.b = yfm.an(list);
        this.c = g(list);
        this.d = i;
        this.e = i2;
    }

    private static final int g(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((gcb) it.next()).c.size();
        }
        return size;
    }

    public final int a() {
        int[] iArr = ((gcb) yfm.S(this.b)).b;
        int i = iArr[0];
        int iAK = yfm.aK(iArr);
        if (iAK > 0) {
            int i2 = 1;
            while (true) {
                int i3 = iArr[i2];
                if (i > i3) {
                    i = i3;
                }
                if (i2 == iAK) {
                    break;
                }
                i2++;
            }
        }
        Integer.valueOf(i).getClass();
        return i;
    }

    public final int b() {
        int[] iArr = ((gcb) yfm.W(this.b)).b;
        int i = iArr[0];
        int iAK = yfm.aK(iArr);
        if (iAK > 0) {
            int i2 = 1;
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == iAK) {
                    break;
                }
                i2++;
            }
        }
        Integer.valueOf(i).getClass();
        return i;
    }

    public final int c() {
        return this.d + this.c + this.e;
    }

    public final gcd d(int i) {
        List list;
        int i2 = 0;
        int size = i - this.d;
        while (true) {
            list = this.b;
            if (size < ((gcb) list.get(i2)).c.size() || i2 >= yfm.q(list)) {
                break;
            }
            size -= ((gcb) list.get(i2)).c.size();
            i2++;
        }
        return new gcd(((gcb) list.get(i2)).d, size, i - this.d, ((c() - i) - this.e) - 1, a(), b());
    }

    public final Object e(int i) {
        List list = this.b;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((gcb) list.get(i2)).c.size();
            if (size2 > i) {
                break;
            }
            i2++;
            i -= size2;
        }
        return ((gcb) list.get(i2)).c.get(i);
    }

    public final void f(fus fusVar) {
        fusVar.getClass();
        if (!(fusVar instanceof fzz)) {
            if (!(fusVar instanceof fzy)) {
                throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            }
            fzy fzyVar = (fzy) fusVar;
            ymd ymdVar = new ymd(fzyVar.b, fzyVar.c);
            Iterator it = this.b.iterator();
            int size = 0;
            while (it.hasNext()) {
                gcb gcbVar = (gcb) it.next();
                int[] iArr = gcbVar.b;
                int i = 0;
                while (true) {
                    if (i <= 0) {
                        int i2 = iArr[i];
                        if (ymdVar.a <= i2 && i2 <= ymdVar.b) {
                            size += gcbVar.c.size();
                            it.remove();
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            this.c -= size;
            if (fzyVar.a == fzx.b) {
                this.d = fzyVar.d;
                return;
            } else {
                this.e = fzyVar.d;
                return;
            }
        }
        fzz fzzVar = (fzz) fusVar;
        List list = fzzVar.c;
        fzx fzxVar = fzzVar.b;
        int iG = g(list);
        int iOrdinal = fzxVar.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (iOrdinal == 1) {
            this.b.addAll(0, list);
            this.c += iG;
            this.d = fzzVar.d;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                yfm.I(arrayList, ((gcb) it2.next()).c);
            }
            return;
        }
        if (iOrdinal != 2) {
            throw new yfu();
        }
        List list2 = this.b;
        list2.addAll(list2.size(), list);
        this.c += iG;
        this.e = fzzVar.e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            yfm.I(arrayList2, ((gcb) it3.next()).c);
        }
    }

    public final String toString() throws IOException {
        int i = this.c;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(e(i2));
        }
        return "[(" + this.d + " placeholders), " + yfm.ax(arrayList, null, null, null, null, 63) + ", (" + this.e + " placeholders)]";
    }
}
