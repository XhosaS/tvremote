package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class kzt implements tsl {
    public abstract kus a(lbe lbeVar);

    @Override // defpackage.tsl
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kut apply(lbe lbeVar) {
        ksy ksyVar;
        Uri uri;
        String str;
        lcc lccVar;
        String str2;
        String str3;
        String str4;
        kus kusVarA = a(lbeVar);
        c(lbeVar, kusVarA);
        f(lbeVar, kusVarA);
        i(kusVarA);
        kusVarA.g(lbeVar.d);
        if ((lbeVar.b & 8) != 0) {
            lcc lccVar2 = lbeVar.h;
            if (lccVar2 == null) {
                lccVar2 = lcc.a;
            }
            kusVarA.b(lccVar2);
        }
        d(lbeVar, kusVarA);
        e(lbeVar, kusVarA);
        h(lbeVar, kusVarA);
        kusVarA.a(lbeVar.e);
        g(lbeVar, kusVarA);
        if (kusVarA.k == 1 && (ksyVar = kusVarA.a) != null && (uri = kusVarA.b) != null && (str = kusVarA.d) != null && (lccVar = kusVarA.e) != null && (str2 = kusVarA.g) != null && (str3 = kusVarA.h) != null && (str4 = kusVarA.i) != null) {
            return new kut(ksyVar, uri, kusVarA.c, str, lccVar, kusVarA.f, str2, str3, str4, kusVarA.j);
        }
        StringBuilder sb = new StringBuilder();
        if (kusVarA.a == null) {
            sb.append(" assetId");
        }
        if (kusVarA.b == null) {
            sb.append(" posterUrl");
        }
        if (kusVarA.k == 0) {
            sb.append(" posterAspectRatio");
        }
        if (kusVarA.d == null) {
            sb.append(" title");
        }
        if (kusVarA.e == null) {
            sb.append(" color");
        }
        if (kusVarA.g == null) {
            sb.append(" ctaText");
        }
        if (kusVarA.h == null) {
            sb.append(" subTitle");
        }
        if (kusVarA.i == null) {
            sb.append(" accessibilityText");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public abstract void c(lbe lbeVar, kus kusVar);

    public abstract void d(lbe lbeVar, kus kusVar);

    public abstract void e(lbe lbeVar, kus kusVar);

    public abstract void f(lbe lbeVar, kus kusVar);

    public abstract void g(lbe lbeVar, kus kusVar);

    public abstract void h(lbe lbeVar, kus kusVar);

    public abstract void i(kus kusVar);
}
