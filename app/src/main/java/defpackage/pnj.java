package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class pnj {
    public final Context a;
    public final prk b;
    public final pxv c;
    public final pxy d;
    public final qbv e;
    public final ueg f;
    public final yqt g;
    public final pkn h;
    public final Executor i;
    public final phg j;
    public final pmq k;

    public pnj(Context context, prk prkVar, pxv pxvVar, pxy pxyVar, qbv qbvVar, pmq pmqVar, ueg uegVar, yqt yqtVar, pkn pknVar, Executor executor, phg phgVar) {
        this.a = context;
        this.b = prkVar;
        this.c = pxvVar;
        this.d = pxyVar;
        this.e = qbvVar;
        this.k = pmqVar;
        this.f = uegVar;
        this.g = yqtVar;
        this.h = pknVar;
        this.i = executor;
        this.j = phgVar;
    }

    public final int a(Uri uri, List list) {
        int iA;
        ueg uegVar;
        try {
            uegVar = this.f;
        } catch (IOException e) {
            e = e;
            iA = 0;
        }
        if (!uegVar.h(uri)) {
            return 0;
        }
        iA = 0;
        for (Uri uri2 : uegVar.b(uri)) {
            try {
                try {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (uri2.toString().startsWith(((Uri) it.next()).toString())) {
                                break;
                            }
                        } else if (uegVar.i(uri2)) {
                            iA += a(uri2, list);
                        } else {
                            uri2.getPath();
                            int i = qce.a;
                            uegVar.f(uri2);
                            iA++;
                        }
                    }
                } catch (IOException e2) {
                    this.e.k(1059);
                    qce.g(e2, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                }
            } catch (IOException e3) {
                e = e3;
                this.e.k(1059);
                qce.g(e, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                return iA;
            }
        }
        return iA;
    }
}
