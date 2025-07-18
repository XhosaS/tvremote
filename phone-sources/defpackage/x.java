package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class x {
    public final int a;
    public final char b;
    public short c;
    public int d;
    public final int e;

    public x(int i, int i2, int i3, int i4) {
        this.e = i;
        this.a = i2;
        this.b = (char) i3;
        this.c = (short) i4;
    }

    public final int a() {
        return this.a + this.b;
    }

    public final int b() {
        int i = this.e;
        if (i == 6 || i == 7) {
            return y.e[this.c];
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            x xVar = (x) obj;
            if (this.e == xVar.e && this.a == xVar.a && this.b == xVar.b && this.c == xVar.c && this.d == xVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        a.bl(i);
        return (((((i * 37) + this.a) * 37) + this.b) * 37) + this.c;
    }

    public final String toString() {
        String string;
        String str;
        int i = this.e;
        if (i == 6 || i == 7) {
            int iB = b();
            String strA = a.a(iB);
            if (iB == 0) {
                throw null;
            }
            string = strA;
        } else {
            string = Integer.toString(this.c);
        }
        switch (i) {
            case 1:
                str = "MSG_START";
                break;
            case 2:
                str = "MSG_LIMIT";
                break;
            case 3:
                str = "SKIP_SYNTAX";
                break;
            case 4:
                str = "INSERT_CHAR";
                break;
            case 5:
                str = "REPLACE_NUMBER";
                break;
            case 6:
                str = "ARG_START";
                break;
            case 7:
                str = "ARG_LIMIT";
                break;
            case 8:
                str = "ARG_NUMBER";
                break;
            case 9:
                str = "ARG_NAME";
                break;
            case 10:
                str = "ARG_TYPE";
                break;
            case 11:
                str = "ARG_STYLE";
                break;
            case 12:
                str = "ARG_SELECTOR";
                break;
            case 13:
                str = "ARG_INT";
                break;
            default:
                str = "ARG_DOUBLE";
                break;
        }
        return str + "(" + string + ")@" + this.a;
    }
}
