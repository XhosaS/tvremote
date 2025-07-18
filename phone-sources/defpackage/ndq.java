package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ndq implements Comparable {
    public static final ndq a = new ndq();
    public final String b;
    public final String c;
    public final boolean d;

    private ndq() {
        this.b = "";
        this.c = null;
        this.d = false;
    }

    public final String a(String str) {
        if (this.d) {
            return null;
        }
        String str2 = this.c;
        return str2 != null ? str2.concat(String.valueOf(str.substring(this.b.length()))) : str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((ndq) obj).b.compareTo(this.b);
    }

    public ndq(String str) throws ndr {
        int i;
        String[] strArrSplit = nds.a.split(str);
        if (strArrSplit.length == 0) {
            throw new ndr("Empty rule");
        }
        boolean z = false;
        this.b = strArrSplit[0];
        String str2 = null;
        int i2 = 1;
        while (true) {
            int length = strArrSplit.length;
            if (i2 >= length) {
                this.c = str2;
                this.d = z;
                return;
            }
            String lowerCase = strArrSplit[i2].toLowerCase();
            if (lowerCase.equals("rewrite") && (i = i2 + 1) < length) {
                str2 = strArrSplit[i];
                i2 += 2;
            } else {
                if (!lowerCase.equals("block")) {
                    throw new ndr("Illegal rule: ".concat(str));
                }
                i2++;
                z = true;
            }
        }
    }
}
