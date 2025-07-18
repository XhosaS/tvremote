package defpackage;

import android.content.Context;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nka extends ocv {
    public nka() {
        super((short[]) null);
    }

    @Override // defpackage.ocv
    public final /* bridge */ /* synthetic */ nwj b(Context context, Looper looper, oav oavVar, Object obj, nws nwsVar, nwt nwtVar) {
        nki nkiVar = (nki) obj;
        ocv.aG(nkiVar, "Setting the API options is required.");
        return new nrs(context, looper, oavVar, nkiVar.a, nkiVar.c, nkiVar.e, nkiVar.b, nwsVar, nwtVar);
    }
}
