package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vvl {
    public static final /* synthetic */ int a = 0;
    private static final char[] b;

    static {
        char[] cArr = new char[80];
        b = cArr;
        Arrays.fill(cArr, ' ');
    }

    static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i, sb);
        sb.append(a.O(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(vxr.v(vsz.s((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof vsz) {
            sb.append(": \"");
            sb.append(vxr.v((vsz) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof vuc) {
            sb.append(" {");
            b((vuc) obj, sb, i + 2);
            sb.append("\n");
            c(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i2 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i2, "key", entry.getKey());
        a(sb, i2, "value", entry.getValue());
        sb.append("\n");
        c(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(defpackage.vvj r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvl.b(vvj, java.lang.StringBuilder, int):void");
    }

    private static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(b, 0, i2);
            i -= i2;
        }
    }
}
