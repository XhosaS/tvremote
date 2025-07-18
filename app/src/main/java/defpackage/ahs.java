package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahs extends agtt implements agvb {
    int a;
    final /* synthetic */ View b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahs(View view, agsw agswVar) {
        super(agswVar);
        this.b = view;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahs) c((agxu) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r4 == r0) goto L18;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r3.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.agpl.b(r4)
            goto L4b
        Ld:
            java.lang.Object r1 = r3.c
            agxu r1 = (defpackage.agxu) r1
            defpackage.agpl.b(r4)
            goto L29
        L15:
            defpackage.agpl.b(r4)
            java.lang.Object r4 = r3.c
            r1 = r4
            agxu r1 = (defpackage.agxu) r1
            android.view.View r4 = r3.b
            r3.c = r1
            r3.a = r2
            java.lang.Object r4 = r1.a(r4, r3)
            if (r4 == r0) goto L4e
        L29:
            android.view.View r4 = r3.b
            boolean r2 = r4 instanceof android.view.ViewGroup
            if (r2 == 0) goto L4b
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            ahr r2 = new ahr
            r2.<init>(r4)
            r4 = 0
            r3.c = r4
            r4 = 2
            r3.a = r4
            java.util.Iterator r4 = r2.a()
            java.lang.Object r4 = r1.b(r4, r3)
            if (r4 == r0) goto L48
            agpu r4 = defpackage.agpu.a
        L48:
            if (r4 != r0) goto L4b
            goto L4e
        L4b:
            agpu r4 = defpackage.agpu.a
            return r4
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ahs ahsVar = new ahs(this.b, agswVar);
        ahsVar.c = obj;
        return ahsVar;
    }
}
