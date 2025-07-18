package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aaes implements aafh, aaff {
    private static final Map a = new ConcurrentHashMap();
    private final aabo b;
    private final boolean c;

    public aaes(aabo aaboVar, boolean z) {
        this.b = aaboVar;
        this.c = z;
    }

    @Override // defpackage.aaff
    public final int a() {
        return b();
    }

    @Override // defpackage.aafh
    public final int b() {
        return this.c ? 6 : 20;
    }

    @Override // defpackage.aaff
    public final int c(aafb aafbVar, CharSequence charSequence, int i) {
        int i2;
        int iIntValue;
        Map concurrentHashMap;
        Map map = a;
        Locale locale = aafbVar.b;
        Map concurrentHashMap2 = (Map) map.get(locale);
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap();
            map.put(locale, concurrentHashMap2);
        }
        aabo aaboVar = this.b;
        Object[] objArr = (Object[]) concurrentHashMap2.get(aaboVar);
        if (objArr == null) {
            concurrentHashMap = new ConcurrentHashMap(32);
            aacd aacdVar = new aacd(aabs.b);
            aabm aabmVarA = aaboVar.a(aacdVar.b);
            if (!aabmVarA.w()) {
                throw new IllegalArgumentException("Field '" + aaboVar.y + "' is not supported");
            }
            aacc aaccVar = new aacc(aacdVar, aabmVarA);
            int iD = aaccVar.b.d();
            int iC = aaccVar.b.c();
            if (iC - iD <= 32) {
                iIntValue = aaccVar.b.b(locale);
                while (iD <= iC) {
                    aacd aacdVar2 = aaccVar.a;
                    long jH = aaccVar.b.h(aacdVar2.a, iD);
                    aabk aabkVar = aacdVar2.b;
                    aacdVar2.a = jH;
                    concurrentHashMap.put(aaccVar.e(locale), Boolean.TRUE);
                    concurrentHashMap.put(aaccVar.e(locale).toLowerCase(locale), Boolean.TRUE);
                    concurrentHashMap.put(aaccVar.e(locale).toUpperCase(locale), Boolean.TRUE);
                    concurrentHashMap.put(aaccVar.f(locale), Boolean.TRUE);
                    concurrentHashMap.put(aaccVar.f(locale).toLowerCase(locale), Boolean.TRUE);
                    concurrentHashMap.put(aaccVar.f(locale).toUpperCase(locale), Boolean.TRUE);
                    iD++;
                }
                i2 = 0;
                if ("en".equals(locale.getLanguage()) && aaboVar == aabo.b) {
                    concurrentHashMap.put("BCE", Boolean.TRUE);
                    concurrentHashMap.put("bce", Boolean.TRUE);
                    concurrentHashMap.put("CE", Boolean.TRUE);
                    concurrentHashMap.put("ce", Boolean.TRUE);
                    iIntValue = 3;
                }
                concurrentHashMap2.put(aaboVar, new Object[]{concurrentHashMap, Integer.valueOf(iIntValue)});
            }
            return ~i;
        }
        i2 = 0;
        Map map2 = (Map) objArr[0];
        iIntValue = ((Integer) objArr[1]).intValue();
        concurrentHashMap = map2;
        for (int iMin = Math.min(charSequence.length(), i + iIntValue); iMin > i; iMin--) {
            String string = charSequence.subSequence(i, iMin).toString();
            if (concurrentHashMap.containsKey(string)) {
                aaez aaezVarC = aafbVar.c();
                aaezVarC.a = aaboVar.a(aafbVar.a);
                aaezVarC.b = i2;
                aaezVarC.c = string;
                aaezVarC.d = locale;
                return iMin;
            }
        }
        return ~i;
    }

    @Override // defpackage.aafh
    public final void d(Appendable appendable, aach aachVar, Locale locale) throws IOException {
        String strM;
        try {
            aabo aaboVar = this.b;
            if (aachVar.f(aaboVar)) {
                aabm aabmVarA = aaboVar.a(((aacb) aachVar).b);
                strM = this.c ? aabmVarA.m(aachVar, locale) : aabmVarA.p(aachVar, locale);
            } else {
                strM = "�";
            }
            appendable.append(strM);
        } catch (RuntimeException unused) {
            appendable.append((char) 65533);
        }
    }

    @Override // defpackage.aafh
    public final void e(Appendable appendable, long j, aabk aabkVar, int i, aabs aabsVar, Locale locale) throws IOException {
        try {
            aabm aabmVarA = this.b.a(aabkVar);
            appendable.append(this.c ? aabmVarA.l(j, locale) : aabmVarA.o(j, locale));
        } catch (RuntimeException unused) {
            appendable.append((char) 65533);
        }
    }
}
