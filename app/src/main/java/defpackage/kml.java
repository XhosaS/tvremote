package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
class kml implements kmu {
    @Override // defpackage.kmu
    public final kmt a(Context context, String str, kms kmsVar) {
        kmt kmtVar = new kmt();
        int iB = kmsVar.b(context, str, true);
        kmtVar.b = iB;
        if (iB != 0) {
            kmtVar.c = 1;
            return kmtVar;
        }
        int iA = kmsVar.a(context, str);
        kmtVar.a = iA;
        if (iA != 0) {
            kmtVar.c = -1;
        }
        return kmtVar;
    }
}
