package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aacu extends aaea {
    public aacu() {
        super(aabo.n, aacw.s, aacw.t);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int b(Locale locale) {
        return aadg.a(locale).m;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long i(long j, String str, Locale locale) {
        String[] strArr = aadg.a(locale).f;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new aabx(aabo.n, str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return h(j, length);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final String n(int i, Locale locale) {
        return aadg.a(locale).f[i];
    }
}
