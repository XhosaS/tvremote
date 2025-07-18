package defpackage;

import android.view.View;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cte extends ctd implements cuk, cty {
    int b;
    final /* synthetic */ View c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cte(View view, csv csvVar) {
        super(csvVar);
        this.c = view;
        if (csvVar != null && csvVar.b() != ctb.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.cty
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cte) e((cvc) obj, (csv) obj2)).d(cse.a);
    }

    @Override // defpackage.csv
    public final cta b() {
        return ctb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0047, code lost:
    
        if (r5 == r0) goto L37;
     */
    @Override // defpackage.ctd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            ctc r0 = defpackage.ctc.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.dnx.bf(r5)
            goto L4a
        Ld:
            java.lang.Object r1 = r4.d
            defpackage.dnx.bf(r5)
            goto L25
        L13:
            defpackage.dnx.bf(r5)
            java.lang.Object r1 = r4.d
            android.view.View r5 = r4.c
            r4.b = r2
            r2 = r1
            cvc r2 = (defpackage.cvc) r2
            java.lang.Object r5 = r2.a(r5, r4)
            if (r5 == r0) goto L4d
        L25:
            android.view.View r5 = r4.c
            boolean r2 = r5 instanceof android.view.ViewGroup
            if (r2 == 0) goto L4a
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            ra r2 = new ra
            r3 = 0
            r2.<init>(r5, r3)
            r5 = 0
            r4.d = r5
            r5 = 2
            r4.b = r5
            java.util.Iterator r5 = r2.a()
            cvc r1 = (defpackage.cvc) r1
            java.lang.Object r5 = r1.d(r5, r4)
            if (r5 == r0) goto L47
            cse r5 = defpackage.cse.a
        L47:
            if (r5 != r0) goto L4a
            goto L4d
        L4a:
            cse r5 = defpackage.cse.a
            return r5
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cte.d(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ctd
    public final csv e(Object obj, csv csvVar) {
        cte cteVar = new cte(this.c, csvVar);
        cteVar.d = obj;
        return cteVar;
    }

    @Override // defpackage.cuk
    public final int f() {
        return 2;
    }

    @Override // defpackage.ctd
    public final String toString() {
        if (this.a != null) {
            String name = getClass().getName();
            Objects.toString(name);
            return "Continuation at ".concat(String.valueOf(name));
        }
        int i = cun.a;
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        string.getClass();
        return string;
    }
}
