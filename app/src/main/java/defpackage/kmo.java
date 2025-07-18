package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
class kmo implements kmu {
    @Override // defpackage.kmu
    public final kmt a(Context context, String str, kms kmsVar) {
        int iB;
        kmt kmtVar = new kmt();
        int iA = kmsVar.a(context, str);
        kmtVar.a = iA;
        int i = 1;
        int i2 = 0;
        if (iA != 0) {
            iB = kmsVar.b(context, str, false);
            kmtVar.b = iB;
        } else {
            iB = kmsVar.b(context, str, true);
            kmtVar.b = iB;
        }
        int i3 = kmtVar.a;
        if (i3 == 0) {
            if (iB == 0) {
                i = 0;
            }
            kmtVar.c = i;
            return kmtVar;
        }
        i2 = i3;
        if (i2 >= iB) {
            i = -1;
        }
        kmtVar.c = i;
        return kmtVar;
    }
}
