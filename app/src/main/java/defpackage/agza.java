package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agza extends agyw {
    public static final String b(String str) {
        int length;
        Comparable comparable;
        List listM = agyv.m(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (!agyv.n((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(agqq.i(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!agyl.a(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM.size();
        agux aguxVarE = e();
        int iC = agqq.c(listM);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM) {
            int i = length + 1;
            if (length < 0) {
                agqq.h();
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iC) && agyv.n(str3)) {
                str3 = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(a.a(iIntValue, "Requested character count ", " is less than zero."));
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                String strSubstring = str3.substring(length4);
                strSubstring.getClass();
                String str4 = (String) aguxVarE.a(strSubstring);
                if (str4 != null) {
                    str3 = str4;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        agqq.F(arrayList3, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static final String c(String str) throws IOException {
        agyk agykVar = new agyk(new agzj(str), new agux() { // from class: agyx
            public final /* synthetic */ String a = "    ";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                String str2 = (String) obj;
                str2.getClass();
                boolean zN = agyv.n(str2);
                String str3 = this.a;
                return zN ? str2.length() >= str3.length() ? str2 : str3 : str3.concat(str2);
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        agyj agyjVar = new agyj(agykVar);
        int i = 0;
        while (agyjVar.hasNext()) {
            Object next = agyjVar.next();
            i++;
            if (i > 1) {
                sb.append((CharSequence) "\n");
            }
            agyv.a(sb, next, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final String d(String str) {
        String str2;
        if (agyv.n("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM = agyv.m(str);
        listM.size();
        agux aguxVarE = e();
        int iC = agqq.c(listM);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listM) {
            int i2 = i + 1;
            if (i < 0) {
                agqq.h();
            }
            String str3 = (String) obj;
            String strSubstring = null;
            if ((i == 0 || i == iC) && agyv.n(str3)) {
                str3 = null;
            } else {
                int length = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (!agyl.a(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    str3.getClass();
                    if (str3.startsWith("|", i3)) {
                        str3.getClass();
                        strSubstring = str3.substring(i3 + 1);
                        strSubstring.getClass();
                    }
                }
                if (strSubstring != null && (str2 = (String) aguxVarE.a(strSubstring)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(str.length());
        agqq.F(arrayList, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    private static final agux e() {
        return "".length() == 0 ? new agux() { // from class: agyy
            @Override // defpackage.agux
            public final Object a(Object obj) {
                String str = (String) obj;
                str.getClass();
                return str;
            }
        } : new agux() { // from class: agyz
            public final /* synthetic */ String a = "";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                String str = (String) obj;
                str.getClass();
                return this.a.concat(str);
            }
        };
    }
}
