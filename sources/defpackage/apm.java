package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apm {
    public final apa a;
    public final ape b;

    protected apm(Context context, ape apeVar) {
        Context context2;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        apn apnVar = new apn();
        aoz aozVar = new aoz(null);
        aozVar.a();
        if (applicationContext == null) {
            throw new NullPointerException("Null context");
        }
        aozVar.a = applicationContext;
        aozVar.c = byg.h(apnVar);
        aozVar.a();
        if (aozVar.e == 1 && (context2 = aozVar.a) != null) {
            this.a = new apa(context2, aozVar.b, aozVar.c, aozVar.d);
            this.b = apeVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (aozVar.a == null) {
            sb.append(" context");
        }
        if (aozVar.e == 0) {
            sb.append(" googlerOverridesCheckbox");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static apm a(Context context, aoy aoyVar) {
        return new apm(context, new ape(aoyVar));
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + "}";
    }
}
