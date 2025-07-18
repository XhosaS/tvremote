package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eni extends emn {
    public static final eni a = new eni();

    private eni() {
    }

    public static void a(emm emmVar) {
        enh enhVar = (enh) emmVar.c;
        emc emcVar = emd.a;
        boolean z = ema.a;
        ArrayList arrayList = new ArrayList();
        Map map = enhVar.a;
        for (Map.Entry entry : map.entrySet()) {
            eng engVar = (eng) entry.getValue();
            if (engVar.d) {
                engVar.d = false;
            } else {
                arrayList.add((String) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            eng engVar2 = (eng) map.get(str);
            if (engVar2 != null) {
                elq elqVar = engVar2.b;
                elq elqVar2 = engVar2.c;
                if (elqVar != null) {
                    enk.a(elqVar, enhVar.g);
                }
                if (engVar2.b()) {
                    engVar2.a(false);
                    if (elqVar2 != null) {
                        enk.b(elqVar2);
                    }
                }
                elq elqVar3 = engVar2.a;
                if (elqVar3 != null) {
                    enk.c(elqVar3, 0, 0, 0, 0, 0.0f, 0.0f);
                }
                engVar2.e = false;
            }
            map.remove(str);
        }
        enhVar.b.setEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(defpackage.emm r29, android.graphics.Rect r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eni.c(emm, android.graphics.Rect, boolean):void");
    }

    public static boolean d(emm emmVar) {
        enf enfVar = ((enh) emmVar.c).f;
        if (enfVar != null && !enfVar.x()) {
            return false;
        }
        elr elrVarF = f(emmVar);
        return elrVarF == null || !elrVarF.hasTransientState();
    }

    private static int e(Rect rect) {
        if (rect.isEmpty()) {
            return 0;
        }
        return rect.width() * rect.height();
    }

    private static elr f(emm emmVar) {
        elr elrVar = ((enh) emmVar.c).g;
        return elrVar == null ? emmVar.a() : elrVar;
    }

    @Override // defpackage.emn
    public final /* synthetic */ Object b() {
        return new enh();
    }
}
