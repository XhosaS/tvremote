package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
class kmm implements kmu {
    @Override // defpackage.kmu
    public final kmt a(Context context, String str, kms kmsVar) {
        kmt kmtVar = new kmt();
        int iA = kmsVar.a(context, str);
        kmtVar.a = iA;
        if (iA != 0) {
            kmtVar.c = -1;
            return kmtVar;
        }
        int iB = kmsVar.b(context, str, true);
        kmtVar.b = iB;
        if (iB != 0) {
            kmtVar.c = 1;
        }
        return kmtVar;
    }
}
