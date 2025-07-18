package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hb extends gx {
    @Override // defpackage.gx
    public final /* synthetic */ Object a(int i, Intent intent) {
        return new gn(i, intent);
    }

    @Override // defpackage.gx
    public final /* bridge */ /* synthetic */ Intent b(Object obj) {
        gw gwVar = (gw) obj;
        gwVar.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gwVar);
        intentPutExtra.getClass();
        return intentPutExtra;
    }
}
