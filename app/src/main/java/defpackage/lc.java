package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lc {
    final pp e;
    private final afh f = new afi(30);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int d = 0;
    final pd c = new pd(this);

    public lc(pp ppVar) {
        this.e = ppVar;
    }

    private final int l(int i, int i2) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            lb lbVar = (lb) arrayList.get(size);
            int i3 = lbVar.a;
            if (i3 == 8) {
                int i4 = lbVar.b;
                int i5 = lbVar.d;
                int i6 = i4 < i5 ? i5 : i4;
                int i7 = i4 < i5 ? i4 : i5;
                if (i < i7 || i > i6) {
                    if (i < i4) {
                        if (i2 == 1) {
                            lbVar.b = i4 + 1;
                            lbVar.d = i5 + 1;
                        } else if (i2 == 2) {
                            lbVar.b = i4 - 1;
                            lbVar.d = i5 - 1;
                        }
                    }
                } else if (i7 == i4) {
                    if (i2 == 1) {
                        lbVar.d = i5 + 1;
                    } else if (i2 == 2) {
                        lbVar.d = i5 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        lbVar.b = i4 + 1;
                    } else if (i2 == 2) {
                        lbVar.b = i4 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = lbVar.b;
                if (i8 <= i) {
                    if (i3 == 1) {
                        i -= lbVar.d;
                    } else if (i3 == 2) {
                        i += lbVar.d;
                    }
                } else if (i2 == 1) {
                    lbVar.b = i8 + 1;
                } else if (i2 == 2) {
                    lbVar.b = i8 - 1;
                }
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return i;
            }
            lb lbVar2 = (lb) arrayList.get(size2);
            if (lbVar2.a == 8) {
                int i9 = lbVar2.d;
                if (i9 == lbVar2.b || i9 < 0) {
                    arrayList.remove(size2);
                    g(lbVar2);
                }
            } else if (lbVar2.d <= 0) {
                arrayList.remove(size2);
                g(lbVar2);
            }
        }
    }

    private final void m(lb lbVar) {
        int i;
        int i2 = lbVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(lbVar.b, i2);
        int i3 = lbVar.b;
        int i4 = lbVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                Objects.toString(lbVar);
                throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(lbVar)));
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < lbVar.d; i6++) {
            int iL2 = l(lbVar.b + (i * i6), lbVar.a);
            int i7 = lbVar.a;
            if (i7 == 2 ? iL2 != iL : !(i7 == 4 && iL2 == iL + 1)) {
                lb lbVarB = b(i7, iL, i5, lbVar.c);
                e(lbVarB, i3);
                g(lbVarB);
                if (lbVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iL = iL2;
            } else {
                i5++;
            }
        }
        Object obj = lbVar.c;
        g(lbVar);
        if (i5 > 0) {
            lb lbVarB2 = b(lbVar.a, iL, i5, obj);
            e(lbVarB2, i3);
            g(lbVarB2);
        }
    }

    private final void n(lb lbVar) {
        this.b.add(lbVar);
        int i = lbVar.a;
        if (i == 1) {
            this.e.d(lbVar.b, lbVar.d);
            return;
        }
        if (i == 2) {
            pp ppVar = this.e;
            int i2 = lbVar.b;
            int i3 = lbVar.d;
            RecyclerView recyclerView = ppVar.a;
            recyclerView.T(i2, i3, false);
            recyclerView.P = true;
            return;
        }
        if (i == 4) {
            this.e.c(lbVar.b, lbVar.d, lbVar.c);
        } else if (i == 8) {
            this.e.e(lbVar.b, lbVar.d);
        } else {
            Objects.toString(lbVar);
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(lbVar)));
        }
    }

    private final boolean o(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            lb lbVar = (lb) arrayList.get(i2);
            int i4 = lbVar.a;
            if (i4 == 8) {
                if (a(lbVar.d, i3) == i) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = lbVar.b;
                int i6 = lbVar.d + i5;
                while (i5 < i6) {
                    if (a(i5, i3) == i) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
            i2 = i3;
        }
        return false;
    }

    final int a(int i, int i2) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (i2 < size) {
            lb lbVar = (lb) arrayList.get(i2);
            int i3 = lbVar.a;
            if (i3 == 8) {
                int i4 = lbVar.b;
                if (i4 == i) {
                    i = lbVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (lbVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = lbVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = lbVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += lbVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final lb b(int i, int i2, int i3, Object obj) {
        lb lbVar = (lb) this.f.a();
        if (lbVar == null) {
            return new lb(i, i2, i3, obj);
        }
        lbVar.a = i;
        lbVar.b = i2;
        lbVar.d = i3;
        lbVar.c = obj;
        return lbVar;
    }

    public final void c() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.b((lb) arrayList.get(i));
        }
        h(arrayList);
        this.d = 0;
    }

    public final void d() {
        c();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lb lbVar = (lb) arrayList.get(i);
            int i2 = lbVar.a;
            if (i2 == 1) {
                pp ppVar = this.e;
                ppVar.b(lbVar);
                ppVar.d(lbVar.b, lbVar.d);
            } else if (i2 == 2) {
                pp ppVar2 = this.e;
                ppVar2.b(lbVar);
                ppVar2.f(lbVar.b, lbVar.d);
            } else if (i2 == 4) {
                pp ppVar3 = this.e;
                ppVar3.b(lbVar);
                ppVar3.c(lbVar.b, lbVar.d, lbVar.c);
            } else if (i2 == 8) {
                pp ppVar4 = this.e;
                ppVar4.b(lbVar);
                ppVar4.e(lbVar.b, lbVar.d);
            }
        }
        h(arrayList);
        this.d = 0;
    }

    final void e(lb lbVar, int i) {
        pp ppVar = this.e;
        ppVar.b(lbVar);
        int i2 = lbVar.a;
        if (i2 == 2) {
            ppVar.f(i, lbVar.d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            ppVar.c(i, lbVar.d, lbVar.c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x010b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc.f():void");
    }

    public final void g(lb lbVar) {
        lbVar.c = null;
        this.f.b(lbVar);
    }

    final void h(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            g((lb) list.get(i));
        }
        list.clear();
    }

    public final void i() {
        h(this.a);
        h(this.b);
        this.d = 0;
    }

    public final boolean j(int i) {
        return (i & this.d) != 0;
    }

    public final boolean k() {
        return this.a.size() > 0;
    }
}
