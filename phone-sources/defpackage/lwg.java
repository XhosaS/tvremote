package defpackage;

import android.graphics.RectF;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwg implements Comparator {
    private final RectF c = new RectF();
    private static final List b = krh.i(lwt.class, lws.class);
    public static final lwg a = new lwg();

    private final float a(lwo lwoVar) {
        if (lwoVar == null) {
            return 0.0f;
        }
        RectF rectF = this.c;
        lwoVar.b(rectF);
        return rectF.centerX();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        lwu lwuVar = (lwu) obj;
        lwu lwuVar2 = (lwu) obj2;
        if (lwuVar == null) {
            return lwuVar2 != null ? -1 : 0;
        }
        if (lwuVar2 == null) {
            return 1;
        }
        lwq lwqVar = lwuVar.a;
        List list = b;
        int iIndexOf = list.indexOf(lwqVar.getClass()) - list.indexOf(lwuVar2.a.getClass());
        return iIndexOf != 0 ? iIndexOf : (int) Math.signum(a(lwuVar.c) - a(lwuVar2.c));
    }
}
