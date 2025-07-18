package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afsw {
    public static final Logger a = Logger.getLogger(afsw.class.getName());

    private afsw() {
    }

    public static Object a(abdx abdxVar) throws IOException, NumberFormatException {
        double d;
        yqw.M(abdxVar.n(), "unexpected end of JSON");
        int iP = abdxVar.p() - 1;
        if (iP == 0) {
            abdxVar.i();
            ArrayList arrayList = new ArrayList();
            while (abdxVar.n()) {
                arrayList.add(a(abdxVar));
            }
            yqw.M(abdxVar.p() == 2, "Bad token: ".concat(abdxVar.r()));
            abdxVar.k();
            return DesugarCollections.unmodifiableList(arrayList);
        }
        if (iP == 2) {
            abdxVar.j();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (abdxVar.n()) {
                String strE = abdxVar.e();
                yqw.F(!linkedHashMap.containsKey(strE), "Duplicate key found: %s", strE);
                linkedHashMap.put(strE, a(abdxVar));
            }
            yqw.M(abdxVar.p() == 4, "Bad token: ".concat(abdxVar.r()));
            abdxVar.l();
            return DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        if (iP == 5) {
            return abdxVar.g();
        }
        if (iP != 6) {
            if (iP == 7) {
                return Boolean.valueOf(abdxVar.o());
            }
            if (iP != 8) {
                throw new IllegalStateException("Bad token: ".concat(abdxVar.r()));
            }
            abdxVar.m();
            return null;
        }
        int iA = abdxVar.c;
        if (iA == 0) {
            iA = abdxVar.a();
        }
        if (iA == 15) {
            abdxVar.c = 0;
            int[] iArr = abdxVar.h;
            int i = abdxVar.g - 1;
            iArr[i] = iArr[i] + 1;
            d = abdxVar.d;
        } else {
            if (iA == 16) {
                char[] cArr = abdxVar.a;
                int i2 = abdxVar.b;
                int i3 = abdxVar.e;
                abdxVar.f = new String(cArr, i2, i3);
                abdxVar.b = i2 + i3;
            } else if (iA == 8 || iA == 9) {
                abdxVar.f = abdxVar.f(iA == 8 ? '\'' : '\"');
            } else if (iA == 10) {
                abdxVar.f = abdxVar.h();
            } else if (iA != 11) {
                throw abdxVar.c("a double");
            }
            abdxVar.c = 11;
            d = Double.parseDouble(abdxVar.f);
            if (abdxVar.i != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
                throw abdxVar.b("JSON forbids NaN and infinities: " + d);
            }
            abdxVar.f = null;
            abdxVar.c = 0;
            int[] iArr2 = abdxVar.h;
            int i4 = abdxVar.g - 1;
            iArr2[i4] = iArr2[i4] + 1;
        }
        return Double.valueOf(d);
    }
}
