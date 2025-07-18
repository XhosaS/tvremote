package defpackage;

import android.content.Context;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oji extends ocv {
    public oji() {
        super((short[]) null);
    }

    @Override // defpackage.ocv
    public final /* bridge */ /* synthetic */ nwj b(Context context, Looper looper, oav oavVar, Object obj, nws nwsVar, nwt nwtVar) {
        ojk ojkVar = (ojk) obj;
        ocv.aG(ojkVar, "Must provide valid PeopleOptions!");
        return new olb(context, looper, nwsVar, nwtVar, String.valueOf(ojkVar.a), oavVar);
    }
}
