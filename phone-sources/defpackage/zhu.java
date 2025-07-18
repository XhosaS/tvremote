package defpackage;

import java.io.EOFException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zhu {
    public static final zgn a;
    public static final zgn b;
    public static final zgn c;
    public static final zgn d;
    private static final zgn e;

    static {
        zgn zgnVar = zgn.a;
        a = wcq.aD("/");
        b = wcq.aD("\\");
        e = wcq.aD("/\\");
        c = wcq.aD(".");
        d = wcq.aD("..");
    }

    public static final int a(zhe zheVar) {
        zgn zgnVar = zheVar.b;
        int iQ = zgn.q(zgnVar, a);
        return iQ != -1 ? iQ : zgn.q(zgnVar, b);
    }

    public static final int b(zhe zheVar) {
        zgn zgnVar = zheVar.b;
        if (zgnVar.c() == 0) {
            return -1;
        }
        if (zgnVar.a(0) == 47) {
            return 1;
        }
        if (zgnVar.a(0) == 92) {
            if (zgnVar.c() <= 2 || zgnVar.a(1) != 92) {
                return 1;
            }
            int iD = zgnVar.d(b, 2);
            return iD == -1 ? zgnVar.c() : iD;
        }
        if (zgnVar.c() > 2 && zgnVar.a(1) == 58 && zgnVar.a(2) == 92) {
            char cA = (char) zgnVar.a(0);
            if (cA >= 'a' && cA < '{') {
                return 3;
            }
            if (cA >= 'A' && cA < '[') {
                return 3;
            }
        }
        return -1;
    }

    public static final zgn c(zhe zheVar) {
        zgn zgnVar = zheVar.b;
        zgn zgnVar2 = a;
        if (zgnVar.d(zgnVar2, 0) != -1) {
            return zgnVar2;
        }
        zgn zgnVar3 = b;
        if (zgnVar.d(zgnVar3, 0) == -1) {
            return null;
        }
        return zgnVar3;
    }

    public static final zgn d(String str) {
        if (yks.e(str, "/")) {
            return a;
        }
        if (yks.e(str, "\\")) {
            return b;
        }
        throw new IllegalArgumentException("not a directory separator: ".concat(str));
    }

    public static final zhe e(zhe zheVar, zhe zheVar2, boolean z) {
        if (b(zheVar2) != -1 || zheVar2.c() != null) {
            return zheVar2;
        }
        zgn zgnVarC = c(zheVar);
        if (zgnVarC == null && (zgnVarC = c(zheVar2)) == null) {
            zgnVarC = d(zhe.a);
        }
        zgk zgkVar = new zgk();
        zgkVar.J(zheVar.b);
        if (zgkVar.b > 0) {
            zgkVar.J(zgnVarC);
        }
        zgkVar.J(zheVar2.b);
        return f(zgkVar, z);
    }

    public static final zhe f(zgk zgkVar, boolean z) throws EOFException {
        zgn zgnVar;
        char c2;
        zgn zgnVarT;
        zgk zgkVar2 = new zgk();
        zgn zgnVarG = null;
        int i = 0;
        while (true) {
            if (!zgkVar.H(a)) {
                zgnVar = b;
                if (!zgkVar.H(zgnVar)) {
                    break;
                }
            }
            byte bD = zgkVar.d();
            if (zgnVarG == null) {
                zgnVarG = g(bD);
            }
            i++;
        }
        boolean z2 = i >= 2 && yks.e(zgnVarG, zgnVar);
        if (z2) {
            zgnVarG.getClass();
            zgkVar2.J(zgnVarG);
            zgkVar2.J(zgnVarG);
        } else if (i > 0) {
            zgnVarG.getClass();
            zgkVar2.J(zgnVarG);
        } else {
            long j = zgkVar.j(e);
            if (zgnVarG == null) {
                zgnVarG = j == -1 ? d(zhe.a) : g(zgkVar.c(j));
            }
            if (yks.e(zgnVarG, zgnVar) && zgkVar.b >= 2 && zgkVar.c(1L) == 58 && (((c2 = (char) zgkVar.c(0L)) >= 'a' && c2 < '{') || (c2 >= 'A' && c2 < '['))) {
                if (j == 2) {
                    zgkVar2.eW(zgkVar, 3L);
                } else {
                    zgkVar2.eW(zgkVar, 2L);
                }
            }
        }
        boolean z3 = zgkVar2.b > 0;
        ArrayList arrayList = new ArrayList();
        while (!zgkVar.C()) {
            long j2 = zgkVar.j(e);
            if (j2 == -1) {
                zgnVarT = zgkVar.s();
            } else {
                zgnVarT = zgkVar.t(j2);
                zgkVar.d();
            }
            zgn zgnVar2 = d;
            if (yks.e(zgnVarT, zgnVar2)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (!z || (!z3 && (arrayList.isEmpty() || yks.e(yfm.W(arrayList), zgnVar2)))) {
                        arrayList.add(zgnVarT);
                    } else if (!z2 || arrayList.size() != 1) {
                        if (!arrayList.isEmpty()) {
                            arrayList.remove(yfm.q(arrayList));
                        }
                    }
                }
            } else if (!yks.e(zgnVarT, c) && !yks.e(zgnVarT, zgn.a)) {
                arrayList.add(zgnVarT);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                zgkVar2.J(zgnVarG);
            }
            zgkVar2.J((zgn) arrayList.get(i2));
        }
        if (zgkVar2.b == 0) {
            zgkVar2.J(c);
        }
        return new zhe(zgkVar2.s());
    }

    private static final zgn g(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        throw new IllegalArgumentException(a.cf(b2, "not a directory separator: "));
    }
}
