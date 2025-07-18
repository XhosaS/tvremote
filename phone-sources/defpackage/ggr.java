package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggr {
    public final String a;
    public final Set b;
    public final Set c;

    public ggr(String str, Set set, String str2) {
        this(str, set, ggs.a(str2));
    }

    public static final ggr a(gic gicVar, String str) throws Exception {
        int i = ggs.a;
        yia yiaVar = new yia();
        ghi ghiVarA = gicVar.a("PRAGMA table_info(`" + str + "`)");
        try {
            if (ghiVarA.l()) {
                int iH = gez.H(ghiVarA, "name");
                do {
                    yiaVar.add(ghiVarA.d(iH));
                } while (ghiVarA.l());
            }
            wef.r(ghiVarA, null);
            Set setAi = wcq.ai(yiaVar);
            ghiVarA = gicVar.a("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
            try {
                String strD = ghiVarA.l() ? ghiVarA.d(gez.H(ghiVarA, "sql")) : "";
                wef.r(ghiVarA, null);
                return new ggr(str, setAi, ggs.a(strD));
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        return gez.h(this, obj);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return gez.g(this);
    }

    public ggr(String str, Set set, Set set2) {
        set.getClass();
        this.a = str;
        this.b = set;
        this.c = set2;
    }
}
