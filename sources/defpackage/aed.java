package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aed extends agb implements adk {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public aed(Context context) {
        awy awyVar = adj.j;
        afv afvVar = afw.a;
        afz afzVar = new afz();
        afzVar.b = new qo();
        super(context, awyVar, afvVar, afzVar.a());
    }

    public final void a(ady adyVar) {
        if (adyVar.a.isEmpty()) {
            qs.j(Status.a);
            return;
        }
        ahq ahqVar = new ahq();
        ahqVar.a = new ajk(adyVar, 1);
        ahqVar.b = new aes[]{adr.a};
        ahqVar.b();
        f(ahqVar.a());
    }
}
