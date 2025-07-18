package defpackage;

import j$.nio.file.Path;
import j$.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zhe implements Comparable {
    public static final String a;
    public final zgn b;

    static {
        String str = File.separator;
        str.getClass();
        a = str;
    }

    public zhe(zgn zgnVar) {
        zgnVar.getClass();
        this.b = zgnVar;
    }

    public final Path a() {
        Path path = Paths.get(toString(), new String[0]);
        path.getClass();
        return path;
    }

    public final File b() {
        return new File(toString());
    }

    public final Character c() {
        zgn zgnVar = this.b;
        if (zgnVar.d(zhu.a, 0) != -1 || zgnVar.c() < 2 || zgnVar.a(1) != 58) {
            return null;
        }
        char cA = (char) zgnVar.a(0);
        if ((cA < 'a' || cA >= '{') && (cA < 'A' || cA >= '[')) {
            return null;
        }
        return Character.valueOf(cA);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zhe zheVar = (zhe) obj;
        zheVar.getClass();
        return this.b.compareTo(zheVar.b);
    }

    public final List d() {
        ArrayList arrayList = new ArrayList();
        int iB = zhu.b(this);
        if (iB == -1) {
            iB = 0;
        } else {
            zgn zgnVar = this.b;
            if (iB < zgnVar.c() && zgnVar.a(iB) == 92) {
                iB++;
            }
        }
        zgn zgnVar2 = this.b;
        int iC = zgnVar2.c();
        int i = iB;
        while (iB < iC) {
            int i2 = iB + 1;
            if (zgnVar2.a(iB) == 47 || zgnVar2.a(iB) == 92) {
                arrayList.add(zgnVar2.j(i, iB));
                i = i2;
            }
            iB = i2;
        }
        if (i < zgnVar2.c()) {
            arrayList.add(zgnVar2.j(i, zgnVar2.c()));
        }
        return arrayList;
    }

    public final zhe e() {
        int iB = zhu.b(this);
        if (iB == -1) {
            return null;
        }
        return new zhe(this.b.j(0, iB));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zhe) && yks.e(((zhe) obj).b, this.b);
    }

    public final zhe f() {
        zgn zgnVar = this.b;
        zgn zgnVar2 = zhu.c;
        if (!yks.e(zgnVar, zgnVar2)) {
            zgn zgnVar3 = zhu.a;
            if (!yks.e(zgnVar, zgnVar3)) {
                zgn zgnVar4 = zhu.b;
                if (!yks.e(zgnVar, zgnVar4)) {
                    zgn zgnVar5 = zhu.d;
                    zgnVar5.getClass();
                    if (zgnVar.r(zgnVar.c() - zgnVar5.c(), zgnVar5, zgnVar5.c()) && (zgnVar.c() == 2 || zgnVar.r(zgnVar.c() - 3, zgnVar3, 1) || zgnVar.r(zgnVar.c() - 3, zgnVar4, 1))) {
                        return null;
                    }
                    int iA = zhu.a(this);
                    if (iA == 2) {
                        if (c() != null) {
                            if (zgnVar.c() == 3) {
                                return null;
                            }
                            return new zhe(zgn.s(zgnVar, 0, 3, 1));
                        }
                        iA = 2;
                    }
                    if (iA == 1) {
                        if (zgnVar.m(zgnVar4)) {
                            return null;
                        }
                        iA = 1;
                    }
                    if (iA != -1 || c() == null) {
                        return iA == -1 ? new zhe(zgnVar2) : iA == 0 ? new zhe(zgn.s(zgnVar, 0, 1, 1)) : new zhe(zgn.s(zgnVar, 0, iA, 1));
                    }
                    if (zgnVar.c() == 2) {
                        return null;
                    }
                    return new zhe(zgn.s(zgnVar, 0, 2, 1));
                }
            }
        }
        return null;
    }

    public final zhe g(String str) {
        zgk zgkVar = new zgk();
        zgkVar.V(str);
        return zhu.e(this, zhu.f(zgkVar, false), false);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.h();
    }
}
