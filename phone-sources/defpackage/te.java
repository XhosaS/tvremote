package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class te {
    public final yjk a;
    public final yoe b;

    public te(yjk yjkVar, yoe yoeVar) {
        this.a = yjkVar;
        this.b = yoeVar;
    }

    public final String toString() {
        String str;
        yoe yoeVar = this.b;
        yov yovVar = (yov) ((yof) yoeVar).b.get(yov.b);
        String str2 = yovVar != null ? yovVar.a : null;
        StringBuilder sb = new StringBuilder("Request@");
        String string = Integer.toString(hashCode(), 16);
        string.getClass();
        sb.append(string);
        if (str2 != null) {
            str = "[" + str2 + "](";
        } else {
            str = "(";
        }
        sb.append(str);
        sb.append("currentBounds()=");
        sb.append(this.a.a());
        sb.append(", continuation=");
        sb.append(yoeVar);
        sb.append(')');
        return sb.toString();
    }
}
