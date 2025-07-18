package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggu {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public ggu(String str, String str2, String str3, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggu)) {
            return false;
        }
        ggu gguVar = (ggu) obj;
        if (yks.e(this.a, gguVar.a) && yks.e(this.b, gguVar.b) && yks.e(this.c, gguVar.c) && yks.e(this.d, gguVar.d)) {
            return yks.e(this.e, gguVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        gez.D(yfm.ai(this.d));
        ygi ygiVar = ygi.a;
        sb.append(ygiVar);
        sb.append("\n            |   referenceColumnNames = {");
        gez.C(yfm.ai(this.e));
        sb.append(ygiVar);
        sb.append("\n            |}\n        ");
        return ylh.q(ylh.t(sb.toString()), "    ");
    }
}
