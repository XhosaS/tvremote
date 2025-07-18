package defpackage;

import j$.util.DesugarArrays;
import java.util.HashMap;
import java.util.function.ToIntFunction;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvw implements idf {
    public static final int a = d(5.0f);
    public static final HashMap b = new HashMap();
    public static int c = 0;
    public static String d = "";
    private final lqs e;

    public lvw(mfa mfaVar) {
        HashMap map = new HashMap();
        map.put("/transcript", new lvt());
        map.put("/transcript/text", new lvu());
        map.put("/timedtext", new lvv());
        map.put("/timedtext/window", new lvl());
        map.put("/timedtext/text", new lvm());
        map.put("/tt", new lvn());
        map.put("/tt/head/styling/style", new lvo());
        map.put("/tt/head/layout/region", new lvp());
        map.put("/tt/body", new lvq());
        map.put("/tt/body/div/p", new lvr());
        map.put("/tt/body/div/p/span", new lvs());
        this.e = new lqs(mfaVar, map, 4);
    }

    public static int a(int i) {
        switch (i) {
            case 0:
                return 9;
            case 1:
                return 10;
            case 2:
                return 12;
            case 3:
                return 17;
            case 4:
                return 18;
            case 5:
                return 20;
            case 6:
                return 33;
            case 7:
            default:
                return 34;
            case 8:
                return 36;
        }
    }

    public static int c(String str) {
        int iIndexOf = str.indexOf(":");
        int i = Integer.parseInt(str.substring(0, iIndexOf));
        int i2 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(":", i2);
        int i3 = Integer.parseInt(str.substring(i2, iIndexOf2));
        return (int) (((i * 3600) + (i3 * 60) + Float.parseFloat(str.substring(iIndexOf2 + 1))) * 1000.0f);
    }

    public static int d(float f) {
        return (int) (f * 1000.0f);
    }

    public static String e(Attributes attributes, String... strArr) {
        for (String str : strArr) {
            String value = attributes.getValue(str);
            if (value != null) {
                return value;
            }
        }
        return null;
    }

    public static int[] f(String str) {
        return DesugarArrays.stream(str.split(" ")).mapToInt(new ToIntFunction() { // from class: lvk
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                int i = lvw.a;
                return Integer.parseInt(((String) obj).replace("%", ""));
            }
        }).toArray();
    }

    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return ((mfq) obj).b.c(this.e);
    }
}
