package j$.time.format;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class t extends s {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();
    public final G e;
    public final boolean f;
    public final HashMap g;
    public final HashMap h;

    public t(G g, boolean z) {
        super(j$.time.temporal.o.e, "ZoneText(" + String.valueOf(g) + ")");
        this.g = new HashMap();
        this.h = new HashMap();
        Objects.a(g, "textStyle");
        this.e = g;
        this.f = z;
    }

    @Override // j$.time.format.s
    public final m a(v vVar) {
        m mVar;
        if (this.e == G.NARROW) {
            return super.a(vVar);
        }
        Locale locale = vVar.a.b;
        boolean z = vVar.b;
        Set set = j$.time.zone.h.d;
        int size = set.size();
        HashMap map = z ? this.g : this.h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (mVar = (m) ((SoftReference) entry.getValue()).get()) != null) {
            return mVar;
        }
        m mVar2 = vVar.b ? new m("", null, null) : new l("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                mVar2.a(str, str);
                HashMap map2 = H.g;
                HashMap map3 = H.d;
                String str2 = (String) map3.get(str);
                if (str2 == null && map2.containsKey(str)) {
                    str = (String) map2.get(str);
                    str2 = (String) map3.get(str);
                }
                if (str2 != null) {
                    Map map4 = (Map) H.f.get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) H.e.get(str2) : (String) map4.get(locale.getCountry());
                }
                if (map2.containsKey(str)) {
                    str = (String) map2.get(str);
                }
                for (int i2 = this.e == G.FULL ? 1 : 2; i2 < strArr.length; i2 += 2) {
                    mVar2.a(strArr[i2], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(mVar2)));
        return mVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // j$.time.format.s, j$.time.format.InterfaceC0062e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(j$.time.format.y r14, java.lang.StringBuilder r15) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.t.i(j$.time.format.y, java.lang.StringBuilder):boolean");
    }
}
