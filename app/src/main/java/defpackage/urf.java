package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class urf implements urc {
    private final urc a;

    public urf(urc urcVar) {
        this.a = urcVar;
    }

    public final int a(String str) {
        return str == null ? ure.a[0] : ure.a[Math.abs(str.hashCode()) % 21];
    }

    public final CharSequence b(qjv qjvVar) {
        String str;
        if (qjvVar != null) {
            int i = 0;
            while (true) {
                String[] strArr = qjvVar.a;
                if (i >= strArr.length) {
                    break;
                }
                String string = strArr[i];
                if (string == null || string.isEmpty() || string.equals(".")) {
                    string = null;
                } else if (string.length() > 2) {
                    urk urkVar = ((urd) this.a).a;
                    yqw.L(urkVar.e);
                    urj urjVar = (urj) urkVar.d.get();
                    if (urjVar == null) {
                        str = null;
                    } else {
                        int length = string.length();
                        str = null;
                        for (int i2 = 0; i2 < length && urjVar != null; i2++) {
                            uri uriVar = (uri) urjVar.get(Character.valueOf(string.charAt(i2)));
                            if (uriVar == null) {
                                break;
                            }
                            String str2 = uriVar.b;
                            if (str2 != null) {
                                str = str2;
                            }
                            urjVar = uriVar.a;
                        }
                    }
                    string = str == null ? new StringBuilder().appendCodePoint(string.codePointAt(0)).toString() : str;
                }
                if (string != null) {
                    return string;
                }
                i++;
            }
        }
        return null;
    }
}
