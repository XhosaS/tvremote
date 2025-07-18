package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qtu {
    private static final yrl b = yrl.b(new ypz('/'));
    private static final Pattern c = Pattern.compile("^(\\*[a-z]+\\*).*");
    final ConcurrentHashMap a = new ConcurrentHashMap();

    static String a(String str) {
        List listG = b.g(str);
        return listG.size() != 3 ? "MALFORMED" : (String) listG.get(0);
    }

    final ahqg b(ahqg ahqgVar) {
        ahpw ahpwVar = ahqgVar.e;
        if (ahpwVar == null) {
            ahpwVar = ahpw.a;
        }
        if ((ahpwVar.b & 1) == 0) {
            return ahqgVar;
        }
        ahpw ahpwVar2 = ahqgVar.e;
        if (ahpwVar2 == null) {
            ahpwVar2 = ahpw.a;
        }
        ahpv ahpvVar = new ahpv();
        ahpvVar.B(ahpwVar2);
        Long l = (Long) this.a.get(Long.valueOf(((ahpw) ahpvVar.b).c));
        l.getClass();
        ahqf ahqfVar = new ahqf();
        ahqfVar.B(ahqgVar);
        long jLongValue = l.longValue();
        if ((ahpvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahpvVar.y();
        }
        ahpw ahpwVar3 = (ahpw) ahpvVar.b;
        ahpwVar3.b |= 1;
        ahpwVar3.c = jLongValue;
        if ((ahqfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahqfVar.y();
        }
        ahqg ahqgVar2 = (ahqg) ahqfVar.b;
        ahpw ahpwVar4 = (ahpw) ahpvVar.v();
        ahpwVar4.getClass();
        ahqgVar2.e = ahpwVar4;
        ahqgVar2.b |= 4;
        return (ahqg) ahqfVar.v();
    }

    final ahqg c(int i, ahqg ahqgVar) throws NoSuchAlgorithmException {
        ahpw ahpwVar = ahqgVar.e;
        if (ahpwVar == null) {
            ahpwVar = ahpw.a;
        }
        if ((ahpwVar.b & 2) == 0) {
            return ahqgVar;
        }
        ahpw ahpwVar2 = ahqgVar.e;
        if (ahpwVar2 == null) {
            ahpwVar2 = ahpw.a;
        }
        ahpv ahpvVar = new ahpv();
        ahpvVar.B(ahpwVar2);
        ahqf ahqfVar = new ahqf();
        ahqfVar.B(ahqgVar);
        String strConcat = ((ahpw) ahpvVar.b).d;
        Long lA = aagg.a(strConcat);
        lA.getClass();
        ConcurrentHashMap concurrentHashMap = this.a;
        long jLongValue = lA.longValue();
        if (!concurrentHashMap.containsKey(lA)) {
            int i2 = i - 1;
            if (i2 == 0) {
                Matcher matcher = c.matcher(strConcat);
                if (matcher.matches()) {
                    strConcat = strConcat.startsWith("*sync*/") ? "*sync*/".concat(String.valueOf(a(strConcat.substring(7)))) : matcher.group(1);
                }
            } else if (i2 == 1) {
                strConcat = a(strConcat);
            } else if (i2 == 2) {
                strConcat = "--";
            }
            Long lA2 = aagg.a(strConcat);
            if (lA2 != null) {
                concurrentHashMap.putIfAbsent(lA, lA2);
            }
        }
        if ((ahpvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahpvVar.y();
        }
        ahpw ahpwVar3 = (ahpw) ahpvVar.b;
        ahpwVar3.b |= 1;
        ahpwVar3.c = jLongValue;
        if ((ahpvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahpvVar.y();
        }
        ahpw ahpwVar4 = (ahpw) ahpvVar.b;
        ahpwVar4.b &= -3;
        ahpwVar4.d = ahpw.a.d;
        if ((ahqfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahqfVar.y();
        }
        ahqg ahqgVar2 = (ahqg) ahqfVar.b;
        ahpw ahpwVar5 = (ahpw) ahpvVar.v();
        ahpwVar5.getClass();
        ahqgVar2.e = ahpwVar5;
        ahqgVar2.b |= 4;
        return (ahqg) ahqfVar.v();
    }
}
