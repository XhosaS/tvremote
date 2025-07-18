package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sno implements snm {
    private final Object a;

    public sno(snm snmVar) {
        this.a = snmVar;
    }

    public static final int a(String str) {
        return str == null ? snn.a[0] : snn.a[Math.abs(str.hashCode()) % 21];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence b(zft zftVar) {
        String str;
        if (zftVar != null) {
            int i = 0;
            while (true) {
                String[] strArr = (String[]) zftVar.a;
                if (i >= strArr.length) {
                    break;
                }
                String string = strArr[i];
                if (string == null || string.isEmpty() || string.equals(".")) {
                    string = null;
                } else if (string.length() > 2) {
                    snp snpVar = (snp) ((sno) this.a).a;
                    a.ab(snpVar.e);
                    Object obj = (ko) snpVar.d.get();
                    if (obj == null) {
                        str = null;
                    } else {
                        int length = string.length();
                        str = null;
                        for (int i2 = 0; i2 < length && obj != null; i2++) {
                            uri uriVar = (uri) ((ko) obj).get(Character.valueOf(string.charAt(i2)));
                            if (uriVar == null) {
                                break;
                            }
                            Object obj2 = uriVar.b;
                            if (obj2 != 0) {
                                str = obj2;
                            }
                            obj = uriVar.a;
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

    public sno(snp snpVar) {
        this.a = snpVar;
        if (snpVar.e) {
            return;
        }
        uhp uhpVarSubmit = snpVar.c.submit(new rjs(snpVar, 10));
        uhpVarSubmit.c(new rmz(snpVar, uhpVarSubmit, 15), ugk.a);
        snpVar.e = true;
    }
}
