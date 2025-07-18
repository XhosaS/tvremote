package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zuo implements Serializable {
    private static final long serialVersionUID = 1;
    public int a;
    public transient int b;
    private transient zva c;
    private final int d;
    private final List e;
    private int f;
    private zvl g;
    private List h;
    private Map i;
    private Stack j;
    private Map k;
    private boolean l;

    public zuo(zuo zuoVar) {
        this.c = new zva(zuoVar.c.a);
        this.d = zuoVar.d;
        this.f = zuoVar.f;
        this.g = zuoVar.g;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.addAll(zuoVar.h);
        this.i = new TreeMap();
        for (Integer num : zuoVar.i.keySet()) {
            this.i.put(num, (LinkedList) ((LinkedList) zuoVar.i.get(num)).clone());
        }
        Stack stack = new Stack();
        this.j = stack;
        stack.addAll(zuoVar.j);
        this.e = new ArrayList();
        Iterator it = zuoVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((zuq) it.next()).clone());
        }
        this.k = new TreeMap(zuoVar.k);
        this.a = zuoVar.a;
        this.b = zuoVar.b;
        this.l = zuoVar.l;
    }

    private final void a(byte[] bArr, byte[] bArr2, zuz zuzVar) {
        zuy zuyVar = new zuy(null);
        int i = zuzVar.d;
        zuyVar.e = i;
        long j = zuzVar.e;
        zuyVar.f = j;
        zux zuxVar = new zux(zuyVar);
        zuu zuuVar = new zuu();
        zuuVar.e = i;
        zuuVar.f = j;
        zuv zuvVar = new zuv(zuuVar);
        int i2 = 0;
        while (true) {
            int i3 = this.d;
            if (i2 >= (1 << i3)) {
                this.g = (zvl) this.j.pop();
                return;
            }
            zuy zuyVar2 = new zuy();
            zuyVar2.e = zuzVar.d;
            zuyVar2.f = zuzVar.e;
            zuyVar2.a = i2;
            zuyVar2.b = zuzVar.b;
            zuyVar2.c = zuzVar.c;
            zuyVar2.g = zuzVar.f;
            zuzVar = new zuz(zuyVar2);
            zva zvaVar = this.c;
            zvaVar.a(zvaVar.b(bArr2, zuzVar), bArr);
            zyt zytVarC = this.c.c(zuzVar);
            zuy zuyVar3 = new zuy(null);
            zuyVar3.e = zuxVar.d;
            zuyVar3.f = zuxVar.e;
            zuyVar3.b = i2;
            zuyVar3.c = zuxVar.b;
            zuyVar3.a = zuxVar.c;
            zuyVar3.g = zuxVar.f;
            zuxVar = new zux(zuyVar3);
            zvl zvlVarBG = vxr.bG(this.c, zytVarC, zuxVar);
            zuu zuuVar2 = new zuu();
            zuuVar2.e = zuvVar.d;
            zuuVar2.f = zuvVar.e;
            zuuVar2.b = i2;
            zuuVar2.g = zuvVar.f;
            zuvVar = new zuv(zuuVar2);
            while (!this.j.isEmpty()) {
                int i4 = ((zvl) this.j.peek()).a;
                int i5 = zvlVarBG.a;
                if (i4 == i5) {
                    int i6 = i2 / (1 << i5);
                    if (i6 == 1) {
                        this.h.add(zvlVarBG);
                        i6 = 1;
                    }
                    if (i6 == 3) {
                        if (i5 < i3 - this.f) {
                            zuq zuqVar = (zuq) this.e.get(i5);
                            zuqVar.a = zvlVarBG;
                            zuqVar.c = i5;
                            if (i5 == zuqVar.b) {
                                zuqVar.f = true;
                            }
                        }
                        i6 = 3;
                    }
                    if (i6 >= 3 && (i6 & 1) == 1 && i5 >= i3 - this.f && i5 <= i3 - 2) {
                        Map map = this.i;
                        Integer numValueOf = Integer.valueOf(i5);
                        if (map.get(numValueOf) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(zvlVarBG);
                            this.i.put(numValueOf, linkedList);
                        } else {
                            ((LinkedList) this.i.get(numValueOf)).add(zvlVarBG);
                        }
                    }
                    zuu zuuVar3 = new zuu();
                    zuuVar3.e = zuvVar.d;
                    zuuVar3.f = zuvVar.e;
                    zuuVar3.a = zuvVar.a;
                    zuuVar3.b = (zuvVar.b - 1) / 2;
                    zuuVar3.g = zuvVar.f;
                    zuv zuvVar2 = new zuv(zuuVar3);
                    zvl zvlVarBF = vxr.bF(this.c, (zvl) this.j.pop(), zvlVarBG, zuvVar2);
                    zvl zvlVar = new zvl(zvlVarBF.a + 1, zvlVarBF.a());
                    zuu zuuVar4 = new zuu();
                    zuuVar4.e = zuvVar2.d;
                    zuuVar4.f = zuvVar2.e;
                    zuuVar4.a = zuvVar2.a + 1;
                    zuuVar4.b = zuvVar2.b;
                    zuuVar4.g = zuvVar2.f;
                    zuvVar = new zuv(zuuVar4);
                    zvlVarBG = zvlVar;
                }
            }
            this.j.push(zvlVarBG);
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b(byte[] bArr, byte[] bArr2, zuz zuzVar) {
        int i;
        zuz zuzVar2 = zuzVar;
        if (this.l) {
            throw new IllegalStateException("index already used");
        }
        int i2 = this.a;
        if (i2 > this.b - 1) {
            throw new IllegalStateException("index out of bounds");
        }
        int i3 = this.d;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i = 1;
            if (i5 >= i3) {
                i5 = 0;
                break;
            } else if (((i2 >> i5) & 1) == 0) {
                break;
            } else {
                i5++;
            }
        }
        if (((this.a >> (i5 + 1)) & 1) == 0 && i5 < i3 - 1) {
            this.k.put(Integer.valueOf(i5), (zvl) this.h.get(i5));
        }
        byte[] bArr3 = null;
        zuy zuyVar = new zuy(null);
        int i6 = zuzVar2.d;
        zuyVar.e = i6;
        long j = zuzVar2.e;
        zuyVar.f = j;
        zux zuxVar = new zux(zuyVar);
        zuu zuuVar = new zuu();
        zuuVar.e = i6;
        zuuVar.f = j;
        zuv zuvVar = new zuv(zuuVar);
        if (i5 == 0) {
            zuy zuyVar2 = new zuy();
            zuyVar2.e = i6;
            zuyVar2.f = j;
            zuyVar2.a = this.a;
            zuyVar2.b = zuzVar2.b;
            zuyVar2.c = zuzVar2.c;
            zuyVar2.g = zuzVar2.f;
            zuzVar2 = new zuz(zuyVar2);
            zva zvaVar = this.c;
            zvaVar.a(zvaVar.b(bArr2, zuzVar2), bArr);
            zyt zytVarC = this.c.c(zuzVar2);
            zuy zuyVar3 = new zuy(null);
            zuyVar3.e = zuxVar.d;
            zuyVar3.f = zuxVar.e;
            zuyVar3.b = this.a;
            zuyVar3.c = zuxVar.b;
            zuyVar3.a = zuxVar.c;
            zuyVar3.g = zuxVar.f;
            this.h.set(0, vxr.bG(this.c, zytVarC, new zux(zuyVar3)));
        } else {
            zuu zuuVar2 = new zuu();
            zuuVar2.e = zuvVar.d;
            zuuVar2.f = zuvVar.e;
            int i7 = i5 - 1;
            zuuVar2.a = i7;
            zuuVar2.b = this.a >> i5;
            zuuVar2.g = zuvVar.f;
            zuv zuvVar2 = new zuv(zuuVar2);
            zva zvaVar2 = this.c;
            zvaVar2.a(zvaVar2.b(bArr2, zuzVar2), bArr);
            zva zvaVar3 = this.c;
            zvl zvlVar = (zvl) this.h.get(i7);
            Map map = this.k;
            Integer numValueOf = Integer.valueOf(i7);
            zvl zvlVarBF = vxr.bF(zvaVar3, zvlVar, (zvl) map.get(numValueOf), zuvVar2);
            this.h.set(i5, new zvl(zvlVarBF.a + 1, zvlVarBF.a()));
            this.k.remove(numValueOf);
            for (int i8 = 0; i8 < i5; i8++) {
                if (i8 < i3 - this.f) {
                    this.h.set(i8, ((zuq) this.e.get(i8)).a);
                } else {
                    this.h.set(i8, (zvl) ((LinkedList) this.i.get(Integer.valueOf(i8))).removeFirst());
                }
            }
            int iMin = Math.min(i5, i3 - this.f);
            for (int i9 = 0; i9 < iMin; i9++) {
                int i10 = 1 << i3;
                int i11 = this.a + 1 + ((1 << i9) * 3);
                if (i11 < i10) {
                    zuq zuqVar = (zuq) this.e.get(i9);
                    zuqVar.a = null;
                    zuqVar.c = zuqVar.b;
                    zuqVar.d = i11;
                    zuqVar.e = true;
                    zuqVar.f = false;
                }
            }
        }
        while (i4 < ((i3 - this.f) >> i)) {
            zuq zuqVar2 = bArr3;
            for (zuq zuqVar3 : this.e) {
                if (!zuqVar3.f && zuqVar3.e && (zuqVar2 == 0 || zuqVar3.a() < zuqVar2.a() || (zuqVar3.a() == zuqVar2.a() && zuqVar3.d < zuqVar2.d))) {
                    zuqVar2 = zuqVar3;
                }
            }
            if (zuqVar2 != 0) {
                Stack stack = this.j;
                zva zvaVar4 = this.c;
                if (zuqVar2.f || !zuqVar2.e) {
                    throw new IllegalStateException("finished or not initialized");
                }
                zuy zuyVar4 = new zuy();
                zuyVar4.e = zuzVar2.d;
                zuyVar4.f = zuzVar2.e;
                int i12 = zuqVar2.d;
                zuyVar4.a = i12;
                zuyVar4.b = zuzVar2.b;
                zuyVar4.c = zuzVar2.c;
                zuyVar4.g = zuzVar2.f;
                zuz zuzVar3 = new zuz(zuyVar4);
                zuy zuyVar5 = new zuy(bArr3);
                int i13 = zuzVar3.d;
                zuyVar5.e = i13;
                boolean z = i;
                long j2 = zuzVar3.e;
                zuyVar5.f = j2;
                zuyVar5.b = i12;
                zux zuxVar2 = new zux(zuyVar5);
                zuu zuuVar3 = new zuu();
                zuuVar3.e = i13;
                zuuVar3.f = j2;
                zuuVar3.b = i12;
                zuv zuvVar3 = new zuv(zuuVar3);
                zvaVar4.a(zvaVar4.b(bArr2, zuzVar3), bArr);
                zvl zvlVarBG = vxr.bG(zvaVar4, zvaVar4.c(zuzVar3), zuxVar2);
                while (!stack.isEmpty() && ((zvl) stack.peek()).a == zvlVarBG.a && ((zvl) stack.peek()).a != zuqVar2.b) {
                    zuu zuuVar4 = new zuu();
                    zuuVar4.e = zuvVar3.d;
                    zuuVar4.f = zuvVar3.e;
                    zuuVar4.a = zuvVar3.a;
                    zuuVar4.b = (zuvVar3.b - 1) / 2;
                    zuuVar4.g = zuvVar3.f;
                    zuv zuvVar4 = new zuv(zuuVar4);
                    zvl zvlVarBF2 = vxr.bF(zvaVar4, (zvl) stack.pop(), zvlVarBG, zuvVar4);
                    zvl zvlVar2 = new zvl(zvlVarBF2.a + 1, zvlVarBF2.a());
                    zuu zuuVar5 = new zuu();
                    zuuVar5.e = zuvVar4.d;
                    zuuVar5.f = zuvVar4.e;
                    zuuVar5.a = zuvVar4.a + 1;
                    zuuVar5.b = zuvVar4.b;
                    zuuVar5.g = zuvVar4.f;
                    zuvVar3 = new zuv(zuuVar5);
                    zvlVarBG = zvlVar2;
                }
                zvl zvlVar3 = zuqVar2.a;
                if (zvlVar3 == null) {
                    zuqVar2.a = zvlVarBG;
                } else {
                    if (zvlVar3.a == zvlVarBG.a) {
                        zuu zuuVar6 = new zuu();
                        zuuVar6.e = zuvVar3.d;
                        zuuVar6.f = zuvVar3.e;
                        zuuVar6.a = zuvVar3.a;
                        zuuVar6.b = (zuvVar3.b - 1) / 2;
                        zuuVar6.g = zuvVar3.f;
                        zuv zuvVar5 = new zuv(zuuVar6);
                        zvlVarBG = new zvl(zuqVar2.a.a + 1, vxr.bF(zvaVar4, zvlVar3, zvlVarBG, zuvVar5).a());
                        zuqVar2.a = zvlVarBG;
                        zuu zuuVar7 = new zuu();
                        zuuVar7.e = zuvVar5.d;
                        zuuVar7.f = zuvVar5.e;
                        zuuVar7.a = zuvVar5.a + 1;
                        zuuVar7.b = zuvVar5.b;
                        zuuVar7.g = zuvVar5.f;
                    } else {
                        stack.push(zvlVarBG);
                    }
                }
                if (zuqVar2.a.a == zuqVar2.b) {
                    zuqVar2.f = z;
                } else {
                    zuqVar2.c = zvlVarBG.a;
                    zuqVar2.d += z ? 1 : 0;
                }
            }
            i4++;
            i = 1;
            bArr3 = null;
        }
        this.a++;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        if (objectInputStream.available() != 0) {
            i = objectInputStream.readInt();
            this.b = i;
        } else {
            i = (1 << this.d) - 1;
            this.b = i;
        }
        if (i > (1 << this.d) - 1 || this.a > i + 1 || objectInputStream.available() != 0) {
            throw new IOException("inconsistent BDS data detected");
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.b);
    }

    public zuo(zuo zuoVar, zjb zjbVar) {
        this.c = new zva(new zvc(zjbVar));
        this.d = zuoVar.d;
        this.f = zuoVar.f;
        this.g = zuoVar.g;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.addAll(zuoVar.h);
        this.i = new TreeMap();
        for (Integer num : zuoVar.i.keySet()) {
            this.i.put(num, (LinkedList) ((LinkedList) zuoVar.i.get(num)).clone());
        }
        Stack stack = new Stack();
        this.j = stack;
        stack.addAll(zuoVar.j);
        this.e = new ArrayList();
        Iterator it = zuoVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((zuq) it.next()).clone());
        }
        this.k = new TreeMap(zuoVar.k);
        int i = zuoVar.a;
        this.a = i;
        this.b = zuoVar.b;
        this.l = zuoVar.l;
        if (this.h != null) {
            if (this.i != null) {
                if (this.j != null) {
                    if (!vxr.by(this.d, i)) {
                        throw new IllegalStateException("index in BDS state out of bounds");
                    }
                    return;
                }
                throw new IllegalStateException("stack == null");
            }
            throw new IllegalStateException("retain == null");
        }
        throw new IllegalStateException("authenticationPath == null");
    }

    public zuo(zuo zuoVar, byte[] bArr, byte[] bArr2, zuz zuzVar) {
        this.c = new zva(zuoVar.c.a);
        this.d = zuoVar.d;
        this.f = zuoVar.f;
        this.g = zuoVar.g;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.addAll(zuoVar.h);
        this.i = new TreeMap();
        for (Integer num : zuoVar.i.keySet()) {
            this.i.put(num, (LinkedList) ((LinkedList) zuoVar.i.get(num)).clone());
        }
        Stack stack = new Stack();
        this.j = stack;
        stack.addAll(zuoVar.j);
        this.e = new ArrayList();
        Iterator it = zuoVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((zuq) it.next()).clone());
        }
        this.k = new TreeMap(zuoVar.k);
        this.a = zuoVar.a;
        this.b = zuoVar.b;
        this.l = false;
        b(bArr, bArr2, zuzVar);
    }

    private zuo(zva zvaVar, int i, int i2, int i3) {
        this.c = zvaVar;
        this.d = i;
        this.b = i3;
        this.f = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.h = new ArrayList();
                this.i = new TreeMap();
                this.j = new Stack();
                this.e = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.e.add(new zuq(i5));
                }
                this.k = new TreeMap();
                this.a = 0;
                this.l = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    public zuo(zvn zvnVar, int i, int i2) {
        this(zvnVar.a(), zvnVar.c, zvnVar.d, i2);
        this.b = i;
        this.a = i2;
        this.l = true;
    }

    public zuo(zvn zvnVar, byte[] bArr, byte[] bArr2, zuz zuzVar) {
        this(zvnVar.a(), zvnVar.c, zvnVar.d, (1 << r1) - 1);
        a(bArr, bArr2, zuzVar);
    }

    public zuo(zvn zvnVar, byte[] bArr, byte[] bArr2, zuz zuzVar, int i) {
        this(zvnVar.a(), zvnVar.c, zvnVar.d, (1 << r1) - 1);
        a(bArr, bArr2, zuzVar);
        while (this.a < i) {
            b(bArr, bArr2, zuzVar);
            this.l = false;
        }
    }
}
