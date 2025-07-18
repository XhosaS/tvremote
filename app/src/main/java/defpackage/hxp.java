package defpackage;

import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hxp extends agtu implements agvb {
    int a;
    final /* synthetic */ hxr b;
    final /* synthetic */ EditText c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxp(hxr hxrVar, EditText editText, agsw agswVar) {
        super(2, agswVar);
        this.b = hxrVar;
        this.c = editText;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hxp) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r12 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r12 == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r11.a
            java.lang.String r2 = ""
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L17
            defpackage.agpl.b(r12)
            if (r1 == r4) goto L26
            if (r1 == r3) goto L12
            goto L58
        L12:
            agpk r12 = (defpackage.agpk) r12
            java.lang.Object r12 = r12.a
            goto L44
        L17:
            defpackage.agpl.b(r12)
            hxr r12 = r11.b
            r11.a = r4
            gtu r12 = r12.B
            java.lang.Object r12 = r12.j(r11)
            if (r12 == r0) goto L8f
        L26:
            android.accounts.Account r12 = (android.accounts.Account) r12
            if (r12 == 0) goto L5b
            hxr r1 = r11.b
            agow r5 = r1.r
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4c
            gtu r1 = r1.B
            r11.a = r3
            java.lang.Object r12 = r1.f(r12, r11)
            if (r12 == r0) goto L8f
        L44:
            boolean r0 = r12 instanceof defpackage.agpj
            if (r4 != r0) goto L49
            r12 = r2
        L49:
            java.lang.String r12 = (java.lang.String) r12
            goto L5c
        L4c:
            gtu r1 = r1.B
            r3 = 3
            r11.a = r3
            java.lang.Object r12 = r1.e(r12, r11)
            if (r12 != r0) goto L58
            goto L8f
        L58:
            java.lang.String r12 = (java.lang.String) r12
            goto L5c
        L5b:
            r12 = 0
        L5c:
            if (r12 != 0) goto L60
            r4 = r2
            goto L61
        L60:
            r4 = r12
        L61:
            int r12 = r4.length()
            if (r12 <= 0) goto L8c
            hxr r5 = r11.b
            android.widget.EditText r9 = r11.c
            hyi r3 = new hyi
            boolean r7 = r5.ah
            agow r12 = r5.E
            java.lang.Object r12 = r12.a()
            r12.getClass()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r10 = r12.booleanValue()
            fyq r6 = r5.y
            android.view.inputmethod.InputMethodManager r8 = r5.A
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r9.addTextChangedListener(r3)
            r3.h = r5
            r5.U = r3
        L8c:
            agpu r12 = defpackage.agpu.a
            return r12
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hxp(this.b, this.c, agswVar);
    }
}
