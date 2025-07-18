package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hah implements aejg {
    public static hag b(String str) {
        hag hagVar;
        str.getClass();
        Set set = hag.a;
        if (str.length() == 0) {
            hagVar = hag.i;
        } else if (agyv.o(str, ":")) {
            hag[] hagVarArrValues = hag.values();
            int length = hagVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    hagVar = null;
                    break;
                }
                hag hagVar2 = hagVarArrValues[i];
                String str2 = hagVar2.j.a;
                str2.getClass();
                if (str.endsWith(str2)) {
                    hagVar = hagVar2;
                    break;
                }
                i++;
            }
            if (hagVar == null) {
                hagVar = hag.i;
            }
        } else {
            hagVar = hag.b;
        }
        hagVar.getClass();
        return hagVar;
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
