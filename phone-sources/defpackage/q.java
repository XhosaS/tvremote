package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class q {

    @Deprecated
    public final Set a;

    @Deprecated
    public final boolean b;

    @Deprecated
    public final int c;

    private q(int i, Set set, boolean z) {
        this.c = i;
        this.a = set;
        this.b = z;
    }

    static q a(String str) {
        int i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (str.startsWith("integer")) {
            i = 1;
        } else {
            if (!str.startsWith("decimal")) {
                throw new IllegalArgumentException("Samples must start with 'integer' or 'decimal'");
            }
            i = 2;
        }
        boolean z = true;
        boolean z2 = false;
        for (String str2 : v.e.split(str.substring(7).trim())) {
            if (str2.equals("…") || str2.equals("...")) {
                z2 = true;
                z = false;
            } else {
                if (z2) {
                    throw new IllegalArgumentException("Can only have … at the end of samples: ".concat(String.valueOf(str2)));
                }
                String[] strArrSplit = v.f.split(str2);
                int length = strArrSplit.length;
                if (length == 1) {
                    o oVar = new o(strArrSplit[0]);
                    b(i, oVar);
                    linkedHashSet.add(new p(oVar, oVar));
                } else {
                    if (length != 2) {
                        throw new IllegalArgumentException("Ill-formed number range: ".concat(String.valueOf(str2)));
                    }
                    o oVar2 = new o(strArrSplit[0]);
                    o oVar3 = new o(strArrSplit[1]);
                    b(i, oVar2);
                    b(i, oVar3);
                    linkedHashSet.add(new p(oVar2, oVar3));
                }
            }
        }
        return new q(i, DesugarCollections.unmodifiableSet(linkedHashSet), z);
    }

    private static void b(int i, o oVar) {
        if ((i == 1) != (oVar.b == 0)) {
            throw new IllegalArgumentException("Ill-formed number range: ".concat(oVar.toString()));
        }
    }

    @Deprecated
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        boolean z = true;
        sb.append((this.c != 1 ? "DECIMAL" : "INTEGER").toLowerCase(Locale.ENGLISH));
        for (p pVar : this.a) {
            if (!z) {
                sb.append(",");
            }
            sb.append(' ');
            sb.append(pVar);
            z = false;
        }
        if (!this.b) {
            sb.append(", …");
        }
        return sb.toString();
    }
}
