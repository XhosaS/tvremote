package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vru implements vrt {
    final /* synthetic */ vrv a;
    private final Object b;

    public vru(vrv vrvVar, Object obj) {
        this.a = vrvVar;
        this.b = obj;
    }

    @Override // defpackage.vrt
    public final String a(Context context) {
        String string = context.getString(this.a.a, this.b);
        string.getClass();
        return string;
    }

    public final String b(Context context) throws Resources.NotFoundException, NumberFormatException {
        int i = Integer.parseInt((String) this.b);
        String quantityString = context.getResources().getQuantityString(this.a.a, i, Integer.valueOf(i));
        quantityString.getClass();
        return quantityString;
    }
}
