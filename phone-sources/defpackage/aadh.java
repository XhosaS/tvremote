package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aadh extends aada {
    public aadh(aacw aacwVar) {
        super(aacwVar);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int b(Locale locale) {
        return aadg.a(locale).l;
    }

    @Override // defpackage.aadr
    protected final int eX(String str, Locale locale) {
        Integer num = (Integer) aadg.a(locale).i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new aabx(aabo.h, str);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final String k(int i, Locale locale) {
        return aadg.a(locale).e[i];
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final String n(int i, Locale locale) {
        return aadg.a(locale).d[i];
    }
}
