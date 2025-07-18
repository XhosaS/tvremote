package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtu implements dtt {
    private final /* synthetic */ int c;
    public static final dtu b = new dtu(1);
    public static final dtu a = new dtu(0);

    private dtu(int i) {
        this.c = i;
    }

    @Override // defpackage.dtt
    public final Object a(Context context, String str) {
        byte[] bArr = null;
        if (this.c != 0) {
            return cwo.d(dny.a, null, null, new aye(context, str, 8, bArr), 14);
        }
        aye ayeVar = new aye(context, str, 10, bArr);
        yhb yhbVar = yhb.a;
        yot yotVar = ypk.a;
        return cwr.e(yhbVar, yoz.l(yya.a.plus(new yqy(null))), ayeVar);
    }
}
