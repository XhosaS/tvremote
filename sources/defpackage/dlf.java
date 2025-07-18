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
/* loaded from: classes.dex */
public final class dlf implements Serializable {
    private static final long serialVersionUID = 1;
    public int a;
    public transient int b;
    private transient dlr c;
    private final int d;
    private final List e;
    private int f;
    private dmc g;
    private List h;
    private Map i;
    private Stack j;
    private Map k;
    private boolean l;

    public dlf(dlf dlfVar) {
        this.c = new dlr(dlfVar.c.a);
        this.d = dlfVar.d;
        this.f = dlfVar.f;
        this.g = dlfVar.g;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.addAll(dlfVar.h);
        this.i = new TreeMap();
        for (Integer num : dlfVar.i.keySet()) {
            this.i.put(num, (LinkedList) ((LinkedList) dlfVar.i.get(num)).clone());
        }
        Stack stack = new Stack();
        this.j = stack;
        stack.addAll(dlfVar.j);
        this.e = new ArrayList();
        Iterator it = dlfVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((dlh) it.next()).clone());
        }
        this.k = new TreeMap(dlfVar.k);
        this.a = dlfVar.a;
        this.b = dlfVar.b;
        this.l = dlfVar.l;
    }

    private final void a(byte[] bArr, byte[] bArr2, dlq dlqVar) {
        dlp dlpVar = new dlp(null);
        int i = dlqVar.d;
        dlpVar.e = i;
        long j = dlqVar.e;
        dlpVar.f = j;
        dlo dloVar = new dlo(dlpVar);
        dll dllVar = new dll();
        dllVar.e = i;
        dllVar.f = j;
        dlm dlmVar = new dlm(dllVar);
        int i2 = 0;
        while (true) {
            int i3 = this.d;
            if (i2 >= (1 << i3)) {
                this.g = (dmc) this.j.pop();
                return;
            }
            dlp dlpVar2 = new dlp();
            dlpVar2.e = dlqVar.d;
            dlpVar2.f = dlqVar.e;
            dlpVar2.a = i2;
            dlpVar2.b = dlqVar.b;
            dlpVar2.c = dlqVar.c;
            dlpVar2.g = dlqVar.f;
            dlqVar = new dlq(dlpVar2);
            dlr dlrVar = this.c;
            dlrVar.a(dlrVar.b(bArr2, dlqVar), bArr);
            att attVarC = this.c.c(dlqVar);
            dlp dlpVar3 = new dlp(null);
            dlpVar3.e = dloVar.d;
            dlpVar3.f = dloVar.e;
            dlpVar3.b = i2;
            dlpVar3.c = dloVar.b;
            dlpVar3.a = dloVar.c;
            dlpVar3.g = dloVar.f;
            dloVar = new dlo(dlpVar3);
            dmc dmcVarS = dnx.S(this.c, attVarC, dloVar);
            dll dllVar2 = new dll();
            dllVar2.e = dlmVar.d;
            dllVar2.f = dlmVar.e;
            dllVar2.b = i2;
            dllVar2.g = dlmVar.f;
            dlmVar = new dlm(dllVar2);
            while (!this.j.isEmpty()) {
                int i4 = ((dmc) this.j.peek()).a;
                int i5 = dmcVarS.a;
                if (i4 == i5) {
                    int i6 = i2 / (1 << i5);
                    if (i6 == 1) {
                        this.h.add(dmcVarS);
                        i6 = 1;
                    }
                    if (i6 == 3) {
                        if (i5 < i3 - this.f) {
                            dlh dlhVar = (dlh) this.e.get(i5);
                            dlhVar.a = dmcVarS;
                            dlhVar.c = i5;
                            if (i5 == dlhVar.b) {
                                dlhVar.f = true;
                            }
                        }
                        i6 = 3;
                    }
                    if (i6 >= 3 && (i6 & 1) == 1 && i5 >= i3 - this.f && i5 <= i3 - 2) {
                        Map map = this.i;
                        Integer numValueOf = Integer.valueOf(i5);
                        if (map.get(numValueOf) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(dmcVarS);
                            this.i.put(numValueOf, linkedList);
                        } else {
                            ((LinkedList) this.i.get(numValueOf)).add(dmcVarS);
                        }
                    }
                    dll dllVar3 = new dll();
                    dllVar3.e = dlmVar.d;
                    dllVar3.f = dlmVar.e;
                    dllVar3.a = dlmVar.a;
                    dllVar3.b = (dlmVar.b - 1) / 2;
                    dllVar3.g = dlmVar.f;
                    dlm dlmVar2 = new dlm(dllVar3);
                    dmc dmcVarR = dnx.r(this.c, (dmc) this.j.pop(), dmcVarS, dlmVar2);
                    dmc dmcVar = new dmc(dmcVarR.a + 1, dmcVarR.a());
                    dll dllVar4 = new dll();
                    dllVar4.e = dlmVar2.d;
                    dllVar4.f = dlmVar2.e;
                    dllVar4.a = dlmVar2.a + 1;
                    dllVar4.b = dlmVar2.b;
                    dllVar4.g = dlmVar2.f;
                    dlmVar = new dlm(dllVar4);
                    dmcVarS = dmcVar;
                }
            }
            this.j.push(dmcVarS);
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b(byte[] bArr, byte[] bArr2, dlq dlqVar) {
        int i;
        dlq dlqVar2 = dlqVar;
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
            this.k.put(Integer.valueOf(i5), (dmc) this.h.get(i5));
        }
        byte[] bArr3 = null;
        dlp dlpVar = new dlp(null);
        int i6 = dlqVar2.d;
        dlpVar.e = i6;
        long j = dlqVar2.e;
        dlpVar.f = j;
        dlo dloVar = new dlo(dlpVar);
        dll dllVar = new dll();
        dllVar.e = i6;
        dllVar.f = j;
        dlm dlmVar = new dlm(dllVar);
        if (i5 == 0) {
            dlp dlpVar2 = new dlp();
            dlpVar2.e = i6;
            dlpVar2.f = j;
            dlpVar2.a = this.a;
            dlpVar2.b = dlqVar2.b;
            dlpVar2.c = dlqVar2.c;
            dlpVar2.g = dlqVar2.f;
            dlqVar2 = new dlq(dlpVar2);
            dlr dlrVar = this.c;
            dlrVar.a(dlrVar.b(bArr2, dlqVar2), bArr);
            att attVarC = this.c.c(dlqVar2);
            dlp dlpVar3 = new dlp(null);
            dlpVar3.e = dloVar.d;
            dlpVar3.f = dloVar.e;
            dlpVar3.b = this.a;
            dlpVar3.c = dloVar.b;
            dlpVar3.a = dloVar.c;
            dlpVar3.g = dloVar.f;
            this.h.set(0, dnx.S(this.c, attVarC, new dlo(dlpVar3)));
        } else {
            dll dllVar2 = new dll();
            dllVar2.e = dlmVar.d;
            dllVar2.f = dlmVar.e;
            int i7 = i5 - 1;
            dllVar2.a = i7;
            dllVar2.b = this.a >> i5;
            dllVar2.g = dlmVar.f;
            dlm dlmVar2 = new dlm(dllVar2);
            dlr dlrVar2 = this.c;
            dlrVar2.a(dlrVar2.b(bArr2, dlqVar2), bArr);
            dlr dlrVar3 = this.c;
            dmc dmcVar = (dmc) this.h.get(i7);
            Map map = this.k;
            Integer numValueOf = Integer.valueOf(i7);
            dmc dmcVarR = dnx.r(dlrVar3, dmcVar, (dmc) map.get(numValueOf), dlmVar2);
            this.h.set(i5, new dmc(dmcVarR.a + 1, dmcVarR.a()));
            this.k.remove(numValueOf);
            for (int i8 = 0; i8 < i5; i8++) {
                if (i8 < i3 - this.f) {
                    this.h.set(i8, ((dlh) this.e.get(i8)).a);
                } else {
                    this.h.set(i8, (dmc) ((LinkedList) this.i.get(Integer.valueOf(i8))).removeFirst());
                }
            }
            int iMin = Math.min(i5, i3 - this.f);
            for (int i9 = 0; i9 < iMin; i9++) {
                int i10 = 1 << i3;
                int i11 = this.a + 1 + ((1 << i9) * 3);
                if (i11 < i10) {
                    dlh dlhVar = (dlh) this.e.get(i9);
                    dlhVar.a = null;
                    dlhVar.c = dlhVar.b;
                    dlhVar.d = i11;
                    dlhVar.e = true;
                    dlhVar.f = false;
                }
            }
        }
        while (i4 < ((i3 - this.f) >> i)) {
            dlh dlhVar2 = bArr3;
            for (dlh dlhVar3 : this.e) {
                if (!dlhVar3.f && dlhVar3.e && (dlhVar2 == 0 || dlhVar3.a() < dlhVar2.a() || (dlhVar3.a() == dlhVar2.a() && dlhVar3.d < dlhVar2.d))) {
                    dlhVar2 = dlhVar3;
                }
            }
            if (dlhVar2 != 0) {
                Stack stack = this.j;
                dlr dlrVar4 = this.c;
                if (dlhVar2.f || !dlhVar2.e) {
                    throw new IllegalStateException("finished or not initialized");
                }
                dlp dlpVar4 = new dlp();
                dlpVar4.e = dlqVar2.d;
                dlpVar4.f = dlqVar2.e;
                int i12 = dlhVar2.d;
                dlpVar4.a = i12;
                dlpVar4.b = dlqVar2.b;
                dlpVar4.c = dlqVar2.c;
                dlpVar4.g = dlqVar2.f;
                dlq dlqVar3 = new dlq(dlpVar4);
                dlp dlpVar5 = new dlp(bArr3);
                int i13 = dlqVar3.d;
                dlpVar5.e = i13;
                boolean z = i;
                long j2 = dlqVar3.e;
                dlpVar5.f = j2;
                dlpVar5.b = i12;
                dlo dloVar2 = new dlo(dlpVar5);
                dll dllVar3 = new dll();
                dllVar3.e = i13;
                dllVar3.f = j2;
                dllVar3.b = i12;
                dlm dlmVar3 = new dlm(dllVar3);
                dlrVar4.a(dlrVar4.b(bArr2, dlqVar3), bArr);
                dmc dmcVarS = dnx.S(dlrVar4, dlrVar4.c(dlqVar3), dloVar2);
                while (!stack.isEmpty() && ((dmc) stack.peek()).a == dmcVarS.a && ((dmc) stack.peek()).a != dlhVar2.b) {
                    dll dllVar4 = new dll();
                    dllVar4.e = dlmVar3.d;
                    dllVar4.f = dlmVar3.e;
                    dllVar4.a = dlmVar3.a;
                    dllVar4.b = (dlmVar3.b - 1) / 2;
                    dllVar4.g = dlmVar3.f;
                    dlm dlmVar4 = new dlm(dllVar4);
                    dmc dmcVarR2 = dnx.r(dlrVar4, (dmc) stack.pop(), dmcVarS, dlmVar4);
                    dmc dmcVar2 = new dmc(dmcVarR2.a + 1, dmcVarR2.a());
                    dll dllVar5 = new dll();
                    dllVar5.e = dlmVar4.d;
                    dllVar5.f = dlmVar4.e;
                    dllVar5.a = dlmVar4.a + 1;
                    dllVar5.b = dlmVar4.b;
                    dllVar5.g = dlmVar4.f;
                    dlmVar3 = new dlm(dllVar5);
                    dmcVarS = dmcVar2;
                }
                dmc dmcVar3 = dlhVar2.a;
                if (dmcVar3 == null) {
                    dlhVar2.a = dmcVarS;
                } else {
                    if (dmcVar3.a == dmcVarS.a) {
                        dll dllVar6 = new dll();
                        dllVar6.e = dlmVar3.d;
                        dllVar6.f = dlmVar3.e;
                        dllVar6.a = dlmVar3.a;
                        dllVar6.b = (dlmVar3.b - 1) / 2;
                        dllVar6.g = dlmVar3.f;
                        dlm dlmVar5 = new dlm(dllVar6);
                        dmcVarS = new dmc(dlhVar2.a.a + 1, dnx.r(dlrVar4, dmcVar3, dmcVarS, dlmVar5).a());
                        dlhVar2.a = dmcVarS;
                        dll dllVar7 = new dll();
                        dllVar7.e = dlmVar5.d;
                        dllVar7.f = dlmVar5.e;
                        dllVar7.a = dlmVar5.a + 1;
                        dllVar7.b = dlmVar5.b;
                        dllVar7.g = dlmVar5.f;
                    } else {
                        stack.push(dmcVarS);
                    }
                }
                if (dlhVar2.a.a == dlhVar2.b) {
                    dlhVar2.f = z;
                } else {
                    dlhVar2.c = dmcVarS.a;
                    dlhVar2.d += z ? 1 : 0;
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

    public dlf(dlf dlfVar, czv czvVar) {
        this.c = new dlr(new dlt(czvVar));
        this.d = dlfVar.d;
        this.f = dlfVar.f;
        this.g = dlfVar.g;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.addAll(dlfVar.h);
        this.i = new TreeMap();
        for (Integer num : dlfVar.i.keySet()) {
            this.i.put(num, (LinkedList) ((LinkedList) dlfVar.i.get(num)).clone());
        }
        Stack stack = new Stack();
        this.j = stack;
        stack.addAll(dlfVar.j);
        this.e = new ArrayList();
        Iterator it = dlfVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((dlh) it.next()).clone());
        }
        this.k = new TreeMap(dlfVar.k);
        int i = dlfVar.a;
        this.a = i;
        this.b = dlfVar.b;
        this.l = dlfVar.l;
        if (this.h != null) {
            if (this.i != null) {
                if (this.j != null) {
                    if (!dnx.k(this.d, i)) {
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

    public dlf(dlf dlfVar, byte[] bArr, byte[] bArr2, dlq dlqVar) {
        this.c = new dlr(dlfVar.c.a);
        this.d = dlfVar.d;
        this.f = dlfVar.f;
        this.g = dlfVar.g;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.addAll(dlfVar.h);
        this.i = new TreeMap();
        for (Integer num : dlfVar.i.keySet()) {
            this.i.put(num, (LinkedList) ((LinkedList) dlfVar.i.get(num)).clone());
        }
        Stack stack = new Stack();
        this.j = stack;
        stack.addAll(dlfVar.j);
        this.e = new ArrayList();
        Iterator it = dlfVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((dlh) it.next()).clone());
        }
        this.k = new TreeMap(dlfVar.k);
        this.a = dlfVar.a;
        this.b = dlfVar.b;
        this.l = false;
        b(bArr, bArr2, dlqVar);
    }

    private dlf(dlr dlrVar, int i, int i2, int i3) {
        this.c = dlrVar;
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
                    this.e.add(new dlh(i5));
                }
                this.k = new TreeMap();
                this.a = 0;
                this.l = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    public dlf(dme dmeVar, int i, int i2) {
        this(dmeVar.a(), dmeVar.c, dmeVar.d, i2);
        this.b = i;
        this.a = i2;
        this.l = true;
    }

    public dlf(dme dmeVar, byte[] bArr, byte[] bArr2, dlq dlqVar) {
        this(dmeVar.a(), dmeVar.c, dmeVar.d, (1 << r1) - 1);
        a(bArr, bArr2, dlqVar);
    }

    public dlf(dme dmeVar, byte[] bArr, byte[] bArr2, dlq dlqVar, int i) {
        this(dmeVar.a(), dmeVar.c, dmeVar.d, (1 << r1) - 1);
        a(bArr, bArr2, dlqVar);
        while (this.a < i) {
            b(bArr, bArr2, dlqVar);
            this.l = false;
        }
    }
}
